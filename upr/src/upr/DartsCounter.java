package upr;
import java.util.Scanner;
public class DartsCounter {
	static boolean win=false;
	public static void main(String[] args) {
		System.out.println("Welcome to 501 Double-out!");
		int scoreP1=501;
		int scoreP2=501;
		boolean firstPlayer=true;
		do{
			if(firstPlayer){
				scoreP1=playMove(scoreP1,firstPlayer);
			}
			else{
				scoreP2=playMove(scoreP2,firstPlayer);
			}
			firstPlayer=!firstPlayer;
			System.out.println("Player 1 score: "+scoreP1);
			System.out.println("Player 2 score: "+scoreP2);
		}while(!win);
		if(scoreP1==0){
			System.out.println("Player 1 WINS!");
		}
		else{
			System.out.println("Player 2 WINS!");
		}
	}
	static int playMove(int score, boolean first){
		Scanner sc = new Scanner(System.in);
		int scoreTemp=score;
		if(first){
			System.out.print("Player 1");
		}
		else{
			System.out.print("Player 2");
		}
		System.out.println(" enter your score:");
		for (int i = 0; i < 3; i++) {
			int dart=0;
			do{	
				System.out.println("Dart "+(i+1)+":");
				dart=sc.nextInt();
			}while ((dart<0||dart>20)&&dart!=25);
			if(dart==0){
				continue;
			}
			sc.nextLine();
			String d="";
			do{
				System.out.println("Double?");
				d = sc.nextLine();
			}while(!(d.equals("y")||d.equals("n")));
			boolean doub=false;			
			if (d.equals("y")) {
				dart*=2;
				doub=true;
			}
			if(doub==false&&dart!=25){
				String t="";
				do{
					System.out.println("Triple?");
					t = sc.nextLine();
				}while(!(t.equals("y")||t.equals("n")));
				if (t.equals("y")) {
					dart*=3;
				}
			}
			if (doub&&score==dart){
				win=true;
				score=0;
				break;
			}
			else {
				if((score-dart)<2){
					System.out.println("Busted!");
					score=scoreTemp;
					break;
				}
				else {
					score-=dart;
					System.out.println("");
				}
			}
		}
		return score;
	}
}
