import java.util.Map;


public class ProductTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		p1.setId("P001");
		p1.setName("Maruti800");
		
		p2.setId("P002");
		p2.setName("MarutiZen");
		
		p3.setId("P003");
		p3.setName("MarutiEstem");
		
		ProductOperation op = new ProductOperation();
		op.addProduct(p1);
		op.addProduct(p2);
		op.addProduct(p3);
		
		Map<String, String> pp  = op.getAllProduct();
		for (String string : pp.keySet()) {
			System.out.println(string+"\t"+pp.get(string));
		}
		
		String key  = "P001";
		System.out.println("Search Product with ID "+key);
		String nm = op.searchProduct(key);
		if(nm==null)
		{
			System.out.println("No Product with ID "+key);
		}
		else
		{
			System.out.println("Product found\nName is "+nm);
		}
	}

}
