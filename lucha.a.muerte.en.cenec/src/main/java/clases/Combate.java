package clases;

import java.util.Random;

public class Combate {
	private Luchador luchador1;
	private Luchador luchador2;
	private Integer turno;
	public Combate(Luchador luchador1, Luchador luchador2) {
		super();
		this.luchador1 = luchador1;
		this.luchador2 = luchador2;
		this.turno = 1;
	}
	
	public Luchador combatir() {
		Luchador ganador;
		if(new Random().nextBoolean()) {
			ganador=luchador1.pelear(luchador2);
		}else {
			ganador=luchador2.pelear(luchador1);
		}		
		return ganador;
	}
	
	
	public Luchador getLuchador1() {
		return luchador1;
	}
	public void setLuchador1(Luchador luchador1) {
		this.luchador1 = luchador1;
	}
	public Luchador getLuchador2() {
		return luchador2;
	}
	public void setLuchador2(Luchador luchador2) {
		this.luchador2 = luchador2;
	}
	public Integer getTurno() {
		return turno;
	}
	public void setTurno(Integer turno) {
		this.turno = turno;
	}
	@Override
	public String toString() {
		return "Combate luchador 1: " + luchador1 + ", "
				+ "\nluchador2=" + luchador2 + ", turno:" + turno;
	}
	
}
