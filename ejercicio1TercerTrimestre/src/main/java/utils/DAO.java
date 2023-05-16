package utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

/**
 * Clase de Acceso a Base de datos, abstracta, que permite hacer de forma
 * sencilla y sin preocuparse de la sintaxis SQL, las operaciones CRUD (Create,
 * Read, Update y Delete) sobre una bd.
 * 
 * @author Álvaro Guerrero
 *
 */
public abstract class DAO {
	/**
	 * Objeto conexión desde el que se va a referenciar a la BD. La operativa sera
	 * conectar, usar y desconectar lo antes posible
	 */
	private static Connection connection;

	/**
	 * Método privado que abre una conexión con un servidor de base de datos. Las
	 * propiedades de las BD deben estar definidas en un fichero ./bdconfig.ini con
	 * el siguiente formato: 1º linea: ip o dns del servidor 2º linea: puerto 3º
	 * linea: nombre BD 4º linea: usuario BD 5º linea: contraseña BD
	 * 
	 * @return Statement listo para hacer la consulta que necesitemos
	 */
	private static Statement connect() {
		try {
			BufferedReader lector = new BufferedReader(new FileReader("./bdconfig.ini"));
			String ip = lector.readLine();
			int puerto = Integer.parseInt(lector.readLine());
			String nombreBD = lector.readLine();
			String usuarioBD = lector.readLine();
			String passBD = lector.readLine();
			lector.close();
			connection = DriverManager.getConnection("jdbc:mysql://" + ip + ":" + puerto + "/" + nombreBD, usuarioBD,
					passBD);
			return connection.createStatement();
		} catch (IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

	public static int insert(String table, HashMap<String, Object> campos) throws SQLException {
		Statement querier = connect();
		// insert into cliente (email, nombre, contraseña) values ('ladlads@asdasd.es',
		// 'aaa','123132');
		// Lo que estamos construyendo es algo como insert into cliente (email, nombre,
		// telefono, password) values ( 'asdasd@ada.es','asdasdasd','123123',
		String query = "insert into " + table + " (";
		Iterator it = campos.keySet().iterator();
		while (it.hasNext()) {
			String clave = (String) it.next();
			query += clave + ",";
		}
		query = query.substring(0, query.length() - 1) + ") values (";
		Iterator itv = campos.values().iterator();
		while (itv.hasNext()) {
			Object elemento = itv.next();
			if (elemento.getClass() != String.class && elemento.getClass() != Character.class) {
				query += elemento + ",";
			} else {
				query += "'" + (String) elemento + "',";
			}

		}
		query = query.substring(0, query.length() - 1) + ")";

		if (Config.verboseMode) {
			System.out.println(query);
		}
		int ret = querier.executeUpdate(query);
		disconnect(querier);
		return ret;
	}

	public static int delete(String table, HashMap<String, Object> campos) throws SQLException {
		Statement querier = connect();
		// delete from user where email='asdasd@asda.es' and nick='asdad' and
		String query = "delete from " + table + " where ";
		Iterator it = campos.entrySet().iterator();
		while (it.hasNext()) {
			Entry actual = (Entry) it.next();
			if (actual.getValue().getClass() != String.class && actual.getValue().getClass() != Character.class) {
				query += actual.getKey() + " = " + actual.getValue() + " and ";
			} else {
				query += actual.getKey() + " = '" + actual.getValue() + "' and ";
			}
		}
		query = query.substring(0, query.length() - 5);
		if (Config.verboseMode) {
			System.out.println(query);
		}
		int ret = querier.executeUpdate(query);
		disconnect(querier);
		return ret;
	}

	public static ArrayList<Object> consultar(String tabla, LinkedHashSet<String> columnasSelect,
			HashMap<String, Object> restricciones) throws SQLException {
		Statement smt = connect();

		String query = "select ";
		Iterator ith = columnasSelect.iterator();
		while (ith.hasNext()) {
			query += (String) ith.next() + ",";
		}

		query = query.substring(0, query.length() - 1) + " from " + tabla + (restricciones.size() > 0 ? " where " : "");
		// select email, nombre, pass from cliente where email='asdad' and
		Iterator itm = restricciones.entrySet().iterator();
		while (itm.hasNext()) {
			Entry actual = (Entry) itm.next();
			if (actual.getValue().getClass() != String.class && actual.getValue().getClass() != Character.class) {
				query += actual.getKey() + " = " + actual.getValue() + " and ";
			} else {
				query += actual.getKey() + " = '" + actual.getValue() + "' and ";
			}
		}
		if (restricciones.size() > 0) {
			query = query.substring(0, query.length() - 5);
		}
		System.out.println(query);
		ResultSet cursor = smt.executeQuery(query);
		ArrayList<Object> fila = new ArrayList<Object>();
		while (cursor.next()) {
			Iterator hsCols = columnasSelect.iterator();
			while (hsCols.hasNext()) {
				String nombreCol = (String) hsCols.next();
				try {
					fila.add(cursor.getInt(cursor.findColumn(nombreCol)));
				} catch (NumberFormatException | SQLException e) {
					fila.add(cursor.getString(cursor.findColumn(nombreCol)));
				}
			}
		}
		disconnect(smt);
		return fila;
	}

	public static int actualizar(String tabla, HashMap<String, Object> datosAModificar,
			HashMap<String, Object> restricciones) throws SQLException {
		String query = "update " + tabla + " set ";
		Iterator itm = datosAModificar.entrySet().iterator();
		while (itm.hasNext()) {
			Entry actual = (Entry) itm.next();
			if (actual.getValue().getClass() != String.class && actual.getValue().getClass() != Character.class) {
				query += actual.getKey() + " = " + actual.getValue() + ",";
			} else {
				query += actual.getKey() + " = '" + actual.getValue() + "',";
			}
		}
		query = query.substring(0, query.length() - 1) + " where ";
		Iterator itr = restricciones.entrySet().iterator();
		while (itr.hasNext()) {
			Entry actual = (Entry) itr.next();
			if (actual.getValue().getClass() != String.class && actual.getValue().getClass() != Character.class) {
				query += actual.getKey() + " = " + actual.getValue() + " and ";
			} else {
				query += actual.getKey() + " = '" + actual.getValue() + "' and ";
			}
		}
		query = query.substring(0, query.length() - 5);
		
		Statement smt=connect();
		System.out.println(query);
		int ret=smt.executeUpdate(query);
		disconnect(smt);
		
		return ret;
	}

	/**
	 * Funcion privada que cierra en su interior tanto el statement pasado por
	 * argumentos como la conexión, para dejar libre la entrada a más programas que
	 * quieran entrar a la BD.
	 * 
	 * @param smt Statement que se va a liberar (cerrar)
	 */
	private static void disconnect(Statement smt) {
		try {
			smt.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
