package clases;

import java.util.ArrayList;

public class Temporada {
	private String numero;
	private ArrayList<Programa> programas;
	public Temporada(String numero, ArrayList<Programa> programas) {
		super();
		this.numero = numero;
		this.programas = programas;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public ArrayList<Programa> getProgramas() {
		return programas;
	}
	public void setProgramas(ArrayList<Programa> programas) {
		this.programas = programas;
	}
	@Override
	public String toString() {
		return "Temporada [numero=" + numero + ", programas=" + programas + "]";
	}
	
	
}
