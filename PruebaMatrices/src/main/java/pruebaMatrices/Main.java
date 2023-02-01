package pruebaMatrices;

public class Main {

	public static void main(String[] args) {
		byte numero=5;
		byte[] array= {4,3,2};
		byte[][]matriz= {{6,12,21},{72,13,44},{-5,41,-12}};
		matriz[2][0]=7;
		
		//Si para recorrer un array hace falta un bucle, para una matriz hace falta 2 bucles:
		
		for (int i = 0; i < matriz.length; i++) { //Matriz.length es el numero de filas. Si hago sysout de eso solo me imprime los punteros de las filas
			for (int j = 0; j < matriz[i].length; j++) {//Matriz de i es un array, 0 la fila 0, 1 la fila 1 y asi sucesivamente
				System.out.print(matriz[i][j]+"\t"); //sin ln para que se imprima bonita
				
			}
			System.out.println();
		}
		
		byte[][][]matriz2= {{{1,2,3},{4,5,6}},{{7,8,9},{10,11,12}},{{13,14,15},{16,17,18}}};
		matriz2[1][1][2]=3;
		
		for (int i = 0; i < matriz2.length; i++) {
			System.out.println("Profundidad "+i+"---------------------");
			for (int j = 0; j < matriz2[i].length; j++) {
				for (int k = 0; k < matriz2[i][j].length; k++) {
					System.out.print(matriz2[i][j][k]+"\t");
				}
				System.out.println();	
			}
		}

	}

}
