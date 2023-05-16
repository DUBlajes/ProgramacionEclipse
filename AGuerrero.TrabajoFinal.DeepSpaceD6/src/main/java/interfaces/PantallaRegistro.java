package interfaces;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PantallaRegistro extends JPanel{
	
	private Ventana ventana;
	public PantallaRegistro(Ventana v) {
		this.ventana=v;
		setLayout(null);
		
		JLabel etiquetaRegistro = new JLabel("Registro");
		etiquetaRegistro.setBounds(186, 34, 46, 14);
		add(etiquetaRegistro);
		
		JButton botonVolver = new JButton("Volver atrás");
		botonVolver.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarAPantalla(PantallaLogin.class);
			}
		});
		botonVolver.setBounds(144, 207, 141, 51);
		add(botonVolver);
	}
	
}
