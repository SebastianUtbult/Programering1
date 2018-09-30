package CookieClicker;

public class Main {

	static double cookies = 0;
	static double cps = 10;
	static double cpc = 1;
	static int ugAnzahl = 2;
	
	
	public static void main(String[] args) {
		
		Gui g = new Gui();
		g.createGui();
		
		new CookieCounter();
		
		
	}
	
}
