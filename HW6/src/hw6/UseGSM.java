package hw6;
import java.util.Scanner;
class UseGSM {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		GSM ljubo = new GSM();
		System.out.println("Ljubo's phone:");
		ljubo.model=inputModel();
		do{
			ljubo.insertSimCard(inputNumber());
		}
		while(!ljubo.hasSimCard);
		GSM krasi = new GSM();
		System.out.println("Krasi's phone:");
		krasi.model=inputModel();
		do{
			krasi.insertSimCard(inputNumber());
		}
		while(!krasi.hasSimCard);
		makeCalls(ljubo, krasi);
		System.out.println("Price of all outgoing calls for Ljubo " + ljubo.getSumForCall());
		System.out.println("Phone model is "+ljubo.model);
		ljubo.printForLastOutgoingCall();
		ljubo.printForLastIncomingCall();
		System.out.println("Price of all outgoing calls for Krasi " + krasi.getSumForCall());
		System.out.println("Phone model is "+krasi.model);
		krasi.printForLastOutgoingCall();
		krasi.printForLastIncomingCall();
	}
	static String inputModel(){
		Scanner sc = new Scanner(System.in);
		String model;
		do{
			System.out.println("Input model:");
			model=sc.nextLine();
		}
		while(model.equals(null));
		return model;
	}
	static String inputNumber(){
		Scanner sc = new Scanner(System.in);
		String number;
		System.out.println("Input phone numer (08XXXXXXXX):");
		number=sc.nextLine();
		return number;
	}
	static void makeCalls(GSM ljubo, GSM krasi){
		Scanner sc = new Scanner(System.in);
		int choice=0;
		do{
			do{
				System.out.println("What do you want to do?");
				System.out.println("1 to make a call from Ljubo to Krasi");
				System.out.println("2 to make a call from Krasi to Ljubo");
				System.out.println("0 for end");
				choice=sc.nextInt();
			}
			while(choice<0||choice>2);
			if (choice==0){
				break;
			}
			System.out.println("What is the duration of the call?");
			int duration=sc.nextInt();
			if (choice==1){
				ljubo.call(krasi,duration);
			}
			else{
				krasi.call(ljubo,duration);;
			}
		}
		while(true);
	}
}
