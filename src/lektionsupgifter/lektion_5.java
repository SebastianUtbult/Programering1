package lektionsupgifter;

import java.util.Scanner;

public class lektion_5 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < 10000; i++) {
			if(i % 7 == 0) {
				System.out.println(i);
			}
		}
		
	}
}
