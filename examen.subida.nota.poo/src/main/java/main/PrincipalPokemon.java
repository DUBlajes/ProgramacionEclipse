package main;

import java.util.ArrayList;
import java.util.Scanner;

import clases.Ataque;
import clases.Entrenador;
import clases.Inventario;
import clases.Pocion;
import clases.Pokeball;
import clases.Pokemon;
import enumerador.Tipo;
import enumerador.TipoPokeball;

public class PrincipalPokemon {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		ArrayList<Ataque> ataques=new ArrayList<Ataque>();
		ArrayList<Pokemon> pokemons=new ArrayList<Pokemon>();
		ArrayList<Pokeball> pokeballs=new ArrayList<Pokeball>();
		ArrayList<Pocion> pociones=new ArrayList<Pocion>();
		
		Inventario inventario=new Inventario(pokeballs, pociones);
		
		Pokemon p1=new Pokemon("Pikachu", Tipo.ELECTRICO, ataques);
		Ataque a1=new Ataque("Placaje", Tipo.NORMAL, (byte)30);
		Ataque a2=new Ataque("Lanzallamas", Tipo.FUEGO, (byte)100);
		Pokemon p2=new Pokemon("Charmander", Tipo.FUEGO, null);
		Pokeball pokeball1=new Pokeball(TipoPokeball.MASTER_BALL);
		Pocion superPocion=new Pocion("Superpocion", (byte)100);
		
		ataques.add(a1);
		ataques.add(a2);
		pokemons.add(p1);
		pokemons.add(p2);
		pokeballs.add(pokeball1);
		pociones.add(superPocion);
		
		
		
		
		
		
		
		
		Entrenador rojo=new Entrenador("Rojo", pokemons, null);

		Entrenador ash=new Entrenador("Ash", inventario);
		System.out.println(ash);
		System.out.println("Dime cuantos pokemon quieres que tenga el entrenador (Entre 1 y 6)");
		System.out.println(ash.crearPokemonsNormales(Byte.parseByte(sc.nextLine())));
		

	}

}
