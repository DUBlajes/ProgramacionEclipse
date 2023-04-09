package clases;

import java.util.Random;

import excepciones.NombreInvalidoException;

public class Guerrero extends Luchador {
	private Escudo escudo;

	public Guerrero(String nombre, Arma arma, Escudo escudo) throws NombreInvalidoException {
		super(nombre, arma);
		this.escudo = escudo;
	}

	public Escudo getEscudo() {
		return escudo;
	}

	public void setEscudo(Escudo escudo) {
		this.escudo = escudo;
	}

	@Override
	public String toString() {
		return super.toString()
				+ "\n Escudo disponible: " + escudo;
	}
	
	public byte defender() {
		Random r = new Random();
		byte dañoBloqueado = (byte) r.nextInt(0, this.escudo.getProteccion() + 1);
		System.out.println(
				this.getNombre() + " defiende con su " + this.escudo.getNombre() + " y bloquea " + dañoBloqueado + " puntos de daño.");
		return dañoBloqueado;
	}

	
	
}
