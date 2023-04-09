package clases;

import enumerador.Tematica;

public class Seccion extends ElementoConNombre {
	private Tematica tematica;

	public Seccion(String nombre, Tematica tematica) {
		super(nombre);
		this.tematica = tematica;
	}

	public Tematica getTematica() {
		return tematica;
	}

	public void setTematica(Tematica tematica) {
		this.tematica = tematica;
	}

	@Override
	public String toString() {
		return super.toString()+ "Seccion [tematica=" + tematica + "]";
	}
	
	
}
