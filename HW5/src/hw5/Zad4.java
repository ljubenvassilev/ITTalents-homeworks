package hw5;
import java.util.Scanner;
public class Zad4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input two names (separated with a comma):");
		String names = sc.nextLine();
		String name1=names.substring(0, names.indexOf(','));
		String name2=names.substring(names.indexOf(',')+1).trim();
		System.out.println((getIntSumOfString(name1)>getIntSumOfString(name2)) ? name1 : name2);
	}
	static int getIntSumOfString(String s){
		int sum=0;
		for (int i = 0; i < s.length(); i++) {
			sum+=s.charAt(i);
		}
		return sum;
	}
}
