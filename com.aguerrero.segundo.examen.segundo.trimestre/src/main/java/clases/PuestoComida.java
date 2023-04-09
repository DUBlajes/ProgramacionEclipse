package clases;

public class PuestoComida extends ElementoConNombre {
	private boolean puedeVenderAlcohol;
	private Comida comidasEnVenta;
	public PuestoComida(String nombre, boolean puedeVenderAlcohol, Comida comidasEnVenta) {
		super(nombre);
		this.puedeVenderAlcohol = puedeVenderAlcohol;
		this.comidasEnVenta = comidasEnVenta;
	}
	public boolean isPuedeVenderAlcohol() {
		return puedeVenderAlcohol;
	}
	public void setPuedeVenderAlcohol(boolean puedeVenderAlcohol) {
		this.puedeVenderAlcohol = puedeVenderAlcohol;
	}
	public Comida getComidasEnVenta() {
		return comidasEnVenta;
	}
	public void setComidasEnVenta(Comida comidasEnVenta) {
		this.comidasEnVenta = comidasEnVenta;
	}
	@Override
	public String toString() {
		return super.toString()+ " (Puesto de comida) "
				+ "\n¿Puede vender alcohol? " + puedeVenderAlcohol + 
				"\nComidas a la venta: " + 
				"\n\t"+comidasEnVenta.getNombre()+comidasEnVenta+
				"\n";
	}
	
	
}
