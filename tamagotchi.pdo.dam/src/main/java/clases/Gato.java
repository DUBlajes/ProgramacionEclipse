package clases;

import enums.Especie;
import excepciones.NombreConNumerosException;

public class Gato extends Tamagotchi{
	private byte causarCaos;

	public Gato(String nombre) throws NombreConNumerosException {
		super(nombre, Especie.GATO);
		this.causarCaos = 50;
	}

	public byte getCausarCaos() {
		return causarCaos;
	}

	public void setCausarCaos(byte causarCaos) {
		this.causarCaos = causarCaos;
	}
	
	public void causarCaos() {
		this.causarCaos+=25;
		this.bajarEstadisticas();
		if(this.causarCaos>100) {causarCaos=100;}
	}
	
	
	
	@Override
	public boolean estaVivo() {
		return super.estaVivo()&&this.causarCaos>0;
	}

	@Override
	protected void bajarEstadisticas() {
		super.bajarEstadisticas();
		this.causarCaos-=5;
		if(this.causarCaos<0) {this.causarCaos=0;}
	}

	@Override
	public String toString() {
		return super.toString()+"causar caos: "+this.causarCaos+"/100\n\t";
	}
	
}
