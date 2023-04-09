package clases;

import enums.Especie;
import excepciones.NombreConNumerosException;

public class Tamagotchi extends CosaConNombre{
	private byte edad;
	private Especie especie;
	private byte hambre;
	private byte sueño;
	private byte diversion;
	private byte estres;
	
	
	public Tamagotchi(String nombre, byte edad, Especie especie, byte hambre, byte sueño, byte diversion, byte estres) throws NombreConNumerosException {
		super(nombre);
		this.edad = edad;
		this.especie = especie;
		this.hambre = hambre;
		this.sueño = sueño;
		this.diversion = diversion;
		this.estres = estres;
	}
	
	public Tamagotchi(String nombre,Especie especie) throws NombreConNumerosException {
		super(nombre);
		this.edad = 0;
		this.especie = especie;
		this.hambre = 50;
		this.sueño = 50;
		this.diversion = 50;
		this.estres = 50;
	}
	
	public void crecer() {
		this.edad++;
	}
	
	public boolean estaVivo() {
		return this.hambre>0&&this.sueño>0&&this.diversion>0&&this.estres>0&&edad<30;
	}
	
	public void comer(Comida c) {
		this.hambre+=c.getValorEnergetico();
		this.sueño-=c.getModorra();
		this.hambre+=5; //SOLO PARA ANULAR LA BAJADA DE HAMBRE
		this.sueño+=5; //PARA QUE SOLO AFECTE AL SUEÑO LA ESTADISTICA DE LA COMIDA
		bajarEstadisticas();
		if(this.sueño<0) {this.sueño=0;}
		if(this.hambre>100) {this.hambre=100;}
	}	
	
	public void jugar(Juego j) {
		this.diversion+=j.getDiversion();
		this.estres+=j.getEstres();
		this.diversion+=5; //CONTRAMEDIDA AL BAJAR DIVERSION QUE HARA BAJAR ESTADISTICAS
		this.estres+=5;//PARA LO MISMO: QUE EN EL ESTRES SOLO INTERVENGA EL JUEGO
		this.bajarEstadisticas();
		if(this.diversion>100) {this.diversion=100;}
		if(this.diversion<0) {this.diversion=0;}
		if(this.estres>100) {this.estres=100;}
		if(this.estres<0) {this.estres=0;}
	}
	
	public void relajarse() {
		this.estres+=25;
		this.bajarEstadisticas();
		if(this.estres>100) {estres=100;}
	}
	
	
	
	protected void bajarEstadisticas() {
		this.sueño-=5;
		this.diversion-=5;
		this.hambre-=5;
		this.estres-=5;
		if (this.sueño<0) {this.sueño=0;}
		if (this.diversion<0) {this.diversion=0;}
		if (this.hambre<0) {this.hambre=0;}
		if (this.estres<0) {this.estres=0;}
		this.crecer();
	}


	public void dormir() {
		this.sueño+=25;
		this.bajarEstadisticas();
		if(this.sueño>100) {this.sueño=100;}
	}

	
	
	public byte getEdad() {
		return edad;
	}


	public void setEdad(byte edad) {
		this.edad = edad;
	}


	public Especie getEspecie() {
		return especie;
	}


	public void setEspecie(Especie especie) {
		this.especie = especie;
	}


	public byte getHambre() {
		return hambre;
	}


	public void setHambre(byte hambre) {
		this.hambre = hambre;
	}


	public byte getSueño() {
		return sueño;
	}


	public void setSueño(byte sueño) {
		this.sueño = sueño;
	}


	public byte getDiversion() {
		return diversion;
	}


	public void setDiversion(byte diversion) {
		this.diversion = diversion;
	}


	public byte getEstres() {
		return estres;
	}


	public void setEstres(byte estres) {
		this.estres = estres;
	}


	@Override
	public String toString() {
		return super.toString()+"("+this.especie+") | Edad: "+this.edad+
				"\n-----------------------------------\n\t"+
				"hambre: "+this.hambre+"/100\n\t"+
				"sueño: "+this.sueño+"/100\n\t"+
				"diversión: "+this.diversion+"/100\n\t"+
				"estrés: "+this.estres+"/100\n\t";
	}
	
	
	
	
}
