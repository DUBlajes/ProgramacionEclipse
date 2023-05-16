package clases;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

import excepciones.PassInvalidaException;
import excepciones.UsuarioNoExisteException;
import utils.DAO;

public class Usuario {
	private String email;
	private String nick;
	private String pass;

	public Usuario(String email, String nick, String pass) throws SQLException {
		super();
		this.email = email;
		this.nick = nick;
		this.pass = pass;
		HashMap<String, Object> columnas = new HashMap<String, Object>();
		columnas.put("email", email);
		columnas.put("pass", pass);
		columnas.put("nick", nick);
		DAO.insert("user", columnas);
	}

	public Usuario(String email, String pass) throws UsuarioNoExisteException, PassInvalidaException, SQLException {
		LinkedHashSet columnasSacar=new LinkedHashSet<String>();
		columnasSacar.add("email");
		columnasSacar.add("pass");
		columnasSacar.add("nick");
		HashMap<String,Object> restricciones=new HashMap<String,Object>();
		restricciones.put("email", email);
		restricciones.put("pass", pass);
		ArrayList<Object> resultadoConsulta=null;
		String passN=null;
		try {
			resultadoConsulta=DAO.consultar("user", columnasSacar, restricciones);
			if(resultadoConsulta.isEmpty()) {
				throw new UsuarioNoExisteException("El usuario introducido no existe");
			}else {
				passN= ""+resultadoConsulta.get(1); //Se ponen las comillas para que si pones una pass numerica se pueda convertir a string
				if (!passN.equals(pass)) {
					throw new PassInvalidaException("La contraseña introducida no es válida");
					
				}
			}
		}catch(SQLException e) {
			System.out.println(e.getMessage());		
		}
		this.email=(String)resultadoConsulta.get(0);
		this.nick=(String)resultadoConsulta.get(2);

	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws Exception {
		// Usa la función actualizar de la clase DAO para cambiar el valor del email en
		// la base de datos
		// donde el email del usuario sea igual a this.email
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el email del cliente a modificar");
		email = sc.nextLine();
		HashMap<String, Object> valoresNuevos = new HashMap<String, Object>();
		HashMap<String, Object> restriccionesMod = new HashMap<String, Object>();
		System.out.println("Dime el nuevo email");
		valoresNuevos.put("email", sc.nextLine());
		restriccionesMod.put("email", email);
		try {
			DAO.actualizar("user", valoresNuevos, restriccionesMod);
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		this.email = email; // Actualiza el valor del email en la variable interna
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		// Usa la función actualizar de la clase DAO para cambiar el valor del nick en
		// la base de datos
		// donde el email del usuario sea igual a this.email
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el nick del cliente a modificar");
		nick = sc.nextLine();
		HashMap<String, Object> valoresNuevos = new HashMap<String, Object>();
		HashMap<String, Object> restriccionesMod = new HashMap<String, Object>();
		System.out.println("Dime el nuevo nick");
		valoresNuevos.put("nick", sc.nextLine());
		restriccionesMod.put("nick", nick);
		try {
			DAO.actualizar("user", valoresNuevos, restriccionesMod);
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		this.nick = nick; // Actualiza el valor del nick en la variable interna
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "email: " + email + ", nick: " + nick + ", pass: " + pass + "]";
	}

}