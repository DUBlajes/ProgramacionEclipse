package clases;

/**
 * Clase que modela a un perro en Los Sims
 * 
 * @author Álvaro Guerrero
 *
 */
public class Perro {
	/** El nombre del perro **/
	private String nombre;
	/** El género del perro. Tiene que valer h(hombre) o m(mujer) **/
	private char genero;
	/**
	 * El hambre que tiene el perro. De 0 (saciado totalmente) a 100 (muerto de
	 * hambre)
	 **/
	private byte hambre;
	/**
	 * El sueño que tiene el perro. De 0 (totalmente descansado) a 100 (muerto de
	 * sueño)
	 **/
	private byte sueño;
	/**
	 * La suciedad que tiene el perro. De 0 (Limpio como una patena) a 100 (comido
	 * de mierda)
	 **/
	private byte suciedad;
	/**
	 * El aburrimiento que tiene el perro. De 0 (Entretenido totalmente) a 100
	 * (aburrido de estar aburrido)
	 **/
	private byte aburrimiento;
	/** Raza del perro **/
	private String raza;
	/** Pelaje del perro **/
	private String pelaje;
	/** Dueño o dueña del perro **/
	private Sim dueño;
	
	
	
	
	

	public Perro(String nombre, char genero, String raza,
			String pelaje, Sim dueño) {
		
		this.nombre = nombre;
		this.genero = genero;
		this.hambre = 50;
		this.sueño = 50;
		this.suciedad = 50;
		this.aburrimiento = 50;
		this.raza = raza;
		this.pelaje = pelaje;
		this.dueño = dueño;
	}
	
	public String getNombre() {
		return this.nombre;		
	}
	
	public char getGenero() {
		return this.genero;
	}
	public void setNombre(String elNombreQueYoQuiera) {
		this.nombre=elNombreQueYoQuiera;
	}
	
	public Sim getDuenio() {
		return this.dueño;
	}
	
	public void setDuenio(Sim d) {
		this.dueño=d;
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


	/**
	 * Función que resta 20 de hambre al sim que la llame
	 */
	public void comer() { // el 'static' lo que hace es generalizar, cuando queremos que algo lo hagan
							// todos los objetos
		this.hambre -= 20;
	}

	public String toString() {
		String ret="";
		ret+=this.nombre+" - "+
		(genero=='h'?"Perro":"Perra")+" "+this.raza+
				". Pelaje "+this.pelaje+
				".\n\tHambre: "+this.hambre+
				"\n\tSueño: "+this.sueño+
				"\n\tSuciedad: "+this.suciedad+
				"\n\tAburrimiento: "+this.aburrimiento;
		return ret;
	}
}
