package interfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PantallaPrueba extends JPanel {
	private Ventana ventana;
	private DefaultListModel<Integer> listModel;
	private JList<Integer> numberList;
	private JPanel resultPanel;

	public PantallaPrueba(Ventana v) {

		listModel = new DefaultListModel<>();
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 450, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 262, 33, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel labelTitulo = new JLabel("Números Aleatorios");
		labelTitulo.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_labelTitulo = new GridBagConstraints();
		gbc_labelTitulo.insets = new Insets(0, 0, 5, 5);
		gbc_labelTitulo.gridx = 2;
		gbc_labelTitulo.gridy = 1;
		add(labelTitulo, gbc_labelTitulo);
		numberList = new JList<>(listModel);
		numberList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		numberList.setEnabled(false);

		JScrollPane scrollPane = new JScrollPane(numberList);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setPreferredSize(new Dimension(200, 150));
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 2;
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 2;
		add(scrollPane, gbc_scrollPane);

		JButton randomButton = new JButton("Sacar aleatorio");
		GridBagConstraints gbc_randomButton = new GridBagConstraints();
		gbc_randomButton.fill = GridBagConstraints.BOTH;
		gbc_randomButton.gridwidth = 2;
		gbc_randomButton.insets = new Insets(0, 0, 5, 5);
		gbc_randomButton.gridx = 1;
		gbc_randomButton.gridy = 3;
		add(randomButton, gbc_randomButton);
		randomButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				addRandomNumberToList();
			}
		});

		JButton sumButton = new JButton("Calcular sumatoria");
		GridBagConstraints gbc_sumButton = new GridBagConstraints();
		gbc_sumButton.fill = GridBagConstraints.BOTH;
		gbc_sumButton.gridwidth = 2;
		gbc_sumButton.insets = new Insets(0, 0, 5, 5);
		gbc_sumButton.gridx = 1;
		gbc_sumButton.gridy = 4;
		add(sumButton, gbc_sumButton);
		sumButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showSumResult();
			}
		});
	}

	private void addRandomNumberToList() {
		Random random = new Random();
		int randomNumber = random.nextInt(10) + 1;
		listModel.addElement(randomNumber);
	}

	private void showSumResult() {
		int sum = 0;
		for (int i = 0; i < listModel.getSize(); i++) {
			sum += listModel.getElementAt(i);
		}

        PantallaPrueba2 pantalla2 = new PantallaPrueba2(sum, this);
        removeAll();
        add(pantalla2, BorderLayout.CENTER);
        revalidate();
        repaint();
    }

    public void clearNumberList() {
        listModel.clear();
    }

	private void removeResultPanel() {
		removeAll();
		add(numberList, BorderLayout.CENTER);
		listModel.clear();
		revalidate();
		repaint();
	}

}
