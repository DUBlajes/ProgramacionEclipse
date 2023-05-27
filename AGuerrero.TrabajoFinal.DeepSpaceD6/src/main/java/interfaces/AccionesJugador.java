package interfaces;

public interface AccionesJugador {

	//Tirar dados tripulante
	public byte tirarDadoTripulante();
	
	//Asignar dados tripulante
		public void asignarTripulacion();
	//recuperar dados tripulante
		public void recuperarTripulacion();
	//sacar carta
	
	public void sacarCarta();
	
	//bloquear dados
	public void bloquearTripulantes();
	
	//No asignar dados
	public void noAsignar();
	
	//Tirar dado amenaza
	public byte tirarDadoAmenaza();
}
