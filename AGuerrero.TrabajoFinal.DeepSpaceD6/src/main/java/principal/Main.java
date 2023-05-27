package principal;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;

import javax.imageio.ImageIO;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import clases.Dado;
import clases.DadoTripulacion;
import utils.DAO;

public class Main {

	public static void main(String[] args) {
		try {	
			BufferedImage imagen=ImageIO.read(new File("./images/tableroJuego.jpg"));
			for (short i = 0; i < imagen.getWidth(); i++) { //Para recorrer las columnas, de 0 a la anchura
				for (short j = 0; j < imagen.getHeight(); j++){
					imagen.setRGB(i, j, imagen.getRGB(i, j)&Integer.parseInt("FFFF00",16));
				}
				}
			
			ImageIO.write(imagen, "jpg", new File("./images/resultado.jpg"));
			
			
			
		/* TODO ESTO PARA METER COLORCITOS
		 * BufferedImage imagen=new BufferedImage(800,600,BufferedImage.TYPE_INT_RGB); //Solo sirve para imagenes por pixeles. Matriz a la que le decimos largo por alto

		float contadorRojo=0;
		float contadorAzul=0;
		float contadorVerde=0;
				for (short i = 0; i < imagen.getWidth(); i++) { //Para recorrer las columnas, de 0 a la anchura
			for (short j = 0; j < imagen.getHeight(); j++) {//Para recorrer las filas, de 0 a la altura
				String colorEscogido=String.format("%02X",(int)contadorRojo);
				colorEscogido+=String.format("%02X",(int)contadorAzul);
				colorEscogido+=String.format("%02X",(int)contadorVerde);
				imagen.setRGB(i, j, Integer.parseInt(colorEscogido,16));
				contadorRojo=(contadorRojo+(255f/imagen.getHeight()))%255;
			}
			contadorVerde=(contadorVerde+(255f/imagen.getHeight()))%255;
		}
				ImageIO.write(imagen,"JPG",new File("./images/Tablero.jpg")); //Con esto te crea el archivo. DEBE ESTAR AL FINAL DEL TODO*/
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("hecho");
		
		
	}

}
