package by.htp.com;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student st, Student st1) {
		
		String string1 = st.getName();
		String string2 = st1.getName();
		
		//У string есть свой метод compareTo!!!
		
		if(string1.compareTo(string2) > 0) {
			return 1;
		} else if (string1.compareTo(string2) == 0) {
			if(st.compareTo(st1) > 0) {
				return 1;
			}
		}
		
		
		return 0;
	}

}
