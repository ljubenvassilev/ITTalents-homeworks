package hw1;

import java.util.Scanner;

public class Zad4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input two different numbers:");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		if (num1==num2){
			System.out.println("Numbers are equal");
		}
		else {
			if (num1<num2){
				System.out.println("Numbers in ascending order are "+num1+", "+num2);
			}
			else {
				System.out.println("Numbers in ascending order are "+num2+", "+num1);
			}
		}
	}
}
