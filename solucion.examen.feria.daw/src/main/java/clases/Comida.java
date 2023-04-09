package clases;

public class Comida {
	private String nombre;
	private float precio;
	private boolean necesitaCalentarse;
	
	public Comida(String nombre, float precio, boolean necesitaCalentarse) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.necesitaCalentarse = necesitaCalentarse;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public boolean isNecesitaCalentarse() {
		return necesitaCalentarse;
	}

	public void setNecesitaCalentarse(boolean necesitaCalentarse) {
		this.necesitaCalentarse = necesitaCalentarse;
	}

	@Override
	public String toString() {
		return  nombre + " | Precio: " + precio + " € "+
	(this.necesitaCalentarse?" | Necesita calentarse":"");
	}
	
	
	
	
}
