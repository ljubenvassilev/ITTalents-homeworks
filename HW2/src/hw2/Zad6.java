package hw2;

import java.util.Scanner;

public class Zad6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a=0;
		do {
			System.out.println("Input number:");
			a = sc.nextInt();
		} while(a<1);
		int sum=0;
		for (int i=1;i<=a;i++){
			sum+=i;
		}
		System.out.println("Sum is "+sum);

	}

}
