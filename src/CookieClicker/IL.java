package CookieClicker;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class IL {
	
	BufferedImage ibg;

	public IL() {
		
		try {
			ibg = ImageIO.read(new File("rsc/joink.jpg"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
