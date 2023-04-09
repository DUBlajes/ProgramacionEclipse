package clases;

import java.util.Random;

import excepciones.NombreInvalidoException;
import interfaces.AccionesLuchador;
import interfaces.RecibirDaño;

public abstract class Luchador extends ElementoConNombre implements AccionesLuchador, RecibirDaño {
	private Arma arma;
	private byte vida;

	public Luchador(String nombre, Arma arma) throws NombreInvalidoException {
		super(nombre);
		this.arma = arma;
		this.vida = 100;
	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}

	public byte getVida() {
		return vida;
	}

	@Override
	public String toString() {
		return "\n\t"+super.toString() + 
				"\n\tArma en su poder: " + arma + "\n\tVida restante: " + vida;
	}

	@Override
	public byte atacar() {
		Random r = new Random();
		byte ataqueHecho = (byte) r.nextInt(0, this.arma.getDanio() + 1);
		System.out.println(
				this.getNombre() + " ataca con su " + this.arma.getNombre() + " y hace " + ataqueHecho + " de daño.");
		return ataqueHecho;
	}

	@Override
	public Luchador pelear(Luchador rival) {
		while (this.vida > 0 && rival.vida > 0) {
			byte defensa = 0;
			byte ataque=this.atacar();
			Luchador.espera((short)750);
			if (rival.getClass().equals(Guerrero.class)) {
				defensa=((Guerrero)rival).defender();
			}
			Luchador.espera((short)750);
			rival.recibirDaño((byte) (ataque - defensa));
			Luchador.espera((short)750);
			defensa=0;
			if (rival.vida > 0) {
				ataque=rival.atacar();
				Luchador.espera((short)750);
				if (this.getClass().equals(Guerrero.class)) {
					defensa=((Guerrero)this).defender();
				}
				Luchador.espera((short)750);
				this.recibirDaño((byte) (ataque - defensa));
			}
		}
		return (this.vida>0?this:rival);
	}

	@Override
	public void recibirDaño(byte dañoRecibido) {
		if (dañoRecibido >= 0) {
			this.vida -= dañoRecibido;
			if (this.vida < 0) {
				this.vida = 0;
			}
			System.out.println(this.getNombre() + " recibe " + dañoRecibido + " puntos de daño, y le quedan "
					+ this.vida + " puntos de vida.");
		}
		System.out.println("A "+this.getNombre()+" le quedan "+this.getVida()+" puntos de vida");
	}
	private static void espera(short ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
