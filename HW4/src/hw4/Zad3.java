package hw4;

public class Zad3 {

	
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
		//calculate sum
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum+=arr[i][j];
			}
		}
		//calculate mean
		int mean=sum/(arr.length+arr[0].length);
		//output
		System.out.println("Sum of all elements = "+sum);
		System.out.println("Mean of all elements = "+mean);
	}
}
