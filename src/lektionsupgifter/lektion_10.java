package lektionsupgifter;

import java.util.Scanner;

public class lektion_10 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("bas? ");
		int antalX = input.nextInt();
		int MPR = antalX;
		
		for (int i = 0; i < antalX; i++) {
			for (int j2 = MPR - 1; j2 > 0; j2--) {
				System.out.print(" ");
			}
			MPR = MPR - 1;
			for (int j = 0; j <= i; j++) {
				System.out.print("x");
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
