package hw1;

import java.util.Scanner;

public class Zad9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two 2-digit whole numbers:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int remainder = 0;
		int multiply = 0;
		if (num1>=10&&num1<=99&&num2>=10&&num2<=99){
			multiply = num1*num2;
			remainder = multiply%10;
			if (remainder%2==0){
				System.out.println("Multiply is "+multiply+", last digit is "+remainder+" and it is even.");;
			}
			else {
				System.out.println("Multiply is "+multiply+", last digit is "+remainder+" and it is uneven.");
			}
		}
		else {
		System.out.println("Numbers outside of range.");
		}
	}
}