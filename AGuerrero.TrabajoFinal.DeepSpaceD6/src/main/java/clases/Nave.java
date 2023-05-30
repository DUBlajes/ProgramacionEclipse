package clases;

import interfaces.FuncionesNave;

public class Nave extends ElementoConNombre implements FuncionesNave {
	private ZonasNave zonasDeLaNave;
	private byte puntosEscudo;
	private byte puntosVida;
	private Dado dado;

	public Nave(String nombre, ZonasNave zonasDeLaNave, byte puntosEscudo, byte puntosVida) {
		super(nombre);
		this.zonasDeLaNave = zonasDeLaNave;
		this.puntosEscudo = puntosEscudo;
		this.puntosVida = puntosVida;
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

	@Override
	public byte tirarDadoDeNuevo() {
		return (byte) dado.lanzar();
	}

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
		if (puntosEscudo >= 0 || puntosEscudo > 4) {
			puntosEscudo = 4;
		}

		return puntosEscudo;
	}

	@Override
	public byte reparacion() {
		if (puntosVida >= 8) {
			puntosVida = 8;
		} else {
			puntosVida = (byte) (puntosVida + 1);
			// Meter condición de que si se añade otro dado, ataquehecho aumenta en 2 puntos
		}

		return puntosVida;
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


}
