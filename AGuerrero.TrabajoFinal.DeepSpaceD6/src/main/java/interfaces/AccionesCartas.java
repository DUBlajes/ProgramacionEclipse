package interfaces;

public interface AccionesCartas {
	//Quitar x puntos de vida (primero ataca al escudo)
	public byte atacar();
	
	//Atacar al casco ignorando escudo
	public byte atacarIgnorandoEscudos();
	
	//Destruir escudo
	public byte destruirEscudo();
	
	//Enviar dados a enfermeria
	public void aEnfermeria();
	
	//Tirar dado amenaza
	public byte tirarDadoAmenaza();
	
	//Amenazas externas recuperan 1 nivel
	public byte amenazasAumentanNivel();
	
	//Pohibido asignar dados
	public void prohibidoAsignar();
	
	//No ocurre nada
	public void noPasaNada();
}
