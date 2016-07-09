package hw1;

import java.util.Scanner;

public class Zad10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input total volume between 10 and 9999:");
		int volume = sc.nextInt();
		if (volume<10||volume>9999){
			System.out.println("Incorrect volume.");
		}
		else{
			int remainder = volume%5;
			if(remainder==0){
				System.out.println("3 liter bucket - "+volume/5+" times and 2 liter bucket - "+volume/5+" times.");
			}
			if(remainder==4){
				System.out.println("3 liter bucket - "+volume/5+" times and 2 liter bucket - "+(volume/5+2)+" times.");
			}
			if(remainder==3){
				System.out.println("3 liter bucket - "+(volume/5+1)+" times and 2 liter bucket - "+volume/5+" times.");
			}
			if(remainder==2){
				System.out.println("3 liter bucket - "+volume/5+" times and 2 liter bucket - "+(volume/5+1)+" times.");
			}
			if(remainder==1){
				System.out.println("3 liter bucket - "+(volume/5-1)+" times and 2 liter bucket - "+(volume/5+2)+" times.");
			}
		}
	}
}