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
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;

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

	public TableroDeJuego(Ventana v) {
		Nave navePrueba=new Nave("Nave 1", zonasNave, (byte)4, (byte)3);
		this.ventana = v;
		v.setSize(1440, 900);
		setLayout(null);
		
		labelEscudoNave = new JLabel("Puntos de Escudo: "+navePrueba.getPuntosEscudo());
		labelEscudoNave.setBounds(288, 154, 132, 14);
		add(labelEscudoNave);
		
		labelVidaNave = new JLabel("Puntos de vida: "+navePrueba.getPuntosVida());
		labelVidaNave.setBounds(300, 129, 132, 14);
		add(labelVidaNave);
		
		textoCartas = new JTextArea();
		textoCartas.setBounds(51, 16, 242, 100);
		textoCartas.setEditable(false);
		add(textoCartas);

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
		
		JPanel panelAmenaza0 = new JPanel();
		panelAmenaza0.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelAmenaza0.setBounds(51, 16, 242, 100);
		add(panelAmenaza0);
		panelAmenaza0.setLayout(null);

		JPanel panelAmenaza4 = new JPanel();
		panelAmenaza4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelAmenaza4.setBounds(1078, 86, 242, 130);
		add(panelAmenaza4);
		panelAmenaza4.setLayout(null);
		
		JPanel panelAmenaza3 = new JPanel();
		panelAmenaza3.setBounds(1078, 230, 242, 130);
		add(panelAmenaza3);
		panelAmenaza3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelAmenaza3.setLayout(null);

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
		btnAtacar4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valorAmenaza=(byte) (valorAmenaza-1);
				panelAmenaza4.revalidate();
				panelAmenaza4.repaint();

			}
		});
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
				byte resultado = (byte)dadoAmenaza.lanzarDado();
				tiradaAmenaza.setText("Dado de Amenaza: "+resultado);
				if(resultado==cartas.getDadoActivacion()) {
					cartas.Funcion();
					System.out.println("Puntos de Escudo: "+navePrueba.getPuntosEscudo());
				}
				labelEscudoNave.setText("Puntos de Escudo: "+navePrueba.getPuntosEscudo());
				labelVidaNave.setText("Puntos de vida: "+navePrueba.getPuntosVida());
			}
		});
		botonAmenaza.setForeground(new Color(0, 0, 0));
		botonAmenaza.setBounds(21, 480, 70, 70);
		panelAcciones.add(botonAmenaza);

		botonAsignar1 = new JButton("Asignar a zona 1");
		botonAsignar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//nave.tirarDadoDeNuevo();
				String resultado= ("\nTira de nuevo los dados");
				textoZona1.append(resultado);
			}
		});
		botonAsignar1.setVisible(false);
		botonAsignar1.setBounds(66, 106, 133, 45);
		panelAcciones.add(botonAsignar1);

		botonAsignar2 = new JButton("Asignar a zona 2");
		botonAsignar2.setVisible(false);
		botonAsignar2.setBounds(66, 174, 133, 45);
		panelAcciones.add(botonAsignar2);

		botonAsignar3 = new JButton("Asignar a zona 3");
		botonAsignar3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//nave.recuperarBloqueados();
				//nave.recuperarEnfermos();
				String resultado= ("\nDados bloqueados"+ "\ny enfermos recuperados");
				textoZona3.append(resultado + "\n");
			}
		});
		botonAsignar3.setVisible(false);
		botonAsignar3.setBounds(66, 240, 133, 45);
		panelAcciones.add(botonAsignar3);

		botonAsignar4 = new JButton("Asignar a zona 4");
		botonAsignar4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				navePrueba.recargarEscudos();
				String resultado= ("\nEscudos recargados."+ "\nPuntos de escudo: ");
				textoZona4.append(resultado + navePrueba.getPuntosEscudo());
				
			}
		});
		botonAsignar4.setVisible(false);
		botonAsignar4.setBounds(66, 295, 133, 45);
		panelAcciones.add(botonAsignar4);

		botonAsignar5 = new JButton("Asignar a zona 5");
		botonAsignar5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				navePrueba.reparacion();
				String resultado= ("\nVida recuperada en 1 punto."+"\nTotal de puntos de vida: ");
				textoZona5.append(resultado + "\n"+navePrueba.getPuntosVida());
			}
		});
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
				//nave.atacar();
				
				
			}
		});
		botonSacarCarta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botonAmenaza.setVisible(true);
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
			}
		});
		botonAsignar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botonPasarAAtaque.setVisible(true);
				//nave.tirarDadoDeNuevo();
				String resultado= ("\nPuntos de ataque: 1");
				textoZona2.append(resultado);

			}
		});



		tiradaDadosTripulantes = new JLabel("Resultados tiradas");
		tiradaDadosTripulantes.setBounds(95, 114, 277, 45);
		add(tiradaDadosTripulantes);
		
		textoZona1 = new JTextArea();
		textoZona1.setLineWrap(true);
		textoZona1.setBounds(654, 273, 201, 73);
		add(textoZona1);
		
		textoZona2 = new JTextArea();
		textoZona2.setLineWrap(true);
		textoZona2.setBounds(654, 370, 201, 73);
		add(textoZona2);
		
		textoZona3 = new JTextArea();
		textoZona3.setLineWrap(true);
		textoZona3.setBounds(654, 454, 201, 73);
		add(textoZona3);
		
		textoZona4 = new JTextArea();
		textoZona4.setLineWrap(true);
		textoZona4.setBounds(654, 547, 201, 73);
		add(textoZona4);
		
		textoZona5 = new JTextArea();
		textoZona5.setLineWrap(true);
		textoZona5.setBounds(654, 631, 201, 73);
		add(textoZona5);
		JLabel labelTablero = new JLabel("");
		labelTablero.setBorder(new LineBorder(new Color(0, 0, 0)));
		labelTablero.setBounds(400, 16, 668, 751);
		add(labelTablero);
		setImageLabel(labelTablero, "./images/tableroJuego.jpg");
		
		tiradaAmenaza = new JLabel("Dado de Amenaza: ");
		tiradaAmenaza.setBounds(95, 139, 277, 45);
		add(tiradaAmenaza);
	}

	private void setImageLabel(JLabel labelTablero, String raiz) {
		ImageIcon image = new ImageIcon(raiz);
		Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelTablero.getWidth(), labelTablero.getHeight(),
				Image.SCALE_SMOOTH));

		labelTablero.setIcon(icon);
		this.repaint();

	}
}
