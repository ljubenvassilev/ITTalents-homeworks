package hw2;

import java.util.Scanner;

public class Zad11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num=0;
		do {
			System.out.println("Input number:");
			num = sc.nextInt();
		} while(num<=1);
		for (int i=1;i<=num;i++){
			for(int j=1;j<=(num-i);j++){
				System.out.print(" ");
			}
			for(int k=1;k<=(i*2-1);k++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		int num2=0;
		do {
			System.out.println("Input number:");
			num2 = sc.nextInt();
		} while(num2<=1);
		for (int i=1;i<num2;i++){
			for(int j=1;j<=(num2-i);j++){
				System.out.print(" ");
			}
			System.out.print("*");
			for(int k=1;k<=(i*2-3);k++){
				System.out.print(" ");
			}
			if(i!=1){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int l=1;l<=(num2*2-1);l++){
			System.out.print("*");
		}

	}
}
	
	
