package hemläxa;

import java.util.Scanner;

public class läxa {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Vad är ditt namn?");
		
		String namn = input.nextLine();
		
		System.out.print("Du heter ");
		System.out.print(namn);
		
	}
}
