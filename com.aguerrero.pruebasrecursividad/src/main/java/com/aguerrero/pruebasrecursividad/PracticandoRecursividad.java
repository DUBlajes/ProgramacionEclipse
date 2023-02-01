package com.aguerrero.pruebasrecursividad;

public class PracticandoRecursividad {
	public static void imprimeDivisores(int posibleDivisor, int leBuscoDivisores) {
		if (posibleDivisor <= leBuscoDivisores / 2) { // Caso recursivo (iterativo)
			if (leBuscoDivisores % posibleDivisor == 0) {
				System.out.println(posibleDivisor + " es divisor de " + leBuscoDivisores);
			}
			imprimeDivisores(posibleDivisor + 1, leBuscoDivisores);
		} else { // Caso base

		}
	}

	public static byte cuentaLetras(short i, String texto, char letra) {
		byte ret=0;
		if (i < texto.length()) {
			if (texto.charAt(i) == letra) {
				ret++;
			}
			ret+=PracticandoRecursividad.cuentaLetras(++i, texto, letra);
		} else {

		}
		return ret;
		

	}
}
