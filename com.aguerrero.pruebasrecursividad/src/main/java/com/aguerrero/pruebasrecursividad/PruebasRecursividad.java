package com.aguerrero.pruebasrecursividad;

import java.util.Scanner;

public class PruebasRecursividad {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una letra minúscula y te digo todas las vocales entre a y esa letra");
		char letraFinal = sc.nextLine().charAt(0);
		// Convierte este bucle en una función recursiva que se pueda llamar así:
		// System.out.println(Funciones.letrasRecursivas('a',letraFinal));
		for (byte i = (byte) letraFinal; i >= 'a'; i--) {
			if ((char) i == 'a' || (char) i == 'e' || (char) i == 'i' || (char) i == 'o' || (char) i == 'u') {
System.out.println((char) i);
				System.out.println(FuncionesSinMain.letrasRecursivas((byte)letraFinal));
			}
		}
	}
}
	
