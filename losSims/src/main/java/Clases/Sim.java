package Clases;

public class Sim extends SerVivo {
	private String apellidos;

	public Sim(String nombre, char genero, byte hambre, byte sueño, byte aburrimiento, byte suciedad,
			String apellidos) {
		super(nombre, genero, hambre, sueño, aburrimiento, suciedad);
		this.apellidos = apellidos;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Override
	public String toString() {
		return super.toString()+"\nApellido/s= " + apellidos;
	}
	
	
}
