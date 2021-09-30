import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
public class Hotel {
	 int totalRooms;
	 String name;
	 String address;
	 ArrayList<Rooms> rooms;
	 ArrayList<Customer> customers;

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

	public int getTotalRooms() {
		return totalRooms;
	}

	public void setTotalRooms(int totalRooms) {
		this.totalRooms = totalRooms;
	}

	public ArrayList<Rooms> getRooms() {
		return rooms;
	}

	public void setRooms(ArrayList<Rooms> rooms) {
		this.rooms = rooms;
	}

	public Hotel(String name, String address, ArrayList<Rooms> rooms,ArrayList<Customer> customer) {
		super();
		this.name = name;
		this.address = address;
		this.rooms = rooms;
		this.totalRooms=rooms.size();
		this.customers=customer;
	}
	
	public Hotel() {
		super();
		this.name = "New Hotel";
		this.address = "XYZ";
		this.rooms =new ArrayList<Rooms>();
		this.customers=new ArrayList<Customer>();
		this.totalRooms=0;
	}

	//........................................................
	public void AddRoom( int id ) {
		
		this.rooms.add(new Rooms(id));
		this.totalRooms+=1;
		
	}
	
	public void ReserveRoom( int Id,Customer customer)  throws Exception {
		for(int i=0;i<this.rooms.size();i++) {
			if (Id==this.rooms.get(i).id) {
				if(this.rooms.get(i).status.equals("available"))
				{
				this.rooms.get(i).status="reserved";
				this.rooms.get(i).setCustomer(customer);
				customer.setRoomN(this.rooms.get(i));
				}
				else {
					throw new Exception("Room is already "+this.rooms.get(i).status);
				}
				
			}
		}
		this.customers.add(customer);
	}
	
	public void BookRoom( int Id,Customer customer) throws Exception {
		for(int i=0;i<this.rooms.size();i++) {
			if (Id==this.rooms.get(i).id) {
				if(this.rooms.get(i).status.equals("available"))
				{
				this.rooms.get(i).status="Booked";
				this.rooms.get(i).setCustomer(customer);
				customer.setRoomN(this.rooms.get(i));
				}
				else {
					throw new Exception("Room is already "+rooms.get(i).status);
				}
				
			}
		}
		this.customers.add(customer);
	}
	
	public ArrayList<Rooms> GetAvailableRooms() {
		ArrayList<Rooms> availablerooms=new ArrayList<Rooms>();
		for(int i=0;i<this.rooms.size();i++) {
			if(this.rooms.get(i).status=="available") {
				availablerooms.add(this.rooms.get(i));
			}
		}
		return availablerooms;
	}
	
	public void  DisplayAvailableRooms(){
		ArrayList<Rooms> availablerooms=GetAvailableRooms();
		for(int i=0;i<this.rooms.size();i++) {
			if(this.rooms.get(i).status=="available") {
				System.out.println(this.rooms.get(i).id);
			}
		}
	}
	
	public Customer SearchGuest(int id) throws Exception {
		for(int i=0;i<this.customers.size();i++) {
			if(id==this.customers.get(i).getId()) {
				return this.customers.get(i);
			}
			
		}
			throw new Exception("Customer not exist");
	}
	
	public void DisplayGuest(int id) throws Exception {
		Customer c=SearchGuest(id);
		System.out.println("Name:"+c.getName());
		System.out.println("Phone No:"+c.getPhoneNo());
		System.out.println("Room No"+c.getMyroom().getId());
		System.out.println("Bill:"+c.getBill());
		System.out.println("......Services.......");
		for(int i=0;i<c.getServices().size();i++) {
			System.out.println("Services " +i+" : "+c.getServices().get(i).getName()+"("+c.getServices().get(i).getType()+")");
		}
	}
	public void WritetoFile() throws IOException {
		 FileWriter myWriter = new FileWriter("HotelData.txt");
		   try {
			   
			      myWriter.write("...............Customers..................."+"\n");
			      String cust="";
			      for(int i=0;i<this.customers.size();i++) {
			    	   cust=this.customers.get(i).name +" , "+
			    			       this.customers.get(i).phoneNo+" , "+ "RoomNo :"+
					    		   this.customers.get(i).myroom.id+" Bill :"+this.customers.get(i).getBill()+"\n";
			    	   myWriter.write(cust);
			      }
			      
			      String rm ="";
			      myWriter.write("...............Rooms..................."+"\n");
			      for(int i=0;i<this.rooms.size();i++) {
			    	   rm=this.rooms.get(i).getId() +" , "+
			    			       this.rooms.get(i).getStatus()+"\n";
			    	   myWriter.write(rm);
			    	   
			      }
			    
			      System.out.println("Successfully wrote to the file.");
			    } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    }finally {
			    	myWriter.close();
			    }
	}
}
