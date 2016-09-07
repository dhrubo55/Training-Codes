
public class Employee {

	private int id;
	private String  name;
	private float salary;
	private String location;
	
	public int getId() {
		return id;
	}
	
	public String getLocation() {
		return location;
	}
	
	public String getName() {
		return name;
	}
	public float getSalary() {
		return salary;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
}
