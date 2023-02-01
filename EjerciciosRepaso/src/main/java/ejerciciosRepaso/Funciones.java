package ejerciciosRepaso;

import java.util.Scanner;

public class Funciones {
	public static short cuentaLetras(String palabra, char letra) {
		byte contador = 0;
		for (short i = 0; i < palabra.length(); i++) {
			if (palabra.charAt(i) == letra) {
				contador++;
			}
		}
		return contador;

	}

	public static String dibujarBarcos(String dibujo, byte numeroBarcos) {
		return dibujo;
	}

	public static short loQueQueda(String orig, String substring) {
		short ret = 0;

		if (orig.indexOf(substring) == -1) {
			ret = -1;
			return ret;

		}
		while (orig.indexOf(substring) != -1) {
			int indice = orig.indexOf(substring);
			orig = orig.substring(indice + substring.length());
			ret = (short) orig.length();
		}
		return ret;

	}

	public static String patadizarRefran(String miRefran) {
		String ret = "";
		if (!miRefran.contains(",")) {
			ret = null;
		} else {
			int indice = miRefran.indexOf(',');
			miRefran = miRefran.substring(indice);
			ret = miRefran.replace(", ", "patada en la entrepierna");
		}
		return ret;

	}

	/*
	 * public static String imprimeArray(float f) { Scanner sc = new
	 * Scanner(System.in); float[] prueba1 = new float[(int)
	 * Float.parseFloat(sc.nextLine())]; for (int i = 0; i < prueba1.length; i++) {
	 * prueba1[i]++;
	 * 
	 * } String ret = ""; for (int i = 0; i < prueba1.length; i++) { ret += i + " ";
	 * } return ret; }
	 */

	public static String imprimeArray(char c) {
		char[] prueba = { 'l', 'o', 'l' };
		for (int i = 0; i < prueba.length; i++) {

		}
		String ret = "";
		for (int i = 0; i < prueba.length; i++) {
			ret += prueba[i] + " ";
		}
		return ret;
	}

	public static String codificar(String texto, byte num) {
		String ret = "";
		for (byte i = 0; i < texto.length(); i++) {
			ret += (char) (texto.charAt(i) + num);
		}
		return ret;
	}

	public static String codiRec(byte i, String texto,byte num) {
		String ret="";
		if (i<texto.length()) {
			//ret+=(char)(texto.charAt(i)+num);
			ret+=Funciones.codiRec((byte)++i, texto, num);
		} else {

		}
		return ret;
		} 

	public static short descifrarQuiero(String codigo) {
		short ret=0;
		String codigo1="Vznjwt%fuwtgfw%jxyf%fxnlsfyzw";
		String descodif="";
		do {
			for (short num = 1; num < codigo1.length(); num++) {
				descodif += (char) (codigo1.charAt(ret));
				ret++;
			}
		} while (!codigo1.contains("Quiero"));
		return ret;

		
	}
	
	}


