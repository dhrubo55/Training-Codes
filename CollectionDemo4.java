import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class CollectionDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<String>();
		list.add("pen");
		list.add("book");
		list.add("khata");
		list.add("mobile");
		list.add("apple");
		list.add("eraser");
		
		
		Collections.sort(list);
		System.out.println(list);
		
		String s = "Pen";
		int pos = Collections.binarySearch(list,s);
		if(pos>=0)
		{
			System.out.println(s+" found at: "+pos);
		}
		else
		{
			System.out.println(s+" not present");
		}
		
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));
		
		System.out.println("Reversing");
		Collections.reverse(list);
		System.out.println(list);
		
		Collections.shuffle(list);
		System.out.println("Shuffeld "+ list);
	}

}
