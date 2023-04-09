package clases;

public class ElementoConApellidoYProfesion extends ElementoConNombre{
	private String apellido;
	private String profesion;
	public ElementoConApellidoYProfesion(String nombre, String apellido, String profesion) {
		super(nombre);
		this.apellido = apellido;
		this.profesion = profesion;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getProfesion() {
		return profesion;
	}
	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
	@Override
	public String toString() {
		return apellido + " , "+ profesion;
	}
	
	
}
