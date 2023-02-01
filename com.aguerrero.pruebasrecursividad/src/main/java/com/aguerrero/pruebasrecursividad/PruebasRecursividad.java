package com.aguerrero.pruebasrecursividad;

import java.util.Scanner;

public class PruebasRecursividad {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in); System.out.
		 println("Dime una letra minúscula y te digo todas las vocales entre a y esa letra"
		 ); char letraFinal = sc.nextLine().charAt(0); // Convierte este bucle en una función recursiva que se pueda llamar así: //
		 /*System.out.println(FuncionesSinMain.letrasRecursivas('a',letraFinal)); for (byte i =
		 (byte) letraFinal; i >= 'a'; i--) { if ((char) i == 'a' || (char) i == 'e' ||
		 (char) i == 'i' || (char) i == 'o' || (char) i == 'u') {
		 System.out.println((char) i);
		 System.out.println(FuncionesSinMain.letrasRecursivas((byte)letraFinal)); } }*/
		 

		// PracticandoRecursividad.imprimeDivisores(2, 8904);
		// int posibleDivisor=2;
		/*
		 * int leBuscoDivisores=8904; 
		 * for (int i = 2; i <= leBuscoDivisores/2; i++) {
		 * if(leBuscoDivisores%i==0) {
		 * System.out.println(i+" es divisor de "+leBuscoDivisores); //posibleDivisor++;
		 * 
		 * }
		 */
		Scanner sc1 = new Scanner(System.in);

		System.out.println("Introduce un texto");
		String texto = sc1.nextLine();
		System.out.println("Y ahora una letra para buscarla en el texto");
		/*char letra = sc.nextLine().charAt(0);

		byte contador = 0;
		for (short i = 0; i < texto.length(); i++) {
			if (texto.charAt(i) == letra) {
				contador++;
			}
		}
		System.out.println(letra + " aparece " + contador + " veces.");*/
		System.out.println(PracticandoRecursividad.cuentaLetras((short) 0, texto, 'e'));
	}

}
