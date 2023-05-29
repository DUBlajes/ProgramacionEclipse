package clases;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Random;

import interfaces.AccionesJugador;
import utils.DAO;

public class Jugador extends ElementoConNombre implements AccionesJugador {
	
	 private DadoTripulacion dadosParaJugar;

	public Jugador(String nombre, DadoTripulacion dadosParaJugar) {
		super(nombre);
		this.dadosParaJugar = dadosParaJugar;
	}

	@Override
	public void sacarCarta() {
		try {
			LinkedHashSet columnasSacar = new LinkedHashSet<String>();
			columnasSacar.add("Nombre");
			columnasSacar.add("ValorAmenaza");
			columnasSacar.add("DadoActivacion");
			columnasSacar.add("AccionQueRealiza");
			columnasSacar.add("InternaOExterna");
			columnasSacar.add("NumeroCartas");
			columnasSacar.add("DadoDesactivacion");
			HashMap<String, Object> restricciones = new HashMap<String, Object>(); // Si lo dejo vacio me lo va
																					// a mostrar todo
			ArrayList<Object> cliente = DAO.consultar("amenazas", columnasSacar, restricciones);
			for (int i = 0; i < cliente.size(); i++) {
				System.out.println(cliente.get(i) + " : ");
			}
			System.out.println();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

	@Override
	public void tirarDadoAmenaza() {
		DadoAmenaza dadoAmenaza = new DadoAmenaza(null);
        int resultado = dadoAmenaza.lanzarDado();
	}

	@Override
	public void asignarTripulacion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recuperarTripulacion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bloquearTripulantes() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void noAsignar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tirarDadoTripulante() {
		DadoTripulacion dadoTripulante = new DadoTripulacion(null);
        int[] resultados = dadoTripulante.lanzarDados();
	}
	 
	 
	 

}
