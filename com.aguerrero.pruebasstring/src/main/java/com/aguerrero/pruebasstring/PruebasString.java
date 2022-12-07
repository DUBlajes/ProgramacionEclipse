package com.aguerrero.pruebasstring;

import java.util.Random;
import java.util.Scanner;

public class PruebasString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¡¿Escríbeme un texto, coño de su madre!");
		String texto = sc.nextLine();
		System.out.println("¿Contiene \"n s\"? "+ texto.contains("n s"));
		System.out.println("¿Acaba con \"nso\"? " +texto.endsWith("nso"));
		System.out.println("¿Empieza con \"hola buen\"? "+texto.startsWith("hola buen"));
		System.out.println("Primer índice de \"ahor\":"+ texto.indexOf("ahor"));
		System.out.println("Último índice de \"ahor\": "+ texto.lastIndexOf("ahor"));
		
		System.out.println("Desde la posición 10: "+texto.substring(10));
		System.out.println("Desde la posición 10 a la 26: "+texto.substring(10,26));
		
		System.out.println("Dime la subcadena a buscar");
		String subcadena=sc.nextLine();
		//Copio en otra variable porque necesito modificar el texto original
		//te lo digo ahora, ahora mismo estoy ocupado, ahora no puedo porque estoy ahorcando un telettubbie
		String texto2=texto;
		//En el bucle voy a ir eliminado texto con el substring y voy a segir hasta que la cadena que busco ya no aparezca más veces
		while(texto2.indexOf(subcadena)!=-1) {
			int indice=texto2.indexOf(subcadena);
			texto2=texto2.substring(indice+subcadena.length());
			System.out.println(texto2);
		}
		
		//isBlank/isEmpty/repeat/trim/strip
		//Strip quita todos los espacio en blanco o tabulaciones que haya al principio y al final
		//isBlank / isEmpty
		
		System.out.println("isBlank: "+texto.isBlank());//Te da true si la cadena solo tiene espacios y tabulaciones
		texto=texto.strip();
		System.out.println("isEmpty: "+texto.isEmpty());//Te da true si la cadena no tiene nada de nada de nada
		System.out.println("isEmpty: "+texto.equals(""));
		System.out.println(texto.repeat(425));
		
		
		
		
		
		
		
		
		
		
		Random r = new Random();
		for (short i = 0; i < texto.length(); i++) {
			char letra = texto.charAt(i);
			if (r.nextBoolean()) {
				System.out.print((""+letra).toLowerCase());//Así se convertía un char en un string, concatenando "".
			} else {
				System.out.print((""+letra).toUpperCase());
			}

		}

	}
}
