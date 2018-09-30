package CookieClicker;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

public class Draw extends JLabel{
	IL i = new IL();
	Gui gui = new Gui();
	protected void paintComponent(Graphics g){
		
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		//bakgrund
		g.drawImage(i.ibg, 0, 0, null);
		
		//övre lista
		g.setColor(Color.black);
		g.fillRect(0, 0, gui.width, 100);
		
		g.setColor(Color.WHITE);
		g.drawLine(gui.width/2, 100, gui.width/2, gui.height);
		g.drawLine(0, 100, gui.width, 100);
		
		repaint();
		
	}
	
}
