package clases;

import interfaces.ContarNumeroPlazas;
import interfaces.VenderFicha;

public abstract class Columpio extends Instalacion implements ContarNumeroPlazas,VenderFicha{
	private float precioFicha;
	private float benefico;

	public Columpio(String nombre, float precioFicha) {
		super(nombre);
		this.precioFicha = precioFicha;
		this.benefico=0;
	}
	
	

	public float getPrecioFicha() {
		return precioFicha;
	}

	public void setPrecioFicha(float precioFicha) {
		this.precioFicha = precioFicha;
	}

	@Override
	public String toString() {
		return super.toString()+
				"\tBeneficio total: "+this.benefico+
				"\n\tNumero de plazas: "+this.numeroTotalPlazas()+
				"\n\tPrecio Ficha: "+this.precioFicha;
	}



	public void venderFicha() {
		this.benefico+=this.precioFicha;
	}


	
	
}
