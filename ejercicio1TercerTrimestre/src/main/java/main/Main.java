package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

import clases.Usuario;
import excepciones.PassInvalidaException;
import excepciones.UsuarioNoExisteException;
import utils.DAO;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Usuario usuario;
		Byte opcion;
		String email;
		String nick;
		String pass;
		boolean loginCorrecto = false;
		do {

			System.out.println(
					"¿Qué quieres hacer?\n\t0 - Salir" + "\n\t1 - Registro" + "\n\t2 - Login" + "\n\t3 - Ver log");
			if(loginCorrecto==true) {
				System.out.println("\t4 - Ver todos los usuarios");
			}
			opcion = Byte.parseByte(sc.nextLine());
			switch (opcion) {
			case 1:
				System.out.println("Dime tu email");
				email = sc.nextLine();
				System.out.println("Dime tu nick");
				nick = sc.nextLine();
				System.out.println("Dime tu pass");
				pass = sc.nextLine();
				try {
					usuario = new Usuario(email, nick, pass);
					System.out.println("Usuario registrado con éxito");
					try {
						FileWriter escritor = new FileWriter("./usuarios.log");
						String logEntry = "Usuario " + usuario.getEmail() + " registrado con éxito en: "
								+ LocalDateTime.now().toString() + "\n";
						escritor.write(logEntry);
						escritor.flush();
						escritor.close();
						System.out.println("Registro escrito en el archivo 'usuarios.log'.");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						System.out.println("Error al escribir en el archivo 'usuarios.log'.");
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("Error al registrar usuario: " + e.getMessage());
				}
				break;

			case 2:
				loginCorrecto = false;
				do {
					System.out.println("Dime tu email");
					email = sc.nextLine();
					System.out.println("Dime tu contraseña");
					pass = sc.nextLine();
					try {
						usuario = new Usuario(email, pass);
						System.out.println("Usuario logueado con éxito");
						FileWriter fw = new FileWriter("./usuarios.log", true);
						fw.write("Usuario " + usuario.getEmail() + " logueado con éxito en: "
								+ LocalDateTime.now().toString() + "\n");
						fw.flush();
						fw.close();
						loginCorrecto = true;
					} catch (UsuarioNoExisteException | PassInvalidaException e) {
						System.out.println("Se ha producido un error en el logueo de usuario: " + e.getMessage());
						loginCorrecto = false;
					} catch (IOException e) {
						System.out.println("Se ha producido un error: " + e.getMessage());
						loginCorrecto = false;
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} while (loginCorrecto == false);
				break;

			case 3:
				try {
					BufferedReader lector = new BufferedReader(new FileReader("./usuarios.log"));
					String texto = "";
					String linea = lector.readLine();
					while (linea != null) {
						texto += linea + "\n";
						linea = lector.readLine();
					}
					lector.close();
					System.out.println(texto);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
				
			case 4:
				if(loginCorrecto==false) {
					System.out.println("Usuario no logueado");
				}else {
					try {
						Usuario.getTodos();
						System.out.println(Usuario.getTodos());
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				

				break;
			}
		} while (opcion != 0);
	}
}