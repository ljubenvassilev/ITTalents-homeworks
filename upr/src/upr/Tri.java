package upr;

import java.util.Scanner;

public class Tri {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size=0;
		do{
			System.out.println("Input size:");
			size=sc.nextInt();
		}while(size<1||size%2==1);
		
		int[] masiv = new int[size];
		for (int i = 0; i < masiv.length; i++) {
			System.out.println("Input number on position "+(i+1));
			masiv[i]=sc.nextInt();
		}
		int[] result= new int [size];
		for (int i = 0; i < result.length/2; i++) {
			result[i]=masiv[i];
		}
		for (int i = masiv.length/2, j=masiv.length-1; i < masiv.length; i++, j--) {
			result[i]=masiv[j];
		}
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+" ");
		}
		
	}
}
