package hw3;

import java.util.Scanner;

public class Zad11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
			
		//create array and fill with numbers
		int[] array = new int[7];

		for (int i=0;i<array.length;i++){
			System.out.println("Input number on position "+(i+1)+":");
			array[i]= sc.nextInt();

		}
		int count=0;
		for (int i = 0; i < array.length; i++) {
			if (array[i]%5==0&&array[i]>5){
				System.out.print(array[i]+" ");
				count++;
			}
		}
		System.out.println("- "+count+" numbers.");

	}
}
