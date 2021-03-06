package computers;


public class Computer {

	int year;
	double price;
	boolean isNotebook;
	double hardDiskMemory;
	double freeMemory;
	String operationSystem;
	
	public void changeOperationSystem(String OS){
		if (OS.length()>0){
			operationSystem=OS;
		}
	}
	
	public void useMemory(int use){
		if (use>freeMemory){
			System.out.println("Not enough free memory!");
			return;
		}
		freeMemory-=use;
	}
	Computer(){
		isNotebook=false;
		operationSystem="Win XP";
	}
	Computer(int year, double price, double hardDiskMemory, double freeMemory){
		this();
		this.year=year;
		this.price=price;
		this.hardDiskMemory=hardDiskMemory;
		this.freeMemory=freeMemory;
	}
	Computer(int year, double price, boolean isNotebook, double hardDiskMemory,	double freeMemory, String operationSystem){
		this.isNotebook=isNotebook;
		this.operationSystem=operationSystem;
		this.year=year;
		this.price=price;
		this.hardDiskMemory=hardDiskMemory;
		this.freeMemory=freeMemory;
	}
	int comparePrice(Computer pc){
		if(pc.price>this.price){
			return 1;
		}
		else{
			if(pc.price<this.price){
				return -1;
			}
			else{
				return 0;
			}
		}
	}
}
