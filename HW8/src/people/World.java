package people;

class World {

	public static void main(String[] args) {
		
		Object[] people = new Object[10];
		people[0]=new Student("Ivan Ivanov", 16, true, 4.5);
		people[1]=new Student("Katq Velikova", 15, false, 5.5);
		people[2]=new Employee("Stanislav Stankov", 25, true, 35.12);
		people[3]=new Employee("Stanka Petrova", 23, false, 31.4);
		people[4]=new Person("Petur Stefanov", 29, true);
		people[5]=new Person("Tanq Stoikova", 10, false);
		for (int i = 0; i < people.length; i++) {
			if (people[i] instanceof Student) {
				((Student) people[i]).showStudentInfo();
			}
			else{
				if (people[i] instanceof Employee) {
					((Employee) people[i]).showEmployeeInfo();
				}
				else{
					if (people[i] instanceof Person) {
						((Person) people[i]).showPersonInfo();
					}
				}
			}
		}
		for (int i = 0; i < people.length; i++) {
			if (people[i] instanceof Employee) {
				System.out.println("Salary for two hours overtime of "+((Employee) people[i]).getName()+" is "+((Employee) people[i]).calculateOvertime(2)+".");
			}
		}
	}
}

/* 
 * Може да се дефинира като се подадат дифолт данни към Person. Иначе няма да работи, защото не е достъпен 
 * Person(), защото е дефиниран Person(параметри).
 * Student(){
 *		super("Default Person", 0, true);
 * }
 * Друг вариант е да се дефинира Person() като това ще позволи той да бъде достъпен от Student().
 */
