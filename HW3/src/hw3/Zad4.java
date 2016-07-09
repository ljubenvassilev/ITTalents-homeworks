package hw3;

import java.util.Scanner;

public class Zad4 {

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
		boolean mirror = true;
		for (int i = 0, j=array.length-1; i <= array.length/2; i++, j--) {
			if (array[i]!=array[j]){
				mirror=false;
				System.out.println("Not mirror.");
				break;
			}
		}
		if(mirror){
			System.out.println("Mirror.");
		}
	}
}
