package work;

class Employee {

	private String name;
	private Task currentTask;
	private int hoursLeft;
	
	Employee(String name){
		if(name.length()>0){
			setName(name);
		}
	}

	private String getName() {
		return name;
	}

	private void setName(String name) {
		if (name.length()>0){
			this.name = name;
		}
	}

	private Task getCurrentTask() {
		return currentTask;
	}

	void setCurrentTask(Task currentTask) {
		this.currentTask = currentTask;
	}

	private int getHoursLeft() {
		return hoursLeft;
	}

	void setHoursLeft(int hoursLeft) {
		if(hoursLeft>=0&&hoursLeft<=24){
			this.hoursLeft = hoursLeft;
		}
	}
	
	void work(){
		if (hoursLeft>=currentTask.getWorkingHours()){
			setHoursLeft(getHoursLeft()-currentTask.getWorkingHours());
			currentTask.setWorkingHours(0);
			return;
		}
		currentTask.setWorkingHours(currentTask.getWorkingHours()-getHoursLeft());
		setHoursLeft(0);
	}
	void showReport(){
		System.out.println("Employee name: "+getName());
		System.out.println("Working hours left: "+getHoursLeft());
		currentTask.printInfo();
		System.out.println("-----------");
	}
}
