package hw3;

import java.util.Scanner;

import javax.swing.SingleSelectionModel;

public class Zad18 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//declare size of array
		int n=0;
		do {
			System.out.println("Input size:");
			n = sc.nextInt();
		} while(n<1);
			
		//create array and fill with numbers
		int[] array1 = new int[n];
		int[] array2 = new int[n];
		int[] array3 = new int[n];
		for (int i=0;i<array1.length;i++){
			System.out.println("Input number on position "+(i+1)+" of first array:");
			array1[i]= sc.nextInt();
		}
		for (int i=0;i<array2.length;i++){
			System.out.println("Input number on position "+(i+1)+" of second array:");
			array2[i]= sc.nextInt();
		}
		for (int i = 0; i < array1.length; i++) {
			if(array1[i]>=array2[i]){
				array3[i]=array1[i];
			}
			else{
				array3[i]=array2[i];
			}
		}
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < array3.length; i++) {
			System.out.print(array3[i]+" ");
		}
	}

}
