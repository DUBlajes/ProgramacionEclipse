package clases;

public class Noria extends Columpio {
	private short alturaMetros;
	private byte numeroCabinas;
	private byte asientosPorCabina;
	
	public Noria(String nombre, float precioFicha, short alturaMetros, byte numeroCabinas, byte asientosPorCabina) {
		super(nombre, precioFicha);
		this.alturaMetros = alturaMetros;
		this.numeroCabinas = numeroCabinas;
		this.asientosPorCabina = asientosPorCabina;
	}

	public short getAlturaMetros() {
		return alturaMetros;
	}

	public void setAlturaMetros(short alturaMetros) {
		this.alturaMetros = alturaMetros;
	}

	public byte getNumeroCabinas() {
		return numeroCabinas;
	}

	public void setNumeroCabinas(byte numeroCabinas) {
		this.numeroCabinas = numeroCabinas;
	}

	public byte getAsientosPorCabina() {
		return asientosPorCabina;
	}

	public void setAsientosPorCabina(byte asientosPorCabina) {
		this.asientosPorCabina = asientosPorCabina;
	}

	@Override
	public String toString() {
		return super.toString()+"\n\tAltura: "+this.alturaMetros+" m"+
			"\n\tNúmero de cabinas: "+this.numeroCabinas+
			"\n\tAsientos por cabina: "+this.asientosPorCabina;
	}

	public byte numeroTotalPlazas() {
		return (byte)(this.asientosPorCabina*this.numeroCabinas);
	}

	
	
	
}
