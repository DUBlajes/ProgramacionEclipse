package clases;

public class Noria extends ElementoConPrecioFicha{
	private static Float beneficio;
	private short alturaMetros;
	private byte numeroCabinas;
	private byte asientosPorCabina;
	public Noria(String nombre, Float precioFicha, short alturaMetros, byte numeroCabinas, byte asientosPorCabina) {
		super(nombre, precioFicha, beneficio);
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
		return super.getNombre()+
				"\n\t Esta noria tiene una altura de " + alturaMetros + " metros, "+ 
				"\n\ttiene un numero de " + numeroCabinas + " cabinas y "+
				"\n\ttiene "+ asientosPorCabina + " asientos por cabina."+
				"\n\tEl precio por ficha es de "+super.getPrecioFicha()+" euros"+
				"\n\tEl beneficio total por la venta es de "+super.beneficio+" euros"+
				"\n";
	}
	
	
}
