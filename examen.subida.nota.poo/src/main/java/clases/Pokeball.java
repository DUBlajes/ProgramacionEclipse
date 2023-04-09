package clases;

import enumerador.TipoPokeball;

public class Pokeball {
	private TipoPokeball tipo;

	public Pokeball(TipoPokeball tipo) {
		super();
		this.tipo = tipo;
	}

	public TipoPokeball getTipo() {
		return tipo;
	}

	public void setTipo(TipoPokeball tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Pokeball tipo: " + tipo;
	}
	
}
