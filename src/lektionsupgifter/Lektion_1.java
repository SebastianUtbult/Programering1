package lektionsupgifter;

import java.util.Scanner;

public class Lektion_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int tal1 = input.nextInt();
		int tal2 = input.nextInt();
		
		if (tal1 < tal2) {
			System.out.println("Mintal: " + tal1);
		}
		else {
			System.out.println("Mintal: " + tal2);
		}
		
	}
}
