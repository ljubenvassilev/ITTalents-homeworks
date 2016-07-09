package hw2;

import java.util.Scanner;

public class Zad19 {
	
	public static void main (String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int num=0;
		do {
			System.out.println("Input number 1:");
			num = sc.nextInt();
		} while(num<10||num>99);
			
		for(;;){
			if(num%2==0){
				System.out.print(num/2+" ");
				num/=2;
			}
			else{
				System.out.print(num*3+1+" ");
				num=num*3+1;
			}
			if(num==1){
				break;
			}
		}

	}

}
