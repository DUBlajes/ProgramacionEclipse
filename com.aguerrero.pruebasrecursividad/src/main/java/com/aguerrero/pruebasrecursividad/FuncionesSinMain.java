package com.aguerrero.pruebasrecursividad;

import java.nio.charset.Charset;

//import java.util.Scanner;

public class FuncionesSinMain {
//	public static void entiendesRecursividad() {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("¿Entiendes la recursividad? (s/n)");
//		boolean loEntiende=sc.nextLine().toLowerCase().charAt(0)=='s';
//		if(!loEntiende) {//caso recursivo
//			FuncionesSinMain.entiendesRecursividad();
//		}else {//caso base
//			System.out.println("Me alegro.");
//		}
	public static String forRecursivo(byte i, byte nf) {
		String ret = "";
		if (i < nf) { // Caso recursivo
			ret += forRecursivo((byte) (i - 1), (byte) nf);
			ret += ("iteración: " + i + "\n");
		} else {// Caso base
			// Si hubiese algo cuando salga del bucle, se pone aquí.
		}
		return ret;
	}

	public static String letrasRecursivas(byte i) {
		String ret = "";
		if ((char) i == 'a' || (char) i == 'e' || (char) i == 'i' || (char) i == 'o' || (char) i == 'u') {// Caso recursivo
			ret += (char) i + "\n";
		} 
		if (i >= 'a') {
			ret += letrasRecursivas((byte) (i - 1));
		} else {// Caso base
			// Si hubiese algo cuando salga del bucle, se pone aquí.
		}
		return ret;
	}
}
