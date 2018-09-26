package modulus;
import java.util.Scanner;
public class Spavanac {
	public static void main(String[] args) {
			
		Scanner input = new Scanner (System.in);	
		
		int X = input.nextInt();
		int Y = input.nextInt();
		int N = input.nextInt();
		
		for (int i = 1; i <= N; i++) {
			
			if(i % Y == 0 && i % X == 0) {
				System.out.println("Fizzbuzz");
			}
			else if(i % X == 0) {
				System.out.println("fizz");
			}
			else if(i % Y == 0) {
				System.out.println("buzz");
			}
			
			else {
				System.out.println(i);
			}
			
		}
	}
}
