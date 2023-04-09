package clases;

public abstract class Montable {
	private byte edadMinima;
	private byte numeroPlazas;
	
	public Montable(byte edadMinima, byte numeroPlazas) {
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
		return this.getClass().getName()+ 
				" | Edad Mínima: "+this.edadMinima+" años. | "+
				" Número de plazas: "+this.numeroPlazas;
	}
	
	
	
	
}
