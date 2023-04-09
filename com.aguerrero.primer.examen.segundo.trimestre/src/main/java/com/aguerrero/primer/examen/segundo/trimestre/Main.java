package com.aguerrero.primer.examen.segundo.trimestre;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ☁
		// ꆜ
		// Prueba ejercicio 2
		byte tamanio = -1;
		for (byte i = 0; i < args.length; i++) {
			if (args[i].equals("-tam")) {
				tamanio = Byte.parseByte(args[i + 1]);
			}
		}
		if (tamanio == -1) {
			System.out.println("¿De qué tamaño quieres la matriz? (12-16)");
			tamanio = Byte.parseByte(sc.nextLine());

		}
		char[][]matriz=Funciones.creaMatrizEspacios(tamanio);
		char[][]escena=new char[tamanio][tamanio];
			Funciones.ponerNubes(matriz);
			Funciones.insertarFraseEufrasio(escena);
			Funciones.generarEscena(escena);
			System.out.println(Funciones.imprimeMatriz(escena));


	}
}
