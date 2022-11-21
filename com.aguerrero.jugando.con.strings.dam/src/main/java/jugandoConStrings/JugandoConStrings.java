package jugandoConStrings;

import java.util.Random;
import java.util.Scanner;

public class JugandoConStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char opcion = '-';
		String texto = "";
		String numero = "";
		String mimificado = "";
		String desmimificado = "";
		String codificado="";
		String descodificado="";
		String codigoAleatorio="";
		Random aleatorio=new Random();
		while (opcion != 's') {
			System.out.println("Elige una acción:\n\te - Escribir un texto" + "\n\t0 - Dime si el texto tiene números"
					+ "\n\ti - Invertir el texto" + "\n\tc - Codificar un texto" + "\n\tf - Mimificar un texto"
					+ "\n\tF - Desmimificar un texto" + "\n\td - Decodificar el texto"
					+ "\n\tM - Cambiar a todo mayúsculas" + "\n\tm - Cambiar a todo minúsculas"
					+ "\n\tn - Poner mayúsculas solo la primera letra" + "\n\ta - Codificar con números aleatorios"
					+ "\n\ts - Salir");
			opcion = sc.nextLine().charAt(0);
			switch (opcion) {
			case '0':
				System.out.println("¿Tiene números el texto?" + (texto.contains("1") || (texto.contains("2"))
						|| (texto.contains("3")) || (texto.contains("4")) || (texto.contains("5"))
						|| (texto.contains("6")) || (texto.contains("7")) || (texto.contains("8"))
						|| (texto.contains("9")) || (texto.contains("0"))));// Esto devuelve un boolean.
				numero = sc.nextLine();
				break;
			case 'e':
			case 'E':
				System.out.println("Dime el texto que quieres usar.");
				texto = sc.nextLine();
				break;
			case 'i':
				System.out.println("Voy a invertir el texto");
				for (byte i = (byte) (texto.length() - 1); i >= 0; i--) {
					System.out.print(texto.charAt(i));
				}
				System.out.println();
				break;
			case 'c':
				System.out.println("Voy a codificar un texto");
				for(byte i=0;i<texto.length();i++) {
					codificado+=(char)(texto.charAt(i)+10);
				}
				System.out.println(codificado);
				// partir del codificado, descodificar en la opción
				break;
			case 'f':
				System.out.println("Voy a mimificar el texto que has escrito");
				System.out.println("Pulsa intro para continuar");
				sc.nextLine();
				for (short i = 0; i < texto.length(); i++) {
					mimificado += (texto.charAt(i) + "mi");
				}
				
				System.out.println(mimificado);
				break;
			case 'F':
				System.out.println("Este era el texto que habías mimificado: "+mimificado+". Ahora voy a desmimificarlo y recuperar el texto original.");
				System.out.println("Pulsa intro para continuar");
				sc.nextLine();
				for (short i = 0; i < mimificado.length(); i = (short) (i + 3)) {
					desmimificado += (mimificado.charAt(i));
				}
				System.out.println(desmimificado);
				//por si no funcionase, podría hacer System.out.println(texto);
				break;
			case 'd':
				System.out.println("Voy a decodificar un texto");
				for(byte i=0;i<codificado.length();i++) {
					descodificado+=(char)(codificado.charAt(i)-10);
				}
				System.out.println(descodificado);
				break;
			case 'M':
				System.out.println("Voy a cambiar todas las letras a mayúsculas");
				texto = texto.toUpperCase();
				System.out.println(texto);
				break;
			case 'm':
				System.out.println("Voy a cambiar todas las letras a minúsculas");
				texto = texto.toLowerCase();
				System.out.println(texto);
				break;
			case 'n':
				System.out.println("Voy a poner en mayúsculas solo la primera letra");
				System.out.print((""+texto.charAt(0)).toUpperCase());//Con las dos comillas convierto un char en un string y puedo poner la primera en minúsculas
				for(byte i=1;i<texto.length();i++) {
					System.out.print((""+texto.charAt(i)).toLowerCase());//con esto me aseguro de que el resto de letras sean minúsculas
				}
				break;
			case 'a':
				System.out.println("Voy a codificar con números aleatorios");
				//Hacer aquí lo mismo que la opción c, pero además de codificar entre letra y letra, introduce una letra entre a y z aleatoria
				//Si escribimos el texto "acaba", la opción c daría "kmklk". Esta opción, además de eso, entre letra y letra insertaría otra letra aleatoria. Ej: kvmxkrlqku
				for(byte i=0;i<texto.length();i++) {
					codigoAleatorio+=(char)(texto.charAt(i)+10);
					codigoAleatorio+=(char)(aleatorio.nextInt(97,122));
				}
				System.out.println(codigoAleatorio);
				break;
			case 's':
				System.out.println("Voy a salir del menu");
				break;
			default:
				System.out.println("La opción '" + opcion + "' no es válida.");
				break;
			}
			if (opcion != 's') {
				System.out.println("Pulsa intro para continuar");
				sc.nextLine();
			}

		}
		System.out.println("Cerrando Scanner...");
		sc.close();
		System.out.println("Scanner cerrado.");

	}
}
