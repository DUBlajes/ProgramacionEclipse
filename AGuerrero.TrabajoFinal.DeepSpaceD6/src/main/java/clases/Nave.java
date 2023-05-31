package clases;

import java.util.HashMap;
import java.util.HashSet;

import interfaces.FuncionesNave;

public class Nave extends ElementoConNombre implements FuncionesNave {
	private HashMap<String, ZonasNave> zonaNave;
	private byte puntosEscudo;
	private byte puntosVida;
	private Dado dado;

	public Nave(String nombre, HashMap<String, ZonasNave> zonasDeLaNave, byte puntosEscudo, byte puntosVida) {
		super(nombre);
		setZonasDeLaNave(zonasDeLaNave);
		setPuntosEscudo((byte) puntosEscudo);
		setPuntosVida((byte) puntosVida);
	}

	public HashMap<String, ZonasNave> getZonasDeLaNave() {
		return zonaNave;
	}

	public void setZonasDeLaNave(HashMap<String, ZonasNave> zonasDeLaNave) {
		this.zonaNave = zonasDeLaNave;
	}

	public byte getPuntosEscudo() {
		return puntosEscudo;
	}

	public void setPuntosEscudo(byte puntosEscudo) {
		this.puntosEscudo = puntosEscudo;
		if (this.puntosEscudo<=0) {
			this.puntosEscudo=0;
		}
	}

	public byte getPuntosVida() {
		return puntosVida;
	}

	public void setPuntosVida(byte puntosVida) {
		this.puntosVida = puntosVida;
		if (this.puntosVida<=0) {
			this.puntosVida=0;
		}
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
