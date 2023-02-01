package repasoArrays;

import java.util.Random;

public class Funciones {
	/**
	 * Función que, dado un array, una posición y un valor, mete (si puede) el valor
	 * en la posición del array indicada.
	 * 
	 * @param array    array donde se va a cambiar el valor de una de las posiciones
	 * @param posicion la posición del array cuyo valor se va a cambiar
	 * @param valor    valor que se va a introducir en una posición del array
	 * @return true si se ha podido insertar, false si no.
	 */
	/*
	 * public static boolean valorEnPosicion(String[] array, byte posicion, String
	 * valor) { if (posicion<0||posicion>=array.length) { return false; }
	 * 
	 * array[posicion]=valor; return true;}
	 */

	public static boolean intercambio(char[] letras, byte p1, byte p2) {

		if (p1 > letras.length || p2 > letras.length) {
			return false;
		}
		char auxiliar = letras[p1];
		letras[p1] = letras[p2];
		letras[p2] = auxiliar;
		return true;

	}

	public static String palabraAzar() {
		String[] palabrasPosibles = { "cancamusa", "teclado", "bolsa", "ornitorrinco", "kamehameha", "australopitecido",
				"redencion", "batracio", "algoritmo", "igual", "parecidas" };

		Random r = new Random();
		return palabrasPosibles[r.nextInt(palabrasPosibles.length)];
	}

	public static String imprimeArray(char[] array) {
		String ret = "";
		for (byte i = 0; i < array.length; i++) {
			ret += array[i] + "\t";
		}
		return ret;
	}

	public static char[] stringAArray(String orig) {
		char[] ret = new char[orig.length()];
		for (byte i = 0; i < orig.length(); i++) {
			ret[i] = orig.charAt(i);
		}
		return ret;
	}

	public static char[] arrayAlAzar() {
		return stringAArray(palabraAzar());
	}

	public static char[] copiaArray(char[] orig) {
		char[] ret = new char[orig.length];
		for (byte i = 0; i < orig.length; i++) {
			ret[i] = orig[i];
		}
		return ret;
	}

	public static boolean sonIguales(char[] arr1, char[] arr2) {
		if (arr1.length != arr2.length) {
			return false;
		}

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}

}
