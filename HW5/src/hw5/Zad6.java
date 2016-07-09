package hw5;

import java.util.Scanner;

public class Zad6 {

	public static void main(String[] args) {

		String text = stringInput();
		String s=text.substring(0, 1).toUpperCase();
		for (int i = 1; i < text.length(); i++) {
			if (text.charAt(i-1)==' '){
				s+=text.substring(i,(i+1)).toUpperCase();
			}
			else{
				s+=text.substring(i,(i+1));
			}
		}
		System.out.println(s);
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
}
