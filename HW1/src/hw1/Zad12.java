package hw1;

import java.util.Scanner;

public class Zad12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Input date:");
		int date = sc.nextInt();
		System.out.println("Input month:");
		int month = sc.nextInt();
		System.out.println("Input year:");
		int year = sc.nextInt();
		boolean incorrect = false;
		if (month>=1&&month<=11){
			if (month==1||month==3||month==5||month==7||month==8||month==10){
				if (date<31&&date>=1){
					date++;
				}
				else{
					if (date==31){
						date=1;
						month++;
					}
					else{
						incorrect=true;
					}
				}
			}
			else{
				if (month==4||month==6||month==9||month==11){
					if (date<30&&date>=1){
						date++;
					}
					else{
						if (date==30){
							date=1;
							month++;
						}
						else{
							incorrect=true;
						}
					}
				}
				else{
					if (year%4==0&&(year%100!=0||year%400==0)){
						if (date<29&&date>=1){
							date++;
						}
						else{
							if (date==29){
								date=1;
								month++;
							}
							else{
								incorrect=true;
							}
						}
					}
					else{
						if (date<28&&date>=1){
							date++;
						}
						else{
							if (date==28){
								date=1;
								month++;
							}
							else{
								incorrect=true;
							}
						}
					}
				}
			}
		}
		else{
			if (month==12){
				if (date<31&&date>=1){
					date++;
				}
				else{
					if (date==31){
						date=1;
						month=1;
						year++;
					}
					else{
						incorrect=true;
					}
				}
			}
			else{
				incorrect=true;
			}
		}
		if (incorrect==true){
			System.out.println("Incorrect input.");
		}
		else{
			System.out.println("Next date is "+date+" "+month+" "+year+".");
		}
	}
}
