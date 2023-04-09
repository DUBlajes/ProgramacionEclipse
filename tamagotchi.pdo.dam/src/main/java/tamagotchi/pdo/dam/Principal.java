package tamagotchi.pdo.dam;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import clases.Comida;
import clases.Gato;
import clases.Juego;
import clases.Perro;
import clases.Tamagotchi;
import enums.Especie;
import excepciones.NombreConNumerosException;

public class Principal {

	public static void main(String[] args) {
		Random r=new Random();
		ArrayList<Comida> comidas=new ArrayList<Comida>();
		System.out.println(comidas.size());
		Comida patatas=null;
		Scanner sc = new Scanner (System.in);
		boolean patatasBien=false;
		do {
		try {
			System.out.println("Dime el nombre para la primera comida");
			patatas = new Comida("Patatas",(byte)4,(byte)1);
			patatasBien=true;
		} catch (NombreConNumerosException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		}while (!patatasBien);
		
		Comida pollo=new Comida("Pollo",(byte)7,(byte)3);
		Comida sopa=new Comida("Sopa",(byte)2,(byte)8);
		Comida pescado=new Comida("Pescado",(byte)9,(byte)3);
		
		comidas.add(patatas);
		comidas.add(pollo);
		comidas.add(sopa);
		comidas.add(1,pescado);
		
		ArrayList<Juego> juegos=new ArrayList<Juego>();
		
		juegos.add(new Juego("Peluche",(byte)3,(byte)-6));
		juegos.add(new Juego("Garticphone",(byte)8,(byte)4));
		juegos.add(new Juego("LOL",(byte)-4,(byte)7));
		juegos.add(new Juego("Furgo",(byte)8,(byte)-10));
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime el nombre de tu tamagotchi");
		String nombre=sc.nextLine();
		System.out.println("Elije la especie de tu tamagotchi\n\t1 - Dragon\n\t2 - Pollito\n\t3 - Perro\n\t4 - Gato");
		Tamagotchi tamagotchi=null;
		switch(Byte.parseByte(sc.nextLine())) {
		case 1:
			tamagotchi=new Tamagotchi(nombre,Especie.DRAGON);
			break;
		case 2:
			tamagotchi=new Tamagotchi(nombre,Especie.POLLITO);
			break;
		case 3:
			tamagotchi=new Perro(nombre);
			break;
		case 4:
			tamagotchi=new Gato(nombre);
			break;
		}
		while(tamagotchi.estaVivo()) {
			System.out.println(tamagotchi);
			System.out.println("Elige opcion: "
					+ "\n\t1 - Comer"
					+ "\n\t2 - Dormir"
					+ "\n\t3 - Jugar"
					+ "\n\t4 - Relajarse"
					+ (tamagotchi.getEspecie()==Especie.PERRO?"\n\t5 - Paseo":"")
					+ (tamagotchi.getEspecie()==Especie.GATO?"\n\t5 - Causar Caos":""));
			switch(Byte.parseByte(sc.nextLine())) {
			case 1: //Comer
				
				Comida comidaElegida=comidas.get(r.nextInt(comidas.size()));
				System.out.println(tamagotchi.getNombre()+" come "+comidaElegida.getNombre());
				tamagotchi.comer(comidaElegida);
				
				break;
			case 2: //Dormir
				tamagotchi.dormir();
				break;
			case 3: //Jugar
				
				Juego juegoElegido=juegos.get(r.nextInt(juegos.size()));
				System.out.println(tamagotchi.getNombre()+" juega  a "+juegoElegido.getNombre());
				tamagotchi.jugar(juegoElegido);
				
				break;
			case 4: //Relajarse
				tamagotchi.relajarse();
				break;
			case 5:	//Pasear o Causar caos
				if(tamagotchi.getEspecie()==Especie.PERRO) {
					((Perro)tamagotchi).pasear();
				}else if(tamagotchi.getClass()==Gato.class) {
					((Gato)tamagotchi).causarCaos();
				}
				break;
			}
		}
		
		
	}
	
}
