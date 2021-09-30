import static org.junit.Assert.*;

import org.junit.Test;

public class AddRooms {

	@Test
	public void addRooms() {
		Hotel hot=new Hotel();
		hot.AddRoom(0);
		assertTrue(hot.totalRooms==1);
		
	} 
	@Test
	public void getAvalableRooms() throws Exception {
		 Hotel myhotel=new Hotel();
	     myhotel.AddRoom(0);
	     myhotel.AddRoom(1);
	     myhotel.AddRoom(2);
	     Services Breakfast=new Services("Breakfast",250,"Food","Egg+Chai+Paraths");
	     Services Lunch=new Services("Lunch",250,"Food","Egg+Chai+Paraths");
	     Services Dinner=new Services("Dinner",250,"Food","Egg+Chai+Paraths");
	     Services Laundry =new Services("Laundry ",500,"Laundry","Black Suit+Blue shalwar qameez ");
	     Customer customer1=new Customer("asad","03315685559",1);
	     Customer customer2=new Customer("ali","12345678895678",2);
	     Customer customer3=new Customer("Talha","12345678895678",3);
	     System.out.println(myhotel.getTotalRooms());
	     myhotel.BookRoom(0,customer1);
	     myhotel.BookRoom(1,customer2);
	     customer2.AddServices(Breakfast);
	     customer2.AddServices(Lunch);
	     customer2.AddServices(Dinner);
	     customer2.AddServices(Laundry);
	     customer1.AddServices(Breakfast);
	     customer1.AddServices(Lunch);
	     assertTrue(myhotel.GetAvailableRooms().size()==1);
		
	} 

	@Test
	public void SearchGuest() throws Exception {
		 Hotel myhotel=new Hotel();
	     myhotel.AddRoom(0);
	     myhotel.AddRoom(1);
	     myhotel.AddRoom(2);
	     Services Breakfast=new Services("Breakfast",250,"Food","Egg+Chai+Paraths");
	     Services Lunch=new Services("Lunch",250,"Food","Egg+Chai+Paraths");
	     Services Dinner=new Services("Dinner",250,"Food","Egg+Chai+Paraths");
	     Services Laundry =new Services("Laundry ",500,"Laundry","Black Suit+Blue shalwar qameez ");
	     Customer customer1=new Customer("asad","03315685559",1);
	     Customer customer2=new Customer("ali","12345678895678",2);
	     Customer customer3=new Customer("Talha","12345678895678",3);
	     System.out.println(myhotel.getTotalRooms());
	     myhotel.BookRoom(0,customer1);
	     myhotel.BookRoom(1,customer2);
	     customer2.AddServices(Breakfast);
	     customer2.AddServices(Lunch);
	     customer2.AddServices(Dinner);
	     customer2.AddServices(Laundry);
	     customer1.AddServices(Breakfast);
	     customer1.AddServices(Lunch);
	     assertTrue(myhotel.SearchGuest(1).id==1);
		
	} 
	
	@Test
	public void BookRoom() throws Exception {
		 Hotel myhotel=new Hotel();
	     myhotel.AddRoom(0);
	     myhotel.AddRoom(1);
	     myhotel.AddRoom(2);
	     Services Breakfast=new Services("Breakfast",250,"Food","Egg+Chai+Paraths");
	     Services Lunch=new Services("Lunch",250,"Food","Egg+Chai+Paraths");
	     Services Dinner=new Services("Dinner",250,"Food","Egg+Chai+Paraths");
	     Services Laundry =new Services("Laundry ",500,"Laundry","Black Suit+Blue shalwar qameez ");
	     Customer customer1=new Customer("asad","03315685559",1);
	     Customer customer2=new Customer("ali","12345678895678",2);
	     Customer customer3=new Customer("Talha","12345678895678",3);
	     System.out.println(myhotel.getTotalRooms());
	     myhotel.BookRoom(0,customer1);
	     myhotel.BookRoom(1,customer2);
	     customer2.AddServices(Breakfast);
	     customer2.AddServices(Lunch);
	     customer2.AddServices(Dinner);
	     customer2.AddServices(Laundry);
	     customer1.AddServices(Breakfast);
	     customer1.AddServices(Lunch);
	     assertTrue(myhotel.GetAvailableRooms().size()==1);
		
	} 
	@Test
	public void ReserveRooms() throws Exception {
		 Hotel myhotel=new Hotel();
	     myhotel.AddRoom(0);
	     myhotel.AddRoom(1);
	     myhotel.AddRoom(2);
	     Services Breakfast=new Services("Breakfast",250,"Food","Egg+Chai+Paraths");
	     Services Lunch=new Services("Lunch",250,"Food","Egg+Chai+Paraths");
	     Services Dinner=new Services("Dinner",250,"Food","Egg+Chai+Paraths");
	     Services Laundry =new Services("Laundry ",500,"Laundry","Black Suit+Blue shalwar qameez ");
	     Customer customer1=new Customer("asad","03315685559",1);
	     Customer customer2=new Customer("ali","12345678895678",2);
	     Customer customer3=new Customer("Talha","12345678895678",3);
	     System.out.println(myhotel.getTotalRooms());
	     myhotel.ReserveRoom(0,customer1);
	     myhotel.ReserveRoom(1,customer2);
	     customer2.AddServices(Breakfast);
	     customer2.AddServices(Lunch);
	     customer2.AddServices(Dinner);
	     customer2.AddServices(Laundry);
	     customer1.AddServices(Breakfast);
	     customer1.AddServices(Lunch);
	     assertTrue(myhotel.GetAvailableRooms().size()==1);	
	} 
}
