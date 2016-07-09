package hw5;

import java.util.Scanner;

public class Zad10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = stringInput();
		int shift=inputPositiveInt();
		System.out.println(changeString(text,shift));
	}
	static StringBuilder changeString (String s, int n){
		StringBuilder answer= new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char c =s.charAt(i);
			c+=n;
			answer.append(c);
		}
		return answer;
	}

	static String stringInput(){
		Scanner sc = new Scanner(System.in);
		String s;
		do{
			System.out.println("Enter text:");
			s = sc.nextLine();
		}while (s.length()<1);
		return s;
	}
	static int inputPositiveInt(){
		Scanner sc = new Scanner(System.in);
		int n=0;
		do{
			System.out.println("How many characters do you want to shift:");
			n=sc.nextInt();
		}while(n<1);
		return n;
	}
}
