package com.aguerrero.pruebasFunciones;

import java.util.Scanner;

public class PruebasConFunciones {
/**
 * Método principal del programa. Pide un número y te dice si es primo o no
 * @param args es magia.
 * i18n java
 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime un número. Puede ser muy grande, y te digo si es un número primo");
		long num=Long.parseLong(sc.nextLine());
		if(Funciones.esPrimo(num)) {
			System.out.println("Es un número primo");
			
		}else{
			System.out.println("No es un número primo");
		}
	}

	
	
}

// TODO Auto-generated method stub
/*System.out.println("Antes de la función");
Funciones.funcionPrueba();
System.out.println("Después de la función");
System.out.println(Funciones.numeroAleatorio((byte)10, (byte)30));//Si le pasamos dos argumentos llama a la función con dos argumento de forma automática. Si le pasamos solo uno, llama a la función de un argumento también de forma aleatoria. Tener vairas funciones con mismmo nombre y distintos argumentos se llama sobrecarga
System.out.println(Funciones.numeroAleatorio((byte)10));*/
