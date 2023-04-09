package clases;

public class Pocion extends ElementoConNombre {
	private byte puntosVidaRestaurados;

	public Pocion(String nombre, byte puntosVidaRestaurados) {
		super(nombre);
		this.puntosVidaRestaurados = puntosVidaRestaurados;
	}

	public byte getPuntosVidaRestaurados() {
		return puntosVidaRestaurados;
	}

	public void setPuntosVidaRestaurados(byte puntosVidaRestaurados) {
		this.puntosVidaRestaurados = puntosVidaRestaurados;
	}

	@Override
	public String toString() {
		return "Pocion que restaura " + puntosVidaRestaurados + " puntos de vida.";
	}
	
	

}
