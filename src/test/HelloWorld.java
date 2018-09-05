package test;

import java.util.Scanner;

public class HelloWorld {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int yuuuh = input.nextInt();
		
			if(x>0 && yuuuh>0) {
				System.out.println(1);
			}
			if(x>0 && yuuuh<0) {
				System.out.println(4);
			}
			if(x<0 && yuuuh>0) {
				System.out.println(3);
			}
			if(x<0 && yuuuh<0) {
				System.out.println(2);
			}
			
	}	//main	
	
}	//HelloWorld
