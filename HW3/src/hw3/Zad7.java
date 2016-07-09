package hw3;

import java.util.Scanner;

public class Zad7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//declare size of array
		int n=0;
		do {
			System.out.println("Input size:");
			n = sc.nextInt();
		} while(n<1);
		
		//create array and fill with numbers
		int[] array = new int[n];
		
		for (int i=0;i<array.length;i++){
			System.out.println("Input number on position "+(i+1)+":");
			array[i]= sc.nextInt();
		}
		int[] array2 = new int[n];
		array2[0]=array[0];
		array2[n-1]=array[n-1];
		for (int i = 1; i < array.length-1; i++) {
			array2[i]=array[i-1]+array[i+1];
		}
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]+" ");
		}
		
	}

}
