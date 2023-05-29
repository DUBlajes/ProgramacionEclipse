package clases;

import interfaces.FuncionesNave;

public class Nave extends ElementoConNombre implements FuncionesNave {
	private ZonasNave zonasDeLaNave;
	private byte puntosEscudo;
	private byte puntosVida;

	public Nave(String nombre, ZonasNave zonasDeLaNave, byte puntosEscudo, byte puntosVida) {
		super(nombre);
		this.zonasDeLaNave = zonasDeLaNave;
		this.puntosEscudo = 4;
		this.puntosVida = 8;
	}

	public ZonasNave getZonasDeLaNave() {
		return zonasDeLaNave;
	}

	public void setZonasDeLaNave(ZonasNave zonasDeLaNave) {
		this.zonasDeLaNave = zonasDeLaNave;
	}

	public byte getPuntosEscudo() {
		return puntosEscudo;
	}

	public void setPuntosEscudo(byte puntosEscudo) {
		this.puntosEscudo = puntosEscudo;
	}

	public byte getPuntosVida() {
		return puntosVida;
	}

	public void setPuntosVida(byte puntosVida) {
		this.puntosVida = puntosVida;
	}

	@Override
	public String toString() {
		return "Puntos de Escudo: " + puntosEscudo + "\nPuntos de vida: " + puntosVida;
	}

	/*@Override
	public byte tirarDadoDeNuevo() {
		
	}*/

	@Override
	public byte atacar() {
		byte ataquehecho = (byte) 1;
		// Meter condición de que si se añade otro dado, ataquehecho aumenta en 2 puntos
		if (DadoTripulacion.class != null) // Ojo que esto no es así del todo
			ataquehecho += 2;
		return ataquehecho;
	}

	@Override
	public void recuperarEnfermos() {
		// TODO Auto-generated method stub

	}

	@Override
	public void recuperarBloqueados() {
		// TODO Auto-generated method stub

	}

	@Override
	public byte recargarEscudos() {
		if (this.puntosEscudo >= 0 || this.puntosEscudo > 4) {
			this.puntosEscudo = 4;
		}

		return this.puntosEscudo;
	}

	@Override
	public byte reparacion() {
		if (this.puntosVida > 8) {
			this.puntosVida = 8;
		} else {
			this.puntosVida = (byte) (this.puntosVida + 1);
			// Meter condición de que si se añade otro dado, ataquehecho aumenta en 2 puntos
			if (DadoTripulacion.class != null) // Ojo que esto no es así del todo
				this.puntosVida += 2;
		}

		return this.puntosVida;
	}

	@Override
	public void aEnfermeria() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cambiarFuncionTripulante() {
		// TODO Auto-generated method stub

	}

	@Override
	public void bloquearAmenaza() {
		// TODO Auto-generated method stub

	}

	@Override
	public byte tirarDadoDeNuevo() {
		// TODO Auto-generated method stub
		return 0;
	}

}
