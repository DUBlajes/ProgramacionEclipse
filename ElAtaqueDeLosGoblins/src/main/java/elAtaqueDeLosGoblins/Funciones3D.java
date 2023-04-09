package elAtaqueDeLosGoblins;

import java.util.Scanner;

/**
 * Clase con varias funciones auxiliares para el ejercicio de El Ataque de los Goblins en 3D
 * @author Álvaro Guerrero
 *
 */
public class Funciones3D {
	/**
	 * Funcion que genera una matriz de 3 dimensiones que funcionará como tablero en
	 * el juego.
	 * 
	 * @param tamanio byte que determina el tamaño que tendrá el tablero
	 * @return matriz tablero, donde se ejecutará el juego.
	 */
	public static String[][][] generaTablero(byte tamanio) {
		String[][][] tablero = new String[tamanio][tamanio][tamanio];
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				for (int k = 0; k < tablero.length; k++) {
					tablero[i][j][k] = "♒";
				}
			}

		}
		return tablero;
	}

	public static void jugar(String nombreJugador, char generoJugador) {
		System.out.println("Bienvenid" + Funciones.terminacionGenero(generoJugador, false) + " al Ataque de los Goblins en 3D");
		Scanner sc = new Scanner(System.in);
		byte tamanio;
		do {
			System.out.println("Dime el tamaño del tablero (1-127)");
			tamanio = Byte.parseByte(sc.nextLine());
		} while (tamanio < 0 || tamanio > 127);

		System.out.println(Funciones3D.generaTablero(tamanio));
	}

}
