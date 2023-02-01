package elAtaqueDeLosGoblins;

import java.util.Scanner;

public class Main {
	/**
	 * Metodo principal del programa en el cual el usuario eligirá el género y
	 * nombre de su personaje, y si jugará en 1, 2 o 3 dimensiones
	 * 
	 * @param args argumentos del programa. Si en algun lugar aparece el argumento
	 *             "-g", el siguiente argumento indique el genero del personaje,
	 *             siempre que empiece por m, f o n. Por otra parte, si aparece el
	 *             argumento "-n", el siguiente argumento sera el nombre del
	 *             personaje. Si no aparecen ninguno de estos argumentos indicados,
	 *             o el genero no empieza por m, f o n, tanto genero como nombre se
	 *             pediran por teclado.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char generoJugador = ' ';
		String nombreJugador = null;

		// Mete estas dos líneas en una función recursiva y de género, que no reciba
		// argumentos y devuelva un char. En su interior, hará estas dos líneas y, si el
		// usuario no ha puesto m/f o n, la función se vuelve a llamar a sí misma
		// cuantas veces sea necesario hasta que dé uno de esos valores.
		for (int i = 0; i < args.length; i++) {
			if (args[i].equals("-g")) {
				generoJugador = args[i + 1].charAt(0);
				System.out.println("Tu género es " + generoJugador);
			}
			if (args[i].equals("-n")) {
				nombreJugador = args[i + 1];
				System.out.println("Tu nombre es " + nombreJugador);
			}

			// Hacer que, en argumentos de programa está "-g", el género sea el argumento
			// que hay después de la g, siempre que sea m, f o n. Si no es ninguno de estos,
			// o no está -g, pedir el género por teclado. Si está el argumento de programa
			// -n, lo ue haya en el sigiente argumento se coge como nombre y ya no se pide
			// por teclado.

		}
		if (generoJugador != 'm' && generoJugador != 'f' && generoJugador != 'n') {
			generoJugador = Funciones.pideGenero();
		}
		if (nombreJugador == null) {
			System.out.println("Dime el nombre de tu personaje");
			nombreJugador = sc.nextLine();

		}

		// Hacer un menú que te dé tres opciones: 1- Jugar en una dimensión. 2-Jugar en
		// 2D 3-Jugar en 3D. //Que te pida el número de opción las veces que sea
		// necesario hasta que se diga 1, 2 o 3. Guarda el resultado de la elección en
		// una variable.
		byte opcion = 0;
		do {
			System.out.println(
					"Elige una opción: " + "\n\t1 - Jugar en 1D" + "\n\t2 - Jugar en 2D" + "\n\t3 - Jugar en 3D");
			opcion = Byte.parseByte(sc.nextLine());
		} while ((opcion != 1) && (opcion != 2) && (opcion != 3));
		switch (opcion) {
		case 1:
			FuncionesArray.jugar(nombreJugador, generoJugador);
			break;
		case 2:
			FuncionesMatrices.jugar(nombreJugador, generoJugador);
			break;
		case 3:
			Funciones3D.jugar(nombreJugador, generoJugador);
			break;
		}
	}
}
