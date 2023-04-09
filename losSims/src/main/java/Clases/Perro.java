package Clases;

public final class Perro extends AnimalDomestico{

	public Perro(String nombre, char genero, byte hambre, byte sueño, byte aburrimiento, byte suciedad, String raza,
			String pelaje, Sim dueño) {
		super(nombre, genero, hambre, sueño, aburrimiento, suciedad, raza, pelaje, dueño);
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	
}
