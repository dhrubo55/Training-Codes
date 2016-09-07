import java.util.Map;


public class DepartmentTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Department d1 = new Department();
		Department d2 = new Department();
		Department d3 = new Department();
		
		d1.setId(1001);
		d1.setName("Training");
		
		d2.setId(1002);
		d2.setName("Managment");
		
		d3.setId(1003);
		d3.setName("Placement");
		
		DepartmentOperation op = new DepartmentOperation();
		op.addDepartment(d1);
		op.addDepartment(d2);
		op.addDepartment(d3);
		
		Map<Integer, String> dept  = op.getAllDepartment();
		
		for (Integer k : dept.keySet()) {
			System.out.println(k+"\t"+dept.get(k));
		}
		
		int key  = 1001;
		System.out.println("Search Department with ID "+key);
		String nm = op.searchDepartment(key);
		if(nm==null)
		{
			System.out.println("No Department with ID "+key);
		}
		else
		{
			System.out.println("Department found\n Name is "+nm);
		}
	}

}
