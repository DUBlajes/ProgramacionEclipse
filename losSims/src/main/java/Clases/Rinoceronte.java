package Clases;

public class Rinoceronte extends Animal {
	private byte agresividad;

	public Rinoceronte(String nombre, char genero, byte hambre, byte sueño, byte aburrimiento, byte suciedad,
			String raza, byte agresividad) {
		super(nombre, genero, hambre, sueño, aburrimiento, suciedad, raza);
		this.agresividad = agresividad;
	}

	public byte getAgresividad() {
		return agresividad;
	}

	public void setAgresividad(byte agresividad) {
		this.agresividad = agresividad;
	}

	@Override
	public String toString() {
		return super.toString()+"\n\nEste rinoceronte tiene una agresividad de " + agresividad;
	}
	
}
