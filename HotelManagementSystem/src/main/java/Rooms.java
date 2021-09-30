
public class Rooms {
	
	  public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	int id;
	  Customer customer;
	  String status;
	
	
	public Rooms(int id, String status) {
		super();
		this.id = id;
		this.status = status;
		this.customer=null;
		
	}
	public Rooms(int id) {
		super();
		this.id = id;
		this.status = "available";
		this.customer=null;	
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
