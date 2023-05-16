package clases;

public class Usuario implements Comparable<Usuario>{
	private String nombre;
	private String password;
	private String email;
	private short anoNacimiento;
	
	
	public Usuario(String nombre, String email, short anoNacimiento) {
		super();
		this.nombre = nombre;
		this.password = password;
		this.email = email;
		this.anoNacimiento = anoNacimiento;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public short getAnoNacimiento() {
		return anoNacimiento;
	}


	public void setAnoNacimiento(short anoNacimiento) {
		this.anoNacimiento = anoNacimiento;
	}
	
	public int compareTo(Usuario u) {
		if (this.anoNacimiento!=u.anoNacimiento) {
			return Short.compare(this.anoNacimiento, u.anoNacimiento);
		}else {
			return this.nombre.compareTo(u.nombre);
		}
	}


	@Override
	public String toString() {
		return nombre + "\nContraseña: " + password + "\nEmail: " + email + "\nAño de Nacimiento: "
				+ anoNacimiento;
	}
	
	
}
