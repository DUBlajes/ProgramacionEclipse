package interfaces;

import javax.swing.JPanel;

public class TableroDeJuego extends JPanel {
	private Ventana ventana;

	public TableroDeJuego(Ventana v) {
		this.ventana = v;
		setLayout(null);
	}
}
