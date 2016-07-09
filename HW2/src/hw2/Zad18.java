package hw2;

import java.util.Scanner;

public class Zad18 {
	
	public static void main (String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n=0;
		do {
			System.out.println("Input number 1:");
			n = sc.nextInt();
		} while(n<1||n>9);
	
		int m=0;
		do {
			System.out.println("Input number 2:");
			m = sc.nextInt();
		} while(m<1||m>9);
		
		for (int i=1;i<=m;i++){
			for (int j=1;j<=n;j++){
				System.out.println(i+"*"+j+"= "+(i*j)+";");
			}
		}
	}
}
