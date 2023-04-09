package clases;

import java.util.ArrayList;

public class Inventario {
	private ArrayList<Pokeball> pokeball;
	private ArrayList<Pocion> pociones;

	public Inventario(ArrayList<Pokeball> pokeball, ArrayList<Pocion> pociones) {
		super();
		this.pokeball = pokeball;
		this.pociones = pociones;
	}

	public ArrayList<Pokeball> getPokeball() {
		return pokeball;
	}

	public void setPokeball(ArrayList<Pokeball> pokeball) {
		this.pokeball = pokeball;
	}

	public ArrayList<Pocion> getPociones() {
		return pociones;
	}

	public void setPociones(ArrayList<Pocion> pociones) {
		this.pociones = pociones;
	}

	@Override
	public String toString() {
		return "\n" + this.getPokeball() + "\n" + this.getPociones();
	}

}
