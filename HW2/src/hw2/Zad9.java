package hw2;

import java.util.Scanner;

public class Zad9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=0;
		do {
			System.out.println("Input number:");
			a = sc.nextInt();
		} while(a<1);
		int b=0;
		do {
			System.out.println("Input number:");
			b = sc.nextInt();
		} while(b<=1);
		int sum = 0;
		if (a==b){
			System.out.println("Equal numbers.");
		}
		else {
			if (a>b){
				for (;a>=b;b++){
					if (b%3==0){
						System.out.println("Skip 3");
						continue;
					}
					System.out.println(b*b);
					sum+=b*b;
					if (sum>=200){
						break;
					}
				}
			}
			else{
				for (;b>=a;a++){
					if (a%3==0){
						System.out.println("Skip 3");
						continue;
					}
					System.out.println(a*a);
					sum+=a*a;
					if (sum>=200){
						break;
					}
				}
			}
		}
	}
}