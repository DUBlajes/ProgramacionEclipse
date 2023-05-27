package principal;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;

import clases.Dado;
import clases.DadoTripulacion;
import utils.DAO;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DadoTripulacion dado=new DadoTripulacion("Dado Tripulacion");
		byte tirada= dado.tirarDado();
		System.out.println("El dado ha sacado un: "+tirada);
		
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
		
		try {
			LinkedHashSet columnasSacar = new LinkedHashSet<String>();
			columnasSacar.add("Funcion");
			HashMap<String, Object> restricciones = new HashMap<String, Object>(); // Si lo dejo vacio me lo va
																					// a mostrar todo
			ArrayList<Object> cliente = DAO.consultar("AccionQueRealiza", columnasSacar, restricciones);
			for (int i = 0; i < cliente.size(); i++) {
				System.out.println(cliente.get(i) + " : ");
			}
			System.out.println();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
