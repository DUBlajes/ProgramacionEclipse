package pruebaMatrices;

import java.util.Scanner;

public class MainReal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime de cuántas FILAS quieres la sopa de letras");
		byte nFilas = Byte.parseByte(sc.nextLine());
		System.out.println("Dime de cuántas COLUMNAS quieres la sopa de letras");
		byte nColumnas = Byte.parseByte(sc.nextLine());
		char[][] matriz = Funciones.creaSopa(nFilas, nColumnas);
		boolean[][]palabraAqui=Funciones.palabraAqui(nFilas, nColumnas);
		System.out.println("Dime cuántas palabras quieres insertar");
		byte nPalabras = Byte.parseByte(sc.nextLine());

		for (byte i = 0; i < nPalabras; i++) {
			boolean pudeInsertar;
			do {
				System.out.println(
						"Introduce la palabra a insertar en la matriz " + "(" + (i + 1) + "/" + nPalabras + ")");
				String palabra = sc.nextLine();
				System.out.println("Dime la fila donde insertarás la palabra");
				byte fila = Byte.parseByte(sc.nextLine());
				System.out.println("Dime la columna donde insertarás la palabra");
				byte columna = Byte.parseByte(sc.nextLine());
				System.out.println("Dime en qué dirección quieres insertar la palabra:"
						+ "\n\t0 - Horizontal hacia adelante."//HECHO
						+ "\n\t1 - Horizontal hacia atrás." //HECHO
						+ "\n\t2 - Vertical hacia arriba." //HECHO
						+ "\n\t3 - Vertical hacia abajo."//HECHO
						+ "\n\t4 - Diagonal hacia arriba a la derecha." //HECHO
						+ "\n\t5 - Diagonal hacia arriba a la izquierda." //HECHO
						+ "\n\t6 - Diagonal hacia abajo a la derecha."//HECHO
						+ "\n\t7 - Diagonal hacia abajo a la izquierda.");
				byte direccion = Byte.parseByte(sc.nextLine());
				pudeInsertar = Funciones.insertarPalabra(matriz, palabra, fila, columna, direccion, palabraAqui);
				if (pudeInsertar) {
					System.out.println("Se insertó con exito");
				} else {
					System.out.println("No se pudo insertar esa palabra ahí. No cabe");
				}
			} while (!pudeInsertar);

		}
		System.out.println(Funciones.imprimeMatriz(matriz));
		System.out.println(Funciones.imprimeMatriz(palabraAqui));
		
	}
}
