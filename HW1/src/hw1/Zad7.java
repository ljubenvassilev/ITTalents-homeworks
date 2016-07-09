package hw1;

import java.util.Scanner;

public class Zad7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input time, money and if sick:");
		int time = sc.nextInt(); //ne vijdam kakuv e smisula ot tazi promenliva - tq ne vur6i ni6to
		double money = sc.nextDouble();
		boolean sick = sc.nextBoolean();
		if (sick==true){
			if (money>0){
				System.out.println("Buy medicine and stay home.");
			}
			else {
				System.out.println("Stay home and drink tea.");
			}
		}
		else { 
			if (money>10){
				System.out.println("Go to the movies with friends");
			}
			else {
				System.out.println("Go for a coffee.");
			}
		}
		
	}
}
