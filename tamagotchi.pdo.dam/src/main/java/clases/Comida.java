package clases;

import excepciones.NombreConNumerosException;

public class Comida extends CosaConNombre{
	private byte valorEnergetico;
	private byte modorra;
	
	public Comida(String nombre, byte valorEnergetico, byte modorra) throws NombreConNumerosException {
		super(nombre);
		this.valorEnergetico = valorEnergetico;
		this.modorra = modorra;
	}

	public byte getValorEnergetico() {
		return valorEnergetico;
	}

	public void setValorEnergetico(byte valorEnergetico) {
		this.valorEnergetico = valorEnergetico;
	}

	public byte getModorra() {
		return modorra;
	}

	public void setModorra(byte modorra) {
		this.modorra = modorra;
	}

	@Override
	public String toString() {
		return super.toString()+" [valorEnergetico=" + valorEnergetico + ", modorra=" + modorra + "]";
	}
	
	
	
}
