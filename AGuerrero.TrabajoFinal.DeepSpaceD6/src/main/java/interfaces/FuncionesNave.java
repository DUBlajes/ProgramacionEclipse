package interfaces;

public interface FuncionesNave {
		//CABINA: CAMBIAR DADOS Y TIRAR DADOS
	
	public byte tirarDadoDeNuevo();
	public void cambiarFuncionTripulante();
	
	//Ataque: atacar. En principio hace 1 de ataque y por cada dado extra se suman 2 de ataque
	
	public byte atacar();
	
	//Recuperar - Recupera dados de enfermería y bloqueados
	
	public void recuperarEnfermos();
	public void recuperarBloqueados();
	
	//Laboratorio - Recargar los escudos al máximo o bloquear una amenaza un turno y que no pueda actuar
	
	public byte recargarEscudos();
	public void bloquearAmenaza();
	
	//Reparacion -  En principio recupera 1 punto de vida y por cada dado extra se suman 2 de vida
	
	public byte reparacion();
	
	//Enfermería - Bloquea los dados hasta que se recuperen
	public void aEnfermeria();
	
	//Dados sin asignar - Dados que no se usan este turno. Puede que no se implemente.
}
