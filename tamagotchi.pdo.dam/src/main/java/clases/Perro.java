package clases;

import enums.Especie;
import excepciones.NombreConNumerosException;

public class Perro extends Tamagotchi{
	private byte paseo;

	public Perro(String nombre) throws NombreConNumerosException {
		super(nombre, Especie.PERRO);
		this.paseo = 50;
	}

	public byte getPaseo() {
		return paseo;
	}

	public void setPaseo(byte paseo) {
		this.paseo = paseo;
	}

	@Override
	public String toString() {
		return super.toString()+"paseo: "+this.paseo+"/100\n\t";
	}
	
	public void pasear() {
		this.paseo+=25;
		this.bajarEstadisticas();
		if(this.paseo>100) {this.paseo=100;}
	}

	@Override
	protected void bajarEstadisticas() {
		super.bajarEstadisticas();
		this.paseo-=5;
		if(paseo<0) {paseo=0;}
	}

	@Override
	public boolean estaVivo() {
		return super.estaVivo()&&paseo>0;
	}
	
	
	
	
	
	
	
}
