package hw3;

import java.util.Scanner;

public class Zad14 {
	
	public static void main (String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n=0;
		do {
			System.out.println("Input size:");
			n = sc.nextInt();
		} while(n<1);
		int count=0;
		//create array and fill with numbers
		double[] array = new double[n];
		for (int i=0;i<array.length;i++){
			System.out.println("Input number on position "+(i+1)+":");
			array[i]= sc.nextDouble();
			if(array[i]>=-2.99&&array[i]<=2.99){
				count++;
			}
		}
		double[] result = new double[count];
		for (int i = 0, j=0; i < array.length; i++) {
			if(array[i]>=-2.99&&array[i]<=2.99){
				result[j]=array[i];
				System.out.print(result[j]+" ");
				j++;

			}
		}
		
	}
}
