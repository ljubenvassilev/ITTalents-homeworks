package hw1;

import java.util.Scanner;

public class Zad11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Input 3 digit number that does not include 0:");
		int num = sc.nextInt();
		if(num<100||num>999){
			System.out.println("Not a 3-digit number.");
		}
		else{
			int edinici = num%10;
			int desetici = (num/10)%10;
			int stotici = (num/100)%10;
			if (edinici==0||desetici==0||stotici==0){
				System.out.println("Number includes 0.");
			}
			else{
				if(num%edinici==0&&num%desetici==0&&num%stotici==0){
					System.out.println("Number is divisible by all three digits.");
				}
				else{
					System.out.println("Number is not divisible by all digits.");
				}
			}
		}
	}
}
