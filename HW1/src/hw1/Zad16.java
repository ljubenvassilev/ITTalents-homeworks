package hw1;

import java.util.Scanner;

public class Zad16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input whole number between 100 and 999:");
		int num1 = sc.nextInt();
		if (num1<100||num1>999){
			System.out.println("Number outside interval.");
		}
		else {
			int edinici = num1%10;
			int desetici = (num1/10)%10;
			int stotici = (num1/100)%10;
			if((edinici==desetici)&&(edinici==stotici)){
				System.out.println("Digits are equal.");
			}
			else{
				if((edinici<desetici)&&(desetici<stotici)){
					System.out.println("Digits are decreasing.");
				}
				else{
					if((edinici>desetici)&&(desetici>stotici)){
						System.out.println("Digits are increasing.");
					}
					else{
						System.out.println("Digits are not ordered.");
					}
				}
			}
		}
	}
}
