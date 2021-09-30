
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class Services {
	
	  String name;
	  double cost;
	  String type;
	  SimpleDateFormat date;
	  String info;
	  
	public SimpleDateFormat getDate() {
		return date;
	}
	public void setDate(SimpleDateFormat date) {
		this.date = date;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public Services(String name, double cost, String type,String info) {
		super();
		this.name = name;
		this.cost = cost;
		this.type = type;
//		this.date = date;
	}
	public Services() {
		super();
		this.name = "";
		this.cost = 0;
		this.type = "";
	
	}
	 
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getCost() {
		return cost;
	}
	
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
//	public SimpleDateFormat getDate() {
//		return date;
//	}
//	public void setDate(SimpleDateFormat date) {
//		this.date = date;
//	}
}
