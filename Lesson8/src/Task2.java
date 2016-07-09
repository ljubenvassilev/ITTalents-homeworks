import java.util.Arrays;
import java.util.Random;

public class Task2 {

	public static void main(String[] args) {
		
		int n = 6;
		int[] x = generateArray(n);
		System.out.println(Arrays.toString(x));
	}
	
	static int[] generateArray(int n){
		//create array
		int[] arr = new int[n];
		//fill cells
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(10);
		}
		//return array as result
		return arr;
	}
}
