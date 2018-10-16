package strings;

import java.util.Scanner;

public class upgift2 {
	
	public static void main(String[] args) {
		
		Scanner jeff = new Scanner (System.in);
		
		System.out.println("Välj upgift:");
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		
		String CMD = jeff.nextLine();
		
		if(CMD.equals("1")) {
			double r = jeff.nextDouble();
			volume(r);
		}
		else if(CMD.equals("2")){
			String in = jeff.nextLine();
			System.out.println(reverse(in));
		}
		else if(CMD.equals("3")){
			String str2 = jeff.nextLine();
			char c = jeff.next().charAt(0);
			count(str2, c);
		}
		else if(CMD.equals("4")){
			String str = jeff.nextLine();
			System.out.println(Sjorovare(str));
		}
		
	}
	//1
	public static String reverse(String in) {
		String str = "";
		for (int i = in.length() - 1; i >= 0; i--) {
			str += in.charAt(i);
		}
		return str;
	}
	//2
	public static void volume(double r) {
		
		double V = (4*3.14*(r*r*r))/3;
		System.out.println(V);
		
	}
	//3
	public static void count(String str2, char c) {
		int nmb = 0;
		for (int i = str2.length()-1; i >= 0; i--) {
			if(str2.charAt(i) == c) {
				nmb++;
			}
		}
		System.out.println(nmb);
	}
	//4
	public static String Sjorovare(String str) {
		String sjo = "";
		for (int i = 0; i <= str.length()-1; i++) {
			if(		  str.charAt(i) == 'b'
					||str.charAt(i) == 'c'
					||str.charAt(i) == 'd'
					||str.charAt(i) == 'f'
					||str.charAt(i) == 'g'
					||str.charAt(i) == 'h'
					||str.charAt(i) == 'j'
					||str.charAt(i) == 'k'
					||str.charAt(i) == 'l'
					||str.charAt(i) == 'm'
					||str.charAt(i) == 'n'
					||str.charAt(i) == 'p'
					||str.charAt(i) == 'q'
					||str.charAt(i) == 'r'
					||str.charAt(i) == 's'
					||str.charAt(i) == 't'
					||str.charAt(i) == 'v'
					||str.charAt(i) == 'x'
					||str.charAt(i) == 'z') {
				sjo += str.charAt(i) + "o" +str.charAt(i);
			}
			else {
				sjo+= str.charAt(i);
			}
		}
		return sjo;
	}
}
