package clases;

import java.util.ArrayList;
import java.util.Random;

import enumerador.Tipo;
import interfaces.GenerarAtaquesNormales;

public class Pokemon extends ElementoConNombre implements GenerarAtaquesNormales {
	private Tipo tipo;
	private ArrayList<Ataque> ataque;

	public Pokemon(String nombre, Tipo tipo, ArrayList<Ataque> ataque) {
		super(nombre);
		this.tipo = tipo;
		this.ataque=ataque;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public ArrayList<Ataque> getAtaque() {
		return ataque;
	}

	public void setAtaque(ArrayList<Ataque> ataque) {
		this.ataque = ataque;
	}

	@Override
	public String toString() {
		return "\n" + super.toString() + "\nPokemon tipo: " + tipo + "\nAtaques: " + "\n" + this.getAtaque();
	}

	@Override
	public boolean crearAtaquesNormales() {
		Random r = new Random();
		byte ataqueElegido = (byte) r.nextInt(4);
		switch (ataqueElegido) {
		case 1:
			this.tipo=tipo.NORMAL;
			this.setNombre("Ataque Rapido");
			break;
		case 2:
			this.tipo=tipo.NORMAL;
			this.setNombre("Placaje");
			break;
		case 3:
			this.tipo=tipo.NORMAL;
			this.setNombre("Arañazo");
			break;
		case 4:
			this.tipo=tipo.NORMAL;
			this.setNombre("Mordisco");
			break;

		}
		return true;
	}

}
