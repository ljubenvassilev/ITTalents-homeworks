package university;

public class College {

	public static void main(String[] args) {

		Student pesho = new Student("Pesho","Math", 25);
		Student sasho = new Student("Sasho","Music",23);
		Student ljubo = new Student("Ljubo","Java",28);
		Student krasi = new Student("Krasi","Java",30);
		Student mariq = new Student("Maria","Math",22);
		Student petq = new Student("Petq","Java",27);
		
		StudentGroup classJava = new StudentGroup("Java");
		classJava.addStudent(ljubo);
		classJava.addStudent(krasi);
		classJava.addStudent(petq);
		StudentGroup classMath = new StudentGroup("Math");	
		classMath.addStudent(pesho);
		classMath.addStudent(mariq);
		StudentGroup classMusic = new StudentGroup("Music");
		classMusic.addStudent(sasho);
		sasho.grade++;
		ljubo.grade++;
		ljubo.grade++;
		krasi.grade++;
		mariq.grade++;
		System.out.println("The best student in Java is "+classJava.theBestStudent());
		System.out.println("The best student in Math is "+classMath.theBestStudent());
		System.out.println("----------");
		classMusic.emptyGroup();
		krasi.upYear();
		krasi.upYear();
		ljubo.upYear();
		mariq.upYear();
		krasi.receiveScholarship(4.5, 100);
		ljubo.receiveScholarship(4.5, 100);
		classJava.printStudentsInGroup();
		classMusic.printStudentsInGroup();
		classMath.printStudentsInGroup();

	}

}
