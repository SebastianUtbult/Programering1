package lektionsupgifter;

import java.util.Scanner;

public class lektion_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		boolean exit = false;
		int t1 = 0;
		double summa = 0;
		
		while(!exit) {
			double tal = input.nextDouble();
			summa = tal + summa;
			if(tal == 0) {
				exit = true;
			}
			t1++;
		}
		System.out.println(summa / (t1 - 1));
		
	}
}
