package clases;

import enumerador.Tematica;

public class Invitado extends ElementoConApellidoYProfesion{
	private Tematica especialidad;

	public Invitado(String nombre, String apellido, String profesion, Tematica especialidad) {
		super(nombre, apellido, profesion);
		this.especialidad = especialidad;
	}

	public Tematica getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Tematica especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		return super.toString()+
				"\n\tInvitado." + 
				"\n\tEspecialidad: "+especialidad;
	}
	
	
}
