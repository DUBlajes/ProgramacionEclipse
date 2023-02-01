package com.aguerrero.pruebas.arrays;

import java.util.Random;
import java.util.Scanner;

public class PruebasConArrays {
	// Un array es una variable en la que se puede almacenar más de un valor. Algo
	// así como el inventario del Minecraft. Todos los huecos del array tienen que
	// ser para lo mismo (todos para int, o todos para short, o todos para
	// String...). Se declara poniendo corchetes después del tipo de variable. Para
	// inicializarlo, o bien declaras solo los huecos que tiene, o los huecos y el
	// valor.
	public static void main(String[] args) {

		/*
		 * 1 - Crea un array de char de 10 posiciones. Pide por teclado un char para
		 * cada una de las 10 posiciones. Después recorre el array, y concatena en un
		 * String todas las vocales que aparezcan en el array Por ejemplo, en el array:
		 * {'a','c','d','e','v','a','o'} ,el string resultante será "aeao". Imprímelo
		 * por pantalla.
		 * 
		 * 2 - Crea una función que reciba por argumentos un array de char, y devuelva
		 * concatenados en un string, separados por espacios, todos los valores del
		 * array. Imprímelo por consola desde el main.
		 * 
		 * 3 - Crea una función que reciba por argumentos un array de String, y devuelva
		 * concatenados en un string, separados por espacios, todos los valores del
		 * array. Imprímelo por consola desde el main.
		 * 
		 * 4 - Crea una función que reciba por argumentos un array de float, y devuelva
		 * concatenados en un string, separados por espacios, todos los valores del
		 * array. Imprímelo por consola desde el main.  
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Dime 10 letras");
		char[] vocales = new char[10];
		for (byte i = 0; i < vocales.length; i++) {
			vocales[i] += sc.nextLine().charAt(0);

		}
		String vocalesJuntas = "";
		for (byte i = 0; i < vocales.length; i++) {
			if (vocales[i] == 'a' || vocales[i] == 'e' || vocales[i] == 'i' || vocales[i] == 'o' || vocales[i] == 'u') {
				vocalesJuntas += vocales[i];
			}
		}
		System.out.print("Las vocales son " + vocalesJuntas);
		
		
		

		/*
		 * System.out.println("Dime cuántos números de nombres que quieres guardar");
		 * byte tamaño = Byte.parseByte(sc.nextLine());
		 */
		/*
		 * short[] numeros= {1,2,3,4,5,6}; float[] flotantes=
		 * {5326.87f,684134413231.5454654f}; boolean[] booleanos= {true, false, true,
		 * true, 3>94};
		 */
		/*
		 * String[]nombres= {"Paco","Ana","Sergio","Álvaro","Jose"}; String[] apellidos=
		 * {"Gonzalez","Calvo","Perez","Berlanga","Diaz","Urbano","Boni",
		 * "Schwarzenegger","Camacho"};
		 * System.out.println("Dime cuántas personas aleatorias quieres"); byte
		 * nPersonas=Byte.parseByte(sc.nextLine()); Random r=new Random(); for (byte i =
		 * 0; i < nPersonas; i++) { byte aleatorio=(byte)r.nextInt(nombres.length); byte
		 * a1Aleatorio=(byte)r.nextInt(apellidos.length); byte
		 * a2Aleatorio=(byte)r.nextInt(apellidos.length);
		 * System.out.println(nombres[aleatorio]+" "+apellidos[a1Aleatorio]+" "
		 * +apellidos[a2Aleatorio]);
		 */

		/*
		 * byte[] numeros = new byte[tamaño];
		 * 
		 * for (byte i = 0; i < numeros.length; i++) {
		 * System.out.println("Dime el número en la posición " + i); numeros[i] =
		 * Byte.parseByte(sc.nextLine());
		 * 
		 * } for (byte i = 0; i < numeros.length; i++) { System.out.print(numeros[i] +
		 * " "); }
		 * 
		 * //Sacar la media short acumulado=0; for (int i = 0; i < numeros.length; i++)
		 * { acumulado+=numeros[i]; }
		 * System.out.println("La media es: "+1f*acumulado/numeros.length);
		 */
	}
}
