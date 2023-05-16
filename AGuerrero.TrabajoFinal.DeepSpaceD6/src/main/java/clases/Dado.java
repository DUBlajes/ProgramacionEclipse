package clases;

import java.util.Random;

public abstract class Dado extends ElementoConNombre{
	
	public Dado(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	public static byte tirarDado() {
        Random r = new Random();
        return (byte) r.nextInt(1,7);
    }
}
