package upr;

import java.util.Scanner;

public class Dve {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num=0;
		do{
			System.out.println("Input number:");
			num=sc.nextInt();
		}while(num<1);
		int counter=0;
		for(int i=num+1;;i++){
			if(i%2==0||i%3==0||i%5==0){
				
				counter++;
				System.out.print(counter+": ");
				System.out.print(i+"; ");
			}
			if(counter>=10){
				break;
			}
		}

	}

}
