package clases;

import excepciones.DanioInvalidoException;
import excepciones.NombreInvalidoException;

public class Arma extends ElementoConNombre {
	private byte danio;

	public Arma(String nombre, byte danio) throws NombreInvalidoException, DanioInvalidoException {
		super(nombre);
		this.setDanio(danio);
	}

	public byte getDanio() {
		return danio;
	}

	public void setDanio(byte danio) throws DanioInvalidoException {
		if (danio < 1 || danio > 40) {
			throw new DanioInvalidoException("El daño establecido no es válido. Tiene que estar entre 1 y 40, ambos incluidos");
		} else {
			this.danio = danio;
		}

	}

	@Override
	public String toString() {
		return super.toString() + "\n\tDaño que inflige: " + danio;
	}

}
