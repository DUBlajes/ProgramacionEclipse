/*package clases;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DadosApp extends JFrame {

	private JTextArea resultadosTextArea;
	private ArrayList<Integer> resultadosDados;
	private ArrayList<JButton> botonesAsignar;
	private int dadosBloqueados;
	private boolean dadosRecuperados;
	private JButton volverButton;
	private JPanel panel;

	public DadosApp() {
		setTitle("Dados App");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		resultadosTextArea = new JTextArea(10, 20);
		resultadosTextArea.setEditable(false);

		botonesAsignar = new ArrayList<>();
		dadosBloqueados = 0;
		dadosRecuperados = false;

		panel = new JPanel(new BorderLayout());
		panel.add(new JScrollPane(resultadosTextArea), BorderLayout.CENTER);
		panel.add(createBotonesPanel(), BorderLayout.SOUTH);

		add(panel);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);

		resultadosDados = new ArrayList<>();
		for (int i = 0; i < 6; i++) {
			int resultado = tirarDado();
			resultadosDados.add(resultado);
		}
		mostrarResultadosDados();
	}

	private JPanel createBotonesPanel() {
		JPanel botonesPanel = new JPanel(new FlowLayout());

		for (int i = 1; i <= 6; i++) {
			JButton botonAsignar = new JButton("Asignar " + i);
			botonAsignar.addActionListener(new AsignarButtonListener(i));
			botonesPanel.add(botonAsignar);
			botonesAsignar.add(botonAsignar);
		}

		return botonesPanel;
	}

	private int tirarDado() {
		Random random = new Random();
		return random.nextInt(6) + 1;
	}

	private void mostrarResultadosDados() {
		StringBuilder sb = new StringBuilder();
		sb.append("Resultados de los dados:\n");
		for (int resultado : resultadosDados) {
			sb.append(resultado).append("\n");
		}
		resultadosTextArea.setText(sb.toString());
	}

	private void actualizarBotones() {
		for (JButton boton : botonesAsignar) {
			int numeroBoton = Integer.parseInt(boton.getText().substring(boton.getText().length() - 1));

			if (numeroBoton == 6) {
				boton.setEnabled(dadosBloqueados < 3 && !dadosRecuperados);
			} else {
				boton.setEnabled(resultadosDados.contains(numeroBoton));
			}
		}
	}

	private class AsignarButtonListener implements ActionListener {
		private int valorAsignar;

		public AsignarButtonListener(int valorAsignar) {
			this.valorAsignar = valorAsignar;
		}
	}

		@Override
        public void actionPerformed(ActionEvent e) {
            if (resultadosDados.contains(valorAsignar)) {
                resultadosDados.remove((Integer) valorAsignar);
                mostrarResultadosDados();

                if (valorAsignar == 3) {
                    dadosRecuperados = true;
                    JOptionPane.showMessageDialog(null, "Dados recuperados");
                }

                if (valorAsignar == 6) {
                    dadosBloqueados++;
                    if (dadosBloqueados < 3) {
                        JOptionPane.showMessageDialog(null, "Dado bloqueado. Saca un 3 para volver a usarlo");
                    } else {
                        JOptionPane.showMessageDialog(null, "Dado bloqueado por completo. Puedes continuar jugando con los dados restantes.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Dado asignado");
                    }

                    actualizarBotones();

                    if (resultadosDados.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Has asignado todos los dados. Juego terminado.");
                        for (JButton boton : botonesAsignar) {
                            boton.setEnabled(false);
                        }
                        volverButton.setEnabled(true);
                    }
                }
            
        
	
}*/
