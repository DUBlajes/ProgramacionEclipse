package lucha.a.muerte.en.cenec;

import java.util.ArrayList;
import java.util.Scanner;

import clases.Arma;
import clases.Berserker;
import clases.Combate;
import clases.Escudo;
import clases.Guerrero;
import clases.Luchador;
import clases.Ronda;
import clases.Torneo;
import excepciones.DanioInvalidoException;
import excepciones.NombreInvalidoException;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Combate> combates=new ArrayList<Combate>();
		ArrayList<Ronda> rondas=new ArrayList<Ronda>();
		boolean nombreOK=true;
		boolean danioOK=true;
		Arma a1 = null;
		
		do {
		System.out.println("Dime el nombre del arma");
		String nombre=sc.nextLine();
		System.out.println("Dime el daño entre 1 y 40 que va a hacer el arma");
		byte danio=Byte.parseByte(sc.nextLine());
			try {
				a1=new Arma(nombre, danio);
				nombreOK=true;
				danioOK=true;
			} catch (NombreInvalidoException e) {
				nombreOK=false;
				System.out.println(e.getMessage());
			}catch (DanioInvalidoException e) {
				danioOK=false;
				System.out.println(e.getMessage());
			}
			
		} while (!nombreOK||!danioOK);
		System.out.println(a1);
		
		
		/*Arma espadaBastarda=new Arma("Espada Bastarda", (byte)10);
		Arma lanza=new Arma("Lanza maligna pero no mucho", (byte)15);
		Arma patitoAmarillo=new Arma("Super patito amarillo de goma con pinchos", (byte)30);
		Escudo escudoDeHierro=new Escudo("Escudo de Hierro", (byte)30);
		Guerrero alvaroGuerrero=new Guerrero("Álvaro Guerrero", espadaBastarda, escudoDeHierro);
		Berserker bersie=new Berserker("Bersie", lanza, patitoAmarillo);
		
		
		Combate c1=new Combate(alvaroGuerrero, bersie);
		//Crea un segundo objeto combate y luego crea una ronda metiendole los dos combates con el nombre que quieras
		Combate c2=new Combate(alvaroGuerrero, bersie);
		
		Ronda r1 = null;
		try {
			r1 = new Ronda("Ronda 1", (ArrayList<Combate>)combates);
		} catch (NombreInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		r1.añadirCombates(c1);
		r1.añadirCombates(c2);
		System.out.println(r1);*/
		


	}

}
