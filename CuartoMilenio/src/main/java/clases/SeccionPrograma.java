package clases;

import java.util.ArrayList;

import enumerador.Tematica;

public class SeccionPrograma extends Seccion{
	private ArrayList<Testigo> testigos;

	public SeccionPrograma(String nombre, Tematica tematica, ArrayList<Testigo> testigos) {
		super(nombre, tematica);
		this.testigos = testigos;
	}

	public ArrayList<Testigo> getTestigos() {
		return testigos;
	}

	public void setTestigos(ArrayList<Testigo> testigos) {
		this.testigos = testigos;
	}

	@Override
	public String toString() {
		return "SeccionPrograma [testigos=" + testigos + "]";
	}
	
	
}
