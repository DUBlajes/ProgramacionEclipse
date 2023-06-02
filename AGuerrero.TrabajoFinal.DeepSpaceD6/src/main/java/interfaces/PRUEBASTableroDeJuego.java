package interfaces;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;

import clases.Cartas;
import clases.DadoAmenaza;
import clases.DadoTripulacion;
import clases.Nave;
import clases.ZCabina;
import clases.ZonasNave;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class PRUEBASTableroDeJuego extends JPanel {
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
	private JLabel tiradaAmenaza;
	private JButton botonPasarAAtaque;
	private JButton botonAsignar1;
	private JButton botonAsignar2;
	private JButton botonAsignar3;
	private JButton botonAsignar4;
	private JButton botonAsignar5;
	private JButton botonSacarCarta;
	private JButton botonVolver;
	private JTextArea textoCartas;
	private Nave navePrueba;
	private List<Integer> resultadosDados;
	private JTextArea resultadosTextArea;
	private List<JButton> botonesAsignar;
	private boolean boton3Usado;
	private int contadorBoton6;
	private HashMap<String, ZonasNave> zonasNave;
	private JTextArea textoZona1;
	private JTextArea textoZona2;
	private JTextArea textoZona3;
	private JTextArea textoZona4;
	private JTextArea textoZona5;
	JPanel panelActual;
	private byte valorAmenaza;
	private Cartas cartas;
	private JLabel labelEscudoNave;
	private JLabel labelVidaNave;

	public PRUEBASTableroDeJuego(Ventana v) {
		Nave navePrueba = new Nave("Nave 1", zonasNave, (byte) 4, (byte) 3);
		this.ventana = v;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel labelTablero = new JLabel("");
		labelTablero.setBorder(new LineBorder(new Color(0, 0, 0)));
		labelTablero.setBounds(200, 8, 568, 651);
		add(labelTablero);
		setImageLabel(labelTablero, "./images/tableroJuego.jpg");
		GridBagConstraints gbc_labelTablero = new GridBagConstraints();
		gbc_labelTablero.gridheight = 6;
		gbc_labelTablero.gridwidth = 7;
		gbc_labelTablero.insets = new Insets(0, 0, 5, 5);
		gbc_labelTablero.gridx = 1;
		gbc_labelTablero.gridy = 1;
		add(labelTablero, gbc_labelTablero);
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
