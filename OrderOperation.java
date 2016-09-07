import java.util.ArrayList;
import java.util.List;


public class OrderOperation {

	List<Order> list1;
	public OrderOperation()
	{
		list1 = new ArrayList<Order>();
	}
	
	public void addOrder(Order ord)
	{
		list1.add(ord);
	}
	
	public List<Order> getOrder()
	{
		return list1;
	}
	
	Order order1;
	public Order searchOrder(Order ord)
	{
		if(list1.contains(ord))
		{
			order1 = ord;
		}
		return order1;
	}
	
	boolean status = false;
	public boolean removeOrder(Order ord)
	{
		if(list1.contains(ord))
		{
			list1.remove(ord);
			status = true;
		}
		return status;
	}
}
