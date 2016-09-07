package collection;

import java.util.Vector;

public class VectorDemo {
	
	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<Integer>();
		System.out.println(vector.capacity());
		
		for (int i = 0; i <=11; i++) {
			System.out.println(vector.capacity()+"\t"+vector.size());
			vector.add(i);
		}
		System.out.println(vector);
		vector.add(1);
		System.out.println(vector);
	}
}
