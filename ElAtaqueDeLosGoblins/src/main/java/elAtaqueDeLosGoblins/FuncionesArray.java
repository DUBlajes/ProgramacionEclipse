package elAtaqueDeLosGoblins;

import java.util.Random;
import java.util.Scanner;

/**
 * Clase con varias funciones auxiliares para el ejercicio de El Ataque de los
 * Goblins en 1D
 * 
 * @author Álvaro Guerrero
 *
 */
public class FuncionesArray {
//Crea una función llamada generTablero, que reciba por argumentos un byte tamaño y devuelva un String[]. Dentro de la función, crea un String[] del tamaño indicado por argumentos y rellena todas sus posiciones con el String "_". Luego devuelve el array.

	/**
	 * Funcion que genera un array de 1 dimensión que funcionará como tablero en el
	 * juego.
	 * 
	 * @param tamanio byte que determina el tamaño que tendrá el tablero
	 * @return array tablero, donde se ejecutará el juego.
	 */
	public static String[] generaTablero(byte tamanio) {
		String[] tablero = new String[tamanio];
		for (int i = 0; i < tablero.length; i++) {
			tablero[i] = "#";
		}
		return tablero;
	}
	// ♨ 🍙 🏞 🌀
	// HECHO Haz una función public static String imprime(String[] array){}
	// HECHO Primero concatena en el String que se devuelve tantos simbolos
	// aleatorios entre estos 4 (o 4 letras si no tienes simbolos) como la longitud
	// del array +2.
	// HECHO Después concatena un \n.
	// HECHO Después un símbolo aleatorio entre esos 4.
	// HECHO Después todos los elementos del array en la misma linea.
	// HECHO Después otro símbolo aleatorio y un \n.
	// por último,como la longitud del array +2
	// EJ: Si tenemos el array ____ (4 posiciones), se devolverá:
	// 🌀🍙♨🌀🏞🍙
	// 🌀⬜⬜⬜⬜
	// Documenta el proyecto menos Funciones Jugar

	/**
	 * Funcion de tipo String que sirve para imprimir distintos símbolos en el
	 * tablero de juego.
	 * 
	 * @param array array que tendremos en cuenta en el bucle para imprimir los
	 *              distintos símbolos. En este caso, será el tablero.
	 * @return String en el que se concatenan todos los símbolos y saltos de línea
	 */
	public static String imprime(String[] array) {
		Scanner sc = new Scanner(System.in);
		String ret = "";
		Random r = new Random();
		String array2[] = { "A", "B", "C", "D" };
		for (byte i = 0; i < array.length + 2; i++) {
			ret += array2[r.nextInt(array2.length)];
		}
		ret += "\n";
		ret += array2[r.nextInt(array2.length)];
		for (byte i = 0; i < array.length; i++) {
			ret += array[i];
		}
		ret += array2[r.nextInt(array2.length)];
		ret += "\n";
		for (byte i = 0; i < array.length + 2; i++) {
			ret += array2[r.nextInt(array2.length)];
		}
		return ret;
	}
	
	
	
	public static void jugar(String nombreJugador, char generoJugador) {

		System.out.println("Bienvenid" + Funciones.terminacionGenero(generoJugador, false) + " al Ataque de los Goblins en 1D");
		Scanner sc = new Scanner(System.in);
		byte tamanio;
		do {
			System.out.println("Dime el tamaño del tablero (1-127)");
			tamanio = Byte.parseByte(sc.nextLine());
		} while (tamanio < 0 || tamanio > 127);

		String[] tablero =FuncionesArray.generaTablero(tamanio);
		
		 //👩 👨 웃 
		String iconoJugador=(generoJugador=='m'?"👨":generoJugador=='f'?"👩":"웃");
		byte posicionJugador=0;
		tablero[posicionJugador]=iconoJugador;
		//Con esto relleno el ultimo tercio del tablero de enemigos.
		for (byte i = (byte)(tablero.length-1); i > (tablero.length-1)*2/3; i--) { 
			tablero[i]="👺";

		}
		System.out.println(FuncionesArray.imprime(tablero));
	}
}
