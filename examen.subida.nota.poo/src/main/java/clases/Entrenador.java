package clases;

import java.util.ArrayList;
import java.util.Random;

import enumerador.Tipo;
import interfaces.GenerarPokemonsNormales;

public class Entrenador extends ElementoConNombre implements GenerarPokemonsNormales {
	private ArrayList<Pokemon> pokemons;
	private Inventario inventario;
	public Entrenador(String nombre, ArrayList<Pokemon> pokemons, Inventario inventario) {
		super(nombre);
		this.pokemons = pokemons;
		this.inventario = inventario;
	}
	
	public Entrenador(String nombre, Inventario inventario) {
		super(nombre);
		this.inventario = inventario;
	}

	public ArrayList<Pokemon> getPokemons() {
		return pokemons;
	}
	public void setPokemons(ArrayList<Pokemon> pokemons) {
		this.pokemons = pokemons;
	}
	public Inventario getInventario() {
		return inventario;
	}
	public void setInventario(Inventario inventario) {
		this.inventario = inventario;
	}
	@Override
	public String toString() {
		return super.toString()+
				"\nPokemons en su poder: " + 
				"\n"+this.getPokemons() + 
				"\nInventario: "+
				"\n"+ this.inventario;
	}

	@Override
	public boolean crearPokemonsNormales(byte cantidad) {
		Random r=new Random();
		String[] nombre=new String[]{"Pikachu", "Bulbasur", "Charmander", "Squirtle", "Geodude", "Zapdos"};
		int nombreElegido= r.nextInt(nombre.length);
		Pokemon pokemon1=new Pokemon(""+nombreElegido, Tipo.NORMAL, null);
		pokemon1.s
		return true;
	}
	
	
	
	
}
