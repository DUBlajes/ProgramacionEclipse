package interfaces;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;

import clases.DadoAmenaza;
import clases.DadoTripulacion;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TableroDeJuego extends JPanel {
	private Ventana ventana;
	private ImageIcon imagen;
	private Icon icono;
	private JButton botonAmenaza;
	private JButton botonDado;
	private JButton btnAtacar4;
	private JButton btnAtacar3;
	private JButton btnAtacar2;
	private JButton btnAtacar1;
	private JLabel tiraDado;
	private JLabel tiradaDadosTripulantes;
	private JButton botonPasarAAtaque;
	private JButton botonAsignar1;
	private JButton botonAsignar2;
	private JButton botonAsignar3;
	private JButton botonAsignar4;
	private JButton botonAsignar5;
	private JButton botonSacarCarta;
	private JButton botonVolver;
	
	

	public TableroDeJuego(Ventana v) {
		this.ventana = v;
		v.setSize(1440, 900);
		setLayout(null);

		JPanel panelEnfermeria = new JPanel();
		panelEnfermeria.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelEnfermeria.setBounds(430, 532, 152, 224);
		add(panelEnfermeria);
		panelEnfermeria.setLayout(null);

		JPanel panelBloqueados = new JPanel();
		panelBloqueados.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelBloqueados.setBounds(430, 429, 152, 103);
		add(panelBloqueados);
		panelBloqueados.setLayout(null);

		JPanel panelAmenaza4 = new JPanel();
		panelAmenaza4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelAmenaza4.setBounds(1078, 86, 242, 130);
		add(panelAmenaza4);
		panelAmenaza4.setLayout(null);

		JPanel panelAmenaza2 = new JPanel();
		panelAmenaza2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelAmenaza2.setBounds(1078, 370, 242, 130);
		add(panelAmenaza2);
		panelAmenaza2.setLayout(null);

		JPanel panelAmenaza1 = new JPanel();
		panelAmenaza1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelAmenaza1.setBounds(1078, 517, 242, 130);
		add(panelAmenaza1);
		panelAmenaza1.setLayout(null);

		JPanel panelAcciones = new JPanel();
		panelAcciones.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelAcciones.setBounds(95, 183, 277, 584);
		add(panelAcciones);
		panelAcciones.setLayout(null);

		botonDado = new JButton("<html>" + "Tirar" + "<br>" + "Dado" + "</html>");
		botonDado.setForeground(new Color(0, 0, 0));
		DadoTripulacion dadoTripulante = new DadoTripulacion(null);
		botonDado.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int[] resultados = dadoTripulante.lanzarDados();
				String resultadosText = "Resultados: ";
				for (int resultado : resultados) {
					resultadosText += resultado + " ";
				}
				tiradaDadosTripulantes.setText(resultadosText);
			}
		});
		botonDado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botonAsignar1.setVisible(true);
				botonAsignar2.setVisible(true);
				botonAsignar3.setVisible(true);
				botonAsignar4.setVisible(true);
				botonAsignar5.setVisible(true);
				botonPasarAAtaque.setVisible(false);
				botonSacarCarta.setVisible(true);
			}
		});
		botonDado.setFont(new Font("Tahoma", Font.PLAIN, 10));
		botonDado.setBounds(21, 10, 70, 70);
		panelAcciones.add(botonDado);

		btnAtacar4 = new JButton("Atacar 4");
		btnAtacar4.setVisible(false);
		btnAtacar4.setBounds(66, 106, 150, 80);
		panelAcciones.add(btnAtacar4);

		btnAtacar3 = new JButton("Atacar 3");
		btnAtacar3.setVisible(false);
		btnAtacar3.setBounds(66, 219, 150, 80);
		panelAcciones.add(btnAtacar3);

		btnAtacar2 = new JButton("Atacar 2");
		btnAtacar2.setVisible(false);
		btnAtacar2.setBounds(66, 331, 150, 80);
		panelAcciones.add(btnAtacar2);

		btnAtacar1 = new JButton("Atacar 1");
		btnAtacar1.setVisible(false);
		btnAtacar1.setBounds(66, 441, 150, 80);
		panelAcciones.add(btnAtacar1);

		botonAmenaza = new JButton("<html>Tirar<br>Dado<br>Amenaza</html>");
		botonAmenaza.setVisible(false);
		DadoAmenaza dadoAmenaza = new DadoAmenaza(null);
		botonAmenaza.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int resultado = dadoAmenaza.lanzarDado();

				// Utiliza el resultado obtenido de la tirada
				System.out.println("Resultado: " + resultado);

			}
		});
		botonAmenaza.setForeground(new Color(0, 0, 0));
		botonAmenaza.setBounds(21, 480, 70, 70);
		panelAcciones.add(botonAmenaza);
		
		botonAsignar1 = new JButton("Asignar a zona 1");
		botonAsignar1.setVisible(false);
		botonAsignar1.setBounds(66, 106, 133, 45);
		panelAcciones.add(botonAsignar1);
		
		botonAsignar2 = new JButton("Asignar a zona 2");
		botonAsignar2.setVisible(false);
		botonAsignar2.setBounds(66, 174, 133, 45);
		panelAcciones.add(botonAsignar2);
		
		botonAsignar3 = new JButton("Asignar a zona 3");
		botonAsignar3.setVisible(false);
		botonAsignar3.setBounds(66, 240, 133, 45);
		panelAcciones.add(botonAsignar3);
		
		botonAsignar4 = new JButton("Asignar a zona 4");
		botonAsignar4.setVisible(false);
		botonAsignar4.setBounds(66, 295, 133, 45);
		panelAcciones.add(botonAsignar4);
		
		botonAsignar5 = new JButton("Asignar a zona 5");
		botonAsignar5.setVisible(false);
		botonAsignar5.setBounds(66, 370, 133, 45);
		panelAcciones.add(botonAsignar5);
		
		botonSacarCarta = new JButton("Sacar carta Amenaza");
		botonSacarCarta.setVisible(false);
		botonSacarCarta.setBounds(134, 497, 133, 45);
		panelAcciones.add(botonSacarCarta);
		
		botonPasarAAtaque = new JButton("Atacar");
		botonPasarAAtaque.setBounds(118, 29, 133, 45);
		botonPasarAAtaque.setVisible(false);
		panelAcciones.add(botonPasarAAtaque);
		
		botonVolver = new JButton("Atrás");
		botonVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botonAsignar1.setVisible(true);
				botonAsignar2.setVisible(true);
				botonAsignar3.setVisible(true);
				botonAsignar4.setVisible(true);
				botonAsignar5.setVisible(true);
				btnAtacar4.setVisible(false);
				btnAtacar3.setVisible(false);
				btnAtacar2.setVisible(false);
				btnAtacar1.setVisible(false);
				botonPasarAAtaque.setVisible(true);
				botonSacarCarta.setVisible(true);
			}
		});
		botonVolver.setBounds(166, 552, 85, 21);
		botonVolver.setVisible(false);
		panelAcciones.add(botonVolver);
		botonPasarAAtaque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				btnAtacar4.setVisible(true);
				btnAtacar3.setVisible(true);
				btnAtacar2.setVisible(true);
				btnAtacar1.setVisible(true);
				botonAsignar1.setVisible(false);
				botonAsignar2.setVisible(false);
				botonAsignar3.setVisible(false);
				botonAsignar4.setVisible(false);
				botonAsignar5.setVisible(false);
				botonPasarAAtaque.setVisible(false);
				botonSacarCarta.setVisible(false);
				botonVolver.setVisible(true);
			}
		});
		botonSacarCarta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botonAmenaza.setVisible(true);
			}
		});
		botonAsignar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botonPasarAAtaque.setVisible(true);
				
			}
		});

		JPanel panelAmenaza3 = new JPanel();
		panelAmenaza3.setBounds(1078, 230, 242, 130);
		add(panelAmenaza3);
		panelAmenaza3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelAmenaza3.setLayout(null);

		JPanel panelZona1 = new JPanel();
		panelZona1.setBounds(523, 128, 188, 90);
		add(panelZona1);

		JPanel panelZona2 = new JPanel();
		panelZona2.setBounds(543, 242, 188, 90);
		add(panelZona2);

		JPanel panelZona3 = new JPanel();
		panelZona3.setBounds(635, 370, 188, 90);
		add(panelZona3);

		JPanel panelZona4 = new JPanel();
		panelZona4.setBounds(666, 512, 188, 90);
		add(panelZona4);

		JPanel panelZona5 = new JPanel();
		panelZona5.setBounds(676, 621, 188, 90);
		add(panelZona5);
		JLabel labelTablero = new JLabel("");
		labelTablero.setBorder(new LineBorder(new Color(0, 0, 0)));
		labelTablero.setBounds(400, 16, 668, 751);
		add(labelTablero);
		setImageLabel(labelTablero, "./images/tableroJuego.jpg");

		tiradaDadosTripulantes = new JLabel("Resultados tiradas");
		tiradaDadosTripulantes.setBounds(10, 128, 127, 45);
		add(tiradaDadosTripulantes);
	}

	private void setImageLabel(JLabel labelTablero, String raiz) {
		ImageIcon image = new ImageIcon(raiz);
		Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelTablero.getWidth(), labelTablero.getHeight(),
				Image.SCALE_SMOOTH));

		labelTablero.setIcon(icon);
		this.repaint();

	}
}
