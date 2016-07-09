import java.util.Scanner;

public class StringsExamples {

	public static void main(String[] args) {
		
		String text = "";
		String text2 = "He said \"Ai chao\"!";
		
		String first = "Ivet";
		String last = "Metodieva";
		String name = first + " " + last;
		String s = null;
		System.out.println(s);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text");
		String input = sc.next();
		System.out.println("You have entered: " + input);
	}
}
