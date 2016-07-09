package upr;

import java.util.Scanner;

public class Diagonali {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int rows=0;
		do {
			System.out.println("Input rows:");
			rows = sc.nextInt();
		} while(rows<1);
		int cols=0;
		do {
			System.out.println("Input columns:");
			cols = sc.nextInt();
		} while(cols<1);
		int[][] arr=new int[rows][cols];
		int n = rows*cols;
		int row = 0;
		int col = 0;
		for (int i=1; i<=n; i++) {
		    arr[row][col] = i;
		    if (row == 0 || col+1 == cols)  {
		        row+=(col+1);
		        if (row >= rows) {
		            col = (row-rows)+1;
		            row -= col;
		        } else {
		            col = 0;
		        }
		    } else {
		        col++;
		        row--;
		    }
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
