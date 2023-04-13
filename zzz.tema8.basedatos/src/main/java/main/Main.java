package main;

import java.sql.SQLException;
import java.util.Scanner;

import utils.DAO;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		byte opcion = 0;
		do {
			System.out.println("¿Qué quieres hacer en la base de datos?\n\t0 - Salir" + "\n\t1 - Insertar usuario"
					+ "\n\t2 - Borrar usuario" + "\n\t3 - Modificar usuario" + "\n\t4 - Consultar usaurio");
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

					DAO.insert("insert into user values('" + email + "','" + pass + "','" + nick + "')");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 2:
				try {
					System.out.println("Dime el email del usuario que quieres borrar");
					String email = sc.nextLine();
					int filasBorradas = DAO.delete("delete from user where email='" + email + "'");
					System.out.println("Se han borrado " + filasBorradas + " filas");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 3:

				break;
			case 4:

				break;
			}
		} while (opcion != 0);

	}

}
