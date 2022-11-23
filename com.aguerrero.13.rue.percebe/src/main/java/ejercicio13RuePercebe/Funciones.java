package ejercicio13RuePercebe;

/**
 * Clase con una función auxiliar para el ejercicio de 13 Rue del Percebe, para
 * evitar repetir código en el main. Esta función de tipo String se encargará en
 * el main de devolver un dibujo en forma de String el número de veces que el
 * usuario haya introducido por consola.
 * 
 * @return String, número
 * @author Álvaro Guerrero
 */
public class Funciones {
	public static String printAltura(String dibujo, byte nVeces) {
		/**
		 * Como esta función debe devolver un String, declaramos una variable String
		 * llamada "ret" que, de momento, está vacía. Al final de la función, el return
		 * tendrá el valor del dibujo introducido.
		 */
		String ret = "";
		for (byte i = 0; i < nVeces; i++) {
			ret += (dibujo);
		}
		/**
		 * Este bucle se encarga de que, por cada iteración, se haga un dibujo, el cual
		 * ya habremos preestablecido. Además, "ret+=(dibujo);" indica que, por cada
		 * iteración, ese dibujo se irá concatenando. Es decir, si indicamos que nVeces
		 * tiene un valor de 5, el dibujo se hará y se concatenará (es decir, saldrá uno
		 * al lado del otro) 5 veces.
		 */
		return ret;
	}
}
