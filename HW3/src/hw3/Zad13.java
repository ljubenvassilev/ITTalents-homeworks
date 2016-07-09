package hw3;

import java.util.Scanner;

public class Zad13 {

	public static void main (String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int num=0;
		do {
			System.out.println("Input number:");
			num = sc.nextInt();
		} while(num<1);
		int[] temp = new int[num];
		int count=0;
		do{
			temp[count]=num%2;
			num/=2;
			count++;
		} while (num>0);
		int[] binary = new int [count];
		for (int i = 0,j=binary.length-1; i < binary.length; i++, j--) {
			binary[j]=temp[i];
		}
		temp=binary;//za da pozvolq na GC da iz4isti nenujniq golqm masiv
		for (int i = 0; i < binary.length; i++) {
			System.out.print(binary[i]);
		}
	}
}
