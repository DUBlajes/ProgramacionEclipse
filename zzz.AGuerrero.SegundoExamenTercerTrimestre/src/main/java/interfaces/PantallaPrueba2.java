package interfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PantallaPrueba2 extends JPanel {
    private int sum;
    private PantallaPrueba pantalla1;

    public PantallaPrueba2(int sum, PantallaPrueba pantalla1) {
        this.sum = sum;
        this.pantalla1 = pantalla1;

        setLayout(new BorderLayout());

        JLabel resultLabel = new JLabel("Sumatoria: " + sum);
        JButton backButton = new JButton("Atrás");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                goBack();
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(backButton);

        add(resultLabel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    private void goBack() {
        removeAll();
        pantalla1.clearNumberList();
        pantalla1.setVisible(true);
        revalidate();
        repaint();
    }
}

