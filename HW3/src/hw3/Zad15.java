package hw3;

import java.util.Scanner;

public class Zad15 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int n=0;
		do {
			System.out.println("Input size larger than three:");
			n = sc.nextInt();
		} while(n<4);

		//create array and fill with numbers
		double[] array = new double[n];
		for (int i=0;i<array.length;i++){
			System.out.println("Input number on position "+(i+1)+":");
			array[i]= sc.nextDouble();
		}
		double num1=0;
		double num2=0;
		double num3=0;
		int position1=0;
		int position2=0;
		int position3=0;
		boolean negative0=false;
		boolean negative1=false;
		boolean negative2=false;
		
		if (array[0]<0){
			negative0=true;
			array[0]*=-1;
		}
		if (array[1]<0){
			negative1=true;
			array[1]*=-1;
		}
		if (array[2]<0){
			negative2=true;
			array[2]*=-1;
		}
		if (array[0]>array[1]&&array[0]>array[2]){
			num1=array[0];
			position1=0;
			if (array[1]>array[2]){
				num2=array[1];
				position2=1;
				num3=array[2];
				position3=2;
			}
			else{
				num2=array[2];
				position2=2;
				num3=array[1];
				position3=1;
			}
		}
		else{
			if (array[1]>array[0]&&array[1]>array[2]){
				num1=array[1];
				position1=1;
				if (array[0]>array[2]){
					num2=array[0];
					position2=0;
					num3=array[2];
					position3=2;
				}
				else{
					num2=array[2];
					position2=2;
					num3=array[0];
					position3=0;
				}
			}
			else{
				num1=array[2];
				position1=2;
				if (array[0]>array[1]){
					num2=array[0];
					position2=0;
					num3=array[1];
					position3=1;
				}
				else{
					num2=array[1];
					position2=1;
					num3=array[0];
					position3=0;
				}
			}
		}
		if (negative0){
			array[0]*=-1;
		}			
		if (negative1){
			array[1]*=-1;
		}			
		if (negative2){
			array[2]*=-1;
		}
		double sum=num1+num2+num3;
		boolean negative=false;
		for (int i = 3; i < array.length; i++) {
//check for negative and revert
			if (array[i]<0){
				negative=true;
				array[i]*=-1;
			}
//check for num3
			if ((array[i]+num1+num2)>sum){
				if ((array[i]+num1+num3)>sum){
					if ((array[i]+num3+num2)>sum){
						num3=num2;
						num2=num1;
						num1=array[i];
						sum=num1+num2+num3;
						position3=position2;
						position2=position1;
						position1=i;
						if (negative){
							array[i]*=-1;
							negative=false;
						}
						continue;
					}
					else{
						num3=num2;
						num2=array[i];
						position3=position2;
						position2=i;
						sum=num1+num2+num3;
						if (negative){
							array[i]*=-1;
							negative=false;
						}
						continue;
					}
				}
				else{
					num3=array[i];
					position3=i;
					sum=num1+num2+num3;
					if (negative){
						array[i]*=-1;
						negative=false;
					}
					continue;
				}
			}
			//revert again if it was negative
			if (negative){
				array[i]*=-1;
				negative=false;
			}
		}
		System.out.println(array[position1]+" "+array[position2]+" "+array[position3]);
	}
}