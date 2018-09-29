package CookieClicker;

import javax.swing.JFrame;

public class Gui {
	
	JFrame jf;
	Draw d;
	
	final int width = 1280, height = 720;
	
	public void createGui() {
		
		jf = new JFrame("CookieClicker - Första spel");
		jf.setSize(width, height);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setResizable(false);
		
		
		d = new Draw();
		d.setSize(width,height);
		d.setVisible(true);
		d.requestFocus();
		d.addMouseListener(new MouseHandler());
		d.addMouseMotionListener(new MouseHandler ());
		d.addMouseWheelListener(new MouseHandler());
		jf.add(d);
		
		jf.setVisible(true);
		}
	}
