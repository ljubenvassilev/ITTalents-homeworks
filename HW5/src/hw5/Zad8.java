package hw5;

import java.util.Scanner;

public class Zad8 {

	public static void main(String[] args) {
		String text=stringInput();
		boolean palindrom=true;
		for (int i = 0, j=text.length()-1; i < text.length()/2; i++, j--) {
			if(text.charAt(i)!=text.charAt(j)){
				palindrom=false;
				break;
			}
		}
		if (palindrom){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}

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
