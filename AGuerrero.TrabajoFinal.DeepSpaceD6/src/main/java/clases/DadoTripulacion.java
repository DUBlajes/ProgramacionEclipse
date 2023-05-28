package clases;

public class DadoTripulacion extends Dado {

	public DadoTripulacion(String nombre) {
		super(nombre);

	}
	
	public static void crearTripulantes() {
		DadoTripulacion tripulante1=new DadoTripulacion("Tripulante 1");
		DadoTripulacion tripulante2=new DadoTripulacion("Tripulante 2");
		DadoTripulacion tripulante3=new DadoTripulacion("Tripulante 3");
		DadoTripulacion tripulante4=new DadoTripulacion("Tripulante 4");
		DadoTripulacion tripulante5=new DadoTripulacion("Tripulante 5");
		DadoTripulacion tripulante6=new DadoTripulacion("Tripulante 6");
		
		tripulante1.tirarDado();
		tripulante2.tirarDado();
		tripulante3.tirarDado();
		tripulante4.tirarDado();
		tripulante5.tirarDado();
		tripulante6.tirarDado();
	}

}
