package CookieClicker;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

public class Draw extends JLabel{

	protected void paintComponent(Graphics g){
		
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		g.setColor(Color.BLACK);
		g.drawLine(2, 2, 2, 102);
		g.drawLine(2, 2, 102, 2);
		g.drawLine(102, 2, 102, 102);
		g.drawLine(102, 102, 2, 102);
		
		repaint();
		
	}
	
}
