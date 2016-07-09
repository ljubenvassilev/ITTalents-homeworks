package hw3;

import java.util.Scanner;

public class Zad12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
			
		//create array and fill with numbers
		int[] array = new int[7];

		for (int i=0;i<array.length;i++){
			System.out.println("Input number on position "+(i+1)+":");
			array[i]= sc.nextInt();
		}
		int temp=array[1];
		array[1]=array[0];
		array[0]=temp;
		array[2]+=array[3];
		array[3]=array[2]-array[3];
		array[2]=array[2]-array[3];
		array[4]*=array[5];
		array[5]=array[4]/array[5];
		array[4]=array[4]/array[5];
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
}
