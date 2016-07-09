package hw2;

import java.util.Scanner;

public class Zad22 {
	
	public static void main (String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n=0;
		do {
			System.out.println("Input number 1:");
			n = sc.nextInt();
		} while(n<1||n>999);
		
		int k = 1;
		
		while(k<=10){
			if(n%2==0||n%3==0||n%5==0){
				System.out.print(k+":"+n+"; ");
				k++;
			}
			n++;	
		}
	}
}
