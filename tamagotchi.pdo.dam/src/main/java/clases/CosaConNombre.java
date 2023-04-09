package clases;

import excepciones.NombreConNumerosException;

public abstract class CosaConNombre {
	private String nombre;

	public CosaConNombre(String nombre) throws NombreConNumerosException {
		super();
		this.setNombre(nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) throws NombreConNumerosException {
		String numeros="0123456789";
		for (short i = 0; i < nombre.length(); i++) {
			if(numeros.contains(""+nombre.charAt(i))) {
				throw new NombreConNumerosException("El nombre "+nombre+ " no es valido porque tiene numeros.");
			}
			
		}
		
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return nombre;
	}
	
	
}
