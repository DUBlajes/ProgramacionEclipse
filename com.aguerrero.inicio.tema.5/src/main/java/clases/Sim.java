package clases;

/**
 * Clase que modela un sim del juego de texto 'Los Sims'.
 * 
 * @author Álvaro Guerrero
 *
 */
public class Sim {
//Esto es un molde. Aqui ponemos lo que sea relevante para nuestro programa. Aqui NUNCA se inicializan las variables.

	// Variables internas: Definen lo que son la clase
	/** El nombre del sim **/
	private String nombre;
	/** El apellido o apellidos del sim **/
	private String apellido;
	/** El género del sim. Tiene que valer h(hombre), m(mujer) o n(neutro) **/
	private char genero;
	/**
	 * El hambre que tiene el sim. De 0 (saciado totalmente) a 100 (muerto de
	 * hambre)
	 **/
	private byte hambre;
	/**
	 * El sueño que tiene el sim. De 0 (totalmente descansado) a 100 (muerto de
	 * sueño)
	 **/
	private byte sueño;
	/**
	 * La suciedad que tiene el sim. De 0 (Limpio como una patena) a 100 (comido de
	 * mierda)
	 **/
	private byte suciedad;
	/**
	 * El aburrimiento que tiene el sim. De 0 (Entretenido totalmente) a 100
	 * (aburrido de estar aburrido)
	 **/
	private byte aburrimiento;
	/** Padre del sim **/
	private Sim padre;
	/** Madre del sim **/
	private Sim madre;
	/** Perro o perros que el Sim tiene a su cargo **/
	private Perro[] perros;
	/** Gato o gatos que el Sim tiene a su cargo **/
	private Gato[] gatos;

	// Constructores
	public Sim(String nombre, String apellido, char g, byte hambre, byte suenio, byte suc, byte aburr, Sim padre,
			Sim madre, Perro[] perros, Gato[] gatos) {
		this.setNombre(nombre);
		this.apellido = apellido;
		this.genero = g;
		this.setHambre(hambre);
		this.sueño = suenio;
		this.suciedad = suc;
		this.aburrimiento = aburr;
		this.padre = padre;
		this.madre = madre;
		this.perros = perros;
		this.gatos = gatos;
	}

	public Sim(String nombre, String apellido, char g) {
		this.setNombre(nombre);
		this.apellido = apellido;
		this.genero = g;
		this.setHambre(hambre);
		this.sueño = 50;
		this.suciedad = 50;
		this.aburrimiento = 50;
		this.padre = null;
		this.madre = null;
		this.perros = null;
		this.gatos = null;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		String[] numeros = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
		boolean tieneNumeros = false;
		for (byte i = 0; i < numeros.length; i++) {
			if (nombre.contains(numeros[i])) {
				tieneNumeros = true;
				break;
			}
		}
		if (!tieneNumeros) {
			this.nombre = nombre;
		}else {
			System.out.println("Es una chapuza decírtelo aquí, pero no me metas números");
		}
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public byte getHambre() {
		return hambre;
	}

	public void setHambre(byte hambre) {
		if (hambre < 0) {
			this.hambre = 0;
		} else if (hambre > 100) {
			this.hambre = 100;
		} else {
			this.hambre = hambre;
		}
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

	public Sim getPadre() {
		return padre;
	}

	public void setPadre(Sim padre) {
		this.padre = padre;
	}

	public Sim getMadre() {
		return madre;
	}

	public void setMadre(Sim madre) {
		this.madre = madre;
	}

	public Perro[] getPerros() {
		return perros;
	}

	public void setPerros(Perro[] perros) {
		this.perros = perros;
	}

	public Gato[] getGatos() {
		return gatos;
	}

	public void setGatos(Gato[] gatos) {
		this.gatos = gatos;
	}

	public Sim(String nombre, String apellido, char g, Sim padre, Sim madre) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.genero = g;
		this.hambre = 50;
		this.sueño = 50;
		this.suciedad = 50;
		this.aburrimiento = 50;
		this.padre = null;
		this.madre = null;
	}

	// Metodos: lo que la clase sabe hacer
	/**
	 * Función que resta 20 de hambre al sim que la llame
	 */
	public void comer() { // el 'static' lo que hace es generalizar, cuando queremos que algo lo hagan
							// todos los objetos
		this.setHambre((byte)(this.getHambre()-20));
	}

	/**
	 * Funcion que imprime formateados todos los datos de un sim
	 * 
	 * @return todos los datos del sim en varias líneas de texto
	 */
	public String toString() {
		String ret = "";
		ret += this.nombre + " " + this.apellido + " ("
				+ (genero == 'h' ? "Hombre" : genero == 'm' ? "Mujer" : "Género neutro") + ")\n\tHambre: " + this.hambre
				+ "\n\tSueño: " + this.sueño + "\n\tSuciedad: " + this.suciedad + "\n\tAburrimiento: "
				+ this.aburrimiento;
		if (perros != null) {
			for (byte i = 0; i < perros.length; i++) {
				ret += "\n\t---------------------- " + "\n\tPerro/s a su cargo: " + "\n\t" + this.perros[i];
			}

		} else {
			ret += "\n\t---------------------- " + "\n\tEste Sim no tiene ningún perro";
		}
		if (gatos != null) {
			for (byte i = 0; i < gatos.length; i++) {
				ret += "\n\t---------------------- " + "\n\tGato/s a su cargo: " + "\n\t" + this.gatos[i];
			}

		} else {
			ret += "\n\t---------------------- " + "\n\tEste Sim no tiene ningún gato";
		}

		return ret;
	}
}
