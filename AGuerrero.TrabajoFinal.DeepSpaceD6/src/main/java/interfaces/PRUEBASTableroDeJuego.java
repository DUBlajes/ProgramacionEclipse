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
import clases.DadosApp;
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
	private JLabel tiradaDadoAmenaza;
	private JButton botonPasarAAtaque;
	private JButton botonAsignar1;
	private JButton botonAsignar2;
	private JButton botonAsignar3;
	private JButton botonAsignar4;
	private JButton botonAsignar5;
	private JButton botonVolver;
	private Nave navePrueba;
	private List<Integer> resultadosDados;
	private JTextArea resultadosTextArea;
	private List<JButton> botonesAsignar;
	private JTextArea textoCartas;
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
	private DadosApp dadosApp;
	private JButton botonSacarCarta;
	private JButton botonDadoAmenaza;
	
	
	public PRUEBASTableroDeJuego(Ventana v) {
		
		Nave navePrueba = new Nave("Nave 1", zonasNave, (byte) 4, (byte) 3);
		this.ventana = v;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 65, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 26, 50, 50, 50, 51, 0, 46, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);
		
		textoCartas= new JTextArea();
		GridBagConstraints gbc_textoCartas = new GridBagConstraints();
		gbc_textoCartas.insets = new Insets(0, 0, 5, 5);
		gbc_textoCartas.gridx = 1;
		gbc_textoCartas.gridy = 2;
		
		gbc_textoCartas.fill = GridBagConstraints.BOTH;
		add(textoCartas, gbc_textoCartas);
		textoCartas.setLineWrap(false);
		textoCartas.setEditable(false);
		
		
		JPanel panelAmenaza0 = new JPanel();
		panelAmenaza0.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		GridBagConstraints gbc_panelAmenaza0 = new GridBagConstraints();
		gbc_panelAmenaza0.gridheight = 2;
		gbc_panelAmenaza0.insets = new Insets(0, 0, 5, 5);
		gbc_panelAmenaza0.fill = GridBagConstraints.BOTH;
		gbc_panelAmenaza0.gridx = 1;
		gbc_panelAmenaza0.gridy = 3;
		add(panelAmenaza0, gbc_panelAmenaza0);

		
		JLabel labelTablero = new JLabel("");
		labelTablero.setBorder(new LineBorder(new Color(0, 0, 0), 23));
		labelTablero.setBounds(200, 8, 568, 651);
		add(labelTablero);
		setImageLabel(labelTablero, "./images/tableroJuego.jpg");
		GridBagConstraints gbc_labelTablero = new GridBagConstraints();
		gbc_labelTablero.gridheight = 8;
		gbc_labelTablero.gridwidth = 8;
		gbc_labelTablero.insets = new Insets(0, 0, 5, 5);
		gbc_labelTablero.gridx = 2;
		gbc_labelTablero.gridy = 3;
		add(labelTablero, gbc_labelTablero);
		setImageLabel(labelTablero, "./images/tableroJuego.jpg");
		
		JPanel panelAmenaza4 = new JPanel();
		panelAmenaza4.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_panelAmenaza4 = new GridBagConstraints();
		gbc_panelAmenaza4.insets = new Insets(0, 0, 5, 5);
		gbc_panelAmenaza4.gridx = 10;
		gbc_panelAmenaza4.gridy = 3;
		add(panelAmenaza4, gbc_panelAmenaza4);
		
		JPanel panelDadosTrip = new JPanel();
		panelDadosTrip.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_panelDadosTrip = new GridBagConstraints();
		gbc_panelDadosTrip.insets = new Insets(0, 0, 5, 5);
		gbc_panelDadosTrip.fill = GridBagConstraints.BOTH;
		gbc_panelDadosTrip.gridx = 1;
		gbc_panelDadosTrip.gridy = 5;
		add(panelDadosTrip, gbc_panelDadosTrip);
		
		JPanel panelAmenaza3 = new JPanel();
		panelAmenaza3.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_panelAmenaza3 = new GridBagConstraints();
		gbc_panelAmenaza3.insets = new Insets(0, 0, 5, 5);
		gbc_panelAmenaza3.gridx = 10;
		gbc_panelAmenaza3.gridy = 5;
		add(panelAmenaza3, gbc_panelAmenaza3);
		
		JButton dadoTripulacion = new JButton("Tirar dados tripulacion");
		dadoTripulacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dadosApp=new DadosApp();
				dadosApp.habilitarBotonesAtacar();
				dadosApp.setVisible(false);
				panelDadosTrip.removeAll();
				panelDadosTrip.add(dadosApp.getContentPane());
				panelDadosTrip.revalidate();
				panelDadosTrip.repaint();
				botonSacarCarta.setVisible(true);
				botonDadoAmenaza.setVisible(false);
				
			}
		});
		GridBagConstraints gbc_dadoTripulacion = new GridBagConstraints();
		gbc_dadoTripulacion.insets = new Insets(0, 0, 5, 5);
		gbc_dadoTripulacion.gridx = 1;
		gbc_dadoTripulacion.gridy = 6;
		add(dadoTripulacion, gbc_dadoTripulacion);
		
		
		botonSacarCarta = new JButton("Sacar Carta Amenaza");
		botonSacarCarta.setVisible(false);
		GridBagConstraints gbc_botonSacarCarta = new GridBagConstraints();
		gbc_botonSacarCarta.insets = new Insets(0, 0, 5, 5);
		gbc_botonSacarCarta.gridx = 1;
		gbc_botonSacarCarta.gridy = 7;
		add(botonSacarCarta, gbc_botonSacarCarta);
		
		JPanel panelAmenaza2 = new JPanel();
		panelAmenaza2.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_panelAmenaza2 = new GridBagConstraints();
		gbc_panelAmenaza2.insets = new Insets(0, 0, 5, 5);
		gbc_panelAmenaza2.gridx = 10;
		gbc_panelAmenaza2.gridy = 7;
		add(panelAmenaza2, gbc_panelAmenaza2);
		
		botonDadoAmenaza = new JButton("Tirar dado amenaza");
		botonDadoAmenaza.setVisible(false);
		botonDadoAmenaza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Random random = new Random();
                int resultado = random.nextInt(6) + 1;
                tiradaDadoAmenaza.setText("Dado de Amenaza: "+resultado);
                if(resultado==cartas.getDadoActivacion()) {
					cartas.Funcion();
					System.out.println("Puntos de Escudo: "+navePrueba.getPuntosEscudo());
				}
                	
                	
			}
		});
		GridBagConstraints gbc_botonDadoAmenaza = new GridBagConstraints();
		gbc_botonDadoAmenaza.insets = new Insets(0, 0, 5, 5);
		gbc_botonDadoAmenaza.gridx = 1;
		gbc_botonDadoAmenaza.gridy = 8;
		add(botonDadoAmenaza, gbc_botonDadoAmenaza);
		
		tiradaDadoAmenaza = new JLabel("New label");
		GridBagConstraints gbc_tiradaDadoAmenaza = new GridBagConstraints();
		gbc_tiradaDadoAmenaza.insets = new Insets(0, 0, 5, 5);
		gbc_tiradaDadoAmenaza.gridx = 1;
		gbc_tiradaDadoAmenaza.gridy = 10;
		add(tiradaDadoAmenaza, gbc_tiradaDadoAmenaza);
		
		JPanel panelAmenaza1 = new JPanel();
		panelAmenaza1.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_panelAmenaza1 = new GridBagConstraints();
		gbc_panelAmenaza1.insets = new Insets(0, 0, 5, 5);
		gbc_panelAmenaza1.gridx = 10;
		gbc_panelAmenaza1.gridy = 11;
		add(panelAmenaza1, gbc_panelAmenaza1);
		
		botonSacarCarta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//botonAmenaza.setVisible(true);
				try {
					// Establecer conexión con la base de datos
					Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/deepspaced6", "root",
							"Gv3rr3r0160294!");

					// Generar un número aleatorio entre 1 y 4
					Random r=new Random();
					byte numeroAleatorio =0;
							while(numeroAleatorio==0) {
								numeroAleatorio=(byte) r.nextInt(22);
							}
							

					// Crear la sentencia SQL
					String sql = "SELECT * FROM amenazas WHERE id = ?";

					// Preparar la sentencia SQL
					PreparedStatement statement = conn.prepareStatement(sql);
					statement.setInt(1, numeroAleatorio);

					// Ejecutar la consulta
					ResultSet resultSet = statement.executeQuery();
					byte accionQueRealiza = 0;
					String resultado=null;
					String colNombre=null;
					byte colAmenaza=0;
					byte colDadoActivacion=0;
					byte colDadoDesactivacion=0;
					// Obtener y mostrar los resultados en el JTextArea
					textoCartas.setText("");
					while (resultSet.next()) {
						colNombre=resultSet.getString("Nombre");
						colAmenaza=resultSet.getByte("ValorAmenaza");
						colDadoActivacion = resultSet.getByte("DadoActivacion");
						accionQueRealiza= resultSet.getByte("AccionQueRealiza");
						colDadoDesactivacion=resultSet.getByte("DadoDesactivacion");
						resultado=colNombre+"\nValor de Amenaza: "+colAmenaza+"\n Activación: "+colDadoActivacion;
						
						HashSet<Integer> valoresAmenazaOcupadosPanel1 = new HashSet<>();
						HashSet<Integer> valoresAmenazaOcupadosPanel2 = new HashSet<>();
						HashSet<Integer> valoresAmenazaOcupadosPanel3 = new HashSet<>();
						HashSet<Integer> valoresAmenazaOcupadosPanel4 = new HashSet<>();
						
						valorAmenaza=resultSet.getByte("ValorAmenaza");
						
						
					}
					
					String consulta2 = "SELECT Funcion FROM accionquerealiza WHERE id = " + accionQueRealiza;
					PreparedStatement statement2 = conn.prepareStatement(consulta2);
					ResultSet resultadoFuncion = statement2.executeQuery();
					String accionString = null;
					while (resultadoFuncion.next()) {
						accionString=resultadoFuncion.getString("Funcion");
					}
					resultado+="\nAcción que realiza: "+"\n"+accionString;
					textoCartas.append(resultado + "\n");
					
						switch(valorAmenaza) {
						case 0:
							panelAmenaza0.add(textoCartas);
							break;
						case 1:
							panelAmenaza1.add(textoCartas);
							break;
						case 2:
							panelAmenaza2.add(textoCartas);
							break;
						case 3:
							panelAmenaza3.add(textoCartas);
							break;
						case 4:
							panelAmenaza4.add(textoCartas);
							break;
						}
					
						cartas=new Cartas(colNombre, navePrueba, colAmenaza, colDadoActivacion, accionString, accionQueRealiza, colDadoDesactivacion);
					// Cerrar la conexión y liberar recursos
					resultSet.close();
					statement.close();
					conn.close();
				} catch (SQLException ex) {
					ex.printStackTrace();
				}
				botonDadoAmenaza.setVisible(true);
			}
		});


	}

	private void setImageLabel(JLabel labelTablero, String raiz) {
		ImageIcon image = new ImageIcon(raiz);
		Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelTablero.getWidth(), labelTablero.getHeight(),
				Image.SCALE_SMOOTH));

		labelTablero.setIcon(icon);
		this.repaint();

	}
}
