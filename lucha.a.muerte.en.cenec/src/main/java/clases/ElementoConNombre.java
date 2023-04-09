package clases;

import excepciones.NombreInvalidoException;

public class ElementoConNombre {
	private String nombre;

	public ElementoConNombre(String nombre) throws NombreInvalidoException {
		super();
		this.setNombre(nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) throws NombreInvalidoException {
		String[] numeros = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
		boolean tieneNumeros = false;
		for (byte i = 0; i < numeros.length; i++) {
			if (nombre.contains(numeros[i])) {
				tieneNumeros = true;
				break;
			}
		}
		if (!tieneNumeros) {
			this.nombre = nombre;
		}if(tieneNumeros) {
			throw new NombreInvalidoException("Este nombre no es válido. El nombre no debe tener números.");
		}if(nombre.isBlank()){
			throw new NombreInvalidoException("Este nombre no es válido. No puede estar vacío.");
		}
	}

	@Override
	public String toString() {
		return nombre;
	}
	
	
}
