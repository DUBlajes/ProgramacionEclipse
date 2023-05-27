package principal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

import clases.ExoPlaneta;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ExoPlaneta exoplaneta = null;
		String nombre;
		Float distancia;
		Float temperatura;
		boolean candidatoVida;
		Byte opcion;
		do {

			System.out.println(
					"Que quieres hacer?" + "\n\t0 - Salir" + "\n\t1 - Registrar planeta" + "\n\t2 - Mostrar planetas con el TreeSet"+"\n\t3 - Mostrar planetas con toString (Solo hacer esto después de registrar algún planeta)");
			opcion = Byte.parseByte(sc.nextLine());
			switch (opcion) {
			case 1:
				System.out.println("Dime el nombre del exoplaneta");
				nombre = sc.nextLine();
				System.out.println("Dime a qué distancia está de la Tierra, en millones de kms");
				distancia = Float.parseFloat(sc.nextLine());
				System.out.println("Dime la temperatura media en ºC");
				temperatura = Float.parseFloat(sc.nextLine());
				System.out.println("Dime si es apto para la vida (True/False)");
				candidatoVida = Boolean.parseBoolean(sc.nextLine());
				exoplaneta = new ExoPlaneta(nombre, distancia, temperatura, candidatoVida);
				System.out.println("Planeta registrado con éxito");
				try {
					FileWriter escritor = new FileWriter("./usuarios.log");
					String logEntry = "ExoPlaneta " + exoplaneta.getNombre() + " registrado con éxito en: "
							+ LocalDateTime.now().toString() + "\n";
					escritor.write(logEntry);
					escritor.flush();
					escritor.close();
					System.out.println("Registro escrito en el archivo 'usuarios.log'.");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("Error al escribir en el archivo 'usuarios.log'.");
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("No sé por qué sale este error: ");
				}
				break;

			case 2:
				try {
					ArrayList<ExoPlaneta> arrayList =ExoPlaneta.getTodos();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 TreeSet<String> treeSet = new TreeSet<>((s1, s2) -> {
			            int comparacion = s1.compareTo(s2);
			            if (comparacion == 0) {
			                return s1.compareTo(s2);
			            } else {
			                return comparacion;
			            }
			        });

			        Iterator<String> iterator = treeSet.iterator();
			        while (iterator.hasNext()) {
			            System.out.println(iterator.next());
			        }
				break;
				
			case 3:
				System.out.println(exoplaneta.toString());
				break;
			}
		} while (opcion != 0);
	}
}
