package work;

public class Office {

	public static void main(String[] args) {

		AllWork allWork = new AllWork();
		allWork.addTask(new Task("Send e-mails", 5));
		allWork.addTask(new Task("Call all partners", 10));
		allWork.addTask(new Task("Call all clients", 3));
		allWork.addTask(new Task("Contact future prospects", 20));
		allWork.addTask(new Task("Instruct new trainees", 5));
		allWork.addTask(new Task("Consult the international manager", 2));
		allWork.addTask(new Task("Send invites for the Christmas party", 12));
		allWork.addTask(new Task("Prepare project Devastation", 18));
		allWork.addTask(new Task("Take care of the maintenance", 1));
		allWork.addTask(new Task("Play office games", 5));
		
		Employee[] workers = new Employee[3];
		workers[0] = new Employee("Ivan");
		workers[1] = new Employee("Sasho");
		workers[2] = new Employee("Doni");
		for (int i = 0; i < workers.length; i++) {
			workers[i].setAllwork(allWork);
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

	}

}