package hemläxa;

import java.util.Scanner;

public class läxa {
	public static void main(String[] args) {
		
		String M = ", ";
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Namn:");
		String namn = input.nextLine();
		
		System.out.print("Adress:");
		String adress = input.nextLine();
		
		System.out.print("Postnummer:");
		String Postnummer = input.nextLine();
		
		System.out.print("Stad:");
		String stad = input.nextLine();
		
		System.out.print("Telefonnummer:");
		String telefonnummer = input.nextLine();
		
		System.out.println("Upgifter:");
		System.out.println(namn +M+ adress +M+ Postnummer +M+ telefonnummer);
	}
}