
public class ArrayCopyTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ar1 [] = {1,2,3,4,5};
		int ar2 [] = {11,22,33,44,55,66,77,88,99};
		System.arraycopy(ar1, 0, ar2, 5, 4);
		for (int i : ar2) {
			System.out.print(i+" ");
		}
	}

}
