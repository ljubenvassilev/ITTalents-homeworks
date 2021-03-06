package work;

import java.util.Scanner;

public class Office {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("Welcome to the office!");
		System.out.println("You are the boss :)");
		int tasksNumber=0;
		do{
			System.out.println("Input number of tasks:");
			tasksNumber = sc.nextInt();
		}
		while(tasksNumber<1);		
		AllWork allWork = new AllWork(tasksNumber);
		
		for (int i = 0; i < tasksNumber; i++) {
			sc=new Scanner(System.in);
			String task="";
			int taskWorkingHours=0;
			do{
				System.out.println("Input name of task "+(i+1));
				task=sc.nextLine();
			}
			while(task.length()<1&&task.length()>40);
			do{
				System.out.println("Input working hours needed to complete task "+(i+1));
				taskWorkingHours=sc.nextInt();
			}
			while(taskWorkingHours<1);
			allWork.addTask(new Task(task, taskWorkingHours));
		}
		
//		allWork.addTask(new Task("Send e-mails", 5));
//		allWork.addTask(new Task("Call all partners", 10));
//		allWork.addTask(new Task("Call all clients", 3));
//		allWork.addTask(new Task("Contact future prospects", 20));
//		allWork.addTask(new Task("Instruct new trainees", 5));
//		allWork.addTask(new Task("Consult the international manager", 2));
//		allWork.addTask(new Task("Send invites for the Christmas party", 12));
//		allWork.addTask(new Task("Prepare project Devastation", 18));
//		allWork.addTask(new Task("Take care of the maintenance", 1));
//		allWork.addTask(new Task("Play office games", 5));

		int numberEmployees=0;
		do{
			System.out.println("Input number of employees (They should be less than the tasks!):");
			numberEmployees=sc.nextInt();
		}
		while(numberEmployees<1&&numberEmployees>tasksNumber);
		Employee[] workers = new Employee[numberEmployees];
		sc=new Scanner(System.in);
		for (int i = 0; i < workers.length; i++) {
			String name="";
			do{
				System.out.println("Input name of employee "+(i+1));
				name=sc.nextLine();
			}
			while (name.length()<1);
			workers[i]=new Employee(name);
		}
		System.out.println("--------------");
		System.out.println("Working times:");
		System.out.println();
//		workers[0] = new Employee("Ivan");
//		workers[1] = new Employee("Sasho");
//		workers[2] = new Employee("Doni");
		
		
		for (int i = 0; i < workers.length; i++) {
			workers[i].allwork=allWork;
			workers[i].setCurrentTask(allWork.getNextTask());
		}
		int day=1;
		while(true){
			System.out.println("Day "+day+" starts.");
			for (int i = 0; i < workers.length; i++) {
				workers[i].setHoursLeft(8);
				workers[i].work();
			}
			if(allWork.isAllWorkDone()){
				break;
			}
			day++;
		}
		System.out.println("All work is done");
	}

	
}
