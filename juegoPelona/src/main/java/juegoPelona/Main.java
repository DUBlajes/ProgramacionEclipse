package juegoPelona;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("\\\\||~~El ataque de la pelona~~||//");

		// Primero pedimos cuántas personas quiero matar, el juego acaba cuando se

		// alcance el objetivo

		System.out.println("¿Cuántas almas quieres hacer que abandonen este mundo hoy?");

		byte objetivoMuertes = Byte.parseByte(sc.nextLine());

		byte muertesConseguidas = 0;

		// Mido el nº de turnos para medir cómo de bien lo hace el jugador. Cuanto menos

		// Tarde en matar a todo el mundo, mejor.

		int nTurno = 0;

		// Declaro cuáles van a ser las teclas de movimiento,

		// que más tarde serán personalizables

		char teclaIzda = 'a';

		char teclaDcha = 'd';

		for (byte i = 0; i < args.length; i++) {
			if (args[i].equals("-teclaIzda")) {
				teclaIzda = args[i + 1].charAt(0);
			}
			if (args[i].equals("-teclaDcha")) {
				teclaDcha = args[i + 1].charAt(0);
			}
		}

		// Pido el tamaño del array, máximo de posiciones para moverse

		byte tamanio = Funciones.pideNumeroEntre("Elige un tamaño del tablero: (5-15)", (byte) 5, (byte) 15);

		// Creo el tablero, y coloco aleatoriamente a la muerte (nuestro personaje)

		// y el primer candidato a fiambre ඞ.

		char[] tablero = Funciones.creaTablero(tamanio);

		char[] tumba = Funciones.creaTablero(tamanio);

		byte posPelona = Funciones.colocaAleatoriamente(tablero, '@');

		byte posPersona = Funciones.colocaAleatoriamente(tablero, 'P');

		boolean pisaTumba = false;

		// ඞ☗⚰️☠

		System.out.println(Funciones.imprimeArrayBonico(tablero, tumba));

		// Bucle de juego, que acaba cuando mate a todos los amongus que me

		// haya puesto como objetivo

		for (nTurno = 0; muertesConseguidas < objetivoMuertes; nTurno++) {

			// Primera parte del bucle de juego: Pedir entradas

			System.out.println(

					"¿Dónde te quieres mover? ( Izquierda - " + teclaIzda + " / Derecha - " + teclaDcha + " )");

			char teclaPulsada = sc.nextLine().charAt(0);

			// Segunda parte del bucle de juego: Mover y calcular consecuencias

			// Primero, antes de hacer el cambio, borro al personaje de su sitio

			if (teclaPulsada == teclaIzda) {

				posPelona = Funciones.moverElemento(tablero, '@', (byte) -1, posPelona);

			}

			if (teclaPulsada == teclaDcha) {

				posPelona = Funciones.moverElemento(tablero, '@', (byte) 1, posPelona);

			}

			if (posPersona != posPelona) {
				if (pisaTumba == false) {
					if (muertesConseguidas >= (objetivoMuertes / 2)) {
						if (teclaPulsada == teclaIzda) {
							posPersona = Funciones.moverElemento(tablero, 'P', (byte) -1, posPersona);
						}
						if (teclaPulsada == teclaDcha) {
							posPersona = Funciones.moverElemento(tablero, 'P', (byte) 1, posPersona);
						}
					} else {
						Random r = new Random();
						posPersona = Funciones.moverElemento(tablero, 'P', (byte) (r.nextBoolean() ? -1 : 1),
								posPersona);
					}
					if ('#' == tumba[posPersona]) {
						pisaTumba = true;
					}
				} else {
					System.out.println("La víctima no se puede mover porque está encima de una tumba");
					pisaTumba=false;
				}

				if (posPersona == posPelona) {

					tablero[posPelona] = '@';
				}

			}

			// Si la posición de la pelona es la misma que la del amongus, cuento

			// una muerte

			if (posPelona == posPersona) {

				muertesConseguidas++;

				tumba[posPersona] = '#';

				if (muertesConseguidas == objetivoMuertes) {

					break; // Si he conseguido mi objetivo de muertes, salgo del bucle

					// Del juego

				}

				posPersona = Funciones.colocaAleatoriamente(tablero, 'P');

			}

			// Tercera parte del bucle del juego: Dibujar siguiente frame

			System.out.println("Muertes Conseguidas: " + muertesConseguidas);

			System.out.println(Funciones.imprimeArrayBonico(tablero, tumba));

		}

		// Final de partida, imprimir resumen

		System.out.println("##### Mwahahahahaha #####");// ☗⚰️

		System.out.println("Has cosechado " + muertesConseguidas + " almas...");

		System.out.println("Has tardado " + nTurno + " turnos, en un tablero de tamaño " + tablero.length);

	}

}