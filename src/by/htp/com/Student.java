package by.htp.com;

public class Student implements Comparable<Student> {
	
	private String name;
	private int age;
	
	
	public Student() {
		
	}
	
	public Student(int age) {
		this.age = age;
	}
	
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public int compareTo(Student st) {
		int anotherStudentAge = st.getAge();
		return this.age - anotherStudentAge;
	}

}
