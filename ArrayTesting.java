import java.util.Arrays;


public class ArrayTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ar1 [] = {202,101,2,30,5,1};
		Arrays.sort(ar1);
		for (int i : ar1) {
			System.out.println(i+" ");
		}
		
		int search = 30;
		int pos  = Arrays.binarySearch(ar1, search);
		
		if(pos>=0)
		{
			System.out.println(search+" Found at "+pos+" Position");
		}
		else
		{
			System.out.println(search+" not found");
		}
	}

}
