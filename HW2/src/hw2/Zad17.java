package hw2;

import java.util.Scanner;

public class Zad17 {
	
	public static void main (String[] args){
		
		Scanner sc = new Scanner(System.in);
		Scanner reader = new Scanner(System.in);
		
		int b=0;
		do {
			System.out.println("Input number:");
			b = sc.nextInt();
		} while(b<3||b>20);
	
		System.out.println("Enter c:");
		
		char c = reader.next(".").charAt(0);
		for (int i=1;i<=b;i++){
			System.out.print("*");
		}
		for (int i=2;i<=(b-1);i++){
			System.out.println();
			System.out.print("*");
			for (int j=2;j<=(b-1);j++){
				System.out.print(c);
			}
			System.out.print("*");
		}
		System.out.println();			
		for (int i=1;i<=b;i++){
			System.out.print("*");
		}
		

	}

}
