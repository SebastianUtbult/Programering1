package lektionsupgifter;

import java.util.Scanner;

public class lektion_4 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		boolean exit = false;
		int summa = 1;
		
		while(!exit) {
			int tal = input.nextInt();
			summa = summa * tal;
			if(summa >= 100000) {
				exit = true;
			}
		}
		System.out.println(summa);
	}
}
