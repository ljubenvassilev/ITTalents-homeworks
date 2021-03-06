package people;

class Person {
	
	protected final String name;
	public String getName() {
		return name;
	}

	private int age;
	protected final boolean isMale;

	protected int getAge() {
		return age;
	}
	protected void setAge(int age) {
		if (age>0&&age<150){
			this.age = age;
			return;
		}
		System.out.println("Wrong age!");
	}
	protected Person(String name, int age, boolean isMale) {
		this.name = name;
		setAge(age);
		this.isMale = isMale;
	}
	
	void showPersonInfo(){
		System.out.print("This person is called "+name+", age "+age+" and is ");
		if(isMale){
			System.out.println("male.");
		}
		else{
			System.out.println("female.");
		}
	}
	

}
