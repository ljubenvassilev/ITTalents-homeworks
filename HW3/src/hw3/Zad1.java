package hw3;

import java.util.Scanner;

public class Zad1 {

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
		//create variable for result
		int result = array[0];
		//check which is divisible and smallest
		for (int i = 0; i < array.length; i++) {
			if (array[i]%3==0) {
				if (array[i]<result){
					result=array[i];
					
				}
			}
		}
		//output result
		System.out.println("Smallest divisible by 3 is "+result);
	}

}
