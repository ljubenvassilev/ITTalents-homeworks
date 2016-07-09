package hw3;

import java.util.Scanner;

public class Zad9 {

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
		int[] array2 = new int [n];
		for (int i = 0,j=array.length-1; i < array.length; i++, j--) {
			array2[j]=array[i];
		}
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i]+" ");
		}
		System.out.println();
		
		int m=0;
		do {
			System.out.println("Input size:");
			m = sc.nextInt();
		} while(m<1);
			
		//create array and fill with numbers
		int[] array3 = new int[m];
		
		for (int i=0;i<array3.length;i++){
			System.out.println("Input number on position "+(i+1)+":");
			array3[i]= sc.nextInt();
		}
		int temp =0;
		for (int i = 0, j=array3.length-1; i < array3.length/2; i++,j--) {
			temp=array3[i];
			array3[i]=array3[j];
			array3[j]=temp;
		}
		
		for (int i = 0; i < array3.length; i++) {
			System.out.print(array3[i]+" ");
		}
		
	}
}
