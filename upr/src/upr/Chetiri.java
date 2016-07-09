package upr;

import java.util.Scanner;

public class Chetiri {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size=0;
		do{
			System.out.println("Input size:");
			size=sc.nextInt();
		}while(size<1);
		int[] masiv = new int[size];
		for (int i = 0; i < masiv.length; i++) {
			System.out.println("Input number on position "+(i+1));
			masiv[i]=sc.nextInt();
		}
		boolean ogledalen=true;
//Tova e s cikul for
//		for (int i = 0, j=masiv.length-1; i < masiv.length/2; i++, j--) {
//			if(masiv[i]!=masiv[j]){
//				ogledalen=false;
//				break;
//			}
//		}
//Tova e s cikul while
		int i=0;
		int j=masiv.length-1;
		while(i < masiv.length/2){
			if(masiv[i]!=masiv[j]){
				ogledalen=false;
				break;
			}
			i++;
			j--;
		}
		
		if(ogledalen){
			System.out.println("Masiva e ogledalen.");
		}
		else{
			System.out.println("Masiva NE e ogledalen");
		}
	}
}
