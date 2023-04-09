package pruebaMatrices;

import java.util.Random;

public class Funciones {
	public static char[][] creaSopa(byte filas, byte columnas) {
		char[][] ret = new char[filas][columnas];
		Random r = new Random();
		for (byte i = 0; i < ret.length; i++) {
			for (byte j = 0; j < ret[i].length; j++) {
				ret[i][j] = (char) r.nextInt('a', 'z' + 1);
			}
		}
		return ret;
	}

	public static boolean[][] palabraAqui(byte filas, byte columnas) {
		boolean[][] ret = new boolean[filas][columnas];
		for (byte i = 0; i < ret.length; i++) {
			for (byte j = 0; j < ret[i].length; j++) {
				ret[i][j] = false;
			}
		}
		return ret;

	}

	public static String imprimeMatriz(char[][] matriz) {
		String ret = "";

		for (byte i = 0; i < matriz.length; i++) {
			for (byte j = 0; j < matriz[i].length; j++) {
				ret += matriz[i][j] + " ";
			}
			ret += "\n";
		}
		return ret;
	}
	public static String imprimeMatriz(boolean[][] matriz) {
		String ret = "";
		for (byte i = 0; i < matriz.length; i++) {
			for (byte j = 0; j < matriz[i].length; j++) {
				ret += matriz[i][j] + " ";
			}
			ret += "\n";
		}
		return ret;
	}

	/**
	 * @param matriz
	 * @param palabra
	 * @param fil     fila en la que se va a insertar la palabra. No puede ser menor
	 *                a 0 ni mayor que matriz.length.
	 * @param col
	 * @return
	 */
	public static boolean insertarPalabra(char[][] matriz, String palabra, byte fil, byte col, byte direccion,
			boolean[][] palabraAqui)/* de 0 a 7 */ {
		switch (direccion) {
		case 0: // Horizontal hacia adelante SALE
			if (col + (palabra.length() - 1) < matriz[fil].length) {
				for (byte i = 0; i < palabra.length(); i++) {
						if(palabraAqui[fil][col+i]==true) {
							return false;
						}
				}
				for (byte i = 0; i < palabra.length(); i++) {
					matriz[fil][col + i] = palabra.charAt(i);
					palabraAqui[fil][col+i]=true;
					
				}
				return true;
			}
			return false;
			
		case 1:// Horizontal hacia atras SALE
			if (col - (palabra.length() - 1) >= 0) {
				for (byte i = 0; i < palabra.length(); i++) {
					if(palabraAqui[fil][col-i]==true) {
						return false;
					}
			}
				for (byte i = 0; i < palabra.length(); i++) {
					matriz[fil][col - i] = palabra.charAt(i);
					palabraAqui[fil][col-i]=true;
				}
				return true;
			}
			return false;
			
		case 2:// Vertical hacia arriba SALE
			if (fil - (palabra.length() - 1) >= 0) {
				for (byte i = 0; i < palabra.length(); i++) {
					if(palabraAqui[fil-i][col]==true) {
						return false;
					}
			}
				for (byte i = 0; i < palabra.length(); i++) {
					matriz[fil - i][col] = palabra.charAt(i);
					palabraAqui[fil-i][col]=true;
				}
				return true;
			}
			return false;
			
		case 3:// Vertical hacia abajo SALE
			if (fil + (palabra.length() - 1) < matriz[fil].length) {
				for (byte i = 0; i < palabra.length(); i++) {
					if(palabraAqui[fil+i][col]==true) {
						return false;
					}
			}
				for (byte i = 0; i < palabra.length(); i++) {
					matriz[fil + i][col] = palabra.charAt(i);
					palabraAqui[fil+i][col]=true;
				}
				return true;
			}
			return false;
		case 4:// Diagonal arriba derecha SALE
			if ((fil - (palabra.length() - 1) >= 0) && (col + (palabra.length() - 1) < matriz[fil].length)) {
				for (byte i = 0; i < palabra.length(); i++) {
					if(palabraAqui[fil+i][col+i]==true) {
						return false;
					}
			}
				for (byte i = 0; i < palabra.length(); i++) {
					matriz[fil - i][col + i] = palabra.charAt(i);
					palabraAqui[fil-i][col+i]=true;
				}
				return true;
			}
			return false;
		case 5:// Diagonal arriba izquierda SALE
			if ((fil - (palabra.length() - 1) >= 0) && (col - (palabra.length() - 1) >= 0)) {
				for (byte i = 0; i < palabra.length(); i++) {
					if(palabraAqui[fil-i][col-i]==true) {
						return false;
					}
			}
				for (byte i = 0; i < palabra.length(); i++) {
					matriz[fil - i][col - i] = palabra.charAt(i);
					palabraAqui[fil-i][col-i]=true;					
				}
				return true;
			}
			return false;
		case 6:// Diagonal abajo derecha SALE
			if (fil + (palabra.length() - 1) < matriz[fil].length
					&& (col + (palabra.length() - 1) < matriz[fil].length)) {
				for (byte i = 0; i < palabra.length(); i++) {
					if(palabraAqui[fil+i][col+i]==true) {
						return false;
					}
			}
				for (byte i = 0; i < palabra.length(); i++) {
					matriz[fil + i][col + i] = palabra.charAt(i);
					palabraAqui[fil+i][col+i]=true;					
				}
				return true;
			}
			return false;
		case 7:// Diagonal abajo izquierda SALE
			if (fil + (palabra.length() - 1) < matriz[fil].length && (col - (palabra.length() - 1) >= 0)) {
				for (byte i = 0; i < palabra.length(); i++) {
					if(palabraAqui[fil+i][col-i]==true) {
						return false;
					}
			}
				for (byte i = 0; i < palabra.length(); i++) {
					matriz[fil + i][col - i] = palabra.charAt(i);
					palabraAqui[fil+i][col-i]=true;					
				}
				return true;
			}
			return false;
		}
		return false;
	}

	
}
