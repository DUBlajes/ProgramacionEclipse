package Clases;

public class Comida extends ElementoConNombre {
	private byte valorNutritivo;

	public Comida(String nombre, byte valorNutritivo) {
		super(nombre);
		this.valorNutritivo = valorNutritivo;
	}

	public byte getValorNutritivo() {
		return valorNutritivo;
	}

	public void setValorNutritivo(byte valorNutritivo) {
		this.valorNutritivo = valorNutritivo;
	}

	@Override
	//Tarea: Implementar el resto de clases.
	public String toString() {
		return super.toString()+" | valor nutritivo: "+this.valorNutritivo;
	}
	
	
	
}
