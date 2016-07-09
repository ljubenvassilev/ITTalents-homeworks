import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] masiv = {77,66,55,44,33,22,11,6,4,3,2,1};
		System.out.println(Arrays.toString(masiv));
		bubbleSort(masiv);
		System.out.println(Arrays.toString(masiv));
		System.out.println("Vh. Danni = " + masiv.length);
	}
	
	static void bubbleSort(int[] arr){
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			boolean sorted = true;
			for (int j = 0; j < arr.length-1-i; j++) {
				cnt++;
				if(arr[j] > arr[j+1]){
					sorted = false;
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			if(sorted){
				break;
			}
		}
		System.out.println("Operations = " + cnt);
	}
}
