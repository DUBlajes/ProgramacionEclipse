package repasoArrays;

import java.util.Random;
import java.util.Scanner;

public class RepasoArrays {

	public static void main(String[] args) {
		/*
		 * String[]nombres= new String[7]; String[]apellidos=
		 * {"Gutierrez","Gomez","Peña","Centollo","Buendía","Furgo"};
		 * 
		 * 
		 * Scanner sc=new Scanner(System.in);
		 * System.out.println("Dime una posición para ponerle un nombre (0-"+(nombres.
		 * length-1)+"):"); byte posicion=Byte.parseByte(sc.nextLine());
		 * System.out.println("Dime un nombre para la posición "+posicion+": "); if
		 * (Funciones.valorEnPosicion(nombres, posicion, sc.nextLine())) {
		 * System.out.println("Cambiado correctamente"); }else {
		 * System.out.println("No se pudo cambiar el valor"); }
		 * 
		 * for (int i = 0; i < nombres.length; i++) { System.out.println(i+": "+
		 * (nombres[i]!=null?nombres[i].toUpperCase():"-")); }
		 * 
		 * 
		 * 
		 * }
		 */

		String adri = "Rotulador";
		String dani = "Borrador";
		String aux;
		// dani=adri; //Dani pierde el borrador
		// adri=dani; //Adri pierde el rotulador

		aux = adri; // Adri pierde rotulador, ignacio tiene el rotulador, Dani y Adri tienen un
					// borrador
		adri = dani;
		dani = aux; // Dani tiene rotulador, ignacio tiene copia del rotulador y se pierde, Adri
					// tiene borrador

		// MISION para jueves 12 enero 2023: Crea una función llamada intercambio que
		// devuelva un boolean, y reciba 3 argumento: un array de char y dos byte
		// llamados p1 y p2.
		// En su interior, lo primero que hace es ver si tanto p1 como p2 son posiciones
		// válidas del array. Si alguna no lo es, la función devuelve false y no hace
		// nada más.
		// Si las dos son posiciones válidas, intercambiará los valores de las
		// posiciones p1 y p2 dentro del array.
		// Te propongo que lo intentes con el siguiente array declarado en el main:

		char[] letras = { 'p', 'e', 'l', 'o', 't', 'a' };
		if(Funciones.intercambio(letras, (byte)0, (byte)5)==true){
			System.out.println(letras);
		}else {
			System.out.println("false");
		}
		System.out.println("Bienvenida a este juego. Te voy a dar unas letras desordenadas, y me tienes que decir la palabra original");
		String palabraElegida=Funciones.palabraAzar();
		char[] palabraComoArray=Funciones.stringAArray(palabraElegida);
		char[]original=Funciones.copiaArray(palabraComoArray);
		//Voy a hacer 100 intercambios aleatorios de letras
		Random r=new Random();
		for (byte i = 0; i < 100; i++) {
			byte p1=(byte)r.nextInt(palabraComoArray.length);
			byte p2=(byte)r.nextInt(palabraComoArray.length);
			Funciones.intercambio(palabraComoArray, p1, p2);
		}
		System.out.println(Funciones.imprimeArray(palabraComoArray));
		Scanner sc=new Scanner(System.in);
		String eleccion=sc.nextLine();
		//Para el sabado 21: 
		//- Usa la funcion split para separar todas las letras de eleccion entre si.
		//- Crea una funcion public static boolean sonIguales(char[] arr1, char[] arr2). Esa funcion comprueba primero si los tama;os de arr1 y arr2 son iguales. Si no, devuelve false. Si tienen el mismo tama;o, van comparando posicion a posicion si el contenido de arr1[i] es igual a arr2[i]. Si alguno no es igual, devuelve false. Al final de la funcion, despues del for, devuelve true.
		//- Usa la funcion sonIguales para decir al usuario DESDE EL MAIN si lo que puso eleccion es igual al array original

	}
}
