package CookieClicker;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.text.DecimalFormat;

import javax.swing.JLabel;

public class Draw extends JLabel{
	
	IL i = new IL();
	Gui gui = new Gui();
	
	DecimalFormat df = new DecimalFormat("###, ###, ###");
	DecimalFormat df2 = new DecimalFormat("###, ###, ###");
	
	String s;
	int textwidth;
	
	protected void paintComponent(Graphics g){
		
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		//bakgrund
		g.drawImage(i.ibg, 0, 0, null);
		
		//övre lista
		g.setColor(Color.black);
		g.fillRect(0, 0, gui.width, 100); 
		
		//mitten linje
		g.setColor(Color.WHITE);
		g.drawLine(gui.width/2, 100, gui.width/2, gui.height);
		g.drawLine(0, 100, gui.width, 100);
		
		//lite text
		g.setFont(new Font("Arial", Font.BOLD, 30));
		s = df.format(Main.cookies) + " C";
		textwidth = g.getFontMetrics().stringWidth(s);
		g.drawString(s, gui.width/4 - textwidth/2, 62);
		
		g.setFont(new Font("Arial", Font.BOLD, 15));
		s = df2.format(Main.cps) + " C/s";
		g.drawString(s, 10, 88);
		
		repaint();
		
	}
	
}
