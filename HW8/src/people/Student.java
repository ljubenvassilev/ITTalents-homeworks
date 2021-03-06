package people;

class Student extends Person{

	private double score;
	
	protected Student(String name, int age, boolean isMale, double score){
		super(name, age, isMale);
		setScore(score);
	}
	
	protected void showStudentInfo(){
		super.showPersonInfo();
		System.out.print(name+" is a student and ");
		if(isMale){
			System.out.print("his");
		}
		else{
			System.out.print("her");
		}
		System.out.println(" score is "+score+".");
	}

	protected double getScore() {
		return score;
	}

	protected void setScore(double score) {
		if (score>2&&score<6){
			this.score=score;
		}
	}
	Student(){
		super("Default Person", 0, true);
	}
}

