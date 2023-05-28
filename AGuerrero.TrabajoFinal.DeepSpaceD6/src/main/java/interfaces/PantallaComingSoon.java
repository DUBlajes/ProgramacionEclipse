package interfaces;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class PantallaComingSoon extends JPanel {
	private Ventana ventana;

	public PantallaComingSoon(Ventana v) {
		this.ventana = v;
		setLayout(null);
		
		JLabel labelProximamente = new JLabel("Próximamente");
		labelProximamente.setHorizontalAlignment(SwingConstants.CENTER);
		labelProximamente.setFont(new Font("Tahoma", Font.PLAIN, 91));
		labelProximamente.setBounds(69, 26, 631, 301);
		add(labelProximamente);
	}
}
