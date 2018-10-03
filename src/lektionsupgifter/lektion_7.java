package lektionsupgifter;

import java.util.Scanner;

public class lektion_7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int Storlek = input.nextInt();
		
		if(Storlek == 1) {
			System.out.println("#");
		}else {
			for (int i = 0; i < Storlek; i++) {
				System.out.print("#");
			}
			System.out.println();
			for (int j = 0; j < Storlek - 2; j++) {
				System.out.print("#");
				for (int j2 = 0; j2 < Storlek - 2; j2++) {
					System.out.print(" ");
				}
				System.out.print("#");
				System.out.println();
			}
			for (int i2 = 0; i2 < Storlek; i2++) {
				System.out.print("#");
			}
		}		
	}
}
