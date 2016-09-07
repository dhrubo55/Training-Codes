package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentMain {
	
	public static void main(String[] args) {
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		
		student1.setName("abida praveen");
		student1.setRoll(104);
		student1.setSubject("math");
		
		student2.setName("munni begum");
		student2.setRoll(101);
		student2.setSubject("science");
		
		student3.setName("gulam ali");
		student3.setRoll(103);
		student3.setSubject("bangla");
		
		List<Student> slist= new ArrayList<Student>();
		slist.add(student1);
		slist.add(student2);
		slist.add(student3);
		
		Collections.sort(slist);
		
		for(Student student : slist) {
			System.out.println(student.getRoll()+"\t"+student.getName()+"\t"+student.getSubject());
		}
	}
}
