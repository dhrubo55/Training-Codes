import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;


public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Integer k = null;
        //Hashtable<Integer, String> map = new Hashtable<Integer, String>();
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1001, "Dhrubo");
		map.put(1002, "Sadia");
		map.put(1003, "Adon");
		map.put(1004, "Nafis");
		map.put(1005, "Riyon");
		map.put(k,"");
		
		int key = 1001;
		System.out.println(key+" is ID of "+map.get(key));
		
		System.out.println(map);
		
		Set<Integer> id = map.keySet();
		
		for (Integer integer : id) {
			System.out.println(integer+" "+map.get(integer));
		}
	}

}
