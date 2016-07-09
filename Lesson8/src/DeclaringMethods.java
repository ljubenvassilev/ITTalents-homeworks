
public class DeclaringMethods {

	public static void main(String[] args) {
		
		String s = "";
		int x = 3;
		int y = 5;
		int sbor = subirane(x, y,9);
		//....
		int sbor2 = subirane(5, 14);
		System.out.println(sbor2);
		System.out.println(sbor);
	}
	
	static int subirane(int a, int b){
		int suma = 2*( a + b);
		return suma;
	}
	
	static int subirane(int a, int b, int c){
		int suma = a + b;
		return suma;
	}
}
