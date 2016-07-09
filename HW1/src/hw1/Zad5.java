package hw1;

import java.util.Scanner;

public class Zad5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input three different numbers:");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		double num3 = sc.nextDouble();
		if (num1==num2||num2==num3||num1==num3){
			System.out.println("There are equal numbers.");
		}
		else {
			if (num1>num2){
				if (num2>num3){
					System.out.println("Sorted numbers are "+num1+" "+num2+" "+num3);
				}
				else {
					if (num1>num3){
						System.out.println("Sorted numbers are "+num1+" "+num3+" "+num2);
					}
					else {
						System.out.println("Sorted numbers are "+num3+" "+num1+" "+num2);
					}
				}
			}
			else {
				if (num1>num3){
					System.out.println("Sorted numbers are "+num2+" "+num1+" "+num3);
				}
				else {
					if (num2>num3){
						System.out.println("Sorted numbers are "+num2+" "+num3+" "+num1);
					}
					else {
						System.out.println("Sorted numbers are "+num3+" "+num2+" "+num1);
					}
				}	
			}
		}
	}
}
