package com.aguerrero.primer.examen.segundo.trimestre;

import java.util.Random;
import java.util.Scanner;
/**
 * Clase con funciones auxiliares para evitar repetir código en el main o para hacer distintas ejecuciones y que no abarrote el main.
 * @author Álvaro Guerrero
 *
 */
public class Funciones {
/**
 * Función que imprime la matriz en el main tras haber indicado en el resto de funciones lo que tiene que mostrar
 * @param matriz matriz bidimensional de char
 * @return String que concatena todo el contenido de la matriz
 */
	public static String imprimeMatriz(char[][] matriz) {
		String ret = "";

		for (byte i = 0; i < matriz.length; i++) {
			for (byte j = 0; j < matriz[i].length; j++) {
				ret += matriz[i][j];
			}
			ret += "\n";
		}
		return ret;
	}
/**
 * Función que sirve para crear espacios en el dibujo final.
 * @param tamanio byte que indicará tanto el número de filas como de columnas. Tiene que ser un número entre 12 y 16 (ambos incluidos)
 * @return char[][] una matriz en la que todas sus posiciones tienen el caracter espacio. 
 */
	public static char[][] creaMatrizEspacios(byte tamanio) {
		if (tamanio < 12 || tamanio > 16) {
			return null;
		}
		char[][] ret = new char[tamanio / 2][tamanio];
		for (byte i = 0; i < ret.length; i++) {
			for (byte j = 0; j < ret[i].length; j++) {
				ret[i][j] = ' ';
			}
		}
		return ret;
	}
/**
 * Función que no devuelve nada y que coloca nubes en la primera fila de la matriz final del dibujo del main
 * @param matriz matriz de char que debemos recorrer para poner en la fila 0 de todas las columnas una nube
 */
	public static void ponerNubes(char[][] matriz) {
		for (byte i = 0; i < matriz.length; i++) {
			for (byte j = 0; j < matriz[i].length; j++) {
				matriz[0][j] = '☁';
			}
		}
	}
/**
 * Función que no devuelve nada y que insertará, debajo de las nubes, todas las letras posibles de la frase 'Eufrasio se cayó' dependiendo del número de columnas. A más columnas, más letras de esa frase aparecerán. Si la matriz final tuviese 16 columnas, que es lo máximo que puede tener, tal y como establecimos en la primera función llamada imprimeMatriz, la frase se mostrará por completo.
 * @param matriz
 */
	public static void insertarFraseEufrasio(char[][] matriz) {
		for (byte i = 0; i < matriz.length; i++) {
			for (byte j = 0; j < matriz[i].length; j++) {
				 matriz[1][j]=(char)("Eufrasio se cayó".split("")).length;
			}

		}
	}
/**
 * Función que no devuelve nada y que servirá para montar la escena en la que se muestra el personaje de Eufrasio a determinada altura.
 * @param matriz que recorreremos con distintos bucles para ir colocando los distintos elementos de la escena. Como mínimo, esta matriz tiene que tener 3 filas. Si no, no funcionaría.
 */
	public static void generarEscena(char[][] matriz) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		byte nFilas = Byte.parseByte(sc.nextLine());
		byte nColumnas = Byte.parseByte(sc.nextLine());
		byte inicioBalate = (byte) r.nextInt(1, (nColumnas - 2));
		byte alturaBalate = (byte) r.nextInt(2, (nFilas - 1));
		char[][] ret = new char[alturaBalate][inicioBalate];
		
		for (byte i = 0; i < ret.length; i++) {
			for (byte j = 0; j < ret[i].length; j++) {
				ret[alturaBalate][0] = 'ꆜ';
				ret[i][inicioBalate+1]='_';
			}

		}
		for (byte i = 0; i < alturaBalate; i++) {
			for (byte j = 0; j < ret[i].length; j++) {
					ret[i][0]='|';
			}
		}
		
		for (byte i = 0; i < ret.length; i++) {
			for (byte j = 0; j < ret.length; j++) {
				if (i < ret.length - 1 && j < ret[i].length - 1) {
					 ret[i + 1][j + 1]='@'; //Coloco una arroba porque no recuerdo cómo poder poner el símbolo \ sin que me de error.
				}
			}
		}

	}
}
