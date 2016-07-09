package hw5;
import java.util.Scanner;
public class Zad5 {

	public static void main(String[] args) {
	
		String word1=inputString();
		String word2=inputString();
		int crossX=0;
		int crossY=0;
		boolean crossed=false;
		for (int i = 0; i < word1.length(); i++) {
			for (int j = 0; j < word2.length(); j++) {
				if (word1.charAt(i)==word2.charAt(j)){
					crossX=i;
					crossY=j;
					crossed=true;
					break;
				}
			}
			if(crossed){
				break;
			}
		}
		if (!crossed){
			System.out.println("No equal letter.");
		}
		else{
			for (int i = 0; i < word1.length(); i++) {
				for (int j = 0; j < word2.length(); j++) {
					if(crossX==i||crossY==j){
						if(crossX==i){
							System.out.print(word2.charAt(j));
						}
						else if(crossY==j){
							System.out.print(word1.charAt(i));
						}
					}
					else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
	}
	static String inputString(){
		Scanner sc = new Scanner(System.in);
		String s;
		do{
			System.out.println("Input word:");
			s=sc.next().trim();
		}while(s.length()<1);
		return s;
	}

}
