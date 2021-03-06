package university;

public class Student {

	String name;
	String subject;
	double grade;
	int yearInCollege;
	int age;
	boolean isDegree;
	double money;
	
	Student(){
		grade=4.0;
		yearInCollege=1;
		isDegree=false;
		money=0;
	}
	Student (String name,String subject,int age){
		this();
		this.name=name;
		this.subject=subject;
		this.age=age;
	}
	void upYear(){
		if(isDegree){
			System.out.println(this.name+" has graduated!");
			return;
		}
		if(++yearInCollege==4){
			isDegree=true;
		}
		age++;
	}
	double receiveScholarship(double min, double amount){
		if (grade>=min&&age<30){
			money+=amount;
		}
		return money;
	}
	void printInfo(){
		System.out.println(name+" is "+age+" years old and has received USD "+money+" scholarship.");
		if(isDegree){
			System.out.println(name+" has graduated after 4 years studying "+subject+" with grade "+grade);
			return;
		}
		System.out.println(name+" studies "+subject+" for "+yearInCollege+" years and his grade is "+grade);
	}
}
