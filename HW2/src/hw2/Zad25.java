package hw2;

import java.util.Scanner;

public class Zad25 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num=0;
		do {
			System.out.println("Input number:");
			num = sc.nextInt();
		} while(num<1);
		int multiply = 1;
		int count = 1;
		do {
			multiply=count*multiply;
			count++;
		} while (count<=num);
		System.out.println(multiply);
	}

}