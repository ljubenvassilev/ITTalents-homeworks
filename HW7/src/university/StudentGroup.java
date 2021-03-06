package university;

public class StudentGroup {

	String groupSubject;
	Student[] students;
	int freePlaces;
	
	StudentGroup(){
		freePlaces=5;
		students= new Student[5];
	}
	StudentGroup(String subject){
		this();
		this.groupSubject=subject;
	}
	
	void addStudent (Student s){
		if(freePlaces>=1&&s.subject.equals(groupSubject)){
			students[5-freePlaces--]=s;
		}
	}
	void emptyGroup(){
		freePlaces=5;
		students= new Student[5];
	}
	String theBestStudent(){
		Student best=students[0];
		for (int i = 1; i < students.length-freePlaces; i++) {
			if (students[i].grade>best.grade){
				best=students[i];
			}
		}
		return best.name;
	}
	void printStudentsInGroup(){
		System.out.println("Students in group "+groupSubject);
		for (int i = 0; i < students.length-freePlaces; i++) {
			students[i].printInfo();
		}
		System.out.println("-----------");
	}
}
