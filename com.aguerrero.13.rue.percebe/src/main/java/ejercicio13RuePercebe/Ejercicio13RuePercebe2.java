package ejercicio13RuePercebe;

import java.util.Scanner;
/**
 * Método principal del programa. Te pide un número de plantas y un número de casas por planta y las imprime por pantalla según el número que hayas introducido por consola.
 * @author Álvaro Guerrero
 *
 */
public class Ejercicio13RuePercebe2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte nPlantas;
		byte nPisos;
		System.out.println("¿Cuántas casas quieres en cada planta?");
		nPisos = Byte.parseByte(sc.nextLine());
		System.out.println("¿Cuántas plantas quieres que tenga el edificio?");
		nPlantas = Byte.parseByte(sc.nextLine());
		System.out.println("|----------------------------|" + "\n|     13 Rue del Percebe     |"
				+ "\n|----------------------------|");
		for (byte p = 0; p < nPlantas; p++) {
				System.out.println(Funciones.printAltura("| --- |", nPisos));
				System.out.println(Funciones.printAltura("|     |", nPisos));
				System.out.println(Funciones.printAltura("|     |", nPisos));
			}
		}
	}
