package interfaces;

import javax.swing.JFrame;

public class Frame extends JFrame {

	/**
	 * Create the frame.
	 */
	public Frame() {
		this.setContentPane(new PantallaActs(this));
		// para hacerlo visible
		this.setVisible(true);
		// para el tamaño
		this.setSize(600, 500);
		// para el titulo
		this.setTitle("Interfaces Programación");
		// para cerrar las ventanas en ejecucion (en plan para cuando se queda encendido
		// y tal no¿?NO???)
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		// Para poner la localizacion centrada
		this.setLocationRelativeTo(null);
	} // frame

	// cambiar pantalla METODO.
	// <?> template por argumento
	// para cambiar de pantallas tienes que poner
	public void cambiarAPantalla(Class<?> clase) {
		this.getContentPane().setVisible(false);
		if (clase.equals(Act1.class)) {
			this.setContentPane(new Act1(this));
		} // if
		if (clase.equals(Act2.class)) {
			this.setContentPane(new Act2(this));
		} // if
		
		this.getContentPane().setVisible(true);

	} // cambiar
	
} // class
