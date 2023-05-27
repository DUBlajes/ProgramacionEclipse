package clases;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;

import excepciones.ExoplanetaNoExisteException;
import utils.DAO;

public class ExoPlaneta {
	private String nombre;
	private Float distanciaTierra;
	private Float temperaturaMedia;
	private boolean candidatoVida;
	private boolean planetaNuevo;

	public ExoPlaneta(String nombre, float distanciaTierra, float temperaturaMedia, boolean candidatoVida) {
		super();
		this.nombre = nombre;
		this.distanciaTierra = distanciaTierra;
		this.temperaturaMedia = temperaturaMedia;
		this.candidatoVida = candidatoVida;
		HashMap<String, Object> columnas = new HashMap<String, Object>();
		columnas.put("nombre", nombre);
		columnas.put("distanciaTierra", distanciaTierra);
		columnas.put("temperaturaMedia", temperaturaMedia);
		columnas.put("candidatoVida", candidatoVida);
		try {
			DAO.insert("exoplanetas", columnas);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ExoPlaneta(String nombre) throws ExoplanetaNoExisteException {
		super();
		this.nombre = nombre;
		LinkedHashSet columnasSacar = new LinkedHashSet<String>();
		columnasSacar.add("nombre");
		columnasSacar.add("distanciaTierra");
		columnasSacar.add("temperaturaMedia");
		columnasSacar.add("candidatoVida");
		HashMap<String, Object> restricciones = new HashMap<String, Object>();
		restricciones.put("nombre", nombre);
		ArrayList<Object> resultadoConsulta = null;
		String passN = null;
		try {
			resultadoConsulta = DAO.consultar("exoplanetas", columnasSacar, restricciones);
			if (resultadoConsulta.isEmpty()) {
				throw new ExoplanetaNoExisteException("El planeta introducido no existe");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getDistanciaTierra() {
		return distanciaTierra;
	}

	public void setDistanciaTierra(float distanciaTierra) {
		this.distanciaTierra = distanciaTierra;
	}

	public float getTemperaturaMedia() {
		return temperaturaMedia;
	}

	public void setTemperaturaMedia(float temperaturaMedia) {
		this.temperaturaMedia = temperaturaMedia;
	}

	public boolean isCandidatoVida() {
		return candidatoVida;
	}

	public void setCandidatoVida(boolean candidatoVida) {
		this.candidatoVida = candidatoVida;
	}

	public ExoPlaneta(String nombre, float distanciaTierra, float temperaturaMedia, boolean candidatoVida,
			boolean planetaNuevo) {
		super();
		this.nombre = nombre;
		this.distanciaTierra = distanciaTierra;
		this.temperaturaMedia = temperaturaMedia;
		this.candidatoVida = candidatoVida;
		this.planetaNuevo = planetaNuevo;
	}

	public static ArrayList<ExoPlaneta> getTodos() throws SQLException {
	ArrayList<ExoPlaneta> listaCompleta = new ArrayList<>();
	ArrayList<Object> listaObjeto = new ArrayList<>();
	LinkedHashSet<String> columnas = new LinkedHashSet<>();
	HashMap<String, Object> restricciones = new HashMap<>();
	columnas.add("nombre");
	columnas.add("distanciaTierra");
	columnas.add("temperaturaMedia");
	columnas.add("candidatoVida");
	listaObjeto = DAO.consultar("exoplanetas", columnas, restricciones);

	for (byte i = 0; i < listaObjeto.size(); i++) {
		
		ExoPlaneta actualUsuario =new ExoPlaneta((String)listaObjeto.get(i),(Float)listaObjeto.get(i+1),(Float) listaObjeto.get(i + 2),false);
		
		
		listaCompleta.add(actualUsuario);
		i++;
	}
	return listaCompleta;
}

	public int compareTo(ExoPlaneta o) {
		if (this.distanciaTierra!=(o.distanciaTierra)) {
			return this.distanciaTierra.compareTo(o.distanciaTierra);
		} else if (!this.nombre.equals(o.nombre)) {
		}
		return this.nombre.compareTo(o.nombre);
	}

	@Override
	public String toString() {
		return "Exoplaneta " + nombre + "\nDistancia a la Tierra=" + distanciaTierra + "\nTemperatura Media="
				+ temperaturaMedia + "\nCandidato a la Vida=" + candidatoVida;
	}

}
