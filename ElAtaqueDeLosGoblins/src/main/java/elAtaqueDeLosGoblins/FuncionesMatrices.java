package elAtaqueDeLosGoblins;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/**
 * Clase con varias funciones auxiliares para el ejercicio de El Ataque de los Goblins en 2D
 * @author Álvaro Guerrero
 *
 */
public class FuncionesMatrices {
	/**
	 * Funcion que genera una matriz de 2 dimensiones que funcionará como tablero en
	 * el juego.
	 * 
	 * @param tamanio byte que determina el tamaño que tendrá el tablero
	 * @return matriz tablero, donde se ejecutará el juego.
	 */
	public static String[][] generaTablero(byte tamanio) {
		String[][]tablero=new String[tamanio][tamanio];
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				tablero[i][j]="♒";
			}
		}
		return tablero;
	}
	public static void jugar(String nombreJugador, char generoJugador) {
		System.out.println("Bienvenid" + Funciones.terminacionGenero(generoJugador, false) + " al Ataque de los Goblins en 2D");
		Scanner sc = new Scanner(System.in);
		byte tamanio;
		do {
			System.out.println("Dime el tamaño de la matriz (4-127)");
			tamanio = Byte.parseByte(sc.nextLine());
		} while (tamanio < 4 || tamanio > 127);

		String[][]tablero=FuncionesMatrices.generaTablero(tamanio);
		String iconoJugador=(generoJugador=='m'?"👨":generoJugador=='f'?"👩":"웃");
		String posString=FuncionesMatrices.colocaElemento(tablero, iconoJugador); //"12,5"
		byte filaJugador;
		byte columnaJugador;
	
		for (short i = 0; i < tablero.length*tablero[0].length/3; i++) {
			FuncionesMatrices.colocaElemento(tablero,"👺");
		}
		System.out.println(FuncionesMatrices.imprime(tablero));
		
	}
	//Lo mismo que el array, pero con matrices. Se imprime rodeada de un marco de simbolos aleatorios
	public static String imprime(String[][] matriz) {
		String ret = "";
		Random r = new Random();
		String simbolos[] = { "♨", "🍙", "🏞", "🌀" };
		for (byte i = 0; i < matriz.length + 2; i++) {
			ret += simbolos[r.nextInt(simbolos.length)];
		}
		ret += "\n";
		for (byte i = 0; i < matriz.length; i++) {
			ret += simbolos[r.nextInt(simbolos.length)];
			for (int j = 0; j < matriz[i].length; j++) {
				ret += matriz[i][j];
			}
		
		ret += simbolos[r.nextInt(simbolos.length)];
		ret += "\n";
	}
		for (byte i = 0; i < matriz.length + 2; i++) {
			ret += simbolos[r.nextInt(simbolos.length)];
		}
		return ret;
	}

	/**
	 * Coloca el elemento en una posicion aleatoria de la matriz, y devuelve concatenado en un String la fila y la columna en que se ha colocado el elemento, separados por una coma.
	 * Por ejemplo, si se elige aleatoriamente la fila 4 y la columna nueve, se devuelve "4,9"
	 * @param matriz la matriz donde se inserta el elemento
	 * @param elemento elemento a insertar
	 * @return devuelve concatenadas y separadas por coma la fila y columna donde se inserto el elemento.
	 */
	public static String colocaElemento(String[][] matriz, String elemento) {
		//Haz que esta fila y columna escogida aleatoriamente tenga que contener, por fuerza, el icono del tablero. Si no la contiene, volver a sortear tanto fila como columna.
		String ret="";
		Random r=new Random();
		byte fila;
		byte columna;
		do {
		 fila=(byte)(r.nextInt(matriz.length));
		 columna=(byte)(r.nextInt(matriz.length));
		}while (!matriz[fila][columna].equals("♒"));
		
		matriz[fila][columna]=elemento;
		ret= fila+","+columna;
		return ret;
	}
}
