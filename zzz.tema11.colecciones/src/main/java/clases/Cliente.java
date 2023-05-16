package clases;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Cliente {
	private String email;
	private String password;
	private String telefono;
	private String nombre;
	private TreeSet<Bicicleta> hs;
	
	public Cliente(String email, String password, String telefono, String nombre) {
		super();
		this.email = email;
		this.password = password;
		this.telefono = telefono;
		this.nombre = nombre;
		hs = new TreeSet<Bicicleta>();
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TreeSet<Bicicleta> getHs() {
		return hs;
	}

	public void setHs(TreeSet<Bicicleta> hs) {
		this.hs = hs;
	}
	public void addBici(Bicicleta hs) {
		this.hs.add(hs);
	}
	public void removeBici(Bicicleta hs) {
		this.hs.remove(hs);
	}

	@Override
	public String toString() {
		String ret="";
		Iterator it=hs.iterator();
		while(it.hasNext()) {
			Bicicleta biciActual=(Bicicleta) it.next(); //A esto siempre hay que hacerle un casting
			ret+="\n"+biciActual.toString();
		}
		return	"\nCliente"+ 
				"\n\tEmail: " + email + 
				"\n\tPassword: " + password + 
				"\n\tTelefono: " + telefono + 
				"\n\tNombre: " + nombre +
				ret;
	}
	
	
	
}
