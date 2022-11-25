package com.aguerrero.tamagotchi;

import java.util.Scanner;
/**
 * Clase con una función auxiliar de tipo String que se encargará de mostrar en la función main el menú del Tamagotchi.
 * @author Álvaro Guerrero
 */
public class ImprimirMenu {
	/**
	 * Función que, cada vez que sea invocada en el main, mostrará por pantalla el menú con las distintas acciones que puede hacer el tamagotchi.
	 * @return
	 */
	public static String imprimirMenu() {
		return(
				"Elige una acción: " + "\n\t1 - Comer" + "\n\t2 - Dormir" + "\n\t3 - Ducharse" + "\n\t4 - Jugar");
	}
}
