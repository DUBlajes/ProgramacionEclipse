package solucion.examen.feria.daw;

import java.util.ArrayList;

import clases.Caballo;
import clases.Comida;
import clases.Feria;
import clases.Instalacion;
import clases.Montable;
import clases.Noria;
import clases.PuestoComida;
import clases.Tiovivo;
import clases.Vehiculo;
import enums.TematicaVehiculo;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Montable> montablesTioVivo1=new ArrayList<Montable>();
		for(byte i=0;i<5;i++) {
			montablesTioVivo1.add(new Caballo((byte)5,(byte)2));
		}
		montablesTioVivo1.add(new Vehiculo((byte)5,(byte)2,true,TematicaVehiculo.AMBULANCIA));
		montablesTioVivo1.add(new Vehiculo((byte)5,(byte)2,true,TematicaVehiculo.COCHE_BATMAN));
		montablesTioVivo1.add(new Vehiculo((byte)5,(byte)2,false,TematicaVehiculo.COHETE));
		montablesTioVivo1.add(new Vehiculo((byte)5,(byte)2,false,TematicaVehiculo.SUPERMAN));
		montablesTioVivo1.add(new Vehiculo((byte)5,(byte)2,true,TematicaVehiculo.COCHE_BOMBEROS));
		
		ArrayList<Montable> montablesTioVivo2=new ArrayList<Montable>();
		for(byte i=0;i<5;i++) {
			montablesTioVivo2.add(new Caballo((byte)6,(byte)2));
		}
		montablesTioVivo2.add(new Vehiculo((byte)6,(byte)2,true,TematicaVehiculo.AMBULANCIA));
		montablesTioVivo2.add(new Vehiculo((byte)6,(byte)2,true,TematicaVehiculo.COHETE));
		montablesTioVivo2.add(new Vehiculo((byte)6,(byte)2,false,TematicaVehiculo.COHETE));
		montablesTioVivo2.add(new Vehiculo((byte)6,(byte)2,false,TematicaVehiculo.SUPERMAN));
		montablesTioVivo2.add(new Vehiculo((byte)6,(byte)2,true,TematicaVehiculo.COCHE_BOMBEROS));

		Tiovivo tv1=new Tiovivo("Vueltas 3000",3.5f,montablesTioVivo1);
		Tiovivo tv2=new Tiovivo("Tiovivo del tio paco",4.25f,montablesTioVivo2);
		Noria n1=new Noria("Giroscopio X",2.5f,(byte)100,(byte)25,(byte)2);
		Noria n2=new Noria("Churriana Eye",3f,(byte)120,(byte)20,(byte)5);
		
		ArrayList<Comida> comidaP1=new ArrayList<Comida>();
		comidaP1.add(new Comida("Perrito",3.5f,true));
		comidaP1.add(new Comida("Hamburguesa",5f,true));
		

		ArrayList<Comida> comidaP2=new ArrayList<Comida>();
		comidaP2.add(new Comida("Campero",6.5f,true));
		comidaP2.add(new Comida("Papa asada",4f,true));
		

		PuestoComida p1=new PuestoComida("Come y calla",true,comidaP1);
		PuestoComida p2=new PuestoComida("Casa Lola",false,comidaP2);
		
		ArrayList<Instalacion> instalaciones=new ArrayList<Instalacion>();
		instalaciones.add(p2);
		instalaciones.add(p1);
		instalaciones.add(n2);
		instalaciones.add(n1);
		instalaciones.add(tv1);
		instalaciones.add(tv2);
		
		tv1.venderFicha();
		n1.venderFicha();
		n1.venderFicha();
		
		Feria f=new Feria(instalaciones);
		System.out.println(f);
		
		
	}

}
