package jugandoConStrings;

import java.util.Scanner;

public class JugandoConStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char opcion = '-';
		String texto = "";
		String numero = "";
		while (opcion != 's') {
			System.out.println("Elige una acción:\n\te - Escribir un texto" + "\n\t0 - Dime si el texto tiene números"
					+ "\n\ti - Invertir el texto" + "\n\tc - Codificar un texto" + "\n\tf - Mimificar un texto"
					+ "\n\td - Decodificar el texto" + "\n\tM - Cambiar a todo mayúsculas"
					+ "\n\tm - Cambiar a todo minúsculas" + "\n\tn - Poner mayúsculas solo la primera letra"
					+ "\n\ta - Codificar con números aleatorios" + "\n\ts - Salir");
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
				for(byte i=(byte)(texto.length()-1);i>=0;i--){
				System.out.print(texto.charAt(i));
				}
				System.out.println();
				break;
			case 'c':
				System.out.println("Voy a codificar un texto");
				break;
			case 'f':
				System.out.println("Voy a mimificar un texto");
				//hola - hmiomilmiami
				String mimificado="";
				for(byte i=0;i<texto.length();i++) {
					mimificado+=(texto.charAt(i)+"mi");
				}//en vez de imprimir el texto, concatenar en la variable
				//2 imprimir la variable mimificada
				System.out.println(mimificado);
				//3 hacer otro for que, a partir de la variable mimificado imprima la palabra original
				System.out.println();
				break;
			case 'd':
				System.out.println("Voy a decodificar un texto");
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
				break;
			case 'a':
				System.out.println("Voy a codificar con números aleatorios");
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
