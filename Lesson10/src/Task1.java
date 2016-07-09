
public class Task1 {

	public static void main(String[] args) {
		
		int[] masiv = {1,4,2,8,3,7,6};
		System.out.println(findRazlika(masiv));
		System.out.println(findRazlikaRec(masiv, 1, masiv[0], masiv[0]));
	}
	
	static int findRazlika(int[] arr){
		int max = arr[0];
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] > max){
				max = arr[i];
			}
			if(arr[i] < min){
				min = arr[i];
			}
		}
		return max-min;
	}
	static int findRazlikaRec(int[] arr, int i, int max, int min){
		
		if(i == arr.length){
			return max-min;
		}
		if(arr[i] > max){
			max = arr[i];
		}
		if(arr[i] < min){
			min = arr[i];
		}
		return findRazlikaRec(arr, i+1, max, min);
	}
		
	
	
	
}
