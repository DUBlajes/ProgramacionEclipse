package interfaces;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PantallaListado extends JPanel{
	private Ventana ventana;
	
	public PantallaListado(Ventana v) {
		this.ventana=v;
		setLayout(new BorderLayout(0, 0));
		
		JLabel labelBienvenido = new JLabel("Te doy la bienvenida, "+ventana.usuarioLogado.getNick());
		add(labelBienvenido, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.SOUTH);
		
		JButton botonAtras = new JButton("Volver");
		botonAtras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarAPantalla(PantallaEligeNave.class);
			}
		});
		panel.add(botonAtras);
		
		JScrollPane lista = new JScrollPane();
		add(lista, BorderLayout.CENTER);
		
		JPanel contenedorElementos = new JPanel();
		lista.setViewportView(contenedorElementos);
		contenedorElementos.setLayout(new BoxLayout(contenedorElementos, BoxLayout.Y_AXIS));
		
		for(byte i=0;i<10;i++) {
			contenedorElementos.add(new ElementoListaUsuario(ventana,ventana.usuarioLogado));
		}
	}

}
