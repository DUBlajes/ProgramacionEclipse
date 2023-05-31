package clases;


import java.util.Random;

import interfaces.AccionesCartas;

public class Cartas extends ElementoConNombre implements AccionesCartas{

	private Nave nave;
	private byte valorAmenaza;
	private byte dadoActivacion;
	private String accionQueRealiza;
	private byte dadoDesactivacion;
	private byte accionID;
	
	public Cartas(String nombre, Nave nave, byte valorAmenaza, byte dadoActivacion, String accionQueRealiza, byte accionID,
			byte dadoDesactivacion) {
		super(nombre);
		setNave(nave);
		setValorAmenaza(valorAmenaza);
		setDadoActivacion(dadoActivacion);
		setAccionQueRealiza(accionQueRealiza);
		setDadoDesactivacion(dadoDesactivacion);
		setAccionID(accionID);
	}
	public byte Funcion() {
		byte funcion=accionID;

		switch(funcion) {
		
		case 1:
			atacar();
			System.out.println("Escudo restante: "+this.nave.getPuntosEscudo());
			break;
		case 2:
			atacarIgnorandoEscudos();
			break;
		case 3:
			destruirEscudo();
			break;
		case 4:
			aEnfermeria();
			break;
		case 5:
			tirarDadoAmenaza();
			break;
		case 6:
			amenazasAumentanNivel();
			break;
		case 7:
			atacar();
			break;
		case 8:
			prohibidoAsignar();
			break;
		case 9:
			noPasaNada();
			break;
			
		}
		return funcion;
	}

	public Nave getNave() {
		return nave;
	}


	public void setNave(Nave nave) {
		this.nave = nave;
	}
	

	public byte getAccionID() {
		return accionID;
	}
	public void setAccionID(byte accionID) {
		this.accionID = accionID;
	}
	public byte getValorAmenaza() {
		return valorAmenaza;
	}


	public void setValorAmenaza(byte valorAmenaza) {
		this.valorAmenaza = valorAmenaza;
	}


	public byte getDadoActivacion() {
		return dadoActivacion;
	}


	public void setDadoActivacion(byte dadoActivacion) {
		this.dadoActivacion = dadoActivacion;
	}


	public String getAccionQueRealiza() {
		return accionQueRealiza;
	}


	public void setAccionQueRealiza(String accionQueRealiza) {
		this.accionQueRealiza = accionQueRealiza;
	}


	public byte getDadoDesactivacion() {
		return dadoDesactivacion;
	}


	public void setDadoDesactivacion(byte dadoDesactivacion) {
		this.dadoDesactivacion = dadoDesactivacion;
	}


	@Override
	public String toString() {
		return "Cartas [nave=" + nave + "]";
	}


	@Override
	public void atacar() {
		Random r=new Random();
		byte danioNave =0;
		while(danioNave==0){
			danioNave= (byte) r.nextInt(4);
		}
				
		this.nave.setPuntosEscudo((byte)(this.nave.getPuntosEscudo()-danioNave));
		
	}


	@Override
	public void atacarIgnorandoEscudos() {
		Random r=new Random();
		byte danioNave =0;
		while(danioNave==0){
			danioNave= (byte) r.nextInt(4);
		}
				
		this.nave.setPuntosVida((byte)(this.nave.getPuntosVida()-danioNave));
		
	}


	@Override
	public void destruirEscudo() {
		this.nave.setPuntosEscudo((byte)0);
		
	}


	@Override
	public void aEnfermeria() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public byte tirarDadoAmenaza() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void amenazasAumentanNivel() {
		if(this.valorAmenaza>4) {
			this.valorAmenaza=4;
		}
		this.setValorAmenaza((byte) (valorAmenaza+1));
	}


	@Override
	public void prohibidoAsignar() {
		
		
	}


	@Override
	public void noPasaNada() {
		// TODO Auto-generated method stub
		
	}


}