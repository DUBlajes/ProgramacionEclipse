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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class PantallaEligeNave extends JPanel {
	private Ventana ventana;

	public PantallaEligeNave(Ventana v) {
		this.ventana = v;
		v.setSize(1920, 1080);
		v.setExtendedState(JFrame.MAXIMIZED_BOTH);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {30, 300, 300, 300, 30};
		gridBagLayout.rowHeights = new int[] {30, 640, 30, 0, 30, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 1.0};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel labelNave1 = new JLabel("");
		labelNave1.setIcon(new ImageIcon(".\\images\\nave1.jpg"));
		GridBagConstraints gbc_labelNave1 = new GridBagConstraints();
		gbc_labelNave1.insets = new Insets(0, 0, 5, 5);
		gbc_labelNave1.gridx = 1;
		gbc_labelNave1.gridy = 1;
		add(labelNave1, gbc_labelNave1);
		
		JLabel labelNave2 = new JLabel("");
		labelNave2.setIcon(new ImageIcon(".\\images\\nave2.jpg"));
		GridBagConstraints gbc_labelNave2 = new GridBagConstraints();
		gbc_labelNave2.insets = new Insets(0, 0, 5, 5);
		gbc_labelNave2.gridx = 3;
		gbc_labelNave2.gridy = 1;
		add(labelNave2, gbc_labelNave2);
		
		JButton botonNave1_1 = new JButton("Elige esta nave");
		botonNave1_1.setBackground(new Color(12, 0, 64));
		botonNave1_1.setForeground(new Color(255, 255, 255));
		botonNave1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Nave disponible próximamente","Nave no disponible", JOptionPane.ERROR_MESSAGE);
			}
		});
		
		JButton botonNave1 = new JButton("Elige esta nave");
		botonNave1.setBackground(new Color(12, 0, 64));
		botonNave1.setForeground(new Color(255, 255, 255));
		botonNave1.setFont(new Font("Venus Plant", Font.PLAIN, 20));
		botonNave1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarAPantalla(PRUEBASTableroDeJuego.class);
			}
		});
		botonNave1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_botonNave1 = new GridBagConstraints();
		gbc_botonNave1.insets = new Insets(0, 0, 5, 5);
		gbc_botonNave1.gridx = 1;
		gbc_botonNave1.gridy = 2;
		add(botonNave1, gbc_botonNave1);
		botonNave1_1.setFont(new Font("Venus Plant", Font.PLAIN, 20));
		GridBagConstraints gbc_botonNave1_1 = new GridBagConstraints();
		gbc_botonNave1_1.insets = new Insets(0, 0, 5, 5);
		gbc_botonNave1_1.gridx = 3;
		gbc_botonNave1_1.gridy = 2;
		add(botonNave1_1, gbc_botonNave1_1);
		
		JButton botonListado = new JButton("Usuarios Logueados");
		botonListado.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarAPantalla(PantallaListado.class);
			}
		});
		GridBagConstraints gbc_botonListado = new GridBagConstraints();
		gbc_botonListado.insets = new Insets(0, 0, 5, 5);
		gbc_botonListado.gridx = 2;
		gbc_botonListado.gridy = 3;
		add(botonListado, gbc_botonListado);
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
