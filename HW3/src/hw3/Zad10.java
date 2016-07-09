package hw3;

import java.util.Scanner;

public class Zad10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
			
		//create array and fill with numbers
		int[] array = new int[7];
		double temp=0;
		for (int i=0;i<array.length;i++){
			System.out.println("Input number on position "+(i+1)+":");
			array[i]= sc.nextInt();
			temp+=array[i];
		}
		temp/=7;
		double diff=0;
		double minDiff=999999999;
		int mark=0;
		for (int i = 0; i < array.length; i++) {
			if (array[i]>=temp){
				diff=array[i]-temp;
			}
			else{
				diff=temp-array[i];
			}
			if (diff<minDiff){
				minDiff=diff;
				mark=i;
			}
		}
		System.out.println("Mean is "+temp+" and closest is "+array[mark]);
	}
}
