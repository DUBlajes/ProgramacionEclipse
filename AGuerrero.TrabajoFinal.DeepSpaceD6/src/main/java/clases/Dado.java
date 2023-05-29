package clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dado extends ElementoConNombre{
    private Random random;


	public Dado(String nombre) {
		super(nombre);
		random = new Random();
    }
    
    public int lanzar() {
        return random.nextInt(6) + 1;
    }
}

