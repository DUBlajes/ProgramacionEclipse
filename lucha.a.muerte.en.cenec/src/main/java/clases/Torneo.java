package clases;

import java.util.ArrayList;
import java.util.Arrays;

import excepciones.NombreInvalidoException;

public class Torneo extends ElementoConNombre{
	private ArrayList<Ronda> rondas;

	public Torneo(String nombre, ArrayList<Ronda> rondas) throws NombreInvalidoException {
		super(nombre);
		this.rondas = rondas;
	}

	public ArrayList<Ronda> getRondas() {
		return rondas;
	}

	public void setRondas(ArrayList<Ronda> rondas) {
		this.rondas = rondas;
	}

	@Override
	public String toString() {
		return "Torneo" +super.toString()+ ". Ronda número " + this.rondas;
	}

	
}
