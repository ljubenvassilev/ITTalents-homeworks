package hw3;

import java.util.Scanner;

public class Zad17 {
	
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
		boolean zigzag=true;
		for (int i = 1; i < array.length; i++) {
			if(i%2==1){
				if(array[i]>array[i-1]){
					continue;
				}
				else{
					zigzag=false;
					break;
				}
			}
			else{
				if(array[i]<array[i-1]){
					continue;
				}
				else{
					zigzag=false;
					break;
				}
			}
		}
		if(zigzag){
			System.out.println("It is a zigzag.");
		}
		else{
			System.out.println("Not a zigzag.");
		}
	}
}
