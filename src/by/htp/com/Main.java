package by.htp.com;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Group gr = new Group(5);
		
		Student st1 = new Student(5);
		Student st2 = new Student(4);
		Student st3 = new Student(55);
		Student st4 = new Student(34);
		Student st5 = new Student(100);
		
		gr.addStudent(st1);
		gr.addStudent(st2);
		gr.addStudent(st3);
		gr.addStudent(st4);
		gr.addStudent(st5);
		
		gr.sortStudentsByAge();
		
		for(Student st: gr.getStudents()) {
			System.out.println("Student sorted by Age: " + st.getAge());
		}
		
		System.out.println(" ");
		
		Group gr1 = new Group(5);
		
		Student st6 = new Student("Ira", 2);
		Student st7 = new Student("Olya", 8);
		Student st8 = new Student("Olya", 4);
		Student st9 = new Student("Ilona", 6);
		Student st10 = new Student("Anay", 1);
		
		gr1.addStudent(st6);
		gr1.addStudent(st7);
		gr1.addStudent(st8);
		gr1.addStudent(st9);
		gr1.addStudent(st10);
		
		gr1.sortStudentsByName();
		
		for(Student st: gr1.getStudents()) {
			System.out.println("Student sorted by Name and Age: "  + st.getName()+ " " + st.getAge());
		}
		
		String a = "Ama";
		
		System.out.println(" ");
		
	}

}
