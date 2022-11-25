package com.aguerrero.tamagotchi;

import java.util.Scanner;

/**
 * Método principal del programa.
 * 
 * @author Álvaro Guerrero
 *
 */
public class EjercicioTamagotchi {
	/**
	 * El usuario elige una raza para el tamagotchi, le da un nombre y juega con él,
	 * intentando que sobreviva hasta un máximo de 30 turnos. Podrá darle de comer,
	 * lavarlo, jugar y hacer que duerma. Además, si es un perro, podrá sacarlo a
	 * pasear y, si es un carpincho, hacer que tome mate.
	 * 
	 * @param args De momento, sin uso
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String raza = "";
		String nombre = "";
		boolean razaExiste = true;
		boolean esPerro = false;
		boolean esCarpincho = false;
		byte hambre = 50;
		byte sueño = 50;
		byte higiene = 50;
		byte diversion = 50;
		byte paseo = 50;
		byte tomarMate = 50;
		String accion = "";
		byte partida = 0;
		/*
		 * En esta parte del código, el usuario elige la raza del tamagotchi. Este
		 * do-while se encarga de que el usuario permanezca en ese "menú" siempre que
		 * elija una raza distinta a las 4 disponibles.
		 */
		do {
			System.out.println("Dime de qué raza quieres que sea el tamagotchi:" + "\n\tPerro" + "\n\tGato"
					+ "\n\tHipopótamo" + "\n\tCarpincho");
			raza = sc.nextLine();
			switch (raza) {
			case "P":
			case "p":
			case "perro":
			case "Perro":
				raza = "Perro";
				razaExiste = true;
				esPerro = true;
				break;
			case "h":
			case "H":
			case "hipopótamo":
			case "Hipopótamo":
				raza = "Hipopótamo";
				razaExiste = true;
				break;
			case "g":
			case "G":
			case "gato":
			case "Gato":
				raza = "Gato";
				razaExiste = true;
				break;
			case "c":
			case "C":
			case "carpincho":
			case "Carpincho":
				raza = "Carpincho";
				razaExiste = true;
				esCarpincho = true;
				break;
			default:
				raza = "default";
				razaExiste = false;
				break;
			}
		} while (razaExiste == false);
		System.out.println("Has elegido que el tamagotchi sea de raza " + raza);
		/*
		 * Este do while impide que el usuario introduzca cualquier número en el nombre
		 * del tamagotchi. Si lo hace, el menú le seguirá diciendo que introduzca un
		 * nombre.
		 */
		do {
			System.out.println("Ahora dime su nombre");
			nombre = sc.nextLine();
		} while (nombre.contains("1") || (nombre.contains("2") || (nombre.contains("3")
				|| (nombre.contains("4") || (nombre.contains("5") || (nombre.contains("6") || (nombre.contains("7")
						|| (nombre.contains("8") || (nombre.contains("9") || (nombre.contains("0")))))))))));
		System.out.println("Perfecto. Tu tamagotchi se llama " + nombre + ". \nPulsa intro para continuar.");
		sc.nextLine();
		System.out.println("Comienza el juego");
		System.out.println(nombre + " el " + raza + "\n--------------------");
		if (esPerro == false && esCarpincho == false) {
			System.out.println(
					"Hambre: " + hambre + "\nSueño:" + sueño + "\nHigiene:" + higiene + "\nDiversión: " + diversion);
		}
		if (esPerro == true) {
			System.out.println("Hambre: " + hambre + "\nSueño:" + sueño + "\nHigiene:" + higiene + "\nDiversión: "
					+ diversion + "\nPaseo: " + paseo);
		}
		if (esCarpincho == true) {
			System.out.println("Hambre: " + hambre + "\nSueño:" + sueño + "\nHigiene:" + higiene + "\nDiversión: "
					+ diversion + "\nTomar mate: " + tomarMate);
		}
		System.out.println();
		/*
		 * Este do-while se encarga de que el usuario siga viendo el menú para elegir
		 * acciones mientras el tamagotchi siga vivo. En este caso, siempre que
		 * cualquiera de sus estadísticas sea mayor que 0 o que no hayan pasado 30
		 * turnos.
		 */
		do {
			System.out.println(ImprimirMenu.imprimirMenu());

			if (esPerro == true) {
				System.out.println("\t5 - Pasear");
			}
			if (esCarpincho == true) {
				System.out.println("\t5 - Tomar mate");
			}
			accion = sc.nextLine();
			/**
			 * Este switch es el encargado de que las distintas estadísticas suban o bajen
			 * en función de la acción elegida por el usuario.
			 */
			switch (accion) {
			case "1":
				hambre += 20;
				sueño -= 5;
				higiene -= 5;
				diversion -= 5;
				if (esPerro == true) {
					paseo -= 5;
				}
				if (esCarpincho == true) {
					tomarMate -= 5;
				}
				break;
			case "2":
				hambre -= 5;
				sueño += 20;
				higiene -= 5;
				diversion -= 5;
				if (esPerro == true) {
					paseo -= 5;
				}
				if (esCarpincho == true) {
					tomarMate -= 5;
				}
				break;
			case "3":
				hambre -= 5;
				sueño -= 5;
				higiene += 20;
				diversion -= 5;
				if (esPerro == true) {
					paseo -= 5;
				}
				if (esCarpincho == true) {
					tomarMate -= 5;
				}
				break;
			case "4":
				hambre -= 5;
				sueño -= 5;
				higiene -= 5;
				diversion += 20;
				if (esPerro == true) {
					paseo -= 5;
				}
				if (esCarpincho == true) {
					tomarMate -= 5;
				}
				break;
			case "5":
				if (esPerro == true) {

					hambre -= 5;
					sueño -= 5;
					higiene -= 5;
					diversion -= 5;
					paseo += 20;
					if (esCarpincho == true) {
						tomarMate -= 5;
					}
					break;
				}
				if (esCarpincho == true) {
					hambre -= 5;
					sueño -= 5;
					higiene -= 5;
					diversion -= 5;
					if (esPerro == true) {
						paseo -= 5;
					}
					tomarMate += 20;
				}
				break;
			}
			if (hambre > 100) {
				hambre = 100;
			}
			if (sueño > 100) {
				sueño = 100;
			}
			if (higiene > 100) {
				higiene = 100;
			}
			if (diversion > 100) {
				diversion = 100;
			}
			if (paseo > 100) {
				paseo = 100;
			}
			if (tomarMate > 100) {
				tomarMate = 100;
			}
			if (esPerro == false && esCarpincho == false) {
				System.out.println("Hambre: " + hambre + "\nSueño:" + sueño + "\nHigiene:" + higiene + "\nDiversión: "
						+ diversion);
			}
			if (esPerro == true) {
				System.out.println("Hambre: " + hambre + "\nSueño:" + sueño + "\nHigiene:" + higiene + "\nDiversión: "
						+ diversion + "\nPaseo: " + paseo);
			}
			if (esCarpincho == true) {
				System.out.println("Hambre: " + hambre + "\nSueño:" + sueño + "\nHigiene:" + higiene + "\nDiversión: "
						+ diversion + "\nTomar mate: " + tomarMate);
			}

			partida++;

		} while ((hambre > 0) && (sueño > 0) && (higiene > 0) && (diversion > 0) && (paseo > 0) && (tomarMate > 0)
				&& (partida < 30));
		if (hambre < 1 || sueño < 1 || higiene < 1 || diversion < 1 || paseo < 1 || tomarMate < 1) {
			System.out.println(Enterrar.Enterrar(nombre, raza, partida));
		}
		if (partida == 30) {
			System.out.println(Enterrar.Enterrar(nombre, raza, partida));
		}

	}

}
