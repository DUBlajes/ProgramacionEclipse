package interfaces;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class PantallaEligeNave extends JPanel {
	private Ventana ventana;

	public PantallaEligeNave(Ventana v) {
		this.ventana = v;
		setLayout(null);
		
		JButton botonNave1 = new JButton("Elige esta nave");
		botonNave1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		botonNave1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarAPantalla(TableroDeJuego.class);
			}
		});
		botonNave1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonNave1.setBounds(283, 679, 182, 55);
		add(botonNave1);
		
		JLabel labelNave1 = new JLabel("");
		labelNave1.setIcon(new ImageIcon(".\\images\\nave1.jpg"));
		labelNave1.setBounds(145, 29, 478, 640);
		add(labelNave1);
		
		JLabel labelNave2 = new JLabel("");
		labelNave2.setIcon(new ImageIcon(".\\images\\nave2.jpg"));
		labelNave2.setBounds(715, 29, 504, 640);
		add(labelNave2);
		
		JButton botonNave1_1 = new JButton("Elige esta nave");
		botonNave1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Nave disponible próximamente","Nave no disponible", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		botonNave1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		botonNave1_1.setBounds(876, 679, 182, 55);
		add(botonNave1_1);
	}
	
	
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		try {
			BufferedImage fondo=ImageIO.read(new File("./images/fondo.jpg"));
			g.drawImage(fondo, 0, 0, this);
			g.drawImage(fondo, 0, 0, this.getWidth(), this.getHeight(), new Color(0,0,0), null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}
