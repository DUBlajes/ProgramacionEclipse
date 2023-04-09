package examenMapa;

import java.util.Random;
import java.util.Scanner;

public class Funciones {
	public static short pideNumero(String msg, byte min, short max) {
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		short numero = Short.parseShort(sc.nextLine());
		if (numero < min || numero > max) {
			return pideNumero(msg, min, max);
		}
		return numero;
	}

	public static char[][] matrizDeAgua(byte nFilas, byte nColumnas) {
		char[][] matriz = new char[nFilas][nColumnas];
		for (byte i = 0; i < matriz.length; i++) {
			for (byte j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = '~';
			}
		}
		return matriz;
	}

	public static void ponerTerreno(char[][] matriz, short nContinentes) {
		Random r = new Random();
		for (short i = 0; i < nContinentes; i++) {
			byte fila;
			byte columna;
			do {
				fila = (byte) r.nextInt(matriz.length);
				columna = (byte) r.nextInt(matriz[fila].length);
			} while (matriz[fila][columna] != '~');
			matriz[fila][columna] = '#';
		}
	}

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

	public static void extenderTerreno(char[][] matriz) {
		Random r = new Random();
		for (byte i = 0; i < matriz.length; i++) {
			for (byte j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == '#') {
					// Cada vez que una variable sume, que no se pase de length. Cada vez que reste,
					// que sea mayor que 0. Cuando es las filas, matriz.length-1. Si es las
					// columnas, matriz[i].length-1.

					if (i > 0 && j > 0 && matriz[i - 1][j - 1] != '#') { // arriba izda
						boolean pongoPorCiento = r.nextInt(100) < 40;
						if (pongoPorCiento) {
							matriz[i - 1][j - 1] = '%';
						}
					}
					if (i > 0 && matriz[i - 1][j] != '#') {// justo arriba
						matriz[i - 1][j] = (r.nextInt(100) < 40 ? '%' : matriz[i - 1][j]);
					}
					if (i > 0 && j < matriz[i].length - 1 && matriz[i - 1][j + 1] != '#') {// arriba derecha
						matriz[i - 1][j + 1] = (r.nextInt(100) < 40 ? '%' : matriz[i - 1][j + 1]);
					}
					if (j > 0 && matriz[i][j - 1] != '#') {// misma fila izda
						matriz[i][j - 1] = (r.nextInt(100) < 40 ? '%' : matriz[i][j - 1]);
					}
					if (j < matriz[i].length - 1 && matriz[i][j + 1] != '#') {// misma fila dcha
						matriz[i][j + 1] = (r.nextInt(100) < 40 ? '%' : matriz[i][j + 1]);
					}
					if (i < matriz.length - 1 && j > 0 && matriz[i + 1][j - 1] != '#') {// debajo izquierda
						matriz[i + 1][j - 1] = (r.nextInt(100) < 40 ? '%' : matriz[i + 1][j - 1]);
					}
					if (i < matriz.length - 1 && matriz[i + 1][j] != '#') {// justo debajo
						matriz[i + 1][j] = (r.nextInt(100) < 40 ? '%' : matriz[i + 1][j]);
					}
					if (i < matriz.length - 1 && j < matriz[i].length - 1 && matriz[i + 1][j + 1] != '#') {// debajo
																											// derecha
						matriz[i + 1][j + 1] = (r.nextInt(100) < 40 ? '%' : matriz[i + 1][j + 1]);
					}
				}

			}

		}
		for (byte i = 0; i < matriz.length; i++) {
			for (byte j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j]=='%') {
					matriz[i][j]='#';
				}
			}
		}
	}
}
