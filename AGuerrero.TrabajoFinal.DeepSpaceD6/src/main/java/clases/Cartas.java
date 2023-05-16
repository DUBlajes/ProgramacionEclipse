package clases;

import enums.CartasAmenaza;

public class Cartas extends ElementoConNombre{
	private CartasAmenaza cartasDeAmenaza;

	public Cartas(String nombre, CartasAmenaza cartasDeAmenaza) {
		super(nombre);
		this.cartasDeAmenaza = cartasDeAmenaza;
	}

	public CartasAmenaza getCartasDeAmenaza() {
		return cartasDeAmenaza;
	}

	public void setCartasDeAmenaza(CartasAmenaza cartasDeAmenaza) {
		this.cartasDeAmenaza = cartasDeAmenaza;
	}

	@Override
	public String toString() {
		return "Cartas [cartasDeAmenaza=" + cartasDeAmenaza + "]";
	}
	
	
}
