package jugandoConStrings;

import java.util.Scanner;

public class JugandoConStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre;
		short añoNacimiento;
		float peso;
		System.out.println("Dime tu nombre");
		nombre = (sc.nextLine());
		System.out.println("Dime tu año de nacimiento");
		añoNacimiento = Short.parseShort(sc.nextLine());
		System.out.println("Dime tu peso");
		peso = Float.parseFloat(sc.nextLine());
		System.out.println("¡Hola " + nombre + "! Desde que naciste han pasado " + (2022 - añoNacimiento)
				+ " años. Tendrás 85 años en el año " + (añoNacimiento + 85));
		float pesoMercurio=peso*0.3772f;
		float pesoVenus=peso*0.9044f;
		float pesoMarte=peso*0.3784f;
		float pesoJúpiter=peso*2.5277f;
		float pesoSaturno=peso*1.0645f;
		float pesoUrano=peso*0.8861f;
		float pesoNeptuno=peso*1.1369f;
		
		System.out.println("Basándonos en tu peso, puedo decirte que " 
				+ "\n\tEn la Tierra pesas " + peso + " kilos."
				+ "\n\tEn Marte pesas " + pesoMarte + " kilos."
				+ "\n\tEn Mercurio pesas " + pesoMercurio + " kilos."
				+ "\n\tEn Venus pesas " + pesoVenus + " kilos."
				+ "\n\tEn Júpiter pesas " + pesoJúpiter + " kilos."
				+ "\n\tEn Saturno pesas " + pesoSaturno + " kilos."
				+ "\n\tEn Urano pesas " + pesoUrano + " kilos."
				+ "\n\tEn Neptuno pesas " + pesoNeptuno + " kilos.");
		boolean pesoFinal=(pesoMercurio + pesoVenus)>pesoMarte||(pesoJúpiter)>(peso + pesoMarte);
		System.out.println(pesoFinal);
		
		

		/*
		 * Scanner sc = new Scanner(System.in); char opcion = '-'; String texto="";
		 * while (opcion != 's') {
		 * System.out.println("Elige una acción:\n\te - Escribir un texto" +
		 * "\n\ti - Invertir el texto" + "\n\tc - Codificar un texto" +
		 * "\n\tf - Mimificar un texto" + "\n\td - Decodificar el texto" +
		 * "\n\tM - Cambiar a todo mayúsculas" + "\n\tm - Cambiar a todo minúsculas" +
		 * "\n\tn - Poner mayúsculas solo la primera letra" +
		 * "\n\ta - Codificar con números aleatorios" + "\n\ts - Salir"); opcion =
		 * sc.nextLine().charAt(0); switch (opcion) { case 'e':
		 * System.out.println("Dime el texto que quieres usar."); texto=sc.nextLine();
		 * break; case 'i': System.out.println("Voy a invertir el texto"); break; case
		 * 'c': System.out.println("Voy a codificar un texto"); break; case 'f':
		 * System.out.println("Voy a mimificar un texto"); break; case 'd':
		 * System.out.println("Voy a decodificar un texto"); break; case 'M':
		 * System.out.println("Voy a cambiar todas las letras a mayúsculas");
		 * texto=texto.toUpperCase(); System.out.println(texto); break; case 'm':
		 * System.out.println("Voy a cambiar todas las letras a minúsculas");
		 * texto=texto.toLowerCase(); System.out.println(texto); break; case 'n':
		 * System.out.println("Voy a poner en mayúsculas solo la primera letra"); break;
		 * case 'a': System.out.println("Voy a codificar con números aleatorios");
		 * break; case 's': System.out.println("Voy a salir del menu"); break; default:
		 * System.out.println("La opción '" + opcion + "' no es válida."); break; } if
		 * (opcion != 's') { System.out.println("Pulsa intro para continuar");
		 * sc.nextLine(); }
		 * 
		 * } System.out.println("Cerrando Scanner..."); sc.close();
		 * System.out.println("Scanner cerrado.");
		 */
	}
}
