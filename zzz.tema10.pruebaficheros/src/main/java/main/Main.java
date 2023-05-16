package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import clases.Usuario;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Usuario u1 = new Usuario("Paco", "paco.mer@cenec.es", (short) 2004);
		Usuario u2 = new Usuario("Patricio", "patricio@dublin.es", (short) 1998);
		System.out.println("Dime tu nombre");
		String nombre = sc.nextLine();
		System.out.println("Dime tu email");
		String email = sc.nextLine();
		System.out.println("Dime tu año de nacimiento");
		short anoNacimiento = Short.parseShort(sc.nextLine());
		Usuario u3 = new Usuario(nombre, email, anoNacimiento);

		try {
			FileWriter escritor = new FileWriter("./usuarios.txt");
			escritor.write(u1 + "\n");
			escritor.write(u2 + "\n");
			escritor.write(u3 + "\n");
			escritor.flush();
			escritor.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			BufferedReader lector = new BufferedReader(new FileReader("./usuarios.txt"));
			String texto="";
			String linea=lector.readLine();
			while (linea!=null) {
				texto+=linea+"\n";
				linea=lector.readLine();
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
	}

}
