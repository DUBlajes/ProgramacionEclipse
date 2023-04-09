package clases;

import java.util.ArrayList;

public class PuestoComida extends Instalacion{
	private boolean puedeVenderAlcohol;
	private ArrayList<Comida> comidasEnVenta;
	
	public PuestoComida(String nombre, boolean puedeVenderAlcohol, ArrayList<Comida> comidasEnVenta) {
		super(nombre);
		this.puedeVenderAlcohol = puedeVenderAlcohol;
		this.comidasEnVenta = comidasEnVenta;
	}

	public boolean isPuedeVenderAlcohol() {
		return puedeVenderAlcohol;
	}

	public void setPuedeVenderAlcohol(boolean puedeVenderAlcohol) {
		this.puedeVenderAlcohol = puedeVenderAlcohol;
	}

	public ArrayList<Comida> getComidasEnVenta() {
		return comidasEnVenta;
	}

	public void setComidasEnVenta(ArrayList<Comida> comidasEnVenta) {
		this.comidasEnVenta = comidasEnVenta;
	}

	@Override
	public String toString() {
		String ret= super.toString()+
				(this.puedeVenderAlcohol?"\n\tPuede vender alcohol":"");
			ret+="\n\tComidas en venta: ";
		for(byte i=0;i<this.comidasEnVenta.size();i++) {
			ret+="\n\t\t"+this.comidasEnVenta.get(i);
		}
		return ret;
	}
	
	
	
	
}
