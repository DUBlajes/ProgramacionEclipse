package principal;

import clases.Dado;
import clases.DadoTripulacion;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DadoTripulacion dado=new DadoTripulacion("Dado Tripulacion");
		byte tirada= dado.tirarDado();
		System.out.println("El dado ha sacado un: "+tirada);
	}

}
