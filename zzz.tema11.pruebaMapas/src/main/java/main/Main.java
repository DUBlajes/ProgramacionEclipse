package main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;
import clases.Usuario;

public class Main {

	public static void main(String[] args) {

		/*
		 * 1. Implementa la interfaz comparable en la clase Usuario. Haz que un usuario
		 * se considere menor que otro si su año de nacimiento es menor. Si el año de
		 * nacimiento son iguales, el criterio para ordenar los datos será
		 * alfabéticamente por el nombre. 2. Crea un menú con X opciones; 0 - Salir 1 -
		 * Insertar usuario -> Pide todos los datos de un usuario por teclado y lo
		 * inserta en el map 2 - Cambiar nombre -> Primero pide el email de un usuario.
		 * Si no lo encuentra, vuelve al menú. Si lo encuentra, pide por teclado el
		 * nuevo nombre para el usuario y se lo cambia. 3 - Cambiar email -> Primero
		 * pide el email de un usuario. Si no lo encuentra, vuelve al menú. Si lo
		 * encuentra, pide por teclado el nuevo email para el usuario y cambia tanto el
		 * email en el objeto como la clave de búsqueda 4 - Imprimir en treeset -> En
		 * esta opción recorremos todos los usuarios del Hashmap y, conforme lo
		 * recorremos, los insertamos todos en un treeset. Después, cuando hemos
		 * recorrido todo el mapa, recorremos el treeset imprimiendo a los usuaris
		 * conforme se los encuentra el iterador.
		 * 
		 */
		/*HashMap<String, Usuario> porEmail = new HashMap<String, Usuario>();
		// LinkedHashMap<String, Usuario> porEmail = new LinkedHashMap<String,
		// Usuario>(); PARA IMPRIMIR EN EL ORDEN EN QUE INSERTAMOS
		// TreeMap<String, Usuario> porEmail = new TreeMap<String, Usuario>(); SALE
		// ORDENADO ALFABETICAMENTE POR LAS CLAVES (EN ESTE CASO EL EMAIL)
		TreeSet<Usuario> usuariosExplicacion = new TreeSet<Usuario>();

		porEmail.put("pepelu@micasa.es", new Usuario("Pepe Luis", "123123", "pepelu@micasa.es", (short) 1994));
		porEmail.put("martarada@micasa.es", new Usuario("Marta Rada", "123123", "martarada@micasa.es", (short) 2001));
		porEmail.put("esthercolero@micasa.es",
				new Usuario("Esther Colero", "123123", "esthercolero@micasa.es", (short) 2003));
		porEmail.put("aitortilla@micasa.es",
				new Usuario("Aitor Tilla", "123123", "aitortilla@micasa.es", (short) 1995));
		porEmail.put("zoilaguerra@micasa.es",
				new Usuario("Zoila Guerra", "123123", "zoilaguerra@micasa.es", (short) 1986));

		porEmail.get("aitortilla@micasa.es").setAnoNacimiento((short) 2034);
		System.out.println(porEmail.get("aitortilla@micasa.es"));
		Usuario borrado = porEmail.remove("martarada@micasa.es");
		System.out.println("Tamaño hashmap: " + porEmail.size());

		porEmail.get("aitortilla@micasa.es").setEmail("asd@micasa.es");
		System.out.println(porEmail.get("asd@micasa.es"));
		Usuario quitado = porEmail.remove("aitortilla@micasa.es");
		porEmail.put(quitado.getEmail(), quitado);
		System.out.println("Quitado: " + porEmail.get("asd@micasa.es"));

		Iterator it = porEmail.keySet().iterator();
		while (it.hasNext()) {
			String actual = (String) it.next();
			System.out.println(actual);
		}
		System.out.println("\n\n\n");

		it = porEmail.values().iterator();
		while (it.hasNext()) {
			Usuario actual = (Usuario) it.next();
			System.out.println(actual);
		}
		System.out.println("\n\n\n");
		it = porEmail.entrySet().iterator();
		while (it.hasNext()) {
			Entry actual = (Entry) it.next();
			System.out.println(actual.getKey() + " || " + actual.getValue());
		}*/
		System.out.println();
		Scanner sc = new Scanner(System.in);
		byte opcion;
		HashMap<String, Usuario> usuarios = new HashMap<String,Usuario>();
		do {
			System.out.println("Menú:");
			System.out.println("0 - Salir");
			System.out.println("1 - Insertar usuario");
			System.out.println("2 - Cambiar nombre");
			System.out.println("3 - Cambiar email");
			System.out.println("4 - Imprimir en treeset");
			opcion = Byte.parseByte(sc.nextLine());
			switch (opcion) {
			case 0:
				break;
			case 1:
				System.out.println("Introduce el nombre del usuario:");
				String nombre = sc.nextLine();
				System.out.println("Introduce el email del usuario:");
				String email = sc.nextLine();
				System.out.println("Introduce el año de nacimiento del usuario:");
				Short anoNacimiento=Short.parseShort(sc.nextLine());
				Usuario usuario = new Usuario(nombre, email, (short)anoNacimiento);
				usuarios.put(email, usuario);
				System.out.println("Usuario insertado correctamente.");
				break;
			case 2:
				System.out.println("Introduce el email del usuario:");
				email = sc.nextLine();
				usuario = usuarios.get(email);
				if (usuario == null) {
					System.out.println("Usuario no encontrado.");
					
				} else {
					System.out.println("Introduce el nuevo nombre del usuario:");
					nombre = sc.nextLine();
					usuario.setNombre(nombre);
					System.out.println("Nombre actualizado correctamente.");
				}
				break;
			case 3:
				System.out.println("Introduce el email del usuario:");
				email = sc.nextLine();
				usuario = usuarios.get(email);
				if (usuario == null) {
					System.out.println("Usuario no encontrado.");
				} else {
					System.out.println("Introduce el nuevo email del usuario:");
					String nuevoEmail = sc.nextLine();
					usuario.setEmail(nuevoEmail);
					usuarios.remove(email);
					usuarios.put(nuevoEmail, usuario);
					System.out.println("Email actualizado correctamente.");
				}
				break;
			case 4:
				TreeSet<Usuario> treeSet = new TreeSet<Usuario>(usuarios.values());
				String ret="";
				Iterator it=treeSet.iterator();
				while(it.hasNext()) {
					Usuario userActual=(Usuario) it.next(); //A esto siempre hay que hacerle un casting
					System.out.println(userActual.getNombre() + " - " + userActual.getEmail() + " - " + userActual.getAnoNacimiento());
				}
				break;
			default:
				System.out.println("Opción no válida.");
			}
		} while (opcion != 0);
	}

}
