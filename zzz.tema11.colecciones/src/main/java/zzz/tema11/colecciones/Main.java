package zzz.tema11.colecciones;

import java.util.HashSet;
import java.util.Iterator;

import clases.Bicicleta;
import clases.Cliente;

public class Main {

	public static void main(String[] args) {
		/*HashSet<String> hs=new HashSet<String>();
		hs.add("Patata");
		hs.add("Cebolla");
		hs.add("Ajo");
		hs.add("Aceite");
		hs.add("Chorizo");
		hs.add("Huevo");
		hs.add("Morcilla");
		hs.add("Panceta");		
		System.out.println("Tamaño: "+hs.size());
		hs.remove("Chorizo");
		System.out.println(hs);
		System.out.println("Tamaño: "+hs.size());
		System.out.println("¿Tiene la morcilla? "+hs.contains("Morcilla"));
		System.out.println("¿Tiene chorizo? "+hs.contains("Chorizo"));
		System.out.println("¿Está el conjunto vacío? " +hs.isEmpty());
		Iterator it=hs.iterator();
		
		while(it.hasNext()) {
			String palabraActual=(String) it.next(); //A esto siempre hay que hacerle un casting
			System.out.println(palabraActual);
		}
		
		
		
		hs.clear(); //deja el conjunto vacío
		System.out.println("¿Está el conjunto vacío? " +hs.isEmpty()+" Tamaño: "+hs.size());*/
		
		Cliente c1=new Cliente("pepe@pepe.com", "123", "666 666 666", "Pepe");
		Cliente c2=new Cliente("luis@luis.com", "321", "777 777 777", "Luis");
		
		Bicicleta b1=new Bicicleta("BMX", "PaTrucos", c2);
		Bicicleta b2=new Bicicleta("BMX", "PaOtrosTrucos", c2);
		Bicicleta b3=new Bicicleta("Carrefour", "PaPiezas", c2);
		Bicicleta b4=new Bicicleta("HB", "Normalita", c2);
		Bicicleta b5=new Bicicleta("Monty", "PaDerrapar", c2);
		Bicicleta b6=new Bicicleta("Decathlon", "PaIrAClase", c2);
		
		c2.addBici(b1);
		c2.addBici(b2);
		c2.addBici(b3);
		c2.addBici(b4);
		c2.addBici(b5);
		c2.addBici(b6);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println();
		System.out.println("¿Pertenece la b1 al primer cliente? "+c1.getHs().contains(b1));
		System.out.println("¿Pertenece la b2 al primer cliente? "+c1.getHs().contains(b2));
		System.out.println("¿Pertenece la b3 al primer cliente? "+c1.getHs().contains(b3));
		
		

		
		
		
		
	}

}
