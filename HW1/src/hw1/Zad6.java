package hw1;

import java.util.Scanner;

public class Zad6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input three numbers:");
		double a1 = sc.nextDouble();
		double a2 = sc.nextDouble();
		double a3 = sc.nextDouble();
		double temp = a1;
		a1 = a2;
		a2 = a3;
		a3 = temp;
		System.out.println("The shifted numbers are: "+a1+", "+a2+", "+a3);
	}
}
