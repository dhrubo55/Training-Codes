import java.util.Arrays;
import java.util.Comparator;


public class NameReverse implements Comparator<String>{

	
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}

}

class NameMain
{
	public static void main(String[] args) {
		String arr[] = {"Dhrubo","Sadia","Adon","Nafis","Karishma"};
		Arrays.sort(arr);
		
		for (String string : arr) {
			System.out.println(string+" ");
		}
		
		Arrays.sort(arr,new NameReverse());
		System.out.println("\nReverse Order\n");
		for (String string : arr) {
			System.out.println(string+" ");
		}
	}
}
