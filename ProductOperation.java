import java.util.Hashtable;
import java.util.List;
import java.util.Map;


public class ProductOperation {

	Map<String, String> pr;
	
	public ProductOperation()
	{
	 pr	= new Hashtable<String, String>();
	}
	
	public void addProduct(Product pro)
	{
		pr.put(pro.getId(), pro.getName());
	}
	
	public Map<String, String> getAllProduct()
	{
		return pr;
      
	}
	
	public String searchProduct(String id)
	{
		return pr.get(id);
	}
}