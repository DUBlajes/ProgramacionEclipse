package com.aguerrero.examen2.programacion;

import java.util.Random;

/**
 * Clase con varias funciones auxiliar para el ejercicio del reloj del
 * apocalipsis, con el objetivo de evitar repetir código en el main.
 * 
 * @author Álvaro Guerrero
 *
 */
public class Funciones {
	/**
	 * Función de tipo String no devuelve nada y que imprime en el main el menú
	 * principal de acciones que puede realizar el usuario.
	 * 
	 * @return nada
	 */
	public static String eventosAOcurrir() {
		return ("Ahora elige uno de estos eventos: " + "\n\t0 - Elección aleatoria" + "\n\t1 Comienza una pandemia"
				+ "\n\t2 - Termina una pandemia" + "\n\t3 - Comienza una guerra no nuclear "
				+ "\n\t4 - Se firma la paz en una guerra no nuclear" + "\n\t5 - Comienza una guerra nuclear"
				+ "\n\t6 - Se firma la paz en una guerra nuclear "
				+ "\n\t7 - El egoísmo de una gran empresa contribuye a aumentar la contaminació global "
				+ "\n\t8 - Un avance tecnológico reduce la contaminación global "
				+ "\n\t9 - Sale al mercado un nuevo éxito de música reggaeton "
				+ "\n\t10 - Dios decide no matar a un gatito hoy ");
	}

	/**
	 * Función de tipo short que devuelve, en función de lo que elija el usuario,
	 * números positivos o negativos que se añaden al reloj del apocalpsis. Si son
	 * positivos, añadirán segundos. Si son negativos, los restarán.
	 * 
	 * @param codigoEvento
	 * @return short
	 */
	public static short consecuenciasEvento(byte codigoEvento) {
		switch (codigoEvento) {
		case 1:
			codigoEvento = (byte) 120;
			break;
		case 2:
			codigoEvento = (byte) -140;
			break;
		case 3:
			codigoEvento = (byte) 100;
			break;
		case 4:
			codigoEvento = (byte) -120;
			break;
		case 5:
			codigoEvento = (byte) 500;
			break;
		case 6:
			codigoEvento = (byte) -200;
			break;
		case 7:
			codigoEvento = (byte) 50;
			break;
		case 8:
			codigoEvento = (byte) -40;
			break;
		case 9:
			codigoEvento = (byte) 5;
			break;
		case 10:
			codigoEvento = (byte) -1;
			break;

		default:
			codigoEvento = (byte) 0;
			break;
		}

		return (short) codigoEvento;

	}

	/**
	 * Función de tipo boolean que se ocupa de devolver true si el número aleatorio
	 * es menor a la probabilidad introducida por el usuario en el main o false si
	 * es mayor.
	 * 
	 * @param probabilidad
	 * @return true or false
	 */
	public static boolean sucedeEvento(byte probabilidad) {
		Random rand = new Random();
		byte aleatorio = (byte) rand.nextInt(100);
		if (aleatorio <= probabilidad) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * Función de tipo String que no devuelve nada y que provoca que al usuario le
	 * salga un evento aleatorio entre 1 y 9 (ya que el 10 no está incluido).
	 * 
	 * @return nada
	 */
	public static String eventoAleatorio() {
		Random rand = new Random();
		String ret = "";
		byte casos = (byte) rand.nextInt(1, 10);
		switch (casos) {
		case 1:
			ret = "1 - Comienza una pandemia";
			break;
		case 2:
			ret = "2 - Termina una pandemia";
			break;
		case 3:
			ret = "3 - Comienza una guerra no nuclear";
			break;
		case 4:
			ret = "4 - Se firma la paz en una guerra no nuclear";
			break;
		case 5:
			ret = "5 - Comienza una guerra nuclear";
			break;
		case 6:
			ret = "6 - Se firma la paz en una guerra nuclear";
			break;
		case 7:
			ret = "7 - El egoísmo de una gran empresa contribuyea aumentar la contaminación global";
			break;
		case 8:
			ret = "8 - Un avance tecnológico reduce la contaminación global";
			break;
		case 9:
			ret = "9 - Sale al mercado un nuevo éxito de música reggaeton";
			break;
		}
		return ret;

	}
}
