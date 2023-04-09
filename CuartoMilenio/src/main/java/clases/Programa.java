package clases;

import java.util.ArrayList;

public class Programa extends ElementoConNombre{
	private ArrayList<Seccion> secciones;

	public Programa(String nombre, ArrayList<Seccion> secciones) {
		super(nombre);
		this.secciones = secciones;
	}

	public ArrayList<Seccion> getSecciones() {
		return secciones;
	}

	public void setSecciones(ArrayList<Seccion> secciones) {
		this.secciones = secciones;
	}

	@Override
	public String toString() {
		return "Programa [secciones=" + secciones + "]";
	}
	
	
	
}
