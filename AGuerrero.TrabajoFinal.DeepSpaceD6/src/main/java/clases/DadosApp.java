package clases;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DadosApp extends JFrame {
    private List<Integer> resultadosDados;
    private JTextArea resultadosTextArea;
    private List<JButton> botonesAsignar;
    private boolean boton3Usado;
    private int contadorBoton6;

    public DadosApp() {
        setTitle("Dados App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear el ArrayList para almacenar los resultados de los dados
        resultadosDados = new ArrayList<>();

        // Tirar seis dados de seis caras y agregar los resultados al ArrayList
        for (int i = 0; i < 6; i++) {
            int resultado = tirarDado();
            resultadosDados.add(resultado);
        }

        // Crear el JTextArea para mostrar los resultados de los dados
        resultadosTextArea = new JTextArea(10, 20);
        resultadosTextArea.setEditable(false);

        // Crear los botones "Asignar"
        botonesAsignar = new ArrayList<>();
        boton3Usado = false;
        contadorBoton6 = 0;

        for (int i = 1; i <= 6; i++) {
            JButton botonAsignar = new JButton("Asignar " + i);
            botonAsignar.addActionListener(new AsignarButtonListener(i));
            botonesAsignar.add(botonAsignar);
        }

        // Crear el panel principal y agregar el JTextArea y los botones
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new JScrollPane(resultadosTextArea), BorderLayout.CENTER);

        JPanel botonesPanel = new JPanel(new FlowLayout());
        for (JButton boton : botonesAsignar) {
            botonesPanel.add(boton);
        }
        panel.add(botonesPanel, BorderLayout.SOUTH);

        // Agregar el panel principal al marco
        add(panel);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);

        // Mostrar los resultados iniciales de los dados
        mostrarResultadosDados();
        actualizarBotones();
    }

    // Función para tirar un dado de seis caras y obtener un resultado aleatorio
    private int tirarDado() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    // Mostrar los resultados de los dados en el JTextArea
    private void mostrarResultadosDados() {
        StringBuilder sb = new StringBuilder();
        sb.append("Resultados de los dados:\n");
        for (int resultado : resultadosDados) {
            sb.append(resultado).append("\n");
        }
        resultadosTextArea.setText(sb.toString());
    }

    // Actualizar la disponibilidad de los botones según los resultados de los dados y el estado del botón 3
    private void actualizarBotones() {
        for (JButton boton : botonesAsignar) {
            int numeroBoton = Integer.parseInt(boton.getText().substring(boton.getText().length() - 1));

            if (numeroBoton == 6) {
                boton.setEnabled(boton3Usado);
            } else {
                boton.setEnabled(resultadosDados.contains(numeroBoton));
            }
        }
    }

    // ActionListener para los botones "Asignar"
    private class AsignarButtonListener implements ActionListener {
        private int valorAsignar;

        public AsignarButtonListener(int valorAsignar) {
            this.valorAsignar = valorAsignar;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            // Verificar si el valor a asignar está presente en los resultados de los dados
            if (resultadosDados.contains(valorAsignar)) {
                resultadosDados.remove((Integer) valorAsignar);
                mostrarResultadosDados();

                if (valorAsignar == 3) {
                    boton3Usado = true;
                    actualizarBotones();
                }

                if (valorAsignar == 6) {
                    contadorBoton6++;
                    if (contadorBoton6 == 3) {
                        JOptionPane.showMessageDialog(null, "Saca carta de amenaza");
                        contadorBoton6 = 0;
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el valor " + valorAsignar);
            }
        }
    }
}

