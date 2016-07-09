package hw5;
import java.util.Scanner;
public class Zad9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = stringInput();
		int num=0;
		int sum=0;
		boolean negative=false;
		for (int i = 0; i < s.length(); i++) {
			if (!((s.charAt(i)<='9'&&s.charAt(i)>='0'))&&i>0){
				if (s.charAt(i)=='-'){
					if(s.charAt(i-1)<='9'&&s.charAt(i-1)>='0'){
						if (negative){
							System.out.println(num*-1);
							sum-=num;
						}
						else{
							System.out.println(num);
							sum+=num;
						}
						num=0;
					}
					negative=true;
					continue;
				}
				if(!(s.charAt(i-1)<='9'&&s.charAt(i-1)>='0')){
					continue;
				}
				if (negative){
					System.out.println(num*-1);
					sum-=num;
					negative=false;
				}
				else{
					System.out.println(num);
					sum+=num;
				}
				num=0;
				continue;
			}
			if (s.charAt(i)<='9'&&s.charAt(i)>='0'){
				num=num*10+s.charAt(i)-48;
			}
			
		}
		if (s.charAt(s.length()-1)<='9'&&s.charAt(s.length()-1)>='0'){
			if (negative){
				System.out.println(num*-1);
				sum-=num;
			}
			else{
				System.out.println(num);
				sum+=num;
			}
		}
		System.out.println("Sum is: "+sum);
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
