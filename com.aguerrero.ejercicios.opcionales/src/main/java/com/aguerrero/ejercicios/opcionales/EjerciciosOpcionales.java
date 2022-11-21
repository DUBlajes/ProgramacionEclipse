package com.aguerrero.ejercicios.opcionales;

import java.util.Scanner;

public class EjerciciosOpcionales {

	public static void main(String[] args) {
		// Ejercicio 1
		Scanner sc=new Scanner(System.in);
		float numeroConDecimales=0f;
		System.out.println("Dime un número con decimales");
		numeroConDecimales=Float.parseFloat(sc.nextLine());
		//Ejercicio 2
		do {
			System.out.println("Dime otro número con decimales");
			numeroConDecimales=Float.parseFloat(sc.nextLine());
		} while (numeroConDecimales<1||numeroConDecimales>10);
		System.out.println("De acuerdo, tu número es el "+numeroConDecimales);
		//Ejercicio 3
		byte sinDecimal1=0;
		byte sinDecimal2=0;
		System.out.println("Dime dos números");
		sinDecimal1=Byte.parseByte(sc.nextLine());
		sinDecimal2=Byte.parseByte(sc.nextLine());
		System.out.println("La media de los dos números que has introducido es " +(sinDecimal1+sinDecimal2)/2f);
		
	}

}
