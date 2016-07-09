package upr;

import java.util.Scanner;

public class Pet {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int[] masiv = new int[7];
		for (int i = 0; i < masiv.length; i++) {
			System.out.println("Input element "+(i+1));
			masiv[i]=sc.nextInt();
		}
		for (int i = 0; i < masiv.length; i++) {
			if(masiv[i]%5==0&&masiv[i]>5){
				System.out.print(masiv[i]+" ");
			}
		}
	}
}
