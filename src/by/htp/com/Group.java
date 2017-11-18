package by.htp.com;

public class Group {
	
	private Student[] students;
	private int count = 0;
	
	
	
	
	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Group(int size) {
		students = new Student[size];
	}
	
	public void addStudent(Student st) {
		students[count] = st;
		count++;
	}
	
	public Group sortStudentsByAge() {
		
		int q = 0;
		
		for (int i = students.length - 1; i >= 0; i-- ) {
			
			for (int j = 0; j < i; j++) {
				
				if(q < students[j].compareTo(students[j+1])) {
					
					Student studentToReplace = students[j];
					students[j] = students[j+ 1];
					students[j + 1] = studentToReplace;
					

				}
				
			}
		}
		
		return null;
	}
	
	public Group sortStudentsByName() {
		
		StudentComparator stComp = new StudentComparator();
		
		int q = 0;
		
		for (int i = students.length - 1; i >= 0; i-- ) {
			
			for (int j = 0; j < i; j++) {
				
				if(q < stComp.compare(students[j], students[j+1])) {
					
					Student studentToReplace = students[j];
					students[j] = students[j+ 1];
					students[j + 1] = studentToReplace;
					

				}
				
			}
		}
		
		return null;
	}

}
