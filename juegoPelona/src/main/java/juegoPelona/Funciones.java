package juegoPelona;

import java.util.Random;
import java.util.Scanner;

public class Funciones {
	public static byte pideNumeroEntre(String msg, byte min, byte max) {

		Scanner sc = new Scanner(System.in);

		System.out.println(msg);

		byte numero = Byte.parseByte(sc.nextLine());

		if (numero < min || numero > max) {

			return pideNumeroEntre(msg, min, max);

		}

		return numero;

	}

	public static char[] creaTablero(byte tam) {

		char[] tablero = new char[tam];

		for (byte i = 0; i < tablero.length; i++) {

			tablero[i] = '_';

		}

		return tablero;

	}

	public static String imprimeArrayBonico(char[] frente, char[] fondo) {

		String ret = "| ";

		for (byte i = 0; i < frente.length; i++) {

			if (frente[i] != '_') {

				ret += frente[i] + "\t";

			} else {

				ret += fondo[i] + "\t";

			}

		}

		ret += "|\n  ";

		for (byte i = 0; i < frente.length; i++) {

			ret += i + "\t";

		}

		return ret;

	}

	/**
	 * 
	 * Función que coloca en una posición aleatoria del array QUE CONTENGA _ el
	 * 
	 * caracter que se pasa por segundo argumento
	 *
	 * 
	 * 
	 * @param destino  array que se modificará
	 * 
	 * @param caracter el carácter que se insertará aleatoriamente en una posición
	 * 
	 *                 QUE CONTENGA _
	 * 
	 * @return la posición en la que se ha insertado el carácter
	 * 
	 */

	public static byte colocaAleatoriamente(char[] destino, char caracter) {

		Random r = new Random();

		byte posicion = (byte) r.nextInt(destino.length);

		if (destino[posicion] != '_') {

			return colocaAleatoriamente(destino, caracter);

		}

		destino[posicion] = caracter;

		return posicion;

	}

	public static byte moverElemento(char[] tablero, char pj, byte direccion, byte posicion) {

		tablero[posicion] = '_';

		// En segundo lugar, cambio la posición de la pelona

		if (direccion == -1) {

			if (posicion != 0) {

				posicion--;

			} else { // Tratamiento especial para el caso extremo

				posicion = (byte) (tablero.length - 1);

			}

		}

		if (direccion == 1) {

			if (posicion != tablero.length - 1) {

				posicion++;

			} else { // Tratamiento especial para el caso extremo

				posicion = 0;

			}

		}

		// Por último, pinto a la pelona en su nueva posición

		tablero[posicion] = pj;

		return posicion;

	}

}