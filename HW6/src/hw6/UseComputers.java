package hw6;

public class UseComputers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer pc = new Computer();
		pc.year=2016;
		pc.price=1948.16;
		pc.operationSystem="Windows 10 x64";
		pc.isNotebook=false;
		pc.hardDiskMemory=4194304;
		pc.freeMemory=4194304;
		Computer laptop = new Computer();
		laptop.year=2015;
		laptop.price=4299.99;
		laptop.operationSystem="Windows 8 x64";
		laptop.isNotebook=true;
		laptop.hardDiskMemory=1048576;
		laptop.freeMemory=1048576;
		
		pc.useMemory(100);
		laptop.changeOperationSystem("Ubuntu");
		
		printCharacteristics(pc);
		System.out.println();
		printCharacteristics(laptop);

	}
	static void printCharacteristics(Computer s){
		System.out.println("Production year: "+s.year);
		System.out.println("Price: "+s.price);
		System.out.println("Operation system: "+s.operationSystem);
		if(s.isNotebook){
			System.out.println("Notebook");
		}
		else{
			System.out.println("Desktop");
		}
		System.out.println("Total harddisk memory: "+s.hardDiskMemory);
		System.out.println("Free memory: "+s.freeMemory);
	}

}
