package com.aguerrero.tamagotchi;

import java.util.Random;

/**
 * Clase con una función auxiliar de tipo String que se encargará de mostrar en
 * la función main la tumba del Tamagotchi cuando este fallezca.
 * 
 * @author Álvaro Guerrero
 */
public class Enterrar {
	/**
	 * Esta función devuelve un String compuesto por el dibujo de una lápida, así
	 * como de las variables "nombre", "raza" y "turnos" de la función principal.
	 * Además, contamos con un switch y un random que, dependiendo del número que
	 * salga (del 1 al 4, ya que el 5 no se incluye), hará que en la lápida aparezca
	 * una frase u otra.
	 * 
	 * @param nombre  Esta variable recogerá el nombre del tamagotchi en el main
	 *                para mostrarlo en la lápida
	 * @param raza    Esta variable recogerá la raza del tamagotchi en el main para
	 *                mostrarlo en la lápida
	 * @param partida Esta variable recogerá el número de turnos que ha sobrevivido
	 *                el tamagotchi en el main para mostrarlo en la lápida
	 * @return String, String, byte
	 */
	public static String enterrar(String nombre, String raza, byte partida) {
		String ret="";
		String fraseGraciosa = " ";
		Random rand = new Random();
		int casos = rand.nextInt(1, 5);
		String dep="D.E.P";
		String nTurnos="Vivió "+partida+" turnos";
		String nombreRaza=nombre+" el "+raza;
		short longitudMaxima=(short)dep.length();
		if(longitudMaxima<nTurnos.length()) {
			longitudMaxima=(short)nTurnos.length();
		}
		if(longitudMaxima<fraseGraciosa.length()) {
			longitudMaxima=(short)fraseGraciosa.length();
		}
		if(longitudMaxima<nombreRaza.length()) {
			longitudMaxima=(short)nombreRaza.length();
		}
		switch (casos) {
		case 1:
			fraseGraciosa = "Se ha morido";
			break;
		case 2:
			fraseGraciosa = "Dimitió de existir";
			break;
		case 3:
			fraseGraciosa = "La ha espichado";
			break;
		case 4:
			fraseGraciosa = "Viaja hacia las estrellas";
			break;
		}
		for(short i=0;i<longitudMaxima+3;i++) {
			ret+="_";
		}
		ret+="\n|\\";
		for(short i=0;i<longitudMaxima+2;i++) {
			ret+="_";
		}
		ret+="\\\n||";
		for(short i=0;i<(longitudMaxima+2)/2;i++) {
			ret+=" ";
		}
		ret+=dep;
		for(short i=0;i<(longitudMaxima+2-dep.length()/2)/2-1;i++) {
			ret+=" ";
		}
		return nombreRaza;

	}

}
