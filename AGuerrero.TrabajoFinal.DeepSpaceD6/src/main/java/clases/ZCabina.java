package clases;

import java.util.Random;

public class ZCabina extends ZonasNave {
	
	
	public ZCabina() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static void cambiardados() {

	}

	public static byte tirarDados() {
		Random r = new Random();
        return (byte) r.nextInt(1,7);
	}
}
