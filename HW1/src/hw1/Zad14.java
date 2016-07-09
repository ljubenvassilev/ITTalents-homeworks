package hw1;

import java.util.Scanner;

public class Zad14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input coordinates of first field:");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		if (x1<1||x1>8||y1<1||y1>8){
			System.out.println("Incorrect coordinates.");
		}
		else {
			System.out.println("Input coordinates of second field:");
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			if (x2<1||x2>8||y2<1||y2>8){
				System.out.println("Incorrect coordinates.");
			}
			else{
				if((x1+y1)%2==(x2+y2)%2){
					System.out.println("Fields of same color.");
				}
				else{
					System.out.println("Fields of different color.");
				}
			}
		}
	}
}
