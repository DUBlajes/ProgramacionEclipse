package clases;

import java.util.Random;

import excepciones.NombreInvalidoException;

public class Berserker extends Luchador{
	private Arma segundoArma;

	public Berserker(String nombre, Arma arma, Arma segundoArma) throws NombreInvalidoException {
		super(nombre, arma);
		this.segundoArma = segundoArma;
	}

	public Arma getSegundoArma() {
		return segundoArma;
	}

	public void setSegundoArma(Arma segundoArma) {
		this.segundoArma = segundoArma;
	}

	@Override
	public String toString() {
		return super.toString()+
				 "\n\tSegunda Arma: " + segundoArma;
	}

	@Override
	public byte atacar() {
		byte dañoHechoArma1= super.atacar();
		Random r = new Random();
		byte dañoHechoArma2 = (byte) r.nextInt(0, this.segundoArma.getDanio() + 1);
		System.out.println(
				this.getNombre() + " ataca con su " + this.segundoArma.getNombre() + " y hace " + dañoHechoArma2 + " de daño.");
		return (byte)(dañoHechoArma1+dañoHechoArma2);
	}
	
	
	
}
