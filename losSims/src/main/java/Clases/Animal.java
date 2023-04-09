package Clases;

public abstract class Animal extends SerVivo{
	private String raza;

	public Animal(String nombre, char genero, byte hambre, byte sueño, byte aburrimiento, byte suciedad, String raza) {
		super(nombre, genero, hambre, sueño, aburrimiento, suciedad);
		this.raza = raza;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	@Override
	public String toString() {
		return super.toString()+
				"\n\nSe trata de un animal de raza = " + raza+".";
	}
	
}
