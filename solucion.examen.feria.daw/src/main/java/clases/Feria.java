package clases;

import java.util.ArrayList;

public class Feria {
	private ArrayList<Instalacion> instalaciones;

	public Feria(ArrayList<Instalacion> instalaciones) {
		super();
		this.instalaciones = instalaciones;
	}

	public ArrayList<Instalacion> getInstalaciones() {
		return instalaciones;
	}

	public void setInstalaciones(ArrayList<Instalacion> instalaciones) {
		this.instalaciones = instalaciones;
	}

	@Override
	public String toString() {
		String ret= "Feria\n-----------\n";
		for(byte i=0;i<this.instalaciones.size();i++) {
			ret+=(this.instalaciones.get(i))+"\n";
		}
		return ret;
	}
	
	
}
