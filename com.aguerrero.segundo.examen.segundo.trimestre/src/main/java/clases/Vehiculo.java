package clases;

import enumerador.TematicaVehiculo;

public class Vehiculo extends ElementoConEdadMinimaYNumeroPlazas {
	private boolean tieneBocinas;
	private TematicaVehiculo tematicaVehiculo;
	public Vehiculo(byte edadMinima, byte numeroPlazas, boolean tieneBocinas, TematicaVehiculo tematicaVehiculo) {
		super(edadMinima, numeroPlazas);
		this.tieneBocinas = tieneBocinas;
		this.tematicaVehiculo = tematicaVehiculo;
	}
	public boolean getTieneBocinas() {
		return tieneBocinas;
	}
	public void setTieneBocinas(boolean tieneBocinas) {
		this.tieneBocinas = tieneBocinas;
	}
	public TematicaVehiculo getTematicaVehiculo() {
		return tematicaVehiculo;
	}
	public void setTematicaVehiculo(TematicaVehiculo tematicaVehiculo) {
		this.tematicaVehiculo = tematicaVehiculo;
	}
	@Override
	public String toString() {
		return super.toString()+
				"\n\t¿Vehiculo con bocina?" + tieneBocinas + 
				"\n\tTematica del Vehiculo=" + tematicaVehiculo;
	}
	
	
}
