package hw2;

import java.util.Scanner;

public class Zad7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=0;
		do {
			System.out.println("Input number:");
			n = sc.nextInt();
		} while(n<1);		
		for(int i=1;i<=n;i++){
			System.out.print(i*3);
			if(i<n){
				System.out.print(",");
			}
		}

	}

}
