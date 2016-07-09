package hw2;

import java.util.Scanner;

public class Zad13 {
	
	public static void main (String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int sum=0;
		do {
			System.out.println("Input number:");
			sum = sc.nextInt();
		} while(sum<2&&sum>27);
		
		for (int i=100;i<=999;i++){
			if ((i/100+(i/10%10)+i%10)==sum){
				System.out.println(i+" ");
			}
		}
	}
}
