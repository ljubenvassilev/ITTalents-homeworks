package hw2;

import java.util.Scanner;

public class Zad15 {
	
	public static void main (String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n=0;
		do {
			System.out.println("Input number:");
			n = sc.nextInt();
		} while(n<2);
		
		int sum = 0;
		
		do{
			sum+=n;
			n--;
		}while(n>0);
		System.out.println(sum);
	
	}
}
