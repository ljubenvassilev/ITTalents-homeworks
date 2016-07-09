package hw1;

import java.util.Scanner; 

public class Zad1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input 2 limits:");
		double limit1 = sc.nextDouble();
		double limit2 = sc.nextDouble();
		System.out.println("Please input test variable:");
		double test = sc.nextDouble();
		if (test>limit1&&test>limit2){
			System.out.println("Test variable is above the higher limit.");
		}
		else {
			if (test<limit1&&test<limit2){
				System.out.println("Test variable is below lower limit.");
			}
			else {
				if ((test<limit1&&test>limit2)||(test>limit1&&test<limit2)){
					System.out.println("Test variable is between the limits.");
				}
				else {
					if (test==limit1||test==limit2){
						System.out.println("Test variable is equal to one of the two limits.");
					}
				}
			}
		}
	}
}
