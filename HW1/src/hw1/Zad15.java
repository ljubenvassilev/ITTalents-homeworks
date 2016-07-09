package hw1;

import java.util.Scanner;

public class Zad15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input hour:");
		int hour = sc.nextInt();
		if (hour<0||hour>24){
			System.out.println("Incorrect hour.");
		}
		else{
			if(hour<=4||hour>=18){
				System.out.println("Good evening.");
			}
			else{
				if (hour<=9){
					System.out.println("Good morning.");
				}
				else{
					System.out.println("Good day.");
				}
			}
		}
	}
}
