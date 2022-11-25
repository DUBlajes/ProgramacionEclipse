package com.aguerrero.dibujando;

import java.util.Scanner;

public class DibujarFunciones {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime qué carácter quieres para los ojos.");
        char ojo= sc.nextLine().charAt(0);
        System.out.println("Dime un símbolo para cambiarle la boca a nuestra cara");
        char boca=sc.nextLine().charAt(0);  
        System.out.println("Dime cuántas caras quieres.");
        byte nCaras = Byte.parseByte(sc.nextLine());
//            System.out.print(HaciendoCaras.pintaTrozoCara("pelo", nCaras));
//            String plantillaOjos="(|o o|)";
//            System.out.println();
//            System.out.print(HaciendoCaras.pintaTrozoCara(Reemplazar.cambiarCaracter(plantillaOjos,'o', ojo), nCaras));
//
//            System.out.println();
//            System.out.print(HaciendoCaras.pintaTrozoCara(Reemplazar.cambiarCaracter(" \\ - / ", '-', boca), nCaras));
//
//            System.out.println();
//            System.out.print(HaciendoCaras.pintaTrozoCara("/-----\\", nCaras));
//            System.out.println();
            for(byte i=0;i<nCaras;i++) {
            	System.out.print(Reemplazar.cambiarCaracter("(|o o|)", 'o', ojo));
            }
            System.out.println();
            for(byte i=0;i<nCaras;i++) {
            	String nombreElegido=" "+Reemplazar.nombreAleatorio()+" "; //El más largo tiene 24 caracteres
            	if(nombreElegido.length()<24) {
            		byte espaciosQueFaltan=(byte)(24-nombreElegido.length());
            		//TODO necesita bucles!!
            		nombreElegido=espaciosQueFaltan/2+nombreElegido+espaciosQueFaltan/2;
            	}
            	System.out.print(nombreElegido);
            }

        sc.close();

	}

}
