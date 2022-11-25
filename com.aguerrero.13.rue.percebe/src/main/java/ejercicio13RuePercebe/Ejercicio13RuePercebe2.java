package ejercicio13RuePercebe;

import java.util.Scanner;

/**
 * Método principal del programa. Te pide un número de plantas y un número de
 * casas por planta y las imprime por pantalla según el número que hayas
 * introducido por consola.
 * 
 * @author Álvaro Guerrero
 *
 */
public class Ejercicio13RuePercebe2 {
	/**
	 * 
	 * @param args De momento, sin valor
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * Aquí comenzamos declarando las dos variables que vamos a usar: nPlantas y
		 * nPisos. Ambas variables tomarán el valor que el usuario introduzca por
		 * pantalla. Por esa razón, ambas son datos byte, ya que no queremos que el
		 * usuario pueda introducir más de 127 en cada una de las variables.
		 */
		byte nPlantas;
		byte nPisos;
		System.out.println("¿Cuántas casas quieres en cada planta?");
		nPisos = Byte.parseByte(sc.nextLine());
		System.out.println("¿Cuántas plantas quieres que tenga el edificio?");
		nPlantas = Byte.parseByte(sc.nextLine());
		/*
		 * Aquí simplemente queremos que, antes de que el programa imprima pisos o
		 * casas, imprima el cartel de "13 Rue del Percebe"
		 */
		System.out.println("|----------------------------|" + "\n|     13 Rue del Percebe     |"
				+ "\n|----------------------------|");
		/*
		 * Para evitar repetir código, en este bucle hemos determinado que, por cada
		 * iteración (que en este caso es la variable nPlantas, es decir, el número de
		 * plantas que va a tener el edificio), la consola imprima esos tres dibujos que
		 * corresponden con el techo y las paredes de los pisos, ya que no podemos hacer
		 * el dibujo completo concatenando Strings. La variable nPisos indica el número
		 * de veces que se imprimirán. Si esta variable toma el valor de, por ejemplo,
		 * 5, se imprimirán los tres dibujos un total de 5 veces, uno al lado del otro.
		 */
		for (byte p = 0; p < nPlantas; p++) {
			System.out.println(Funciones.printAltura("| --- |", nPisos));
			System.out.println(Funciones.printAltura("|     |", nPisos));
			System.out.println(Funciones.printAltura("|     |", nPisos));

		}
	}
}
