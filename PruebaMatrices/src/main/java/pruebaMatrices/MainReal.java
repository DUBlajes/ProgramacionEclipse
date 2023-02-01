package pruebaMatrices;

import java.util.Scanner;

public class MainReal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime de cuantas FILAS quieres la sopa de letras");
		byte nFilas = Byte.parseByte(sc.nextLine());
		System.out.println("Dime de cuantas COLUMNAS quieres la sopa de letras");
		byte nColumnas = Byte.parseByte(sc.nextLine());
		char[][] matriz = Funciones.creaSopa(nFilas, nColumnas);
		System.out.println("Dime cuantas palabras quieres insertar");
		byte nPalabras = Byte.parseByte(sc.nextLine());

		for (byte i = 0; i < nPalabras; i++) {
			boolean pudeInsertar;
			do {
				System.out.println("Introduce la palabra a insertar en la matriz " + "(" + (i+1) + "/" + nPalabras + ")");
				String palabra = sc.nextLine();
				System.out.println("Dime la fila donde insertaras la palabra");
				byte fila = Byte.parseByte(sc.nextLine());
				System.out.println("Dime la columna donde insertaras la palabra");
				byte columna = Byte.parseByte(sc.nextLine());
				pudeInsertar = Funciones.insertarPalabra(matriz, palabra, fila, columna);
				if (pudeInsertar) {
					System.out.println("Se insert'o con exito");
				} else {
					System.out.println("No se pudo insertar esa palabra ahi. No cabe");
				}
			} while (!pudeInsertar);

		}
		System.out.println(Funciones.imprimeMatriz(matriz));
	}
}
