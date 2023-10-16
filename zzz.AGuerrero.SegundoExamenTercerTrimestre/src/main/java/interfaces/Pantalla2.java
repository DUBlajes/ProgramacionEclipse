package interfaces;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pantalla2 extends JPanel {
	private Pantalla1 p1;
	private Ventana ventana;
	private int suma;
	private JLabel labelFecha;
	
	public Pantalla2(Ventana v) {
		this.suma=suma;
		this.ventana=v;
		this.p1=p1;
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JButton botonAtras = new JButton("Atrás");
		botonAtras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarAPantalla(Pantalla1.class);

			}
		});
		
		labelFecha = new JLabel("Fecha y hora");
		labelFecha.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_labelFecha = new GridBagConstraints();
		gbc_labelFecha.gridwidth = 8;
		gbc_labelFecha.anchor = GridBagConstraints.WEST;
		gbc_labelFecha.fill = GridBagConstraints.HORIZONTAL;
		gbc_labelFecha.insets = new Insets(0, 0, 5, 5);
		gbc_labelFecha.gridx = 2;
		gbc_labelFecha.gridy = 2;
		add(labelFecha, gbc_labelFecha);
		updateDateTime(); // Actualizar la fecha y hora inicialmente

        add(labelFecha);
		
		JLabel labelSuma = new JLabel("Resultado de la suma: "+suma);
		GridBagConstraints gbc_labelSuma = new GridBagConstraints();
		gbc_labelSuma.insets = new Insets(0, 0, 5, 5);
		gbc_labelSuma.gridx = 2;
		gbc_labelSuma.gridy = 4;
		add(labelSuma, gbc_labelSuma);
		GridBagConstraints gbc_botonAtras = new GridBagConstraints();
		gbc_botonAtras.insets = new Insets(0, 0, 5, 0);
		gbc_botonAtras.fill = GridBagConstraints.BOTH;
		gbc_botonAtras.gridwidth = 15;
		gbc_botonAtras.gridx = 0;
		gbc_botonAtras.gridy = 5;
		add(botonAtras, gbc_botonAtras);
		
	}
	
	private void updateDateTime() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        labelFecha.setText(formattedDateTime);
    }
	
		
}
