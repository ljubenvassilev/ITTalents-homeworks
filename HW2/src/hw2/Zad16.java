package hw2;

import java.util.Scanner;

public class Zad16 {
	
	public static void main (String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n=0;
		do {
			System.out.println("Input number:");
			n = sc.nextInt();
		} while(n<10||n>5555);
	
		int m=0;
		do {
			System.out.println("Input number:");
			m = sc.nextInt();
		} while(m<10||m>5555);
			
		int temp=0;
		if(m>n){				
			temp=m;
			m=n;
			n=temp;
		}
		for (int i=n;i>=m;i--){
			if (i%50==0){
				System.out.print(i+",");
			}
		}
	}	
}
