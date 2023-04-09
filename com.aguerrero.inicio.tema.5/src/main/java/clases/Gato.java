package clases;

public class Gato {
	/** El nombre del gato **/
	private String nombre;
	/** El género del gato. Tiene que valer h(hombre) o m(mujer) **/
	private char genero;
	/**
	 * El hambre que tiene el gato. De 0 (saciado totalmente) a 100 (muerto de
	 * hambre)
	 **/
	private byte hambre;
	/**
	 * El sueño que tiene el gato. De 0 (totalmente descansado) a 100 (muerto de
	 * sueño)
	 **/
	private byte sueño;
	/**
	 * La suciedad que tiene el gato. De 0 (Limpio como una patena) a 100 (comido de
	 * mierda)
	 **/
	private byte suciedad;
	/**
	 * El aburrimiento que tiene el gato. De 0 (Entretenido totalmente) a 100
	 * (aburrido de estar aburrido)
	 **/
	private byte aburrimiento;
	/** Raza del gato **/
	private String raza;
	/** Pelaje del gato **/
	private String pelaje;
	/** Dueño o dueña del gato **/
	private Sim dueño;
	/**
	 * Tendencia al caos del gato. De 0 (totalmente manso) a 100 (el infierno en la
	 * tierra)
	 **/
	private byte tendenciaAlCaos;

	public Gato(String nombre, char genero, String raza, String pelaje, Sim dueño) {
		this.nombre = nombre;
		this.genero = genero;
		this.hambre = 50;
		this.sueño = 50;
		this.suciedad = 50;
		this.aburrimiento = 50;
		this.raza = raza;
		this.pelaje = pelaje;
		this.dueño = dueño;
		this.tendenciaAlCaos = 50;
	}
	
	

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
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



	public byte getSuciedad() {
		return suciedad;
	}



	public void setSuciedad(byte suciedad) {
		this.suciedad = suciedad;
	}



	public byte getAburrimiento() {
		return aburrimiento;
	}



	public void setAburrimiento(byte aburrimiento) {
		this.aburrimiento = aburrimiento;
	}



	public String getRaza() {
		return raza;
	}



	public void setRaza(String raza) {
		this.raza = raza;
	}



	public String getPelaje() {
		return pelaje;
	}



	public void setPelaje(String pelaje) {
		this.pelaje = pelaje;
	}



	public Sim getDueño() {
		return dueño;
	}



	public void setDueño(Sim dueño) {
		this.dueño = dueño;
	}



	public byte getTendenciaAlCaos() {
		return tendenciaAlCaos;
	}



	public void setTendenciaAlCaos(byte tendenciaAlCaos) {
		this.tendenciaAlCaos = tendenciaAlCaos;
	}



	public char getGenero() {
		return genero;
	}



	/**
	 * Función que resta 20 de hambre al sim que la llame
	 */
	public void comer() { // el 'static' lo que hace es generalizar, cuando queremos que algo lo hagan
							// todos los objetos
		this.hambre -= 20;
	}

	public String toString() {
		String ret = "";
		ret += this.nombre + " - " + (genero == 'h' ? "Gato" : "Gata") + " " + this.raza + ".\n\tHambre: " + this.hambre
				+ "\n\tSueño: " + this.sueño + "\n\tSuciedad: " + this.suciedad + "\n\tAburrimiento: "
				+ this.aburrimiento + "\n\tTendencia al caos: " + this.tendenciaAlCaos+ "\n\tDueño: " + this.dueño;
		return ret;
	}
}
