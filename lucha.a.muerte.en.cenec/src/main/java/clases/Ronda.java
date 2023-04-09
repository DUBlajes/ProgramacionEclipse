package clases;

import java.util.ArrayList;
import java.util.Arrays;

import excepciones.NombreInvalidoException;

public class Ronda extends ElementoConNombre{
	private ArrayList<Combate> combates;

	public Ronda(String nombre, ArrayList<Combate> combates) throws NombreInvalidoException {
		super(nombre);
		this.combates = combates;
	}

	public ArrayList<Combate> getCombates() {
		return combates;
	}

	public void añadirCombates(Combate combate) {
		this.combates.add(combate);
	}

	@Override
	public String toString() {
		return super.toString()+"Ronda [combates=" + this.combates + "]";
	}
	
	
}
