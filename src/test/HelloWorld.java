package test;

import java.util.Scanner;

public class HelloWorld {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int y = input.nextInt();
		
			if(x>0 && y>0) {
				System.out.println("kvadrant 2");
			}
			if(x>0 && y<0) {
				System.out.println("kvadrant 4");
			}
			if(x<0 && y>0) {
				System.out.println("kvadrant 1");
			}
			if(x<0 && y<0) {
				System.out.println("kvadrant 3");
			}
			
	}	//main	
	
}	//HelloWorld
