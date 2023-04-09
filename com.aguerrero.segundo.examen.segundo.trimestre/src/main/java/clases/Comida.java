package clases;

public class Comida extends ElementoConNombre{
	private Float precio;
	private boolean necesitaCalentarse;
	public Comida(String nombre, Float precio, boolean necesitaCalentarse) {
		super(nombre);
		this.precio = precio;
		this.necesitaCalentarse = necesitaCalentarse;
	}
	public Float getPrecio() {
		return precio;
	}
	public void setPrecio(Float precio) {
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
		return "\n\tPrecio: " + precio + " euros"
				+ "\n\t¿Necesita Calentarse? " + necesitaCalentarse;
	}
	
	
}
