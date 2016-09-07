import java.util.ArrayList;
import java.util.List;


public class Assingment2pPoblem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list1= new ArrayList<String>();
		
		list1.add("Dhrubo");
		list1.add("Sadia");
		list1.add("Adon");
		list1.add("Nafis");
		
		System.out.println("Students are: "+list1);
		
		String name = "Riyon";
		if(list1.contains(name))
		{
			System.out.println(name+" is present");
		}
		else
		{
			System.out.println(name+" is not present");
		}
	}

}
