package hw3;

import java.util.Scanner;

public class Zad8 {

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
		int endPosition=0;
		int length =1;
		int maxLength =1;
		for (int i = 1; i < array.length; i++) {
			if (array[i]==array[i-1]){
				length++;
				if (maxLength<length){
					maxLength++;
					endPosition=i;
				}
			}
			else{
				length=1;
			}
		}
		for (int i = endPosition-maxLength+1; i <= endPosition; i++) {
			System.out.print(array[i]+" ");
		}
		
	}

}
