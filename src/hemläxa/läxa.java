package heml�xa;

import java.util.Scanner;

public class l�xa {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Vad �r ditt namn?");
		
		String namn = input.nextLine();
		
		System.out.print("Du heter ");
		System.out.print(namn);
		
	}
}
