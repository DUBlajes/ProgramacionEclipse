package interfaces;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;


public class Ventana extends JFrame {
		public Ventana() {
		this.setSize(800, 600);
		this.setTitle("Examen de Programación DAM");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setContentPane(new Pantalla1(this));
		this.setIconImage(new ImageIcon("./icono.jpg").getImage());
		this.setVisible(true); // Siempre tiene que ser la última línea del constructor
	}

	public void cambiarAPantalla(Class<?> clase) {
		this.getContentPane().setVisible(false);
		if (clase.equals(Pantalla1.class)) {
			this.setContentPane(new Pantalla1(this));
		}
		if(clase.equals(Pantalla2.class)) {
			this.setContentPane(new Pantalla2(this));
		}
		this.getContentPane().setVisible(true);
	}
	

}
