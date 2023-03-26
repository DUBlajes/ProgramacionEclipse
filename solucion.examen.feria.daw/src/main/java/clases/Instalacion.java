package clases;

public abstract class Instalacion {
	private String nombre;

	public Instalacion(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return this.nombre+"\n--------------\n";
	}
	
	
}
