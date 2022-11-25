package com.aguerrero.dibujando;

import java.util.Random;

public class Reemplazar {
	/**
	 * 
	 * @param trozos
	 * @param reemplazo
	 * @return
	 */
	public static String cambiarCaracter(String trozos, char original, char reemplazo) {
		return trozos.replace(original, reemplazo);
	}

	public static String peloAleatorio() {
		Random rand = new Random();
		switch (rand.nextInt(4)) {
		case 0:
			return " /'''\\ ";
		// break;
		case 1:
			return " /\\-/\\ ";
		// break;
		case 2:
			return " /###\\ ";
		// break;
		case 3:
			return " /WWW\\ ";
		// break;
		}
		return null;

	}

	public static String nombreAleatorio() {
		Random r = new Random();
		switch (r.nextInt(10)) {
		case 0:
			return "Pepe";
		case 1:
			return "Ambrosio";
		case 2:
			return "Cermuzo";
		case 3:
			return "Papadopoulos";
		case 4:
			return "Juan";
		case 5:
			return "Ali";
		case 6:
			return "Esternocleidomastoideo"; //24 caracteres (22 + espacio delante y detrás)
		case 7:
			return "Gustavo";
		case 8:
			return "Ignassi";
		case 9:
			return "NiIdea";
		}
		return null;

	}

}
