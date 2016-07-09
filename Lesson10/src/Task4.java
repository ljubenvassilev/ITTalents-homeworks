import java.util.Scanner;
public class Task4 {
	public static void main(String[] args) {
		char[][] matrix = {
				{' ', ' ', ' ', 'b', ' ', ' ', ' ', ' '},
				{' ', ' ', ' ', 'b', ' ', ' ', ' ', ' '},
				{'b', 'b', ' ', 'b', ' ', ' ', 'b', 'b'},
				{' ', 'b', ' ', 'b', 'b', 'b', 'b', ' '},
				{' ', 'b', ' ', ' ', ' ', ' ', ' ', ' '},
				{' ', 'b', 'b', 'b', ' ', 'b', 'b', 'b'},
				{' ', ' ', ' ', 'b', ' ', 'b', ' ', ' '},
				{' ', ' ', ' ', 'b', ' ', 'b', ' ', ' '}
		};
		System.out.println("This is the map of the building!");
		System.out.println();
		for (int j2 = 0; j2 < matrix.length; j2++) {
			for (int k = 0; k < matrix[j2].length; k++) {
				System.out.print(matrix[j2][k] + ",");
			}
			System.out.println();
		}
		System.out.println("You can break 1 wall. Enter coordinates(1-8):");
		int s=-1;
		int t=-1;
		do{
			if(s!=-1||t!=-1){
				System.out.println("This is not a wall!");
			}
			s = getCoordinate(1);
			t = getCoordinate(2);
		}while(matrix[s][t]!='b');
		matrix[s][t]=' ';
		for (int j2 = 0; j2 < matrix.length; j2++) {
			for (int k = 0; k < matrix[j2].length; k++) {
				System.out.print(matrix[j2][k] + ",");
			}
			System.out.println();
		}
		System.out.println("Enter coordinates of gas granade(1-8):");
		int i=-1;
		int j=-1;
		do{
			if(i!=-1||j!=-1){
				System.out.println("You can't throw a granade on a wall!");
			}
			i = getCoordinate(1);
			j = getCoordinate(2);
		}while(matrix[i][j]=='b');
		matrix[i][j]='X';
		paint(matrix, i, j);
		for (int j2 = 0; j2 < matrix.length; j2++) {
			for (int k = 0; k < matrix[j2].length; k++) {
				System.out.print(matrix[j2][k] + ",");
			}
			System.out.println();
		}
	}
	static void paint(char[][] matrix, int i, int j){
		if(j+1 < matrix[i].length){
			char sused1 = matrix[i][j+1];
			if(sused1 != 'r' && sused1 != 'b' && sused1 != 'X'){
				matrix[i][j+1] = 'r';
				paint(matrix, i, j+1);
			}
		}
		if(j-1>=0){
			char sused2 = matrix[i][j-1];
			if(sused2!='r'&&sused2!='b'&&sused2!='X'){
				matrix[i][j-1]='r';
				paint(matrix, i, j-1);
			}
		}
		if(i+1 < matrix.length){
			char sused3 = matrix[i+1][j];
			if(sused3 != 'r' && sused3 != 'b' && sused3 != 'X'){
				matrix[i+1][j] = 'r';
				paint(matrix, i+1, j);
			}
		}
		if(i-1>=0){
			char sused4 = matrix[i-1][j];
			if(sused4!='r'&&sused4!='b'&&sused4!='X'){
				matrix[i-1][j]='r';
				paint(matrix, i-1, j);
			}
		}
		return;
	}
	static int getCoordinate(int c){
		Scanner sc = new Scanner(System.in);
		int i =-1;
		do{
			System.out.println("Enter coordinate "+c+":");
			i=sc.nextInt()-1;
		}while(i<0&&i>7);
		return i;
	}
}


