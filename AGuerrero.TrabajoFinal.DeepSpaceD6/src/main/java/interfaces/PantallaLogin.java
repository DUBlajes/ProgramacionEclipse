package interfaces;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaLogin extends JPanel {
	private JTextField campoUsuario;
	private JPasswordField campoPass;
	private Ventana ventana;
	
	
	public PantallaLogin(Ventana v) {
		this.ventana=v;
		setBackground(new Color(58, 148, 56));
		setLayout(null);
		
		
		
		JButton botonLogin = new JButton("Inicia Sesion");
		botonLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String usuario=campoUsuario.getText();
				String pass=new String(campoPass.getPassword());
				System.out.println(usuario+" : "+pass);
				ventana.cambiarAPantalla(PantallaEligeNave.class);
			}
		});
		botonLogin.setToolTipText("Pínchame para inciar sesión");
		botonLogin.setFont(new Font("Meethos", Font.PLAIN, 20));
		botonLogin.setForeground(new Color(255, 255, 255));
		botonLogin.setBackground(new Color(128, 0, 0));
		botonLogin.setBounds(78, 196, 148, 67);
		add(botonLogin);
		
		JButton botonRegistro = new JButton("Registrate");
		botonRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonRegistro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarAPantalla(PantallaRegistro.class);
			}
		});
		botonRegistro.setToolTipText("Pínchame para registrarte");
		botonRegistro.setForeground(Color.WHITE);
		botonRegistro.setFont(new Font("Meethos", Font.PLAIN, 23));
		botonRegistro.setBackground(new Color(128, 0, 255));
		botonRegistro.setBounds(236, 195, 148, 67);
		add(botonRegistro);
		
		campoUsuario = new JTextField();
		campoUsuario.setBounds(96, 57, 205, 35);
		add(campoUsuario);
		campoUsuario.setColumns(10);
		
		JLabel etiquetaUsuario = new JLabel("Correo electrónico");
		etiquetaUsuario.setBounds(96, 43, 205, 14);
		add(etiquetaUsuario);
		
		JLabel etiquetaContraseña = new JLabel("Contraseña");
		etiquetaContraseña.setBounds(96, 122, 205, 14);
		add(etiquetaContraseña);
		
		campoPass = new JPasswordField();
		campoPass.setBounds(96, 138, 205, 35);
		add(campoPass);
		
		JLabel labelImage = new JLabel("");
		try {
			BufferedImage imagen=ImageIO.read(new File(".\\images\\icono.jpg"));
			Image enIcono=imagen.getScaledInstance(256, 256, Image.SCALE_DEFAULT);
			labelImage.setIcon(new ImageIcon(enIcono));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		labelImage.setBounds(394, 23, 256, 256);
		add(labelImage);
	}


	
}
