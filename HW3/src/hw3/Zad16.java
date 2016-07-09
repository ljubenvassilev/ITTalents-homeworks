package hw3;

import java.util.Scanner;

public class Zad16 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
			
		double[] array = new double[10];

		for (int i=0;i<array.length;i++){
			System.out.println("Input number on position "+(i+1)+":");
			array[i]= sc.nextDouble();

		}
		double[] result = new double [10];
		for (int i = 0; i < array.length; i++) {
			if (array[i]<-0.231){
				result[i]=((i+1)*(i+1))+41.25;
			}
			else{
				result[i]=array[i]*(i+1);
			}
			System.out.print(array[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+" ");
		}
	}
}
