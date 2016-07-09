package hw6;

public class Computer {

	int year;
	double price;
	boolean isNotebook;
	int hardDiskMemory;
	int freeMemory;
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
}
