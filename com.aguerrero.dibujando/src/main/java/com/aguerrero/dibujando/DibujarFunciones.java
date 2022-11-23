package com.aguerrero.dibujando;

import java.util.Scanner;

public class DibujarFunciones {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime qué carácter quieres para los ojos.");
        char ojo= sc.nextLine().charAt(0);
        System.out.println("Dime cuántas caras quieres.");
        byte nCaras = Byte.parseByte(sc.nextLine());
        
            System.out.print(HaciendoCaras.pintaTrozoCara(" /'''\\ ", nCaras));

            System.out.println();
            System.out.print(HaciendoCaras.pintaTrozoCara(Reemplazar.reemplazo("o", ojo), nCaras));


            System.out.println();
            System.out.print(HaciendoCaras.pintaTrozoCara(" \\ - / ", nCaras));

            System.out.println();
            System.out.print(HaciendoCaras.pintaTrozoCara("/-----\\", nCaras));

        sc.close();

	}

}
