package ventanas;

import java.awt.EventQueue;
import javax.swing.ButtonModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana1 extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtCod;
	private JTextField txtNombre;
	private JTextField txtLocalidad;
	private JCheckBox checkboxSi;
	private JComboBox comboBox;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana1 frame = new Ventana1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	JRadioButton tec = new JRadioButton("Tecnologia");
	JRadioButton inf = new JRadioButton("Informática");

	/**
	 * Create the frame.
	 */
	public Ventana1() {
		setTitle("Prueba de Ventana");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 373);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textArea = new JTextArea();
		textArea.setBounds(51, 158, 210, 36);
		contentPane.add(textArea);
		textArea.setText("");
		textArea.setText("Primera Linea");
		textArea.append("\n Segunda Linea \n");
		
		txtCod = new JTextField();
		txtCod.setBounds(212, 41, 86, 20);
		contentPane.add(txtCod);
		txtCod.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(212, 83, 124, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtLocalidad = new JTextField();
		txtLocalidad.setBounds(212, 130, 124, 20);
		contentPane.add(txtLocalidad);
		txtLocalidad.setColumns(10);
		
		lblNewLabel = new JLabel("Código departamento");
		lblNewLabel.setBounds(51, 41, 124, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Nombre departamento");
		lblNewLabel_1.setBounds(51, 83, 124, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Localidad departamento");
		lblNewLabel_2.setBounds(51, 130, 124, 14);
		contentPane.add(lblNewLabel_2);
		
		checkboxSi = new JCheckBox("Si");
		checkboxSi.setBounds(175, 201, 36, 23);
		contentPane.add(checkboxSi);
		
		JButton botonLimpiarDatos = new JButton("Limpiar Datos");
		botonLimpiarDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Se ha pulsado el botón limpiar");
				txtCod.setText("");
				txtNombre.setText("");
				txtLocalidad.setText("");

			}
		});
		botonLimpiarDatos.setBounds(86, 284, 109, 23);
		contentPane.add(botonLimpiarDatos);
		
		JButton botonInsertarDatos = new JButton("Insertar Datos");
		botonInsertarDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("SE HA PULSADO EL BOTÓN INSERTAR");
				System.out.println("Codigo Tecleado: "+txtCod.getText());
				System.out.println("Nombre Tecleado: "+txtNombre.getText());
				System.out.println("Localidad Tecleada: "+txtLocalidad.getText());
				System.out.println("Posición" + comboBox.getSelectedIndex());
				System.out.println("Contenido" + comboBox.getSelectedItem());
				ButtonModel informatica =inf.getModel();
				ButtonModel tecnologia =tec.getModel();
				if (buttonGroup.getSelection()!=null)
				{
				
				if (buttonGroup.getSelection().equals(informatica))
					System.out.println("Pulsaste informática");
				if (buttonGroup.getSelection().equals(tecnologia))
					System.out.println("Pulsaste tecnología");			
				}

//Componente Jcheckbox

				if (checkboxSi.isSelected()) {
					System.out.println("Has elegido sí");
				}


			}
		});
		botonInsertarDatos.setBounds(375, 284, 148, 23);
		contentPane.add(botonInsertarDatos);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Italia", "Francia", "España"}));
		comboBox.setBounds(342, 159, 124, 22);
		contentPane.add(comboBox);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(51, 158, 210, 32);
		contentPane.add(scrollPane);


		buttonGroup.add(tec);
		tec.setBounds(41, 201, 109, 23);
		contentPane.add(tec);
		
		buttonGroup.add(inf);
		inf.setBounds(42, 233, 109, 23);
		contentPane.add(inf);

		
	}

}
