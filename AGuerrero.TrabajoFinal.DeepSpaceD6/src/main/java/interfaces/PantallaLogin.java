package interfaces;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JTextField;

import clases.Usuario;
import excepciones.PassInvalidaException;
import excepciones.UsuarioNoExisteException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class PantallaLogin extends JPanel {
	private JTextField campoUsuario;
	private Ventana ventana;
	private JPasswordField campoPass;
	
	
	public PantallaLogin(Ventana v) {
		this.ventana=v;
		v.setExtendedState(JFrame.MAXIMIZED_BOTH);
		setBackground(new Color(170, 162, 163));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {30, 150, 150, 150, 30};
		gridBagLayout.rowHeights = new int[] {30, 50, 50, 50, 50, 50, 50, 50, 50, 50, 30};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 1.0};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		
		
		JButton botonLogin = new JButton("Inicia Sesion");
		botonLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String usuario=campoUsuario.getText();
				String pass=new String(campoPass.getPassword());
				System.out.println(usuario+" : "+pass);
				try {
					ventana.usuarioLogado=new Usuario(usuario, pass);
					JOptionPane.showMessageDialog(ventana, "Te doy la bienvenida, "+ventana.usuarioLogado.getNick(),"Éxito al iniciar sesión",JOptionPane.INFORMATION_MESSAGE);
					ventana.cambiarAPantalla(PantallaEligeNave.class);
				} catch (UsuarioNoExisteException e1) {
					JOptionPane.showMessageDialog(ventana, "El usuario introducido no existe","Error al iniciar sesión",JOptionPane.ERROR_MESSAGE);
				} catch (PassInvalidaException e1) {
					JOptionPane.showMessageDialog(ventana, "La contraseña introducida no es correcta","Error al iniciar sesión",JOptionPane.ERROR_MESSAGE);
				} catch (SQLException e1) {
					JOptionPane.showMessageDialog(ventana, e1.getMessage(),"No se puede conectar a la base de datos",JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		
		JLabel labelTitulo = new JLabel("Deep Space D-6");
		labelTitulo.setFont(new Font("Venus Plant", Font.PLAIN, 25));
		GridBagConstraints gbc_labelTitulo = new GridBagConstraints();
		gbc_labelTitulo.fill = GridBagConstraints.HORIZONTAL;
		gbc_labelTitulo.insets = new Insets(0, 0, 5, 5);
		gbc_labelTitulo.gridx = 2;
		gbc_labelTitulo.gridy = 2;
		add(labelTitulo, gbc_labelTitulo);
		
		JLabel etiquetaUsuario = new JLabel("Correo electrónico");
		etiquetaUsuario.setFont(new Font("Tahoma", Font.PLAIN, 19));
		GridBagConstraints gbc_etiquetaUsuario = new GridBagConstraints();
		gbc_etiquetaUsuario.fill = GridBagConstraints.VERTICAL;
		gbc_etiquetaUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_etiquetaUsuario.gridx = 1;
		gbc_etiquetaUsuario.gridy = 4;
		add(etiquetaUsuario, gbc_etiquetaUsuario);
		
		campoUsuario = new JTextField();
		GridBagConstraints gbc_campoUsuario = new GridBagConstraints();
		gbc_campoUsuario.fill = GridBagConstraints.BOTH;
		gbc_campoUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_campoUsuario.gridx = 2;
		gbc_campoUsuario.gridy = 4;
		add(campoUsuario, gbc_campoUsuario);
		campoUsuario.setColumns(10);
		
		JLabel labelPass = new JLabel("Contraseña");
		labelPass.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_labelPass = new GridBagConstraints();
		gbc_labelPass.fill = GridBagConstraints.VERTICAL;
		gbc_labelPass.insets = new Insets(0, 0, 5, 5);
		gbc_labelPass.gridx = 1;
		gbc_labelPass.gridy = 5;
		add(labelPass, gbc_labelPass);
		
		campoPass = new JPasswordField();
		GridBagConstraints gbc_campoPass = new GridBagConstraints();
		gbc_campoPass.insets = new Insets(0, 0, 5, 5);
		gbc_campoPass.fill = GridBagConstraints.BOTH;
		gbc_campoPass.gridx = 2;
		gbc_campoPass.gridy = 5;
		add(campoPass, gbc_campoPass);
		botonLogin.setToolTipText("Pínchame para inciar sesión");
		botonLogin.setFont(new Font("Venus Plant", Font.PLAIN, 15));
		botonLogin.setForeground(new Color(255, 255, 255));
		botonLogin.setBackground(new Color(128, 0, 0));
		GridBagConstraints gbc_botonLogin = new GridBagConstraints();
		gbc_botonLogin.fill = GridBagConstraints.BOTH;
		gbc_botonLogin.insets = new Insets(0, 0, 5, 5);
		gbc_botonLogin.gridx = 1;
		gbc_botonLogin.gridy = 8;
		add(botonLogin, gbc_botonLogin);
		
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
		botonRegistro.setFont(new Font("Venus Plant", Font.PLAIN, 15));
		botonRegistro.setBackground(new Color(128, 0, 255));
		GridBagConstraints gbc_botonRegistro = new GridBagConstraints();
		gbc_botonRegistro.fill = GridBagConstraints.BOTH;
		gbc_botonRegistro.insets = new Insets(0, 0, 5, 5);
		gbc_botonRegistro.gridx = 3;
		gbc_botonRegistro.gridy = 8;
		add(botonRegistro, gbc_botonRegistro);
		try {
			BufferedImage imagen=ImageIO.read(new File(".\\images\\icono.jpg"));
			Image enIcono=imagen.getScaledInstance(256, 256, Image.SCALE_DEFAULT);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}


	
}
