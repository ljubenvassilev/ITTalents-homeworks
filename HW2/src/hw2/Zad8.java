package hw2;

import java.util.Scanner;

public class Zad8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=0;
		do {
			System.out.println("Input number:");
			n = sc.nextInt();
		} while(n<=1);
		int num = n-1;
		for (int i=1;i<=n;i++){
			for (int j=1;j<=n;j++){
				System.out.print(num);
			}
			System.out.println();
			num+=2;
		}
	}
}
