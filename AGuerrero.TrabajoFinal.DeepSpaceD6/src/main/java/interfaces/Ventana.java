package interfaces;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import clases.Cartas;
import clases.Usuario;

public class Ventana extends JFrame {
	
	protected Usuario usuarioLogado;
	protected Cartas cartasDisponibles;
	
	public Ventana() {
		this.setSize(1920, 1080);
		this.setTitle("Deep Space D-6");
		this.setExtendedState(MAXIMIZED_BOTH);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setContentPane(new PRUEBASTableroDeJuego(this));
		this.setIconImage(new ImageIcon("./images/icono.jpg").getImage());
		this.setVisible(true); // Siempre tiene que ser la última línea del constructor
	}

	public void cambiarAPantalla(Class<?> clase) {
		this.getContentPane().setVisible(false);
		if (clase.equals(PantallaLogin.class)) {
			this.setContentPane(new PantallaLogin(this));
		}
		if(clase.equals(PantallaRegistro.class)) {
			this.setContentPane(new PantallaRegistro(this));
		}
		if(clase.equals(PantallaListado.class)) {
			this.setContentPane(new PantallaListado(this));
		}
		if(clase.equals(PantallaEligeNave.class)) {
			this.setContentPane(new PantallaEligeNave(this));
		}
		if(clase.equals(TableroDeJuego.class)) {
			this.setContentPane(new TableroDeJuego(this));
		}
		this.getContentPane().setVisible(true);
	}
	
	public void VentanaComingSoon() {
		this.setSize(800, 400);
		this.setTitle("Próximamente");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setContentPane(new PantallaComingSoon(this));
		this.setIconImage(new ImageIcon("./images/icono.jpg").getImage());
		this.setVisible(true);
	}
}
