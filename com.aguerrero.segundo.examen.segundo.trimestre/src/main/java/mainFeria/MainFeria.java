package mainFeria;

import java.util.ArrayList;

import clases.Caballo;
import clases.Comida;
import clases.Feria;
import clases.Noria;
import clases.PuestoComida;
import clases.Tiovivo;
import clases.Vehiculo;
import enumerador.TematicaVehiculo;

public class MainFeria {

	public static void main(String[] args) {

		Caballo c1 = new Caballo((byte) 5, (byte) 4);
		Caballo c2 = new Caballo((byte) 10, (byte) 5);
		Caballo c3 = new Caballo((byte) 5, (byte) 4);
		Caballo c4 = new Caballo((byte) 10, (byte) 5);
		Caballo c5 = new Caballo((byte) 5, (byte) 4);
		Caballo c6 = new Caballo((byte) 5, (byte) 4);
		Caballo c7 = new Caballo((byte) 5, (byte) 4);
		Caballo c8 = new Caballo((byte) 5, (byte) 4);
		Caballo c9 = new Caballo((byte) 5, (byte) 4);
		Caballo c10 = new Caballo((byte) 5, (byte) 4);
		
		Vehiculo v1=new Vehiculo((byte)3, (byte)2, true, TematicaVehiculo.AMBULANCIA);
		Vehiculo v2=new Vehiculo((byte)3, (byte)2, false, TematicaVehiculo.COCHE_BATMAN);
		Vehiculo v3=new Vehiculo((byte)5, (byte)8, true, TematicaVehiculo.COCHE_BOMBEROS);
		Vehiculo v4=new Vehiculo((byte)3, (byte)2, false, TematicaVehiculo.COHETE);
		Vehiculo v5=new Vehiculo((byte)5, (byte)5, false, TematicaVehiculo.TRONCOMOVIL);
		Vehiculo v6=new Vehiculo((byte)3, (byte)2, true, TematicaVehiculo.AMBULANCIA);
		Vehiculo v7=new Vehiculo((byte)5, (byte)2, false, TematicaVehiculo.COCHE_BATMAN);
		Vehiculo v8=new Vehiculo((byte)3, (byte)10, true, TematicaVehiculo.COCHE_BOMBEROS);
		Vehiculo v9=new Vehiculo((byte)5, (byte)2, false, TematicaVehiculo.COHETE);
		Vehiculo v10=new Vehiculo((byte)5, (byte)5, false, TematicaVehiculo.TRONCOMOVIL);
		
		ArrayList<Caballo> caballosTiovivo1=new ArrayList<Caballo>();
		caballosTiovivo1.add(c1);
		caballosTiovivo1.add(c2);
		caballosTiovivo1.add(c3);
		caballosTiovivo1.add(c4);
		caballosTiovivo1.add(c5);
		
		ArrayList<Vehiculo> vehiculosTiovivo1=new ArrayList<Vehiculo>();
		vehiculosTiovivo1.add(v1);
		vehiculosTiovivo1.add(v2);
		vehiculosTiovivo1.add(v3);
		vehiculosTiovivo1.add(v4);
		vehiculosTiovivo1.add(v5);
		
		ArrayList<Caballo> caballosTiovivo2=new ArrayList<Caballo>();
		caballosTiovivo2.add(c6);
		caballosTiovivo2.add(c7);
		caballosTiovivo2.add(c8);
		caballosTiovivo2.add(c9);
		caballosTiovivo2.add(c10);
		
		ArrayList<Vehiculo> vehiculosTiovivo2=new ArrayList<Vehiculo>();
		vehiculosTiovivo2.add(v6);
		vehiculosTiovivo2.add(v7);
		vehiculosTiovivo2.add(v8);
		vehiculosTiovivo2.add(v9);
		vehiculosTiovivo2.add(v10);
		
		ArrayList<Tiovivo> tiovivos=new ArrayList<Tiovivo>();
		Tiovivo t1=new Tiovivo("Tiovivo Tio Muerto", 3f, caballosTiovivo1, vehiculosTiovivo1, null);
		Tiovivo t2=new Tiovivo("Tiovivo Tio No Tan muerto", 10f, caballosTiovivo2, vehiculosTiovivo2, null);
		tiovivos.add(t1);
		tiovivos.add(t2);
		
		Noria n1=new Noria("Noria Redonda", 8f, (short)100, (byte)30, (byte)4);
		Noria n2=new Noria("Noria Cuadrada", 10f, (short)100, (byte)30, (byte)6);
		
		ArrayList<Noria> norias=new ArrayList<Noria>();
		norias.add(n1);
		norias.add(n2);
		
		
		Comida comida1 = new Comida("Perrito Caliente", 3f, true);
		Comida comida2 = new Comida("Patata asada", 7f, false);
		ArrayList<Comida> comidasEnVenta = new ArrayList<Comida>();
		PuestoComida puesto1 = new PuestoComida("Rocky", false, comida1);
		PuestoComida puesto2 = new PuestoComida("Don Papon", true, comida2);
		
		ArrayList<PuestoComida> puestosComida = new ArrayList<PuestoComida>();
		puestosComida.add(puesto1);
		puestosComida.add(puesto2);
		
		
		Feria feria1=new Feria(tiovivos, norias, puestosComida);
		System.out.println(feria1);

	}
}
