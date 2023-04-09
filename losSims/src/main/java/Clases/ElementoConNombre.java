package Clases;

public abstract class ElementoConNombre {
	private String nombre;

	public ElementoConNombre(String nombre) {
		this.setNombre(nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
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
		}else {
			System.out.println("Es una chapuza decírtelo aquí, pero no me metas números");
		}
	}

	@Override
	public String toString() {
		return nombre;
	}
	
	
}
