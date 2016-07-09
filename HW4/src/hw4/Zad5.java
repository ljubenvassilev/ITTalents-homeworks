package hw4;

public class Zad5 {
	
	public static void main (String[] args){
		//init array
		int[][] arr = {
						{1,2,3,4},
						{5,6,7,8},
						{9,10,11,12},
						{13,14,15,16}
					};
		//init sums
		int maxSumRow=0;
		int maxSumCol=0;
		int tempSumRow=0;
		int tempSumCol=0;
		//calculate max sum row
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				tempSumRow+=arr[i][j];
			}
			if(tempSumRow>maxSumRow){
				maxSumRow=tempSumRow;
			}
			tempSumRow=0;
		}
		//calculate max sum column
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				tempSumCol+=arr[j][i];
			}
			if(tempSumCol>maxSumCol){
				maxSumCol=tempSumCol;
			}
			tempSumCol=0;
		}
		//output sums
		System.out.println(maxSumRow);
		System.out.println(maxSumCol);
		//output which sum is bigger
		if(maxSumRow>maxSumCol){
			System.out.println("Maximum sum of rows is bigger than max sum of columns.");
		}
		else{
			if(maxSumRow==maxSumCol){
				System.out.println("Maximum sum of rows is equal to max sum of columns.");
			}
			else{
				System.out.println("Maximum sum of rows is smaller than max sum of columns.");
			}
		}
	
	}
}
