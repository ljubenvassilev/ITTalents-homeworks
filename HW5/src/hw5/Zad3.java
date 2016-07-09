package hw5;
import java.util.Scanner;
public class Zad3 {

	public static void main(String[] args) {
		String s1=noSpaceString();
		String s2=noSpaceString();
		if(s1.length()==s2.length()){
			System.out.println("Equal length.");
			compareStrings(s1,s2);
		}
		else{
			if(s1.length()>s2.length()){
				System.out.println("First line is longer.");
				compareStrings(s1,s2);
			}
			else{
				System.out.println("Second line is longer.");
				compareStrings(s2,s1);
			}
		}
	}
	static String noSpaceString() {
		Scanner sc = new Scanner(System.in);
		String s;
		do{
			System.out.println("Input line without spaces: ");
			s = sc.nextLine();
		}while (s.contains(" "));
		return s;
	}
	static void compareStrings(String longer, String shorter){
		for (int i = 0; i < shorter.length(); i++) {
			if(longer.charAt(i)!=shorter.charAt(i)){
				System.out.println((i+1)+" "+longer.charAt(i)+" "+shorter.charAt(i));
			}
		}
		for (int i = shorter.length(); i < longer.length(); i++) {
			System.out.println((i+1)+" "+longer.charAt(i));
		}
	}
}
