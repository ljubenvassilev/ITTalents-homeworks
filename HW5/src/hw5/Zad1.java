package hw5;

import java.util.Scanner;

public class Zad1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1=stringInput();
		String s2=stringInput();
		System.out.println(s1.toUpperCase()+" "+s1.toLowerCase());
		System.out.println(s2.toUpperCase()+" "+s2.toLowerCase());
		sc.close();
	}
	
	static String stringInput(){
		Scanner sc = new Scanner(System.in);
		String s;
		do{
			System.out.println("Enter text:");
			s = sc.nextLine();
		}while (s.length()>=40||s.length()<1);

		return s;
		
	}

}
