package interfaces;

import javax.swing.JFrame;

public class Ventana extends JFrame {

	public Ventana() {
		this.setSize(1200, 600);
		this.setTitle("Programa de prueba de clase");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setContentPane(new PantallaLogin(this));
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
		this.getContentPane().setVisible(true);
	}

}
