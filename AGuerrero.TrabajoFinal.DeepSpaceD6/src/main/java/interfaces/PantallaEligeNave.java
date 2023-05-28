package interfaces;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaEligeNave extends JPanel {
	private Ventana ventana;

	public PantallaEligeNave(Ventana v) {
		this.ventana = v;
		setLayout(null);
		
		JButton botonNave1 = new JButton("Elige esta nave");
		botonNave1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonNave1.setBounds(204, 575, 89, 23);
		add(botonNave1);
		
		JLabel labelNave1 = new JLabel("");
		labelNave1.setIcon(new ImageIcon("F:\\FP\\CENEC\\1er año\\Programacion\\Nuevos Workspaces\\ProgramacionEclipse\\AGuerrero.TrabajoFinal.DeepSpaceD6\\images\\nave1.jpg"));
		labelNave1.setBounds(10, 0, 478, 640);
		add(labelNave1);
		
		JLabel labelNave2 = new JLabel("");
		labelNave2.setIcon(new ImageIcon("F:\\FP\\CENEC\\1er año\\Programacion\\Nuevos Workspaces\\ProgramacionEclipse\\AGuerrero.TrabajoFinal.DeepSpaceD6\\images\\nave2.jpg"));
		labelNave2.setBounds(641, 11, 496, 628);
		add(labelNave2);
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
