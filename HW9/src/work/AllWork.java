package work;

class AllWork {
	
	final Task[] tasks;
	private int freePlacesForTasks;
	int currentUnassignedTask;
	
	AllWork() {
	
		this.tasks = new Task[10];
		freePlacesForTasks=10;
		currentUnassignedTask=0;
		
	}
	
	void addTask(Task nextTask){
		if(freePlacesForTasks<=0){
			return;
		}
		tasks[tasks.length-freePlacesForTasks]=nextTask;
		freePlacesForTasks--;
	}
	
	Task getNextTask(){
		if(currentUnassignedTask==tasks.length){
			return null;
		}
		return tasks[currentUnassignedTask++];
	}
	
	boolean isAllWorkDone(){
		for (int i = 0; i < tasks.length-freePlacesForTasks; i++) {
			if (tasks[i].getWorkingHours()!=0){
				return false;
			}
		}
		return true;
	}

}
