package hw5;

import java.util.Scanner;

public class Zad7 {

	public static void main(String[] args) {
		
		String text=stringInput().trim()+" ";
		int countSpace=0;
		int countLetter=0;
		int maxCountLetter=0;
		for (int i = 0; i < text.length(); i++) {
			countLetter++;
			if(text.charAt(i)==' '){
				countSpace++;
				if(countLetter>maxCountLetter){
					maxCountLetter=countLetter;
				}
				countLetter=0;
			}
		}
		System.out.println(countSpace+" words, longest is "+(maxCountLetter-1)+" characters long.");
	}
	
	static String stringInput(){
		Scanner sc = new Scanner(System.in);
		String s;
		do{
			System.out.println("Enter text:");
			s = sc.nextLine();
		}while (s.length()<1);
		return s;
	}
}
