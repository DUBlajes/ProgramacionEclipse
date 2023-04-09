package clases;

import interfaces.ContarNumeroPlazas;
import interfaces.VenderFicha;

public abstract class ElementoConPrecioFicha extends ElementoConNombre implements ContarNumeroPlazas, VenderFicha{
	private Float precioFicha;
	protected Float beneficio;

	public ElementoConPrecioFicha(String nombre, Float precioFicha, Float beneficio) {
		super(nombre);
		this.precioFicha = precioFicha;
		
	}

	public Float getPrecioFicha() {
		return precioFicha;
	}

	public void setPrecioFicha(Float precioFicha) {
		this.precioFicha = precioFicha;
	}
	
	public byte numeroTotalPlazas() {
		return 0;
	}
	
	public void venderFicha() {
		beneficio=(float)getPrecioFicha();
	}

	
	@Override
	public String toString() {
		return "El precio de la ficha es de " + precioFicha + "€.";
	}
	
	
}
