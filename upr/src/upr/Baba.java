package upr;

import java.util.Scanner;

public class Baba {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input coordinates of field:");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		if((x1+y1)%2==0){
			System.out.println("Black");
		}
		else{
			System.out.println("White");
		}
	}

}
