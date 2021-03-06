package computers;

public class UseComputers {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Computer pc = new Computer();
//		pc.year=2016;
//		pc.price=1948.16;
//		pc.operationSystem="Windows 10 x64";
//		pc.isNotebook=false;
//		pc.hardDiskMemory=4194304;
//		pc.freeMemory=4194304;
//		Computer laptop = new Computer();
//		laptop.year=2015;
//		laptop.price=4299.99;
//		laptop.operationSystem="Windows 8 x64";
//		laptop.isNotebook=true;
//		laptop.hardDiskMemory=1048576;
//		laptop.freeMemory=1048576;
//		
//		pc.useMemory(100);
//		laptop.changeOperationSystem("Ubuntu");
//		
//		printCharacteristics(pc);
//		System.out.println();
//		printCharacteristics(laptop);
		
		Computer pc1= new Computer(1999, 54.22, 1024.48, 511.99);
		Computer pc2= new Computer(2015, 780.14, true, 2007.15, 450.12, "Win 8");
		Computer pc3= new Computer(2016, 1580.86, true, 4014.05, 1350.94, "Win 10");
		Computer pc4= new Computer(2013, 1580.86, false, 2002.01, 1210.74, "Win Vista");
		comparePricesOutput(pc1, pc2);
		comparePricesOutput(pc3, pc2);
		comparePricesOutput(pc3, pc4);
		
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

	static void comparePricesOutput(Computer one, Computer two){
		switch(one.comparePrice(two)){
		case 1:
			System.out.println(one.operationSystem+" is cheaper than "+two.operationSystem);
			break;
		case -1:
			System.out.println(one.operationSystem+" is more expensive than "+two.operationSystem);
			break;
		default:
			System.out.println(one.operationSystem+" and "+two.operationSystem+" have equal price.");	
			break;
		}
	}
}
