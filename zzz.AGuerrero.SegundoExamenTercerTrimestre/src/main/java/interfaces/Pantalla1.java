package interfaces;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class Pantalla1 extends JPanel {
	private Ventana ventana;
	DefaultListModel<Integer> listModel;
	private JList<Integer> listaNumerosAleatorios;
	private JScrollPane scroll;

	public Pantalla1(Ventana v) {
		this.ventana = v;
		listModel = new DefaultListModel<>();
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 450, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 262, 33, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel labelTitulo = new JLabel("Números Aleatorios");
		labelTitulo.setFont(new Font("Tahoma", Font.BOLD, 24));
		GridBagConstraints gbc_labelTitulo = new GridBagConstraints();
		gbc_labelTitulo.insets = new Insets(0, 0, 5, 5);
		gbc_labelTitulo.gridx = 2;
		gbc_labelTitulo.gridy = 1;
		add(labelTitulo, gbc_labelTitulo);
		listaNumerosAleatorios = new JList<>(listModel);
		listaNumerosAleatorios.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listaNumerosAleatorios.setEnabled(false);

		JScrollPane scrollPane = new JScrollPane(listaNumerosAleatorios);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setPreferredSize(new Dimension(200, 150));
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 2;
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 2;
		add(scrollPane, gbc_scrollPane);

		JButton botonAleatorio = new JButton("Sacar aleatorio");
		GridBagConstraints gbc_botonAleatorio = new GridBagConstraints();
		gbc_botonAleatorio.fill = GridBagConstraints.BOTH;
		gbc_botonAleatorio.gridwidth = 2;
		gbc_botonAleatorio.insets = new Insets(0, 0, 5, 5);
		gbc_botonAleatorio.gridx = 1;
		gbc_botonAleatorio.gridy = 3;
		add(botonAleatorio, gbc_botonAleatorio);

		JButton botonSuma = new JButton("Calcular sumatoria\r\n");
		botonSuma.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				muestraSuma();
				ventana.cambiarAPantalla(Pantalla2.class);
			}
		});
		GridBagConstraints gbc_botonSuma = new GridBagConstraints();
		gbc_botonSuma.fill = GridBagConstraints.BOTH;
		gbc_botonSuma.gridwidth = 2;
		gbc_botonSuma.insets = new Insets(0, 0, 5, 5);
		gbc_botonSuma.gridx = 1;
		gbc_botonSuma.gridy = 4;
		add(botonSuma, gbc_botonSuma);
		botonAleatorio.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				addRandomNumberToList();
			}
		});
	}

	private void addRandomNumberToList() {
		Random random = new Random();
		int randomNumber = random.nextInt(10) + 1;
		listModel.addElement(randomNumber);
	}

	private void muestraSuma() {
		int suma = 0;
		for (int i = 0; i < listModel.getSize(); i++) {
			suma += listModel.getElementAt(i);
		}
	}

}
