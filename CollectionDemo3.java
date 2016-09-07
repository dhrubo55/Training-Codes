import java.util.Date;
import java.util.List;


public class CollectionDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Order order1 = new Order();
	   Order order2 = new Order();
	   Order order3 = new Order();
	   
	   order1.setId(1001);
	   order1.setName("Book Order");
	   order1.setOrder_date(new Date(2016-1900,6,21));
	   
	   order2.setId(1002);
	   order2.setName("Fruit Order");
	   order2.setOrder_date(new Date());
	   
	   order3.setId(1003);
	   order3.setName("Mobile Order");
	   order3.setOrder_date(new Date(2016-1900,6,21));
	   
	   OrderOperation op = new OrderOperation();
	   
	   op.addOrder(order1);
	   op.addOrder(order2);
	   op.addOrder(order3);
	   
	   List<Order> list1 = op.getOrder();
	   System.out.println("Order Details");
	   System.out.println("ID\tName\t        Date");
	   
	   
	   for (Order order : list1) {
		System.out.println(order.getId()+"\t"+order.getName()+"\t"+order.getOrder_date());
	}
	   
	   System.out.println("Search Order");
	   Order order4 = new Order();
	   Order ord1 = op.searchOrder(order3);
	   
	   if(ord1==null)
	   {
		   System.out.println("Order Not present");
	   }
	   else 
	   {
		   System.out.println("Order Found");
		   System.out.println("ID\tName\t        Date");
		   System.out.println(ord1.getId()+"\t"+ord1.getName()+"\t"+ord1.getOrder_date());
	   }
	   
	   System.out.println("Order Removal");
	   boolean flag = op.removeOrder(order3);
	   if(flag)
	   {
		   System.out.println("Order Found and Removed");
	   }
	   else 
	   {
		   System.out.println("Order Not Found and Not Removed");
	   }
	   
	   for (Order order : list1) {
			System.out.println(order.getId()+"\t"+order.getName()+"\t"+order.getOrder_date());
		}
	}

}
