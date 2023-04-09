package examen;

import java.util.Random;

public class Funciones {
	
	public static String imprimeAula(String[][] iconos,String[][] nombres) {
		String ret="";
		for(byte i=0;i<iconos.length;i++) {
			for(byte j=0;j<iconos[i].length;j++) {
				ret+=iconos[i][j];
			}
			ret+="\t---->\t";
			for(byte j=0;j<nombres[i].length;j++) {
				ret+=nombres[i][j]+(nombres[i][j].equals("|  ")||nombres[i][j].equals("|🐴")?"":"\t");
			}
			ret+="\n";
		}
		return ret;
	}
	
	public static void intercambiarPosiciones
	(String[][] matriz,byte f1,byte c1,byte f2,byte c2){
		String aux=matriz[f2][c2];
		matriz[f2][c2]=matriz[f1][c1];
		matriz[f1][c1]=aux;
	}
	
	public static String posicionAleatoriaMatriz(byte tamañoFilas,byte tamañoColumnas) {
		Random r=new Random();
		byte f=(byte)r.nextInt(tamañoFilas);
		byte c=(byte)r.nextInt(tamañoColumnas);
		return f+","+c;
	}
	
	public static void intercambiarAlumnos(String[][] iconos,String[][] nombres,byte veces) {
		for(byte i=0;i<veces;i++) {
			byte f;
			byte c;
			do {
				String filCol=Funciones.posicionAleatoriaMatriz(
						(byte)iconos.length,(byte) iconos[0].length);
				String[] spliteado=filCol.split(",");
				 f=Byte.parseByte(spliteado[0]);
			 	 c=Byte.parseByte(spliteado[1]);
			}while(!iconos[f][c].equals("👩")&&!iconos[f][c].equals("👨")&&
					!iconos[f][c].equals("◓ "));

			byte f2;
			byte c2;
			do {
				String filCol=Funciones.posicionAleatoriaMatriz(
						(byte)iconos.length,(byte) iconos[0].length);
				String[] spliteado=filCol.split(",");
				 f2=Byte.parseByte(spliteado[0]);
			 	 c2=Byte.parseByte(spliteado[1]);
			}while(!iconos[f2][c2].equals("👩")&&!iconos[f2][c2].equals("👨")&&
					!iconos[f2][c2].equals("◓ "));

			Funciones.intercambiarPosiciones(iconos, f,c,f2,c2);
			Funciones.intercambiarPosiciones(nombres, f,c,f2,c2);
		}
	}
	
	public static byte buscarCaballo(String[][] matriz){
		for(byte i=(byte)(matriz.length-1);i>=0;i--) {
			if(matriz[i][2].contains("🐴")) {
				return i;
			}
		}
		return -1;
	}
	
	
	public static boolean moverCaballo(String[][] iconos, String[][] nombres, byte direccion) {
		byte posCaballo=Funciones.buscarCaballo(iconos);
		switch(direccion) {
		case 1:
			Funciones.intercambiarPosiciones(iconos, (byte)posCaballo, 
					(byte)2, (byte)(posCaballo+1), (byte)2);
			Funciones.intercambiarPosiciones(nombres, (byte)posCaballo, 
					(byte)2, (byte)(posCaballo+1), (byte)2);
			break;
		case -1:
			Funciones.intercambiarPosiciones(iconos, (byte)posCaballo, 
					(byte)2, (byte)(posCaballo-1), (byte)2);
			Funciones.intercambiarPosiciones(nombres, (byte)posCaballo, 
					(byte)2, (byte)(posCaballo-1), (byte)2);
			break;
		}
		return (iconos[0][2].contains("🐴")||iconos[iconos.length-1][2].contains("🐴"));
	}
	
	
	
	
	
}
