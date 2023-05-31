package interfaces;

public interface AccionesCartas {
	//Quitar x puntos de vida (primero ataca al escudo)
	public void atacar();
	
	//Atacar al casco ignorando escudo
	public void atacarIgnorandoEscudos();
	
	//Destruir escudo
	public void destruirEscudo();
	
	//Enviar dados a enfermeria
	public void aEnfermeria();
	
	//Tirar dado amenaza
	public byte tirarDadoAmenaza();
	
	//Amenazas externas recuperan 1 nivel
	public void amenazasAumentanNivel();
	
	//Pohibido asignar dados
	public void prohibidoAsignar();
	
	//No ocurre nada
	public void noPasaNada();
}
