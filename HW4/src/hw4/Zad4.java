package hw4;

public class Zad4 {
	
	public static void main (String[] args){
		//init array
		int[][] arr = {
						{1,2,3,4},
						{5,6,7,8},
						{9,10,11,12},
						{13,14,15,16}
					};
		//create second array
		int[][] arr2=new int[arr[0].length][arr.length];
		//transfer variables at +90
		for (int i = 0, k=0; i < arr2.length; i++, k++) {
			for (int j = 0, l=arr[k].length-1; j < arr2[i].length; j++, l--) {
				arr2[i][j]=arr[l][k];
			}
		}	
		//del first array
		arr=arr2;
		//output
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
	}
}