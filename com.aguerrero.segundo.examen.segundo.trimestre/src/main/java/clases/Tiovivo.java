package clases;

import java.util.ArrayList;

public class Tiovivo extends ElementoConPrecioFicha {
	private ArrayList<Caballo> caballos;
	private ArrayList<Vehiculo> vehiculos;
	public Tiovivo(String nombre, Float precioFicha, ArrayList<Caballo> caballos, ArrayList<Vehiculo> vehiculos, Float beneficio) {
		super(nombre, precioFicha, beneficio);
		this.caballos = caballos;
		this.vehiculos = vehiculos;
		this.beneficio=beneficio;
	}
	public ArrayList<Caballo> getCaballos() {
		return caballos;
	}
	public void setCaballos(ArrayList<Caballo> caballos) {
		this.caballos = caballos;
	}
	public ArrayList<Vehiculo> getVehiculos() {
		return vehiculos;
	}
	public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}
	@Override
	public String toString() {
		return super.getNombre()+
				"\n\tTiovivo con varios caballos. De ellos, cada uno tiene lo siguiente: " + 
				"\n\t"+this.caballos + 
				"\n\t"+this.vehiculos;
	}
	
	
	
}
