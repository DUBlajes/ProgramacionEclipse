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
		
		JButton botonDado = new JButton("<html>" + "Tirar" + "<br>" + "Dado" + "</html>");
		botonDado.setForeground(new Color(0, 0, 0));
		botonDado.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				byte tiradaDados=DadoTripulacion.tirarDado();
				tiradaDados=DadoTripulacion.tirarDado();
				tiradaDados=DadoTripulacion.tirarDado();
				tiradaDados=DadoTripulacion.tirarDado();
				tiradaDados=DadoTripulacion.tirarDado();
				tiradaDados=DadoTripulacion.tirarDado();
				System.out.println(tiradaDados+" "+tiradaDados+" "+tiradaDados+" "+tiradaDados+" "+tiradaDados+" "+tiradaDados+" ");
			}
		});
		botonDado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonDado.setFont(new Font("Tahoma", Font.PLAIN, 10));
		botonDado.setBounds(21, 10, 70, 70);
		panelAcciones.add(botonDado);
		
		JButton btnAtacar4 = new JButton("Atacar 4");
		btnAtacar4.setBounds(66, 127, 150, 80);
		panelAcciones.add(btnAtacar4);
		
		JButton btnAtacar3 = new JButton("Atacar 3");
		btnAtacar3.setBounds(66, 240, 150, 80);
		panelAcciones.add(btnAtacar3);
		
		JButton btnAtacar2 = new JButton("Atacar 2");
		btnAtacar2.setBounds(66, 352, 150, 80);
		panelAcciones.add(btnAtacar2);
		
		JButton btnAtacar1 = new JButton("Atacar 1");
		btnAtacar1.setBounds(66, 462, 150, 80);
		panelAcciones.add(btnAtacar1);
		
		JButton btnNewButton = new JButton("<html>Tirar<br>Dado<br>Amenaza</html>");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(DadoAmenaza.tirarDado());
				
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(184, 10, 70, 70);
		panelAcciones.add(btnNewButton);
		
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
	}

	private void setImageLabel(JLabel labelTablero, String raiz) {
		ImageIcon image = new ImageIcon(raiz);
		Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelTablero.getWidth(), labelTablero.getHeight(),
				Image.SCALE_SMOOTH));
		
		labelTablero.setIcon(icon);
		this.repaint();

	}
}
