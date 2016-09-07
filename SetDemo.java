package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		Set<String> set1 =new LinkedHashSet<String>();	//returns in order. it is ordered.
//				new TreeSet<String>(); 	//all the elements are automtacilly sorted.
//				new HashSet<String>();  element are not sorted.
		set1.add("Laptop");
		set1.add("Mobile");
		set1.add("Iphone");
		set1.add("Ipad");
		set1.add("Mobile");
		System.out.println(set1);
//		set is unordered. not maintains index.  sub-class==> HashSet, linkedHashSet, TreeSet.
//		List is ordered. maintains index. sub-class==> ArrayList, Vector, LinkedList.
		
		for(String string : set1) {
			System.out.println(string+" ");
		}
		
	}

}
