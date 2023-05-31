package interfaces;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;

import clases.Usuario;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class PantallaRegistro extends JPanel{
	
	private Ventana ventana;
	private JTextField campoNombre;
	private JTextField campoEmail;
	private JPasswordField campoPass;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	public PantallaRegistro(Ventana v) {
		setBackground(new Color(0, 0, 0));
		this.ventana=v;
		v.setExtendedState(JFrame.MAXIMIZED_BOTH);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel labelTitulo = new JLabel("Regístrate");
		labelTitulo.setForeground(new Color(255, 255, 255));
		labelTitulo.setFont(new Font("Tahoma", Font.BOLD, 30));
		GridBagConstraints gbc_labelTitulo = new GridBagConstraints();
		gbc_labelTitulo.insets = new Insets(0, 0, 5, 5);
		gbc_labelTitulo.gridx = 2;
		gbc_labelTitulo.gridy = 0;
		add(labelTitulo, gbc_labelTitulo);
		
		JLabel labelEmail = new JLabel("Email");
		labelEmail.setForeground(new Color(255, 255, 255));
		labelEmail.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_labelEmail = new GridBagConstraints();
		gbc_labelEmail.anchor = GridBagConstraints.WEST;
		gbc_labelEmail.insets = new Insets(0, 0, 5, 5);
		gbc_labelEmail.gridx = 1;
		gbc_labelEmail.gridy = 1;
		add(labelEmail, gbc_labelEmail);
		
		campoEmail = new JTextField();
		GridBagConstraints gbc_campoEmail = new GridBagConstraints();
		gbc_campoEmail.gridwidth = 2;
		gbc_campoEmail.insets = new Insets(0, 0, 5, 5);
		gbc_campoEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_campoEmail.gridx = 2;
		gbc_campoEmail.gridy = 1;
		add(campoEmail, gbc_campoEmail);
		campoEmail.setColumns(10);
		
		JLabel labelNombre = new JLabel("Nombre");
		labelNombre.setForeground(new Color(255, 255, 255));
		labelNombre.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_labelNombre = new GridBagConstraints();
		gbc_labelNombre.anchor = GridBagConstraints.WEST;
		gbc_labelNombre.insets = new Insets(0, 0, 5, 5);
		gbc_labelNombre.gridx = 1;
		gbc_labelNombre.gridy = 2;
		add(labelNombre, gbc_labelNombre);
		
		campoNombre = new JTextField();
		GridBagConstraints gbc_campoNombre = new GridBagConstraints();
		gbc_campoNombre.gridwidth = 2;
		gbc_campoNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_campoNombre.insets = new Insets(0, 0, 5, 5);
		gbc_campoNombre.gridx = 2;
		gbc_campoNombre.gridy = 2;
		add(campoNombre, gbc_campoNombre);
		campoNombre.setColumns(10);
		
		JLabel labelPass = new JLabel("Contraseña");
		labelPass.setForeground(new Color(255, 255, 255));
		labelPass.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_labelPass = new GridBagConstraints();
		gbc_labelPass.anchor = GridBagConstraints.WEST;
		gbc_labelPass.insets = new Insets(0, 0, 5, 5);
		gbc_labelPass.gridx = 1;
		gbc_labelPass.gridy = 3;
		add(labelPass, gbc_labelPass);
		
		campoPass = new JPasswordField();
		GridBagConstraints gbc_campoPass = new GridBagConstraints();
		gbc_campoPass.gridwidth = 2;
		gbc_campoPass.insets = new Insets(0, 0, 5, 5);
		gbc_campoPass.fill = GridBagConstraints.HORIZONTAL;
		gbc_campoPass.gridx = 2;
		gbc_campoPass.gridy = 3;
		add(campoPass, gbc_campoPass);
		
		JLabel labelGenero = new JLabel("Género");
		labelGenero.setForeground(new Color(255, 255, 255));
		labelGenero.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_labelGenero = new GridBagConstraints();
		gbc_labelGenero.insets = new Insets(0, 0, 5, 5);
		gbc_labelGenero.gridx = 2;
		gbc_labelGenero.gridy = 5;
		add(labelGenero, gbc_labelGenero);
		
		JRadioButton radioHombre = new JRadioButton("Hombre");
		radioHombre.setForeground(new Color(255, 255, 255));
		radioHombre.setBackground(new Color(0, 0, 0));
		buttonGroup.add(radioHombre);
		GridBagConstraints gbc_radioHombre = new GridBagConstraints();
		gbc_radioHombre.anchor = GridBagConstraints.EAST;
		gbc_radioHombre.fill = GridBagConstraints.VERTICAL;
		gbc_radioHombre.insets = new Insets(0, 0, 5, 5);
		gbc_radioHombre.gridx = 1;
		gbc_radioHombre.gridy = 6;
		add(radioHombre, gbc_radioHombre);
		
		JRadioButton radioMujer = new JRadioButton("Mujer");
		radioMujer.setBackground(new Color(0, 0, 0));
		radioMujer.setForeground(new Color(255, 255, 255));
		buttonGroup.add(radioMujer);
		GridBagConstraints gbc_radioMujer = new GridBagConstraints();
		gbc_radioMujer.insets = new Insets(0, 0, 5, 5);
		gbc_radioMujer.gridx = 2;
		gbc_radioMujer.gridy = 6;
		add(radioMujer, gbc_radioMujer);
		
		JRadioButton radioOtro = new JRadioButton("Otro");
		radioOtro.setBackground(new Color(0, 0, 0));
		radioOtro.setForeground(new Color(255, 255, 255));
		buttonGroup.add(radioOtro);
		GridBagConstraints gbc_radioOtro = new GridBagConstraints();
		gbc_radioOtro.anchor = GridBagConstraints.WEST;
		gbc_radioOtro.insets = new Insets(0, 0, 5, 5);
		gbc_radioOtro.gridx = 3;
		gbc_radioOtro.gridy = 6;
		add(radioOtro, gbc_radioOtro);
		
		JButton botonRegistrar = new JButton("Regístrate");
		botonRegistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String email=campoEmail.getText().toString();
				String nombre=campoNombre.getText();
				String pass=new String(campoPass.getPassword());
				try {
					new Usuario(email, nombre, pass);
					JOptionPane.showMessageDialog(ventana, "Registrado correctamente","Éxito al registrar",JOptionPane.INFORMATION_MESSAGE);
				} catch(SQLIntegrityConstraintViolationException e2) {
					JOptionPane.showMessageDialog(ventana, "El email introducido ya existe","Error al registrar",JOptionPane.ERROR_MESSAGE);
				}catch (SQLException e1) {
					JOptionPane.showMessageDialog(ventana, e1.getMessage(),"No se puede conectar a la base de datos",JOptionPane.ERROR_MESSAGE);
				}
				
				
				
			}
		});
		botonRegistrar.setFont(new Font("Tahoma", Font.BOLD, 20));
		botonRegistrar.setForeground(new Color(255, 255, 255));
		botonRegistrar.setBackground(new Color(0, 0, 0));
		GridBagConstraints gbc_botonRegistrar = new GridBagConstraints();
		gbc_botonRegistrar.fill = GridBagConstraints.BOTH;
		gbc_botonRegistrar.insets = new Insets(0, 0, 5, 5);
		gbc_botonRegistrar.gridx = 2;
		gbc_botonRegistrar.gridy = 8;
		add(botonRegistrar, gbc_botonRegistrar);
		
		JButton botonLimpiar = new JButton("Limpiar Formulario");
		botonLimpiar.setBackground(new Color(0, 0, 0));
		botonLimpiar.setForeground(new Color(255, 255, 255));
		botonLimpiar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				campoNombre.setText("");
				campoEmail.setText("");
				campoPass.setText("");
				buttonGroup.clearSelection();
			}
		});
		botonLimpiar.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_botonLimpiar = new GridBagConstraints();
		gbc_botonLimpiar.fill = GridBagConstraints.BOTH;
		gbc_botonLimpiar.insets = new Insets(0, 0, 5, 5);
		gbc_botonLimpiar.gridx = 2;
		gbc_botonLimpiar.gridy = 10;
		add(botonLimpiar, gbc_botonLimpiar);
		
		JButton botonAtras = new JButton("Volver atrás");
		botonAtras.setBackground(new Color(0, 0, 0));
		botonAtras.setForeground(new Color(255, 255, 255));
		botonAtras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarAPantalla(PantallaLogin.class);
			}
		});
		botonAtras.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_botonAtras = new GridBagConstraints();
		gbc_botonAtras.anchor = GridBagConstraints.SOUTH;
		gbc_botonAtras.insets = new Insets(0, 0, 5, 5);
		gbc_botonAtras.gridx = 1;
		gbc_botonAtras.gridy = 12;
		add(botonAtras, gbc_botonAtras);
	}
	
}
