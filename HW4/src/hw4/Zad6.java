package hw4;

public class Zad6 {

	public static void main (String[] args){
		
		//init array
		int[][] arr = {
						{48,72,13,14,15},
						{21,22,53,24,75},
						{31,57,33,34,35},
						{41,95,43,44,45},
						{59,52,53,54,55},
						{61,69,63,64,65}
					};
		int sumRow=0;
		int sum=0;
		for (int i = 1; i < arr.length; i+=2) {
			for (int j = 0; j < arr.length-1; j++) {
				System.out.print(arr[i][j]+" ");
				sumRow+=arr[i][j];
			}
			System.out.println("Sum of row is "+sumRow);
			sum+=sumRow;
			sumRow=0;
		}
		System.out.println("Total sum is "+sum);
	}
}
