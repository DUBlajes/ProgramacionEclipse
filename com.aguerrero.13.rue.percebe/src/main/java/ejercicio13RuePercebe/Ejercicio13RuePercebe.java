package ejercicio13RuePercebe;

import java.util.Scanner;

public class Ejercicio13RuePercebe {

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
		for (byte i = 0; i < nPisos; i++) {

				System.out.print("| --- |");
			}
			System.out.println();
			for (byte i = 0; i < nPisos; i++) {
				System.out.print("|     |");
			}
			System.out.println();
			for (byte i = 0; i < nPisos; i++) {
				System.out.print("|     |");
			}
			System.out.println();
		}
	}

}
