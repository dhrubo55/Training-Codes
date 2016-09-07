package collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListDemo1 {
	public static void main(String[] args) {
		String language [] = {"java","python","pearl","bio"};
		ArrayList<String> list1 = new ArrayList<String>();
		for (int i = 0; i < language.length; i++) {
			list1.add(language[i]);
		}
		ListIterator<String> iterator = list1.listIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next()+" ");
		}
		iterator= list1.listIterator(list1.size());
		System.out.println("printing .hasPrevious()");
		while (iterator.hasPrevious()) {
			System.out.println(iterator.previous()+" ");
		}
	}
}
