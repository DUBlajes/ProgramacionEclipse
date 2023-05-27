package interfaces;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PantallaActs extends JPanel{
	public PantallaActs(final Frame f) {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JButton btnAct1 = new JButton("Act 1");
		btnAct1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				f.cambiarAPantalla(Act1.class);
			}
		});
		GridBagConstraints gbc_btnAct1 = new GridBagConstraints();
		gbc_btnAct1.insets = new Insets(0, 0, 5, 5);
		gbc_btnAct1.anchor = GridBagConstraints.NORTH;
		gbc_btnAct1.gridx = 1;
		gbc_btnAct1.gridy = 1;
		add(btnAct1, gbc_btnAct1);
		
		JButton btnAct2 = new JButton("Act 2");
			btnAct2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				f.cambiarAPantalla(Act2.class);
			}
		});
		GridBagConstraints gbc_btnAct2 = new GridBagConstraints();
		gbc_btnAct2.insets = new Insets(0, 0, 5, 5);
		gbc_btnAct2.gridx = 2;
		gbc_btnAct2.gridy = 1;
		add(btnAct2, gbc_btnAct2);
	}

} // class
