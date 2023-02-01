package elAtaqueDeLosGoblins;

import java.util.Random;
import java.util.Scanner;

/**
 * Clase con varias funciones auxiliares para el ejercicio de El Ataque de los
 * Goblins para evitar repetir codigo en el main.
 * 
 * @author Álvaro Guerrero
 *
 */
public class Funciones {
	/**
	 * Funcion recursiva de tipo char en la que el usuario introducirá por teclado
	 * el género de su personaje tantas veces como haga falta siempre que no escriba
	 * m, f o n. En el momento en que escriba una de esas tres letras, la función devolverá el género.
	 * 
	 * @return char generoJugador, que será m(masculino),f(femenino),n(neutro)
	 */
	public static char pideGenero() {
		Scanner sc = new Scanner(System.in);
		char ret = ' ';
		System.out.println("Dime el género de tu personaje (m/f/n)");
		char generoJugador = sc.nextLine().charAt(0);
		if (generoJugador != 'm' && generoJugador != 'f' && generoJugador != 'n') {
			generoJugador = Funciones.pideGenero();
		}
		return generoJugador;
	}
	// Hacer una función llamada terminacionGenero. Recibe por argumentos un char
	// genero, que tiene que valer m, f o n. Si es una m, devuelve el char 'o', si
	// es una f, devuelve el char a y si es una n, devuelve el char i

	/**
	 * Funcion que añade una vocal a la terminació de determinadas palabras para que
	 * concuerden con el género elegido. Por ejemplo, para que diga "Bienvenido",
	 * "Bienvenida" o "Bienvenidi" segun el genero que haya elegido el usuario.
	 * 
	 * @param genero           uno de los tres generos que contemplamos: masculino,
	 *                         femenino o neutro
	 * @param masculinoOmitido booleano que, si es true, hace que en el genero
	 *                         masculino no aparezca la o. Lo usamos para algunas
	 *                         palabras cuyo masculino no termina en o. Por ejemplo,
	 *                         para que la consola muestre "Jugador", no "Jugadoro".
	 * @return char ('o','a' o 'i'=, según el género elegido sea masculino, femenino
	 *         o neutro.
	 */
	public static char terminacionGenero(char genero, boolean masculinoOmitido) {

		if (genero == 'm') {
			if (!masculinoOmitido) {
				return 'o';

			}
			return 0;
		}
		if (genero == 'f') {
			return 'a';
		}
		return 'i';

	}

}
