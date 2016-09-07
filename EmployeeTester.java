import java.util.List;
import java.util.Map;


public class EmployeeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		Employee e4 = new Employee();
		
		e1.setId(1001);
		e1.setLocation("Dhaka");
		e1.setName("Dhrubo");
		e1.setSalary(150000.0000000000000000000000000000000000f);
		
		e2.setId(1002);
		e2.setLocation("Dhaka");
		e2.setName("Sadia");
		e2.setSalary(1000000);
		
		e3.setId(1003);
		e3.setLocation("Barisal");
		e3.setName("Adon");
		e3.setSalary(1000000);
		
		e4.setId(1004);
		e4.setLocation("Khulna");
		e4.setName("Nafis");
		e4.setSalary(1000000);
		
		EmployeeOperation op = new EmployeeOperation();
		op.addEmployee(e1);
		op.addEmployee(e2);
		op.addEmployee(e3);
		op.addEmployee(e4);
		
		Map<Integer, List<Object>> empt = op.getAllEmployee();
		for (Integer k : empt.keySet()) {
			System.out.println(k+"\t"+empt.get(k));
		}
		
//		Integer key  = 1001;
//		System.out.println("Search Department with ID "+key);
//		Object nm = op.searchEmployee(key);
//		if(nm==null)
//		{
//			System.out.println("No Department with ID "+key);
//		}
//		else
//		{
//			System.out.println("Department found\n Name is "+nm);
//		}
	}

}
