package hw1;

import java.util.Scanner;

public class Zad2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input two different whole numbers:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		if (num1==num2){
			System.out.println("Numers are equal.");
		}
		else {
			int sum = num1 + num2;
			int multiply = num1*num2;
			int difference;
			int divide;
			int remainder;
			if (num1>num2){
				difference = num1 - num2;
				divide = num1/num2;
				remainder = num1%num2;
			}
			else {
				difference = num2 - num1;
				divide = num2/num1;
				remainder = num2%num1;
			}
			System.out.println("Sum = "+sum);
			System.out.println("Difference = "+difference);
			System.out.println("Multiply = "+multiply);
			System.out.println("Division = "+divide);
			System.out.println("Remainder = "+remainder);
		}
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Input two different float numbers:");
		float float1 = sc2.nextFloat();
		float float2 = sc2.nextFloat();
		if (float1==float2){
			System.out.println("Numers are equal.");
		}
		else {
			float floatsum = float1 + float2;
			float floatmultiply = float1*float2;
			float floatdifference;
			float floatdivide;
			float floatremainder;
			if (float1>float2){
				floatdifference = float1 - float2;
				floatdivide = float1/float2;
				floatremainder = float1%float2;
			}
			else {
				floatdifference = float2 - float1;
				floatdivide = float2/float1;
				floatremainder = float2%float1;
			}
			System.out.println("Sum = "+floatsum);
			System.out.println("Difference = "+floatdifference);
			System.out.println("Multiply = "+floatmultiply);
			System.out.println("Division = "+floatdivide);
			System.out.println("Remainder = "+floatremainder);
		}
	}
}
