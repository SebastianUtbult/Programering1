package lektionsupgifter;

import java.util.Scanner;

public class Lektion_8 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Timmar: ");
		int t1 = input.nextInt();
		System.out.println("Minuter: ");
		int t2 = input.nextInt();
		System.out.println("Sekunder: ");
		int t3 = input.nextInt();
		
		t1 = t1 * 60 * 60;
		t2 = t2 * 60;
		
		System.out.println("Totalt sekunder:" + (t1 + t2 + t3));
		
	}
}
