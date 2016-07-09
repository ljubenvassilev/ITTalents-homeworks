package hw1;

import java.util.Scanner;

public class Zad13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input whole number for temperature between -100 and 100:");
		double temp = sc.nextDouble();
		if (temp<-100||temp>100){
			System.out.println("Temperature outside interval.");
		}
		else {
			if(temp>=-20){
				if(temp>=0){
					if (temp>=15){
						if (temp>25){
							System.out.println("Hot");
						}
						else{
							System.out.println("Warm");
						}
					}
					else{
						System.out.println("Cool");
					}
				}
				else{
					System.out.println("Cold");
				}
			}
			else{
				System.out.println("Freezing");
			}
		}
	}
}
