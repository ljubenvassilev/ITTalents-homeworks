package hw3;

import java.util.Scanner;

public class Zad3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n=0;
		System.out.println("Input number:");
		n = sc.nextInt();
			
		//create array and fill with numbers
		int[] array = new int[10];
		array[0]=array[1]=n;
		System.out.print(array[0]+" ");
		System.out.print(array[1]+" ");
		for (int i=2;i<array.length;i++){
			array[i]= array[i-2]+array[i-1];
			System.out.print(array[i]+" ");
		}
		
	}

}
