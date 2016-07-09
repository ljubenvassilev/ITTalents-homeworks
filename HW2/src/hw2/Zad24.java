package hw2;

import java.util.Scanner;

public class Zad24 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num=0;
		do {
			System.out.println("Input number:");
			num = sc.nextInt();
		} while(num<10||num>30000);
		int remainder=0;
		int palindrom=0;
		int mod = num;
		do {
			remainder=mod%10;
			mod/=10;
			palindrom=(palindrom*10)+remainder;
		} while (mod>=1);
		if (num==palindrom) {
			System.out.println("Palindrom.");
		} else {
			System.out.println("Not palindrom.");
		}
	}
}