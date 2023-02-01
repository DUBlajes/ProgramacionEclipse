package pruebaMatrices;

import java.util.Random;

public class Funciones {
	public static char[][] creaSopa(byte filas, byte columnas) {
		char[][] ret=new char[filas][columnas];
		Random r=new Random();
		for (int i = 0; i < ret.length; i++) {
			for (int j = 0; j < ret[i].length; j++) {
				ret[i][j]=(char)r.nextInt('a','z'+1);
			}
		}
		return ret;
	}
	
	public static String imprimeMatriz(char[][] matriz) {
		String ret="";
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				ret+=matriz[i][j]+" ";
			}
			ret+="\n";
		}
		return ret;
	}	
	/**
	 * @param matriz
	 * @param palabra
	 * @param fil fila en la que se va a insertar la palabra. No puede ser menor a 0 ni mayor que matriz.length.
	 * @param col
	 * @return
	 */
	public static boolean insertarPalabra(char[][] matriz, String palabra, byte fil, byte col, byte direccion)/*de 0 a 7*/ {
		switch(direccion) {
		case 0:
			if (col+palabra.length()-1<matriz[fil].length) {
				for (byte i = 0; i < palabra.length(); i++) {
					matriz[fil][col+i]=palabra.charAt(i);
				}
				return true;
				}
			break;
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		}
		return false;
	}
}
