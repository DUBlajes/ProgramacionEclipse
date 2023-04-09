package clases;

import excepciones.NombreInvalidoException;

public class Escudo extends ElementoConNombre {
	private byte proteccion;

	public Escudo(String nombre, byte proteccion) throws NombreInvalidoException {
		super(nombre);
		this.proteccion=proteccion;
	}

	public byte getProteccion() {
		return proteccion;
	}

	public void setProteccion(byte proteccion) {
		if (proteccion < 0) {
			this.proteccion = 0;
		} else if (proteccion > 100) {
			this.proteccion = 100;
		} else {
			this.proteccion = proteccion;
		}
	}

	@Override
	public String toString() {
		return super.toString()+" \n\tEste escudo tiene una protección de: " + proteccion;
	}
	
	

}
