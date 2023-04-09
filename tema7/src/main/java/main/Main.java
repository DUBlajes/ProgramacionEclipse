package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		byte numero = pideNumero();
		System.out.println("El número era el " + numero);
		System.out.println("Y el programa seguiría...");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static byte pideNumero() {
		Scanner sc=new Scanner (System.in);
		System.out.println("Dime un número");
		try {
			return Byte.parseByte(sc.nextLine());
		}catch(NumberFormatException e) {
			System.out.println("Tendrías que haber puesto un número");
			return pideNumero();
		}
	}
}
