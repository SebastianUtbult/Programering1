package hemläxa;

import java.util.Scanner;

public class läxa {
	public static void main(String[] args) {
		
		String M = ", ";
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Vad är ditt namn?");
		String namn = input.nextLine();
		
		System.out.print("Vad är din adress?");
		String adress = input.nextLine();
		
		System.out.print("Vad är ditt postnummer?");
		String Postnummer = input.nextLine();
		
		System.out.print("Vad är din stad?");
		String stad = input.nextLine();
		
		System.out.print("Vad är ditt telefonnummer?");
		String telefonnummer = input.nextLine();
		
		System.out.println("Upgifter:");
		System.out.println(namn +M+ adress +M+ Postnummer +M+ telefonnummer);
	}
}