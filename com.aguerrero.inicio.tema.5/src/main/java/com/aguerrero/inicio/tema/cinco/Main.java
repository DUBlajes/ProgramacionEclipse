package com.aguerrero.inicio.tema.cinco;

import java.util.Scanner;

import clases.Sim;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un nombre para un Sim");
		String nombre = sc.nextLine();
		System.out.println("Dime los apellidos del Sim");
		String apellidos = sc.nextLine();
		System.out.println("Dime el género del Sim (h/m)");
		char genero = sc.nextLine().charAt(0);

		Sim miSim = new Sim(nombre, apellidos, genero);
		byte opcion;
		do {
			System.out.println("¿Qué quieres hacer con tu Sim?" + "\n\t0 - Salir del programa" + "\n\t1 - Imprimirlo"
					+ "\n\t2 - Cambiar nombre" + "\n\t3 - Cambiar apellidos" + "\n\t4 - Cambiar género"+ "\n\t5 - Establecer hambre");
			opcion = Byte.parseByte(sc.nextLine());
			switch (opcion) {
			case 1:
				System.out.println(miSim);
				break;
			case 2:
				System.out.println("Dime el nuevo nombre");
				miSim.setNombre(sc.nextLine());
				break;
			case 3:
				System.out.println("Dime los nuevos apellidos");
				miSim.setApellido(sc.nextLine());
				break;
			case 4:
				System.out.println("Dime el género (h/m)");
				miSim.setGenero(sc.nextLine().charAt(0));
				break;
			case 5:
				System.out.println("Dime el hambre que tendrá el Sim (0-100)");
				miSim.setHambre(Byte.parseByte(sc.nextLine()));
				break;
			}
		} while (opcion != 0);

		/*
		 * Sim pepe=new Sim("Pepe", "Tardo", 'h', (byte)50, (byte)50, (byte)50,
		 * (byte)50, null, null, null, null); //Al hacer el new Persona() estás creando
		 * una instancia u objeto de tipo X (persona en este caso).
		 * 
		 * 
		 * Sim eufrasio=new Sim("Eufrasio", "Buhero", 'h');
		 * 
		 * Sim elvira=new Sim("Elvira", "Lapica", 'm', null, pepe);
		 * 
		 * 
		 * Perro yacko=new Perro("Yacko", 'h', "Chucho", "Claro", pepe);
		 * 
		 * Gato scot=new Gato("Scot", 'h', "Maine Coon", "Gris", elvira);
		 * 
		 * 
		 * elvira.setPerros(new Perro[1]); //inicializamos un array de tamaño 1
		 * elvira.getPerros()[0]=yacko;//En la única posición del array, ponemos un
		 * perro yacko.setDueño(elvira);
		 * 
		 * pepe.setGatos(new Gato[1]); pepe.getGatos()[0]=scot; scot.setDueño(pepe);
		 * System.out.println(yacko.getNombre()); yacko.setNombre("Luffy");
		 * yacko.setDuenio(pepe);
		 */
	}

}
