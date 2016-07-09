package hw1;

import java.util.Scanner;

public class Zad3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input two different numbers:");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		if (num1==num2){
			System.out.println("Numbers are equal");
		}
		else {
			double temp = num1;
			num1 = num2;
			num2 = temp;
			System.out.println("The numbers in reverse order are: "+num1+" and "+num2+".");
		}
	}
}
