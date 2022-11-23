package com.aguerrero.tamagotchi;

import java.util.Random;

public class Enterrar {
	public static String Enterrar(String nombre, String raza, byte partida) {
		String fraseGraciosa="";
		Random rand = new Random();
		int casos = rand.nextInt(1,5);
		switch (casos) {
		case 1:
			fraseGraciosa= "Se ha morido";
			break;
		case 2:
			fraseGraciosa="Dimitió de existir";
			break;
		case 3:
			fraseGraciosa="La ha espichado";
			break;
		case 4:
			fraseGraciosa="Viaja hacia las estrellas";
			break;
		}
		return (      "_________________________________________________"

				+ "\n|\\_________________________________________________\\"

				+ "\n| |D.E.P                                            |"

				+ "\n| |"+nombre + " el " + raza +"                                 |"

				+ "\n| |"+fraseGraciosa+    "                             |"

				+ "\n| |Vivió " + partida + " turnos                                |"

				+ "\n| |                                                  |"

				+ "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

	}

}
