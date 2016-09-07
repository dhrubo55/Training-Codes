import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class CollectionDemo1 {

	public static void main(String[] args) {
		//Collection list1 = new ArrayList();
		List list1 = new ArrayList();
		list1.add(1234);
		list1.add("hello");
		list1.add(new Integer(200));
		
		System.out.println(list1);
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		
		System.out.println("Using For loop");
		for(int i=0; i<list1.size(); i++)
		{
			System.out.println(list1.get(i));
		}
		System.out.println("Using for each loop with Object container");
		for (Object object : list1) {
			System.out.println(object);
		}
	}
}
