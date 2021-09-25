package bankManagementSystem;


public class person {
	String name;
	String address;
	String phoneNo;
	int acNo;

	
	
	public person(String Name, String Address, String PhoneNo, int AcNo) {
		this.name = Name;
		this.address = Address;
		this.phoneNo = PhoneNo;
		this.acNo = AcNo;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public int getAcNo() {
		return acNo;
	}
	public void setAcNo(int acNo) {
		this.acNo = acNo;
	}
}
