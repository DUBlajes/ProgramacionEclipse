package clases;

import enumerador.Tipo;

public class Ataque extends ElementoConNombre{
	private Tipo tipo;
	private byte puntosDeVidaRestados;
	public Ataque(String nombre, Tipo tipo, byte puntosDeVidaRestados) {
		super(nombre);
		this.tipo = tipo;
		this.puntosDeVidaRestados = puntosDeVidaRestados;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	public byte getPuntosDeVidaRestados() {
		return puntosDeVidaRestados;
	}
	public void setPuntosDeVidaRestados(byte puntosDeVidaRestados) {
		this.puntosDeVidaRestados = puntosDeVidaRestados;
	}
	@Override
	public String toString() {
		return super.toString()+"\nAtaque tipo: " + tipo + "\nPuntos de vida restados: " + puntosDeVidaRestados+"\n";
	}
	
	
}
