package hw2;

import java.util.Scanner;

public class Zad21 {
	
	public static void main (String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n=0;
		do {
			System.out.println("Input number:");
			n = sc.nextInt();
		} while(n<1||n>51);
		switch(n){
		case 1:
			System.out.print("2 Club, ");
		case 2:
			System.out.print("2 Diamond, ");
		case 3:
			System.out.print("2 Heart, ");
		case 4:
			System.out.print("2 Spade, ");
		case 5:
			System.out.print("3 Club, ");
		case 6:
			System.out.print("3 Diamond, ");
		case 7:
			System.out.print("3 Heart, ");
		case 8:
			System.out.print("3 Spade, ");
		case 9:
			System.out.print("4 Club, ");
		case 10:
			System.out.print("4 Diamond, ");
		case 11:
			System.out.print("4 Heart, ");
		case 12:
			System.out.print("4 Spade, ");
		case 13:
			System.out.print("5 Club, ");
		case 14:
			System.out.print("5 Diamond, ");
		case 15:
			System.out.print("5 Heart, ");
		case 16:
			System.out.print("5 Spade, ");
		case 17:
			System.out.print("6 Club, ");
		case 18:
			System.out.print("6 Diamond, ");
		case 19:
			System.out.print("6 Heart, ");
		case 20:
			System.out.print("6 Spade, ");
		case 21:
			System.out.print("7 Club, ");
		case 22:
			System.out.print("7 Diamond, ");
		case 23:
			System.out.print("7 Heart, ");
		case 24:
			System.out.print("7 Spade, ");
		case 25:
			System.out.print("8 Club, ");
		case 26:
			System.out.print("8 Diamond, ");
		case 27:
			System.out.print("8 Heart, ");
		case 28:
			System.out.print("8 Spade, ");
		case 29:
			System.out.print("9 Club, ");
		case 30:
			System.out.print("9 Diamond, ");
		case 31:
			System.out.print("9 Heart, ");
		case 32:
			System.out.print("9 Spade, ");
		case 33:
			System.out.print("10 Club, ");
		case 34:
			System.out.print("10 Diamond, ");
		case 35:
			System.out.print("10 Heart, ");
		case 36:
			System.out.print("10 Spade, ");
		case 37:
			System.out.print("Jack Club, ");
		case 38:
			System.out.print("Jack Diamond, ");
		case 39:
			System.out.print("Jack Heart, ");
		case 40:
			System.out.print("Jack Spade, ");
		case 41:
			System.out.print("Queen Club, ");
		case 42:
			System.out.print("Queen Diamond, ");
		case 43:
			System.out.print("Queen Heart, ");
		case 44:
			System.out.print("Queen Spade, ");
		case 45:
			System.out.print("King Club, ");
		case 46:
			System.out.print("King Diamond, ");
		case 47:
			System.out.print("King Heart, ");
		case 48:
			System.out.print("King Spade, ");
		case 49:
			System.out.print("Ace Club, ");
		case 50:
			System.out.print("Ace Diamond, ");
		case 51:
			System.out.print("Ace Heart, ");
		default:
			System.out.print("Ace Spade");
		}
		
	}
}
