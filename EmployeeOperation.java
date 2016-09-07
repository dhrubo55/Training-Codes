import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;



public class EmployeeOperation {

	Map<Integer, List<Object>> emp = new Hashtable<Integer, List<Object>>();
	List<Object> elist = new ArrayList<Object>();
	
	public void addEmployee(Employee e)
	{
		elist.add(e.getName());
		elist.add(e.getSalary());
		elist.add(e.getLocation());
		
		emp.put(e.getId(), elist);
	}
	
	public Map<Integer, List<Object>> getAllEmployee()
	{
		return emp;
		
	}

//	public Object searchEmployee(Integer key) {
//		// TODO Auto-generated method stub
//		return emp.getID(key);
//	}
}
