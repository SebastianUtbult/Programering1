package heml�xa;

import java.util.Scanner;

public class l�xa {
	public static void main(String[] args) {
		
		String M = ", ";
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Vad �r ditt namn?");
		String namn = input.nextLine();
		
		System.out.print("Vad �r din adress?");
		String adress = input.nextLine();
		
		System.out.print("Vad �r ditt postnummer?");
		String Postnummer = input.nextLine();
		
		System.out.print("Vad �r din stad?");
		String stad = input.nextLine();
		
		System.out.print("Vad �r ditt telefonnummer?");
		String telefonnummer = input.nextLine();
		
		System.out.println("Upgifter:");
		System.out.println(namn +M+ adress +M+ Postnummer +M+ telefonnummer);
	}
}