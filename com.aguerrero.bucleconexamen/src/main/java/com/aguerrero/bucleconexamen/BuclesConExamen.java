package com.aguerrero.bucleconexamen;

import java.util.Scanner;

public class BuclesConExamen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String nombre;
		char genero;
		String animeFav;
		float presupuestoAnual;
		short añoNacimiento;
		byte naruto;
		float presupuestoAcumulado = 0;
		byte otakusIntroducidos = 0;
		short metrosAcumulados = 0;
		String respuestaSioNo = "";
		boolean animeFavAcumulado = false;
		boolean añosAcumulados = false;
		boolean acumulacionFinal = false;

		do {
			otakusIntroducidos++;
			System.out.println("Bienvenido, otaku. Dime tu nombre:");
			nombre = sc.nextLine();
			System.out.println("Dime tu género (H o M):");
			genero = sc.nextLine().charAt(0);
			System.out.println("Dime tu anime favorito:");
			animeFav = sc.nextLine();
			System.out.println("Dime tu presupuesto anual para gastar en salones del manga:");
			presupuestoAnual = Float.parseFloat(sc.nextLine());
			presupuestoAcumulado += presupuestoAnual;
			System.out.println("Dime el año en que naciste:");
			añoNacimiento = Short.parseShort(sc.nextLine());
			System.out.println(
					"Dime cuántos metros sin decimales eres capaz de correr haciendo el Naruto-Run sin parar:");
			naruto = Byte.parseByte(sc.nextLine());
			metrosAcumulados += (short) naruto;
			System.out.println("¿Quieres introducir los datos de otro otaku?");
			respuestaSioNo = sc.nextLine();
		} while (respuestaSioNo.equalsIgnoreCase("si"));

		System.out
				.println("El presupuesto anual de estos 3 otakus para gastarse en salones del manga es de un total de "
						+ presupuestoAcumulado / otakusIntroducidos + " euros.");
		float mediaKilometros = (float) ((metrosAcumulados) / 3f) / 1000f;
		System.out.println(
				"La media que estos tres otakus son capaces de aguantar corriendo a lo Naruto sin detenerse es de "
						+ mediaKilometros + " kms. Para sorpresa de nadie, no es mucho.");

		if (añoNacimiento > 1900 && añoNacimiento < 2001) {
			añosAcumulados = true;
		}
		if (animeFav.equalsIgnoreCase("Gundam")) {
			animeFavAcumulado = true;
		}
		if ((añosAcumulados == true) && (animeFavAcumulado == true)) {
			acumulacionFinal = true;
		}

		System.out.println(acumulacionFinal);

		System.out.println("");
		System.out.println("Cerrando Scanner...");
		sc.close();
		System.out.println("Scanner cerrado.");

	}

}
