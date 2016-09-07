import java.util.HashMap;
import java.util.Map;


public class DepartmentOperation {

	Map<Integer, String> dept_map;
	
	public DepartmentOperation()
	{
		dept_map = new HashMap<Integer, String>();
	}
	
	public void addDepartment(Department dept)
	{
		dept_map.put(dept.getId(), dept.getName());
	}
	
	public Map<Integer, String> getAllDepartment()
	{
		return dept_map;
      
	}
	
	public String searchDepartment(Integer id)
	{
		return dept_map.get(id);
	}
	
	
}
