package clases;

public class Nave extends ElementoConNombre{
	private ZonasNave zonasDeLaNave;
	private byte puntosEscudo;
	private byte puntosVida;
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
		return "Nave [puntosEscudo=" + puntosEscudo + ", puntosVida=" + puntosVida + "]";
	}
	
	
}
