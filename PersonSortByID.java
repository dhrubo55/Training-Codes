import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class PersonSortByID implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		Float salary1 = o1.getSalary();
		Float salary2 = o2.getSalary();
		return salary1.compareTo(salary2);
	}

}

class PersonMain
{
	void personInfo(List<Person> list)
	{
		System.out.println("ID\tName\tSalary");
		for (Person person : list) {
			System.out.println(person.getId()+"\t"+person.getName()+"\t"+person.getSalary());
		}
	}
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		
		p1.setId(1001);
		p1.setName("Dhrubo");
		p1.setSalary(150000);
		
		p2.setId(1002);
		p2.setName("Sadia");
		p2.setSalary(200000);
		
		p3.setId(1003);
		p3.setName("Adon");
		p3.setSalary(160000);
		
		List<Person> list = new ArrayList<Person>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		//Collections.sort(list, new PersonSortByID());
		Collections.sort(list, new PersonSortByName());
		PersonMain main = new PersonMain();
		main.personInfo(list);
	}
}

class PersonSortByName implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		String name1 = o1.getName();
		String name2 = o2.getName();
		return name1.compareTo(name2);
	}
}
