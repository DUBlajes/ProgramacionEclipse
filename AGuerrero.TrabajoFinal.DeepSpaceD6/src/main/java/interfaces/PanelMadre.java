package interfaces;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class PanelMadre extends JPanel{
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		try {
			BufferedImage fondo=ImageIO.read(new File("./images/resultado.jpg"));
			g.drawImage(fondo, 0, 0, this);
			g.drawImage(fondo, 0, 0, this.getWidth(), this.getHeight(), new Color(0,0,0), null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}
