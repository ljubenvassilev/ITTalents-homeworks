package hw2;

import java.util.Scanner;

public class Zad14 {
	
	public static void main (String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n=0;
		do {
			System.out.println("Input number:");
			n = sc.nextInt();
		} while(n<10||n>200);
		for(;n>=7;n--){
			if (n%7==0){
				System.out.print(n+" ");
			}
		}
				
	}

}
