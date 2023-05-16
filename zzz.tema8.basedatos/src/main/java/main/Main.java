package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

import interfaces.Ventana;
import utils.DAO;

public class Main {

	public static void main(String[] args) {
		
		Ventana v=new Ventana();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// Pon en el menu una opcion 5 - borrar mascota, y usa la funcion delete de DAO
		// que ya tenemos hecha para, pidiendo por teclado el nombre de la mascota y el
		// email del dueño, te borre la mascota de la tabla pets.
		// Hay que probarlo para que luego podamos borrar a prueba@prueba.es
		// Pon en el menu una opcion 6 - borrar juguete, y usa la funcion delete de DAO
		// para que, pidiendo por teclado
		byte opcion = 0;
		do {
			System.out.println("¿Qué quieres hacer en la base de datos?\n\t0 - Salir" + "\n\t1 - Insertar usuario"
					+ "\n\t2 - Borrar usuario" + "\n\t3 - Modificar usuario" + "\n\t4 - Consultar usuario"
					+ "\n\t5 - Borrar mascota");
			opcion = Byte.parseByte(sc.nextLine());
			switch (opcion) {
			case 1:
				try {

					System.out.println("Dime email");
					String email = sc.nextLine();
					System.out.println("Dime contraseña");
					String pass = sc.nextLine();
					System.out.println("Dime nick");
					String nick = sc.nextLine();
					System.out.println("Dime telefono");
					int telefono = Integer.parseInt(sc.nextLine());
					HashMap<String, Object> columnas = new HashMap<String, Object>();
					columnas.put("email", email);
					columnas.put("pass", pass);
					columnas.put("nick", nick);
					columnas.put("telefono", telefono);
					DAO.insert("user", columnas);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 2:
				try {
					System.out.println("Dime el email del usuario que quieres borrar");
					String email = sc.nextLine();
					HashMap<String, Object> campos = new HashMap<String, Object>();
					campos.put("email", email);
					int filasBorradas = DAO.delete("user", campos);
					System.out.println("Se han borrado " + filasBorradas + " filas");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 3:
				System.out.println("Dime el email del cliente a modificar");
				String emailMod = sc.nextLine();
				HashMap<String,Object> valoresNuevos=new HashMap<String,Object>();
				System.out.println("¿Qué quieres cambiar?" + "\n\t1 - Email" + "\n\t2 - Nick" + "\n\t3 - Password"
						+ "\n\t4 - Telefono");
				switch (Byte.parseByte(sc.nextLine())) {
				case 1:
					System.out.println("Dime el nuevo email");
					valoresNuevos.put("email", sc.nextLine());
					break;

				case 2:
					System.out.println("Dime el nuevo nick");
					valoresNuevos.put("nick", sc.nextLine());
					break;
				case 3:
					System.out.println("Dime la nueva contraseña");
					valoresNuevos.put("pass", sc.nextLine());
					break;
				case 4:
					System.out.println("Dime el nuevo telefono");
					valoresNuevos.put("telefono", Integer.parseInt(sc.nextLine()));
					break;
				}
				HashMap<String,Object>restriccionesMod=new HashMap<String, Object>();
				restriccionesMod.put("email", emailMod);
				try {
					DAO.actualizar("user", valoresNuevos, restriccionesMod);
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				break;
			case 4:
				try {
					LinkedHashSet columnasSacar = new LinkedHashSet<String>();
					columnasSacar.add("email");
					columnasSacar.add("pass");
					columnasSacar.add("nick");
					columnasSacar.add("telefono");
					HashMap<String, Object> restricciones = new HashMap<String, Object>(); // Si lo dejo vacio me lo va
																							// a mostrar todo
					ArrayList<Object> cliente = DAO.consultar("user", columnasSacar, restricciones);
					for (byte i = 0; i < cliente.size(); i++) {
						System.out.println(cliente.get(i) + " : ");
					}
					System.out.println();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;
			case 5:
				try {
					System.out.println("Dime el nombre de la mascota que quieres borrar");
					String mascota = sc.nextLine();
					System.out.println("Dime el email del dueño de esa mascota");
					String email = sc.nextLine();
					HashMap<String, Object> campos = new HashMap<String, Object>();
					campos.put("name", mascota);
					campos.put("ownerEmail", email);
					int filasBorradas = DAO.delete("pet", campos);
					System.out.println("Se han borrado " + filasBorradas + " filas");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;
			}
		} while (opcion != 0);*/

	}

}
