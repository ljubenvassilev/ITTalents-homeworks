package work;

class Task {

	private String name;
	private int workingHours;
	
	protected String getName() {
		return name;
	}
	private void setName(String name) {
		if (name.length()>0&&name.length()<40){
			this.name = name;
		}
	}
	protected int getWorkingHours() {
		return workingHours;
	}
	protected void setWorkingHours(int workingHours) {
		if(workingHours>=0)
			this.workingHours = workingHours;
	}
	
	Task(String name, int workingHours){
		setName(name);
		setWorkingHours(workingHours);
	}
//	void printInfo(){
//		System.out.println("Task name: "+getName());
//		System.out.println("Task working hours remaining: "+getWorkingHours());
//	}
}
