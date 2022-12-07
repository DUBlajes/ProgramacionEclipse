package com.aguerrero.pruebasFunciones;

import java.util.Random;

/**
 * Clase con funciones auxiliares para el ejemplo de usos de funciones. Tenemos
 * varias funciones matemáticas como dos que generan aleatorios y una que
 * comprueba si un número es primo. Se irán añadiendo más en el futuro.
 * 
 * @author Álvaro Guerrero
 * @author Perico el de los palotes
 * @version 4
 * @since o.3b Funcion inicial de prueba que solo hace un sysout que dice hola
 */

public class Funciones {
	public static void funcionPrueba() { // int, boolean, String... puede devolver LO QUE SEA. Void es que devuelve el
											// vacío, no devuelve nada.
		System.out.println("Hola desde la función");
	}

	public static byte numeroAleatorio(byte limite) { // Podemos tener dos funciones con nombres distintos siempre que
		Random rand = new Random();
		byte aleatorio = (byte) rand.nextInt(limite);
		// los argumentos sean distintos.
		return aleatorio;

	}

	/**
	 * Función que devuelve dos número aleatorios entre el valor inferior y el valor
	 * límite. EL valor del límite itene que ser 127 como mucho. El valor siempre
	 * tiene que ser menor al del límite.
	 * 
	 * @param inferior Numero mínimo (incluido) que podría salir aleatoriamente
	 * @param limite   número máximo (no incluido) que saldrá alatoriamente. El
	 *                 mínimo posible es 0
	 * @return número aleatorio entre inferior (incluido) y límite (no incluido)
	 */
	public static byte numeroAleatorio(byte inferior, byte limite) {
		Random rand = new Random();
		byte aleatorio = (byte) rand.nextInt(inferior, limite);
		return aleatorio;
	}

	/**
	 * Función que dado un número long, te dice si es primo o no.
	 * 
	 * @param numero número long que se comprobará si es primo o no.
	 * @return true si el número es primo, false si no lo es.
	 */
	public static boolean esPrimo(long numero) {
		for (long i = 2; i <= numero / 2; i++) {
			if (numero % i == 0) {
				// No es un número primo
				return false;
			}
		}
		return true;

	}
}
