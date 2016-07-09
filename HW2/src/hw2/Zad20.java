package hw2;

public class Zad20 {
	
	public static void main(String[] args){
		int end = 0;
		for (int i=1;;){
			for(int j=i;;){
				System.out.print(j);
				j++;
				if (j==i||(j==10&&i==0)){
					break;
				}
				if (j==10){
					j=0;
				}
			}
			i++;
			if (i==10){
				i=0;
				end++;
			}
			if (end>0&&i==1){
				break;
			}
			System.out.println();
		}
	}
}
