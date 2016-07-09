package hw1;

import java.util.Scanner;

public class Zad8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input whole number between 1000 and 9999:");
		int num1 = sc.nextInt();
		if (num1<1000||num1>9999){
			System.out.println("Number outside interval.");
		}
		else {
			int edinici = num1%10;
			int desetici = (num1/10)%10;
			int stotici = (num1/100)%10;
			int hilqdi = num1/1000;
			int num2 = hilqdi*10+edinici;
			int num3 = stotici*10+desetici;
			if (num2>num3){
				System.out.println("Number 1 - "+num2+" is bigger than number 2 - "+num3+".");
			}
			else {
				if (num2==num3){
					System.out.println("Number 1 - "+num2+" is equal to number 2 - "+num3+".");	
				}
				else{
					System.out.println("Number 1 - "+num2+" is smaller than number 2 - "+num3+".");
				}
			}
		}
	}
}
