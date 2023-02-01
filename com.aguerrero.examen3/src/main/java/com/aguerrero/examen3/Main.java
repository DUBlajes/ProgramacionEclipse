package com.aguerrero.examen3;

import java.util.Random;
import java.util.Scanner;

/**
 * Clase que recoge el main del programa.
 * 
 * @author Álvaro Guerrero
 *
 */
public class Main {
	/**
	 * Método principal del programa. Te pide que introduzcas el nombre de una
	 * competición ciclista, (nombre al que se le harán variaciones o se pedirán
	 * determinados datos sobre él), luego introduciremos el número de etapas al que
	 * le añadiremos, de forma aleatoria, una distancia entre 80 y 200 kilometros
	 * (ambos incluidos) y un número de corredores, que siempre será uno más que el
	 * número de etapas.
	 * 
	 * @param args de momento no conocemos el valor
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombreCompeticion = "";
		byte numeroEtapas;
		boolean nombreCorrecto = false;
		System.out.println("Dime un nombre para el tour. Debe comenzar con la palabra Vuelta");
		nombreCompeticion = sc.nextLine();
		do {
			System.out.println("Nombre incorrecto. Dime otro");
			nombreCompeticion = sc.nextLine();
			if (nombreCompeticion.startsWith("Vuelta ") && nombreCompeticion.contains(" ")&& nombreCompeticion.contains(" ")) {
				nombreCorrecto = true;
			}
		} while (nombreCorrecto == false);
		System.out.println("Buena eleccion de nombre. El nombre con las vocales en mayúscula sería:");
		System.out.println(nombreCompeticion.replace("a","A").replace("e","E").replace("i","I").replace("o","O").replace("u","U")); 
		 

		System.out.println("Dime cuántas etapas va a tener la vuelta");
		numeroEtapas = Byte.parseByte(sc.nextLine());
		short[] etapas = new short[numeroEtapas];

		Random r = new Random();
		for (int i = 0; i < etapas.length; i++) {
			etapas[i] += r.nextInt(80, 201);
			System.out.println(etapas[i]);

		}
		// Ejercicio 6
		/*short contador = 0;
		for (int i = 0; i < etapas.length; i++) {
			contador += etapas[i];
			System.out.println("La suma total de kilómetros de las etapas es de: " + contador);
		}*/
		
		//Ejercicio7
		System.out.println(Funciones.cuentaKilometros(numeroEtapas, numeroEtapas));
		//Ejercicio 8
		System.out.println(Funciones.etapaMasLarga(etapas));

		String[] corredores;
		System.out.println("El número de etapas es de " + numeroEtapas+". Por tanto, como tiene que haber un corredor más que número de etapas, el número de corredores es de "+(numeroEtapas+1));
	}
}
