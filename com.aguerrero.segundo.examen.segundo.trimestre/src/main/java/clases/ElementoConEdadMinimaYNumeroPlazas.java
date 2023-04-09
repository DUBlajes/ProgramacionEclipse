package clases;

public abstract class ElementoConEdadMinimaYNumeroPlazas {
	private byte edadMinima;
	private byte numeroPlazas;
	public ElementoConEdadMinimaYNumeroPlazas(byte edadMinima, byte numeroPlazas) {
		super();
		this.edadMinima = edadMinima;
		this.numeroPlazas = numeroPlazas;
	}
	public byte getEdadMinima() {
		return edadMinima;
	}
	public void setEdadMinima(byte edadMinima) {
		this.edadMinima = edadMinima;
	}
	public byte getNumeroPlazas() {
		return numeroPlazas;
	}
	public void setNumeroPlazas(byte numeroPlazas) {
		this.numeroPlazas = numeroPlazas;
	}
	@Override
	public String toString() {
		return "La edad mínima para acceder a esta atracción es de " + edadMinima + " años."
				+"\nEl número de plazas de esta atraccción es de " + numeroPlazas + " plazas.";
	}
	
	
}
