package examen;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// 👨 👩 🐴 🐹 Θ θ ϴ ෴ ෴ ◓
		System.out.println("Situación inicial: ");
		String[][] iconosAula= {{"--","--","|  "," |","--","--"},
								{"--","👨","|  "," |","--","👨"},
								{"👨","👨","|  "," |","◓ ","◓ "},
								{"👨","👨","|  "," |","👨","👨"},
								{"👨","👨","|  "," |","👨","👨"},
								{"👨","--","|  "," |","👩","👩"},
								{"--","--","|🐴"," |","--","👨"},
								{"🖥","🗔","|  "," |"," "," "},
								{"🪑","⊡ ","|  "," |"," "," "}};
		String[][] nombresAula= {{"-","-","|  "," |","-","-"},
								 {"-","Cosmin","|  "," |","-","Alberto"},
								 {"Darío","José H","|  "," |","Irene","Naomi"},
								 {"Borja","Javi","|  "," |","José G","Nico"},
								 {"Sergio","CarlosC","|  "," |","Mario","Ricardo"},
								 {"CarlosR","-","|  "," |","Mónica","Mar"},
								 {"-","-","|🐴"," |","-","Alex. T"},
									{"🖥","🗔","|  "," |"," "," "},
									{"🪑","⊡ ","|  "," |"," "," "}};
		System.out.println(Funciones.imprimeAula(iconosAula, nombresAula));
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime nº de veces a intercambiar alumnos");
		byte veces=Byte.parseByte(sc.nextLine());
		Funciones.intercambiarAlumnos(iconosAula, nombresAula, veces);
		System.out.println("\n------------------------");
		System.out.println(Funciones.imprimeAula(iconosAula, nombresAula));
		byte direccion=1;
		System.out.println("Dime nº de Movimientos");
		byte movimientos=Byte.parseByte(sc.nextLine());
		for(byte i=0;i<movimientos;i++) {
			if(Funciones.moverCaballo(iconosAula, nombresAula, direccion)) {
				direccion*=-1;
			}
			System.out.println(Funciones.imprimeAula(iconosAula, nombresAula));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			for(byte j=0;j<iconosAula.length;j++) {
				System.out.println("\r");
			}


		}
	}
	
} 
