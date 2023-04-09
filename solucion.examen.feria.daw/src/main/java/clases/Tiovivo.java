package clases;

import java.util.ArrayList;

public class Tiovivo extends Columpio{
	private ArrayList<Montable> montables;

	public Tiovivo(String nombre, float precioFicha, ArrayList<Montable> montables) {
		super(nombre, precioFicha);
		this.montables = montables;
	}

	public ArrayList<Montable> getMontables() {
		return montables;
	}

	public void setMontables(ArrayList<Montable> montables) {
		this.montables = montables;
	}

	@Override
	public String toString() {
		String ret=super.toString()+"\n\tMontables:";
		
		for(byte i=0;i<this.montables.size();i++) {
			ret+="\n\t\t"+this.montables.get(i);
		}
		return ret;
	}

	public byte numeroTotalPlazas() {
		byte sumaPlazas=0;
		for (byte i=0;i<this.montables.size();i++) {
			sumaPlazas+=this.montables.get(i).getNumeroPlazas();
		}
		return sumaPlazas;
	}
	
	
}
