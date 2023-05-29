package clases;

public class DadoTripulacion extends Dado {

	public DadoTripulacion(String nombre) {
		super(nombre);

	}

	public int[] lanzarDados() {
        int[] resultados = new int[6];
        for (int i = 0; i < 6; i++) {
            resultados[i] = lanzar();
        }
        return resultados;
    }

}
