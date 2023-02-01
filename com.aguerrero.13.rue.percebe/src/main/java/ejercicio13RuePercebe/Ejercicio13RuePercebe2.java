package ejercicio13RuePercebe;

import java.util.Scanner;

/**
 * 
 * Clase que recoge al main del programa.
 * 
 * @author Álvaro Guerrero
 *
 */
public class Ejercicio13RuePercebe2 {
	/**
	 * Método principal del programa. Te pide un número de plantas y un número de
	 * casas por planta y las imprime por pantalla según el número que hayas
	 * introducido por consola.
	 * 
	 * @param args El primer argumento indicará el número de plantas. Si está
	 *             puesto, debe ser un número positivo mayor a 0. Si no está
	 *             presente, se pedirá por teclado. El segundo argumento indicará el
	 *             número de pisos por planta. Si está puesto, debe ser un número
	 *             positivo mayor a 0. Si no está presente, se pedirá por teclado
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
		// Paso 1: Traerse la declaración de todas las variables que puedan coger su
		// valor de argumentos al principio del programa, e inicializarlas a valores
		// absurdos o imposibles.

		// DECLARACIÓN DE VARIABLES
		byte nPlantas = -1;
		byte nPisos = -1;

		// Paso 2: Al principio del programa, recorrer todos los argumentos y, si encontramos el
		// argumento que necesitamos para cambiar el valor a una variable, se lo cambio. Los míos van a ser -nPlantas y -nPisos
		//Paso 3: a la hora de pedirlo por teclado o darle un valor por defecto, compruebo si sigue teniendo el valor absurdo que le puse. Si lo sigue teniendo, lo pido por teclado. Si no, no lo pido, porque significa que ha venido por argumentos
		for(byte i=0; i<args.length;i++) {
			if(args[i].equals("-nPlantas")) {
				nPlantas=Byte.parseByte(args[i+1]);
			}
		}
		System.out.println("¿Cuántas plantas quieres que tenga el edificio?");
		if(nPlantas==-1) {
		nPlantas = Byte.parseByte(sc.nextLine());
		}
	
		System.out.println("¿Cuántas casas quieres en cada planta?");
		if(nPisos==-1) {
		nPisos = Byte.parseByte(sc.nextLine());
		}
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
