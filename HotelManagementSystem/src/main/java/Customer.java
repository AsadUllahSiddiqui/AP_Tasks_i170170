import java.util.ArrayList;

public class Customer {
	 int id;
	  String name;
	  String phoneNo;
	  double Bill;
	  Rooms myroom;
	  ArrayList<Services> services;
	
	public Customer(String name, String phoneNo, double bill, Rooms myroom,ArrayList<Services> Services,int id) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		Bill = bill;
		this.myroom = myroom;
		this.services = Services;
		this.id=id;
	}
	public Customer(String name, String phoneNo,int id) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		Bill = 0;
		this.myroom = new Rooms(-1);
		this.services = new ArrayList<Services>();
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Customer() {
		super();
		this.name = "";
		this.phoneNo = "";
		Bill = 0;
		this.myroom = new Rooms(-1);
		this.services = new ArrayList<Services>();
	}
	public Customer(int roomno) {
		super();
		this.name = "";
		this.phoneNo = "";
		Bill = 0;
		this.myroom = new Rooms(roomno);
		this.services = new ArrayList<Services>();
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public double getBill() {
		this.Bill=this.CalculateBill();
		return this.Bill;
	}
	public void setBill(double bill) {
		Bill = bill;
	}
	public Rooms getMyroom() {
		return myroom;
	}
	public void setMyroom(Rooms myroom) {
		this.myroom = myroom;
	}
	public ArrayList<Services> getServices() {
		return services;
	}
	public void setServices(ArrayList<Services> services) {
		this.services = services;
	}
    public void setRoomN(Rooms r) {
    	this.myroom=r;
    }

    public void AddServices(Services s) {
    	this.services.add(s);
    	this.Bill=this.CalculateBill();
    }
    public double CalculateBill() {
    	double Bill=0;
    	for (int i=0;i<services.size();i++) {
    		Bill+=services.get(i).cost;
    	}
    	return Bill;
    }
	
}
