
public class ComparingStrings {

	public static void main(String[] args) {
		
		int[] arr1 = new int[5];
		int[] arr2 = new int[5];
		//arr2 = arr1;
		System.out.println(arr1 == arr2);
		
		String s1 = "I. P.";
		String s2 = "I. P.";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2);
		String s3 = new String("Maria");
		String s4 = "Maria";
		System.out.println(s3 == s4);
		
	}
}
