package com.aguerrero.examen3;

import java.util.Random;

/**
 * Clase con una funció auxiliar para el ejercicio de la competición ciclist,
 * con el objetivo de evitar repetir código en el main.
 * 
 * @author Álvaro Guerrero
 *
 */
public class Funciones {
	/**
	 * Función de tipo array de short que devolverá, en un short, la mayor distancia en kilómetros del array que ha sido introducido por los argumentos.
	 * 
	 * @param kilometros: array de short que contemplará las distintas distancias
	 *                    que se hayan introducido en el main.
	 * @return short con la distancia en kilómetros más larga
	 */
	public static short etapaMasLarga(short[] kilometros) {
		Random rand = new Random();
		short ret = (short) rand.nextInt(80, 201);
		return ret;

	}
/**
 * Función recursiva que almacena la distancia en kilómetros de cada etapa y así ahorrar código en el main.
 * @param i iterador de la función recursiva
 * @param etapas número de etapas cuya distancia va a ser sumada. 
 * @return short que suma los kilómetros de las etapas introducidas
 */
	public static short cuentaKilometros(int i, byte etapas) {
		short ret = 0;
		if (i < etapas) { // Caso recursivo (iterativo)
			ret+= etapas;
			{
			}
			Funciones.cuentaKilometros(++i, etapas);
		} else { // Caso base

		}
		return ret;
	}
}
