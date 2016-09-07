import java.util.ArrayList;
import java.util.List;


public class CollectionDemo2 {
 
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		
		list1.add("Dhaka");
		list1.add("Comilla");
		list1.add("Rajshahi");
		list1.add("Khulna");
		list1.add("Barisal");
		list1.add("Shylet");
		list1.add("Chittagong");
		list1.add("Cox's Bazar");
		list1.add("Sundarban");
		
		System.out.println(list1);
		
		System.out.println("Before Removal");
		list1.remove(5);
		list1.remove("Dhaka");
		System.out.println("After Removal");
		System.out.println(list1);
		
		if(list1.contains("Barisal"))
		{
			System.out.println("Element is present");
		}
		else
		{
			System.out.println("Element is not present");
		}
	}
}
