package collection;

//Comparable interface check.
public class Student implements Comparable<Student>{
	
	private int roll;
	private String name;
	private String subject;
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public int compareTo(Student o) {
		if(this.roll>o.roll)
			return 1;
		else if(this.roll== o.roll)
			return 0;
		else
			return -1;
	}
	
	
}
