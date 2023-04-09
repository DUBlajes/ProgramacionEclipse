package Clases;

public class Gato extends AnimalDomestico {
	private byte tendenciaAlCaos;

	public Gato(String nombre, char genero, byte hambre, byte sueño, byte aburrimiento, byte suciedad, String raza,
			String pelaje, Sim dueño, byte tendenciaAlCaos) {
		super(nombre, genero, hambre, sueño, aburrimiento, suciedad, raza, pelaje, dueño);
		this.tendenciaAlCaos = tendenciaAlCaos;
	}

	public byte getTendenciaAlCaos() {
		return tendenciaAlCaos;
	}

	public void setTendenciaAlCaos(byte tendenciaAlCaos) {
		this.tendenciaAlCaos = tendenciaAlCaos;
	}

	@Override
	public String toString() {
		return super.toString()+"\n\nEste gato tiene una tendencia al caos de " + tendenciaAlCaos;
	}
	
}
