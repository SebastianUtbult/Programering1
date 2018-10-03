package lektionsupgifter;

import java.util.Scanner;

public class lektion_6 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		double R = input.nextInt();
		double H = input.nextInt();
		
		R = R * R * 3.14;
		
		System.out.println(R * H);
		
	}
}
