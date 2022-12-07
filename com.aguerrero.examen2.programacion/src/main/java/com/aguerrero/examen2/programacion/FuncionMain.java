package com.aguerrero.examen2.programacion;

import java.util.Scanner;

/**
 * Clase que recoge el main del programa
 * 
 * @author Álvaro Guerrero
 *
 */
public class FuncionMain {
	/**
	 * Método principal del programa. Te pide que indiques números para calcular los
	 * minutos que quedan hata el fin del mundo y luego eliges una serie de acciones
	 * que aumentan o disminuyen esa cantidad de minutos para que, al final del
	 * programa, la humanidad llegue o no al apocalipsis.
	 * 
	 * @param args De momento, sin uso.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		short minutosParaMedianoche = 0;
		byte probabilidad = 0;
		String accion = "";

		System.out.println("Dime un número sin decimales");
		do {
			minutosParaMedianoche = Short.parseShort(sc.nextLine());
			if ((minutosParaMedianoche < -719 || minutosParaMedianoche > -1)) {
				System.out.println("Número erróneo. Debe estar entre -719 y -1. Introdúcelo de nuevo");
			} else {
				System.out.println("Número correcto. Seguimos.");
			}

		} while (minutosParaMedianoche < -719 || minutosParaMedianoche > -1);

		System.out.println("Dime otro número sin decimales");
		do {
			probabilidad = Byte.parseByte(sc.nextLine());
			if ((probabilidad < 0 || probabilidad > 100)) {
				System.out.println("Número erróneo. Debe estar entre 0 y 100. Introdúcelo de nuevo");
			} else {
				System.out.println("Número correcto. Seguimos.");
			}
		} while (probabilidad < 0 || probabilidad > 100);

		for (byte i = 1; i < 31; i++) {
			System.out.println("Turno " + i);
			for (byte j = 0; j < 4; j++) {
				if (j == 0) {
					System.out.println("Estás en primavera.");
					/**
					 * Para evitar repetir el código del menú, llalamos a la función eventosAOCurrir
					 * que muestra las distintas acciones que el usuario puede realizar
					 */
					boolean accionExiste = true;
					do {
						System.out.println(Funciones.eventosAOcurrir());
						accion = sc.nextLine();
						switch (accion) {
						case "0":
							System.out.println(Funciones.eventoAleatorio());
							byte numeroPrincipio = (byte) Funciones.eventoAleatorio().charAt(0);
							minutosParaMedianoche += Funciones.consecuenciasEvento(numeroPrincipio);
							accionExiste = true;
							break;
						case "1":
							Funciones.consecuenciasEvento((byte) 1);
							minutosParaMedianoche += Funciones.consecuenciasEvento((byte) 1);
							System.out.println(minutosParaMedianoche);
							accionExiste = true;
							break;
						case "2":
							Funciones.consecuenciasEvento((byte) 2);
							minutosParaMedianoche += Funciones.consecuenciasEvento((byte) 2);
							System.out.println(minutosParaMedianoche);
							accionExiste = true;
							break;
						case "3":
							Funciones.consecuenciasEvento((byte) 3);
							minutosParaMedianoche += Funciones.consecuenciasEvento((byte) 3);
							System.out.println(minutosParaMedianoche);
							accionExiste = true;
							break;
						case "4":
							Funciones.consecuenciasEvento((byte) 4);
							minutosParaMedianoche += Funciones.consecuenciasEvento((byte) 4);
							System.out.println(minutosParaMedianoche);
							accionExiste = true;
							break;
						case "5":
							Funciones.consecuenciasEvento((byte) 5);
							minutosParaMedianoche += Funciones.consecuenciasEvento((byte) 5);
							System.out.println(minutosParaMedianoche);
							accionExiste = true;
							break;
						case "6":
							Funciones.consecuenciasEvento((byte) 6);
							minutosParaMedianoche += Funciones.consecuenciasEvento((byte) 6);
							System.out.println(minutosParaMedianoche);
							accionExiste = true;
							break;
						case "7":
							Funciones.consecuenciasEvento((byte) 7);
							minutosParaMedianoche += Funciones.consecuenciasEvento((byte) 7);
							System.out.println(minutosParaMedianoche);
							accionExiste = true;
							break;
						case "8":
							Funciones.consecuenciasEvento((byte) 8);
							minutosParaMedianoche += Funciones.consecuenciasEvento((byte) 8);
							System.out.println(minutosParaMedianoche);
							accionExiste = true;
							break;
						case "9":
							Funciones.consecuenciasEvento((byte) 9);
							minutosParaMedianoche += Funciones.consecuenciasEvento((byte) 9);
							System.out.println(minutosParaMedianoche);
							accionExiste = true;
							break;
						case "10":
							Funciones.consecuenciasEvento((byte) 10);
							minutosParaMedianoche += Funciones.consecuenciasEvento((byte) 10);
							System.out.println(minutosParaMedianoche);
							accionExiste = true;
							break;

						default:
							accionExiste = false;
							break;
						}
					} while (accionExiste == false);
				}
				if (j == 1) {
					System.out.println("Estás en verano.");

					boolean accionExiste = true;
					do {
						System.out.println(Funciones.eventosAOcurrir());
						accion = sc.nextLine();
						switch (accion) {
						case "0":
							System.out.println(Funciones.eventoAleatorio());
							byte numeroPrincipio = (byte) Funciones.eventoAleatorio().charAt(0);
							minutosParaMedianoche += Funciones.consecuenciasEvento(numeroPrincipio);
							accionExiste = true;
							break;
						case "1":
							Funciones.consecuenciasEvento((byte) 1);
							minutosParaMedianoche += Funciones.consecuenciasEvento((byte) 1);
							System.out.println(minutosParaMedianoche);
							accionExiste = true;
							break;
						case "2":
							Funciones.consecuenciasEvento((byte) 2);
							minutosParaMedianoche += Funciones.consecuenciasEvento((byte) 2);
							System.out.println(minutosParaMedianoche);
							accionExiste = true;
							break;
						case "3":
							Funciones.consecuenciasEvento((byte) 3);
							minutosParaMedianoche += Funciones.consecuenciasEvento((byte) 3);
							System.out.println(minutosParaMedianoche);
							accionExiste = true;
							break;
						case "4":
							Funciones.consecuenciasEvento((byte) 4);
							minutosParaMedianoche += Funciones.consecuenciasEvento((byte) 4);
							System.out.println(minutosParaMedianoche);
							accionExiste = true;
							break;
						case "5":
							Funciones.consecuenciasEvento((byte) 5);
							minutosParaMedianoche += Funciones.consecuenciasEvento((byte) 5);
							System.out.println(minutosParaMedianoche);
							accionExiste = true;
							break;
						case "6":
							Funciones.consecuenciasEvento((byte) 6);
							minutosParaMedianoche += Funciones.consecuenciasEvento((byte) 6);
							System.out.println(minutosParaMedianoche);
							accionExiste = true;
							break;
						case "7":
							Funciones.consecuenciasEvento((byte) 7);
							minutosParaMedianoche += Funciones.consecuenciasEvento((byte) 7);
							System.out.println(minutosParaMedianoche);
							accionExiste = true;
							break;
						case "8":
							Funciones.consecuenciasEvento((byte) 8);
							minutosParaMedianoche += Funciones.consecuenciasEvento((byte) 8);
							System.out.println(minutosParaMedianoche);
							accionExiste = true;
							break;
						case "9":
							Funciones.consecuenciasEvento((byte) 9);
							minutosParaMedianoche += Funciones.consecuenciasEvento((byte) 9);
							System.out.println(minutosParaMedianoche);
							accionExiste = true;
							break;
						case "10":
							Funciones.consecuenciasEvento((byte) 10);
							minutosParaMedianoche += Funciones.consecuenciasEvento((byte) 10);
							System.out.println(minutosParaMedianoche);
							accionExiste = true;
							break;

						default:
							accionExiste = false;
							break;
						}
					} while (accionExiste == false);

				}
				if (j == 2) {
					System.out.println("Estás en otoño.");

					boolean accionExiste = true;
					do {
						System.out.println(Funciones.eventosAOcurrir());
						accion = sc.nextLine();
						switch (accion) {
						case "0":
							System.out.println(Funciones.eventoAleatorio());
							byte numeroPrincipio = (byte) Funciones.eventoAleatorio().charAt(0);
							minutosParaMedianoche += Funciones.consecuenciasEvento(numeroPrincipio);
							accionExiste = true;
							break;
						case "1":
							Funciones.consecuenciasEvento((byte) 1);
							minutosParaMedianoche += Funciones.consecuenciasEvento((byte) 1);
							System.out.println(minutosParaMedianoche);
							accionExiste = true;
							break;
						case "2":
							Funciones.consecuenciasEvento((byte) 2);
							minutosParaMedianoche += Funciones.consecuenciasEvento((byte) 2);
							System.out.println(minutosParaMedianoche);
							accionExiste = true;
							break;
						case "3":
							Funciones.consecuenciasEvento((byte) 3);
							minutosParaMedianoche += Funciones.consecuenciasEvento((byte) 3);
							System.out.println(minutosParaMedianoche);
							accionExiste = true;
							break;
						case "4":
							Funciones.consecuenciasEvento((byte) 4);
							minutosParaMedianoche += Funciones.consecuenciasEvento((byte) 4);
							System.out.println(minutosParaMedianoche);
							accionExiste = true;
							break;
						case "5":
							Funciones.consecuenciasEvento((byte) 5);
							minutosParaMedianoche += Funciones.consecuenciasEvento((byte) 5);
							System.out.println(minutosParaMedianoche);
							accionExiste = true;
							break;
						case "6":
							Funciones.consecuenciasEvento((byte) 6);
							minutosParaMedianoche += Funciones.consecuenciasEvento((byte) 6);
							System.out.println(minutosParaMedianoche);
							accionExiste = true;
							break;
						case "7":
							Funciones.consecuenciasEvento((byte) 7);
							minutosParaMedianoche += Funciones.consecuenciasEvento((byte) 7);
							System.out.println(minutosParaMedianoche);
							accionExiste = true;
							break;
						case "8":
							Funciones.consecuenciasEvento((byte) 8);
							minutosParaMedianoche += Funciones.consecuenciasEvento((byte) 8);
							System.out.println(minutosParaMedianoche);
							accionExiste = true;
							break;
						case "9":
							Funciones.consecuenciasEvento((byte) 9);
							minutosParaMedianoche += Funciones.consecuenciasEvento((byte) 9);
							System.out.println(minutosParaMedianoche);
							accionExiste = true;
							break;
						case "10":
							Funciones.consecuenciasEvento((byte) 10);
							minutosParaMedianoche += Funciones.consecuenciasEvento((byte) 10);
							System.out.println(minutosParaMedianoche);
							accionExiste = true;
							break;

						default:
							accionExiste = false;
							break;
						}
					} while (accionExiste == false);

				}
				if (j == 3) {
					System.out.println("Estás en invierno.");
					boolean accionExiste = true;
					do {
						System.out.println(Funciones.eventosAOcurrir());
						accion = sc.nextLine();
						switch (accion) {
						case "0":
							System.out.println(Funciones.eventoAleatorio());
							byte numeroPrincipio = (byte) Funciones.eventoAleatorio().charAt(0);
							minutosParaMedianoche += Funciones.consecuenciasEvento(numeroPrincipio);
							accionExiste = true;
							break;
						case "1":
							Funciones.consecuenciasEvento((byte) 1);
							minutosParaMedianoche += Funciones.consecuenciasEvento((byte) 1);
							System.out.println(minutosParaMedianoche);
							accionExiste = true;
							break;
						case "2":
							Funciones.consecuenciasEvento((byte) 2);
							minutosParaMedianoche += Funciones.consecuenciasEvento((byte) 2);
							System.out.println(minutosParaMedianoche);
							accionExiste = true;
							break;
						case "3":
							Funciones.consecuenciasEvento((byte) 3);
							minutosParaMedianoche += Funciones.consecuenciasEvento((byte) 3);
							System.out.println(minutosParaMedianoche);
							accionExiste = true;
							break;
						case "4":
							Funciones.consecuenciasEvento((byte) 4);
							minutosParaMedianoche += Funciones.consecuenciasEvento((byte) 4);
							System.out.println(minutosParaMedianoche);
							accionExiste = true;
							break;
						case "5":
							Funciones.consecuenciasEvento((byte) 5);
							minutosParaMedianoche += Funciones.consecuenciasEvento((byte) 5);
							System.out.println(minutosParaMedianoche);
							accionExiste = true;
							break;
						case "6":
							Funciones.consecuenciasEvento((byte) 6);
							minutosParaMedianoche += Funciones.consecuenciasEvento((byte) 6);
							System.out.println(minutosParaMedianoche);
							accionExiste = true;
							break;
						case "7":
							Funciones.consecuenciasEvento((byte) 7);
							minutosParaMedianoche += Funciones.consecuenciasEvento((byte) 7);
							System.out.println(minutosParaMedianoche);
							accionExiste = true;
							break;
						case "8":
							Funciones.consecuenciasEvento((byte) 8);
							minutosParaMedianoche += Funciones.consecuenciasEvento((byte) 8);
							System.out.println(minutosParaMedianoche);
							accionExiste = true;
							break;
						case "9":
							Funciones.consecuenciasEvento((byte) 9);
							minutosParaMedianoche += Funciones.consecuenciasEvento((byte) 9);
							System.out.println(minutosParaMedianoche);
							accionExiste = true;
							break;
						case "10":
							Funciones.consecuenciasEvento((byte) 10);
							minutosParaMedianoche += Funciones.consecuenciasEvento((byte) 10);
							System.out.println(minutosParaMedianoche);
							accionExiste = true;
							break;

						default:
							accionExiste = false;
							break;
						}
					} while (accionExiste == false);

				}
			}
		}
		Funciones.sucedeEvento(probabilidad);
		if (Funciones.sucedeEvento(probabilidad) == true) {
			System.out.println(Funciones.eventoAleatorio());
			byte numeroPrincipio = (byte) Funciones.eventoAleatorio().charAt(0);
			minutosParaMedianoche += Funciones.consecuenciasEvento(numeroPrincipio);
		}

	}

}
