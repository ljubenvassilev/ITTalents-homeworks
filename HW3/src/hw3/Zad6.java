package hw3;

import java.util.Scanner;

public class Zad6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//declare size of array
		int n=0;
		do {
			System.out.println("Input size 1:");
			n = sc.nextInt();
		} while(n<1);
		int m=0;
		do {
			System.out.println("Input size 2:");
			m = sc.nextInt();
		} while(m<1);
		
		boolean equal=true;
		//create array and fill with numbers
		int[] array1 = new int[m];
		int[] array2 = new int[n];
		
		for (int i=0;i<array1.length;i++){
			System.out.println("Input number on position "+(i+1)+" of array 1:");
			array1[i]= sc.nextInt();
		}
		for (int i=0;i<array2.length;i++){
			System.out.println("Input number on position "+(i+1)+" of array 2:");
			array2[i]= sc.nextInt();
		}
		
		if (m==n){
			for (int i=0;i<array1.length;i++) {
				if (array1[i]!=array2[i]){
					equal=false;
					break;
				}
			}
			if(equal){
				System.out.println("Equal size and equal arrays.");
			}
			else{
				System.out.println("Equal size, different arrays.");
			}
		}
		else{
			System.out.println("Different size.");
		}
		
	}
}
