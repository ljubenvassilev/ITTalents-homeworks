package hw3;

import java.util.Scanner;

public class Zad2 {

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
		//create array for result
		int[] result = new int[n];
		
		for (int i=0; i < result.length/2; i++) {
			result[i]=array[i];
		}
		for (int j=result.length-1, i =0; j >= result.length/2; j--, i++) {
			result[j]=array[i];
		}
		for (int k = 0; k < result.length; k++) {
			System.out.println(result[k]+" ");
		}
	}
}
