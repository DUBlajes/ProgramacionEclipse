package repasoArrays;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * String
		 * frase="me he emparanollao, porque la vida es dura, pero me da igual, porque me voy a clase de programacion y me deprimo un poco menos. Y por eso no tengo una depresion enorme"
		 * ; String[] resultado=(" "+frase+" ").split(" me ");
		 * System.out.println(resultado.length-1); //Si en el split pongo cadena vacia
		 * "", coge todas las letras de la palabra. Vamos a tener que convertir un array
		 * de string en un array de char.
		 */

		System.out.println("Bienvenida a este juego. Te voy a dar unas letras desordenadas.");
		String palabraElegida = Funciones.palabraAzar();
		char[] palabraComoArray = Funciones.stringAArray(palabraElegida);
		char[] original = Funciones.copiaArray(palabraComoArray);
		// Voy a hacer 100 intercambios aleatorios de letras
		Random r = new Random();
		for (byte i = 0; i < 100; i++) {
			byte p1 = (byte) r.nextInt(palabraComoArray.length);
			byte p2 = (byte) r.nextInt(palabraComoArray.length);
			Funciones.intercambio(palabraComoArray, p1, p2);
		}
		System.out.println(Funciones.imprimeArray(palabraComoArray));
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cual es la palabra que estamos buscando?");
		String eleccion = sc.nextLine();
		System.out.println(
				"De acuerdo. Has introducido una palabra. Para que quede bonita, te voy a separar cada una de sus letras.");
		String[] separaLetras = eleccion.split("");
		for (byte i = 0; i < eleccion.length(); i++) {
			System.out.print(separaLetras[i] + "   ");
		}
		System.out.println();
		System.out.println(
				"Llega el momento de la verdad. La palabra que has introducido, ¿es la misma que la palabra original? Vamos a comprobarlo. Pulsa enter para continuar.");
		System.out.println(sc.nextLine());
		char[] paComparar = eleccion.toCharArray();

		if (Funciones.sonIguales(original, paComparar) == true) {
			System.out
					.println("Efectivamente, la palabra que has introducido era la original que buscabas. Enhorabuena");
		} else {
			System.out.println("Te has equivocado. Eres un inutil. Normal que tus padres no te quieran.");
		}
	}
}
