package hw5;

import java.util.Scanner;

public class Zad2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuilder s1=stringInput();
		StringBuilder s2=stringInput();
		if(s1.length()>s2.length()){
			System.out.println("The longer one is "+s1.length()+" characters.");
		}
		else{
			System.out.println("The longer one is "+s2.length()+" characters.");
		}
		int x=inputPositiveInt();
		changeFirstNCharacters(s1, s2, x);
		System.out.println(s1+" "+s2);
		sc.close();
	}

	static StringBuilder stringInput(){
		Scanner sc = new Scanner(System.in);
		String s;
		do{
			System.out.println("Enter text(10-20 characters):");
			s = sc.nextLine();
		}while (s.length()>20||s.length()<10);
		StringBuilder s1=new StringBuilder(s);
		return s1;
		
	}
	
	static StringBuilder changeFirstNCharacters(StringBuilder a, StringBuilder b, int border){
		StringBuilder d=new StringBuilder(a);

		d.delete(border,d.length());
		a.replace(0, border, b.substring(0, border));
		b.replace(0,border,d.toString());
		return d;
	}
	
	static int inputPositiveInt(){
		Scanner sc = new Scanner(System.in);
		int n=0;
		do{
			System.out.println("How many characters do you want to replace(1-10):");
			n=sc.nextInt();
		}while(n<1||n>10);
		return n;
	}
	
}
