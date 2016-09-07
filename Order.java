import java.util.Date;


public class Order {

	private int id;
	private String name;
    Date order_date;
    
    public int getId() {
		return id;
	}
    public String getName() {
		return name;
	}
    public Date getOrder_date() {
		return order_date;
	}
    
    public void setId(int id) {
		this.id = id;
	}
    public void setName(String name) {
		this.name = name;
	}
    public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}
}
