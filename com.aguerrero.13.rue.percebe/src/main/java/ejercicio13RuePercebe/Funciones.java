package ejercicio13RuePercebe;

public class Funciones {
	public static String printAltura(String dibujo, byte nVeces) {
		String ret="";
		for (byte i = 0; i < nVeces; i++) {
			ret+=(dibujo);
		}
		return ret;
	}
}

/*Haz una función llamada "reemplazar" que devuelva un string
y reciba por argumentos un string llamado "trozos"
y un char llamado reemplazo.
Dentro de la función, usa la función "replace" para cambiar todos los ojos que haya en el string trozo
por el char "reemplazo".
Por ejemplo, si llamo a Funciones.reemplazar("(|o o|)", 'x'), que me devuelva el string
"(|x x|)"*/