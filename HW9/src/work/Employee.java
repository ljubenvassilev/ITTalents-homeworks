package work;

class Employee {

	private String name;
	private Task currentTask;
	private int hoursLeft;
	AllWork allwork;
	private boolean jobDone=false;
	
	Employee(String name){
		if(name.length()>0){
			setName(name);
		}
	}

	String getName() {
		return name;
	}

	void startWorkingDay(){
		this.hoursLeft=8;
	}
	
//	AllWork getAllwork() {
//		return allwork;
//	}
//
//	void setAllwork(AllWork allwork) {
//		this.allwork = allwork;
//	}

	private void setName(String name) {
		if (name.length()>0){
			this.name = name;
		}
	}

	Task getCurrentTask() {
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
		if(jobDone){
			return;
		}
		System.out.println(getName()+" starts to work on "+currentTask.getName());
		while (getHoursLeft()>0){
			if (getHoursLeft()>=currentTask.getWorkingHours()){
				setHoursLeft(getHoursLeft()-currentTask.getWorkingHours());
				currentTask.setWorkingHours(0);
				System.out.println(currentTask.getName()+" is done");
				setCurrentTask(allwork.getNextTask());
				if(currentTask==null){
					System.out.println("No more tasks");
					System.out.println(getName()+" finished for today");
					jobDone=true;
					return;
				}
				System.out.println(getName()+" gets task "+currentTask.getName());
				if(getHoursLeft()==0){
					System.out.println(getName()+" finished for today");
				}
			}
			else{
				currentTask.setWorkingHours(currentTask.getWorkingHours()-getHoursLeft());
				setHoursLeft(0);
				System.out.println(getName()+" finished for today");
			}
			
		}
	}
//	void showReport(){
//		System.out.println("Employee name: "+getName());
//		System.out.println("Working hours left: "+getHoursLeft());
//		currentTask.printInfo();
//		System.out.println("-----------");
//	}
}
