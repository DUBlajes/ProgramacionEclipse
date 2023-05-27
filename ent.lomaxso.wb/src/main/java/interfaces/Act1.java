package interfaces;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Act1 extends JPanel {
	
	

	private JTextField txtCod;
	private JTextField txtNombre;
	private JTextField txtLocalidad;
	private JButton btnLimpiarDatos;
	private JButton btnInsertarDatos;
	private final ButtonGroup buttonGroup = new ButtonGroup();

public Act1( Frame f) {
		
	this.setBounds(26, 25, 564, 380);
	this.setLayout(null);

	JLabel lblNewLabel = new JLabel("DATOS DE DEPARTAMENTO");
	lblNewLabel.setBounds(165, 5, 190, 19);
	lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
	this.add(lblNewLabel);

	JLabel lblNewLabel_1 = new JLabel("Código Departamento");
	lblNewLabel_1.setBounds(25, 68, 169, 13);
	this.add(lblNewLabel_1);

	txtCod = new JTextField();
	txtCod.setBounds(204, 65, 96, 19);
	this.add(txtCod);
	txtCod.setColumns(10);

	JLabel lblNewLabel_1_1 = new JLabel("Nombre Departamento");
	lblNewLabel_1_1.setBounds(25, 101, 169, 13);
	this.add(lblNewLabel_1_1);

	JLabel lblNewLabel_1_2 = new JLabel("Localidad Departamento");
	lblNewLabel_1_2.setBounds(25, 134, 169, 13);
	this.add(lblNewLabel_1_2);

	txtNombre = new JTextField();
	txtNombre.setColumns(10);
	txtNombre.setBounds(204, 98, 135, 19);
	this.add(txtNombre);

	txtLocalidad = new JTextField();
	txtLocalidad.setColumns(10);
	txtLocalidad.setBounds(204, 131, 135, 19);
	this.add(txtLocalidad);

	JRadioButton rdbtnTecnologia = new JRadioButton("Tecnologia");
	buttonGroup.add(rdbtnTecnologia);
	rdbtnTecnologia.setBounds(25, 218, 103, 21);
	this.add(rdbtnTecnologia);

	JRadioButton rdbtnInformtica = new JRadioButton("Informática");
	buttonGroup.add(rdbtnInformtica);
	rdbtnInformtica.setBounds(25, 241, 103, 21);
	this.add(rdbtnInformtica);

	ButtonModel informatica = rdbtnInformtica.getModel();
	ButtonModel tecnologia = rdbtnTecnologia.getModel();
	if (buttonGroup.getSelection() != null) {

		if (buttonGroup.getSelection().equals(informatica))
			System.out.println("Pulsaste informática");
		if (buttonGroup.getSelection().equals(tecnologia))
			System.out.println("Pulsaste tecnología");
	}

	JCheckBox chckbSiCheckBox = new JCheckBox("Si");
	chckbSiCheckBox.setBounds(142, 218, 52, 21);
	this.add(chckbSiCheckBox);

	if (chckbSiCheckBox.isSelected()) {
		System.out.println("Has elegido sí");
	}

	final JComboBox comboBox = new JComboBox();
	comboBox.setModel(new DefaultComboBoxModel(new String[] { "Italia", "Francia", "España" }));
	comboBox.setBounds(219, 219, 81, 19);
	this.add(comboBox);

	JTextArea txtrPrimeraLineaSegunda = new JTextArea();
	txtrPrimeraLineaSegunda.setEditable(false);
	txtrPrimeraLineaSegunda.setText("\r\nPrimera Linea\r\n\r\nSegunda Linea\r\n");
	txtrPrimeraLineaSegunda.setText("Primera Linea");
	txtrPrimeraLineaSegunda.append("\n Segunda Linea \n");
	txtrPrimeraLineaSegunda.setBounds(25, 164, 330, 48);
	this.add(txtrPrimeraLineaSegunda);
	btnLimpiarDatos = new JButton("Limpiar Datos");
	btnLimpiarDatos.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			System.out.println("Se ha pulsado el botón limpiar");
			txtCod.setText("");
			txtNombre.setText("");
			txtLocalidad.setText("");
			buttonGroup.clearSelection();
			
		} // action
	}); // listener
	btnLimpiarDatos.setBounds(74, 333, 114, 21);
	this.add(btnLimpiarDatos);

	btnInsertarDatos = new JButton("Insertar Datos");
	btnInsertarDatos.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			System.out.println("SE HA PULSADO EL BOTÓN INSERTAR");
			System.out.println("Codigo Tecleado: " + txtCod.getText());
			System.out.println("Nombre Tecleado: " + txtNombre.getText());
			System.out.println("Localidad Tecleada: " + txtLocalidad.getText());

			System.out.println("Posición: " + comboBox.getSelectedIndex());
			System.out.println("Contenido: " + comboBox.getSelectedItem());
		} // action
	}); // listener
	btnInsertarDatos.setBounds(263, 333, 114, 21);
	this.add(btnInsertarDatos);
	
		JScrollBar scrollBar = new JScrollBar();
		add(scrollBar);
		scrollBar.setBounds(338, 164, 17, 48);
	
}
	
} // class
