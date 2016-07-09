package people;

class Employee extends Person{

	private double daySalary;
		
	protected double getDaySalary() {
		return daySalary;
	}

	protected void setDaySalary(double daySalary) {
		if (daySalary>0){
			this.daySalary=daySalary;
		}
	}

	protected Employee(String name, int age, boolean isMale, double daySalary ) {
		super(name, age, isMale);
		setDaySalary(daySalary);
	}
	
	double calculateOvertime(double hours){
		if(getAge()>=18){
			return daySalary*hours;
		}
		return daySalary;
	}
	protected void showEmployeeInfo(){
		super.showPersonInfo();
		System.out.println("The daily salary is "+daySalary+".");
	}
}
