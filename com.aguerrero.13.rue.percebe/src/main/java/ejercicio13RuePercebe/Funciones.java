package ejercicio13RuePercebe;
/**
 * Clase con una función auxiliar para el ejercicio de 13 Rue del Percebe. Para evitar repetir código en el main para el ejemplo de usos de funciones. Tenemos varias funciones matemáticas como dos que generan aleatorios y una que comprueba si un número es primo. Se irán añadiendo más en el futuro.
 * @author Álvaro Guerrero
 *
 */
public class Funciones {
	public static String printAltura(String dibujo, byte nVeces) {
		String ret="";
		for (byte i = 0; i < nVeces; i++) {
			ret+=(dibujo);
		}
		return ret;
	}
}
