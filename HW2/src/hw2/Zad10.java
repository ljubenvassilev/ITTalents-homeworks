package hw2;

import java.util.Scanner;

public class Zad10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num=0;
		do {
			System.out.println("Input number:");
			num = sc.nextInt();
		} while(num<=1);
		boolean nonPrime = false;
		for(int i=2;i<num;i++){
			if (num%i==0){
				System.out.println("Not prime.");
				nonPrime=true;
				break;
			}
		}
		if (nonPrime==false){
			System.out.println("Prime.");
		}
	}

}
