package losSims;

import Clases.Animal;
import Clases.AnimalDomestico;
import Clases.Comida;
import Clases.Sim;
import Clases.Perro;
import Clases.SerVivo;
import Clases.Gato;
import Clases.Mundo;

public class Main {

	public static void main(String[] args) {
		
		Comida sopaPollo=new Comida("Sopa de pollo", (byte)40);
		Sim alvaro=new Sim("Álvaro", 'h', (byte)50, (byte)50, (byte)50, (byte)50, "Guerrero Sánchez");
		//System.out.println(alvaro);
		Perro yacko=new Perro("Yacko", 'h', (byte)50, (byte)50, (byte)50, (byte)50, "Mezcla", "Claro largo", alvaro);

		Gato scot=new Gato("Scot", 'h', (byte)50, (byte)50, (byte)50, (byte)50, "Maine Coon", "Largo oscuro", alvaro,(byte)100);
		//System.out.println(cat);
		yacko.comer(sopaPollo);
		//System.out.println(yacko);
		
		Animal a=new Gato("Misifu", 'h', (byte)50, (byte)50, (byte)50, (byte)50, "Maine Coon", "Largo oscuro", alvaro,(byte)100);
		
		Mundo m=new Mundo(new Sim[3], new Animal[5]);
		m.getAnimales()[0]=yacko;
		m.getAnimales()[1]=scot;
		System.out.println(m);
		
	}

}
