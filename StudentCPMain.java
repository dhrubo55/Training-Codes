import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class StudentCPMain {
	
	public static void main(String[] args) {
		StudentCP student1 = new StudentCP();
		StudentCP student2 = new StudentCP();
		StudentCP student3 = new StudentCP();
		
		student1.setName("abida praveen");
		student1.setRoll(104);
		student1.setSubject("math");
		
		student2.setName("munni begum");
		student2.setRoll(101);
		student2.setSubject("science");
		
		student3.setName("gulam ali");
		student3.setRoll(103);
		student3.setSubject("bangla");
		
		List<StudentCP> slist= new ArrayList<StudentCP>();
		slist.add(student1);
		slist.add(student2);
		slist.add(student3);
		
		Collections.sort(slist);
		
		for(StudentCP student : slist) {
			System.out.println(student.getRoll()+"\t"+student.getName()+"\t"+student.getSubject());
		}
	}
}
