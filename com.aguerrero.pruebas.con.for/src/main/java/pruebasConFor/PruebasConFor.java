package pruebasConFor;

import java.util.Random;
import java.util.Scanner;

public class PruebasConFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime cuántas letras aleatorias quieres");
		byte nLetras=Byte.parseByte(sc.nextLine());
		Random aleatorio=new Random();
		for(byte i=0; i<nLetras;i++) {
			System.out.print((char)aleatorio.nextInt(97,123));
		}
		/*System.out.println("Dime qué tabla de multiplicar quieres hacer (1-10)");
		byte numero=Byte.parseByte(sc.nextLine());
		for(byte i=0;i<=10;i++) {
			System.out.println(numero+" x "+i+" = "+numero*i);
		}
		System.out.println("Aquí tienes tu tabla de multiplicar.");*/
		System.out.println("");
		System.out.println("Cerrando Scanner...");
		sc.close();
		System.out.println("Scanner cerrado.");

	}

}
