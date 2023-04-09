package clases;

public class Testigo extends ElementoConApellidoYProfesion{
	private boolean testigoDirecto;

	public Testigo(String nombre, String apellido, String profesion, boolean testigoDirecto) {
		super(nombre, apellido, profesion);
		this.testigoDirecto = testigoDirecto;
	}
	
	public Testigo(String[] nombre, String apellido, String profesion, boolean testigoDirecto) {
		nombre=new String[]{"Pepe","Raul","Alvaro","Ignacio","Borja","Adri","Esteban","Pablo"};
		
		this.testigoDirecto = testigoDirecto;
	}

	public boolean isTestigoDirecto() {
		return testigoDirecto;
	}

	public void setTestigoDirecto(boolean testigoDirecto) {
		this.testigoDirecto = testigoDirecto;
	}

	@Override
	public String toString() {
		return super.toString()+ "Testigo Directo " + testigoDirecto + "]";
	}
	
	
}
