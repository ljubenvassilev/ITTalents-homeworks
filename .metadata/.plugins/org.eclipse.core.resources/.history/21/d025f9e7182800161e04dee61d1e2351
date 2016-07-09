package upr;

import java.util.Scanner;

public class Shest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//standartno vuvejdane na 4islo s iziskvane
		int size1=0;
		do{
			System.out.println("Input size:");
			size1=sc.nextInt();
		}while(size1<1);
//
		int size2=0;
		do{
			System.out.println("Input size:");
			size2=sc.nextInt();
		}while(size1<1);
		int[] masiv1 = new int[size1];
		int[] masiv2 = new int[size2];
		boolean bigger=false;
		int size3=0;
		if (size1>size2){
			size3=size1;
			bigger=true;
		}
		else{
			size3=size2;
		}
		int[] masiv3 = new int[size3];
		//obhojdane na masiv s vuvejdane na vsi4ki stoinosti
		for (int i = 0; i < masiv1.length; i++) {
			System.out.println("Input number "+(i+1)+" of array 1");
			masiv1[i]=sc.nextInt();
		}
		//
		for (int i = 0; i < masiv2.length; i++) {
			System.out.println("Input number "+(i+1)+" of array 2");
			masiv2[i]=sc.nextInt();
		}
		if(bigger){		
			for (int i = 0; i < masiv2.length; i++) {
				if (masiv1[i]>masiv2[i]) {
					masiv3[i]=masiv1[i];
				}
				else{
					masiv3[i]=masiv2[i];
				}
			}
			for (int i = masiv2.length; i < masiv1.length; i++) {
				masiv3[i]=masiv1[i];
			}
		}
		else{
			for (int i = 0; i < masiv1.length; i++) {
				if (masiv2[i]>masiv1[i]) {
					masiv3[i]=masiv2[i];
				}
				else{
					masiv3[i]=masiv1[i];
				}
			}
			for (int i = masiv1.length; i < masiv2.length; i++) {
				masiv3[i]=masiv2[i];
			}
		}
		for (int i = 0; i < masiv3.length; i++) {
			System.out.print(masiv3[i]+" ");
		}
	
	}

}
