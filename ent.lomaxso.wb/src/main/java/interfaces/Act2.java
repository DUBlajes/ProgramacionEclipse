package interfaces;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Enumeration;

public class Act2 extends JPanel {
	private JTextField nombreCategoria;
	private JTextField precioCategoria;
	private final ButtonGroup grupoCategoria = new ButtonGroup();
	private final ButtonGroup grupoIva = new ButtonGroup();

	public Act2(Frame f) {
		setLayout(null);

		JLabel lblTitle = new JLabel("ENTRADA DE DATOS DE PRODUCTOS");
		lblTitle.setBounds(91, 30, 248, 14);
		add(lblTitle);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 128));
		panel.setBounds(10, 63, 507, 280);
		add(panel);
		panel.setLayout(null);

		JLabel lblNCateoria = new JLabel("Nombre Categoría");
		lblNCateoria.setBounds(39, 31, 142, 14);
		panel.add(lblNCateoria);

		nombreCategoria = new JTextField();
		nombreCategoria.setBounds(172, 28, 169, 20);
		panel.add(nombreCategoria);
		nombreCategoria.setColumns(10);

		JCheckBox chckbxAplicaTasa = new JCheckBox("Aplica Tasa");
		chckbxAplicaTasa.setBounds(366, 27, 97, 23);
		panel.add(chckbxAplicaTasa);

		JLabel lblTipoCategora = new JLabel("Tipo Categoría");
		lblTipoCategora.setBounds(39, 60, 142, 14);
		panel.add(lblTipoCategora);

		JLabel lblPrecioCategora = new JLabel("Precio Categoría");
		lblPrecioCategora.setBounds(39, 85, 142, 14);
		panel.add(lblPrecioCategora);

		precioCategoria = new JTextField();
		precioCategoria.setColumns(10);
		precioCategoria.setBounds(172, 85, 119, 20);
		panel.add(precioCategoria);

		final JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Tipo 1", "Tipo 2 ", "Tipo 3" }));
		comboBox.setBounds(172, 56, 142, 22);
		panel.add(comboBox);

		JLabel lblCategoria = new JLabel("Categoría:");
		lblCategoria.setBounds(39, 128, 91, 14);
		panel.add(lblCategoria);

		JRadioButton rdbtnExtra = new JRadioButton("Extra");
		grupoCategoria.add(rdbtnExtra);
		rdbtnExtra.setBounds(130, 124, 109, 23);
		panel.add(rdbtnExtra);

		JRadioButton rdbtnPrimera = new JRadioButton("Primera");
		grupoCategoria.add(rdbtnPrimera);
		rdbtnPrimera.setBounds(130, 156, 109, 23);
		panel.add(rdbtnPrimera);

		JRadioButton rdbtnSegunda = new JRadioButton("Segunda");
		grupoCategoria.add(rdbtnSegunda);
		rdbtnSegunda.setBounds(260, 124, 109, 23);
		panel.add(rdbtnSegunda);

		JRadioButton rdbtnSuperExtra = new JRadioButton("Super Extra");
		grupoCategoria.add(rdbtnSuperExtra);
		rdbtnSuperExtra.setBounds(260, 156, 109, 23);
		panel.add(rdbtnSuperExtra);

		JLabel lblIva = new JLabel("IVA:");
		lblIva.setBounds(39, 198, 46, 14);
		panel.add(lblIva);

		JRadioButton rdbtn4 = new JRadioButton("4%");
		grupoIva.add(rdbtn4);
		rdbtn4.setBounds(106, 194, 55, 23);
		panel.add(rdbtn4);

		JRadioButton rdbtn10 = new JRadioButton("10%");
		grupoIva.add(rdbtn10);
		rdbtn10.setBounds(184, 194, 55, 23);
		panel.add(rdbtn10);

		JRadioButton rdbtn21 = new JRadioButton("21%");
		grupoIva.add(rdbtn21);
		rdbtn21.setBounds(259, 194, 55, 23);
		panel.add(rdbtn21);

		JButton btnVerDatos = new JButton("Ver datos tecleados");
		btnVerDatos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("SE HA PULSADO VER DATOS\nNombre Categoría: " + nombreCategoria.getText()
						+ "\nPrecio Categoría: " + comboBox.getSelectedItem() + "\nPrecio Categoría: "
						+ precioCategoria.getText() + "\nCategoría: " + getSelectedButtonText(grupoCategoria) + "\nIVA: " + getSelectedButtonText(grupoIva));
			}
		});
		btnVerDatos.setBounds(39, 236, 202, 23);
		panel.add(btnVerDatos);

		JButton btnLimpiarDatos = new JButton("Limpiar datos");
		btnLimpiarDatos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("SE HA PULSADO LIMPIAR DATOS");
				nombreCategoria.setText("");
				precioCategoria.setText("");
				grupoCategoria.clearSelection();
				grupoIva.clearSelection();
			}
		});
		;
		btnLimpiarDatos.setBounds(261, 236, 202, 23);
		panel.add(btnLimpiarDatos);
	} // constructor
	
	 public String getSelectedButtonText(ButtonGroup buttonGroup) {
	        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
	            AbstractButton button = buttons.nextElement();

	            if (button.isSelected()) {
	                return button.getText();
	            }
	        }

	        return null;
	    }
	
} // class
