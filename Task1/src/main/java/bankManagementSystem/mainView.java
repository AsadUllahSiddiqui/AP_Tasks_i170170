package bankManagementSystem;


import java.util.Scanner;

public class mainView {
	

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		int number = 1;
		int interest=0;
		int i=0;
		Scanner myObj = new Scanner(System.in);
		Bank bank=new Bank();
		while (i!=1) {
		switch (number) {
		  case 1:
			  System.out.println(  "_______________________        ____________________________________________");
			    System.out.println("| 2| new acount.        |      |                                            |");
			    System.out.println("|__|____________________|      |                    WELCOME                 |");
			    System.out.println("| 3| Login.             |      |                                            |");
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 4| Account Details.   |      |        CURRENT ACOUNT: "+bank.currentacount());
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 5| Account Log.       |      |        ACCOUNT TYPE  : "+bank.currenttype());
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 6| set interest.      |      |        USER NAME     : "+bank.currentuser().name);
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 7| Deposit Amount     |      |        USER Address  : "+bank.currentuser().address);                 
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 8| Withdraw Amount.   |      |        USER PHONE NO : "+bank.currentuser().phoneNo);
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 9| Check Balance.     |      |                                            |");
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("|10| Calculate Zakat.   |      |                                            |");
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("|11| Close Acount.      |      |                                            |");
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("|12| Calculate interest |      |                                            |");
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("|13| Transfer Amount    |      |                                            |");
			    System.out.println("|__|____________________|      |____________________________________________|");
			   
		    
			    number=myObj.nextInt(); 
		    break;
		  case 2:
			    System.out.println("Enter User Name :");
				String name = myObj.nextLine();
				
			    System.out.println("Enter User Address :");
			    String address = myObj.nextLine();
			    
			    System.out.println("Enter User Phone No :");
			    String  phoneNo = myObj.nextLine();
			    
			    System.out.println("Type 1 for (saving) or 2 for (checking).");
			    int type = myObj.nextInt();
			    System.out.println("Enter new Acount Number:");
     	    	int acountno = myObj.nextInt();
			    bank.newAccount(name,address,phoneNo,type,acountno);
				  System.out.println(  "_______________________        ____________________________________________");
				    System.out.println("| 2| new acount.        |      |                                            |");
				    System.out.println("|__|____________________|      |                    WELCOME                 |");
				    System.out.println("| 3| Login.             |      |                                            |");
				    System.out.println("|__|____________________|      |                                            |");
				    System.out.println("| 4| Account Details.   |      |        CURRENT ACOUNT: "+bank.currentacount());
				    System.out.println("|__|____________________|      |                                            |");
				    System.out.println("| 5| Account Log.       |      |        ACCOUNT TYPE  : "+bank.currenttype());
				    System.out.println("|__|____________________|      |                                            |");
				    System.out.println("| 6| set interest.      |      |        USER NAME     : "+bank.currentuser().name);
				    System.out.println("|__|____________________|      |                                            |");
				    System.out.println("| 7| Deposit Amount     |      |        USER Address  : "+bank.currentuser().address);                 
				    System.out.println("|__|____________________|      |                                            |");
				    System.out.println("| 8| Withdraw Amount.   |      |        USER PHONE NO : "+bank.currentuser().phoneNo);
				    System.out.println("|__|____________________|      |                                            |");
				    System.out.println("| 9| Check Balance.     |      |                                            |");
				    System.out.println("|__|____________________|      |                                            |");
				    System.out.println("|10| Calculate Zakat.   |      |                                            |");
				    System.out.println("|__|____________________|      |                                            |");
				    System.out.println("|11| Close Acount.      |      |                                            |");
				    System.out.println("|__|____________________|      |                                            |");
				    System.out.println("|12| Calculate interest |      |                                            |");
				    System.out.println("|__|____________________|      |                                            |");
				    System.out.println("|13| Transfer Amount    |      |                                            |");
				    System.out.println("|__|____________________|      |____________________________________________|");
				   
			    number=myObj.nextInt(); 
		     
		    break;
		  case 3:
			  bank.login();
			  System.out.println(  "_________Welcome________  C");
			    System.out.println("| 2| new acount.        | U");
			    System.out.println("|__|____________________| R");
			    System.out.println("| 3| Login.             | R");
			    System.out.println("|__|____________________| E");
			    System.out.println("| 4| Account Details.   | N");
			    System.out.println("|__|____________________| t");
			    System.out.println("| 5| Account Log.       | ");
			    System.out.println("|__|____________________| A");
			    System.out.println("| 6| set interest.      | C");
			    System.out.println("|__|____________________| C");
			    System.out.println("| 7| Deposit Amount     | O");
			    System.out.println("|__|____________________| U");
			    System.out.println("| 8| Withdraw Amount.   | N");
			    System.out.println("|__|____________________| T");
			    System.out.println("| 9| Check Balance.     |");
			    System.out.println("|__|____________________| N");
			    System.out.println("|10| Calculate Zakat.   | O");
			    System.out.println("|__|____________________| ");
			    System.out.println("|11| Close Acount.      | "+bank.currentacount());
			    System.out.println("|__|____________________|"+bank.currenttype());
			    System.out.println("|12| Calculate interest | ");
			    System.out.println("|__|____________________|");
			    System.out.println("|13| Transfer Amount    | ");
			    System.out.println("|__|____________________|");
			    System.out.println("*******select option*****");
			    number=myObj.nextInt(); 
		    break;
		  case 4:
			  bank.accountDetails();
			  System.out.println(  "_______________________        ____________________________________________");
			    System.out.println("| 2| new acount.        |      |                                            |");
			    System.out.println("|__|____________________|      |                    WELCOME                 |");
			    System.out.println("| 3| Login.             |      |                                            |");
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 4| Account Details.   |      |        CURRENT ACOUNT: "+bank.currentacount());
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 5| Account Log.       |      |        ACCOUNT TYPE  : "+bank.currenttype());
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 6| set interest.      |      |        USER NAME     : "+bank.currentuser().name);
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 7| Deposit Amount     |      |        USER Address  : "+bank.currentuser().address);                 
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 8| Withdraw Amount.   |      |        USER PHONE NO : "+bank.currentuser().phoneNo);
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 9| Check Balance.     |      |                                            |");
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("|10| Calculate Zakat.   |      |                                            |");
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("|11| Close Acount.      |      |                                            |");
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("|12| Calculate interest |      |                                            |");
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("|13| Transfer Amount    |      |                                            |");
			    System.out.println("|__|____________________|      |____________________________________________|");
			   
			    number=myObj.nextInt(); 
		    break;
		  case 5:
			  bank.accountsDeductionsDetais();
			  System.out.println(  "_______________________        ____________________________________________");
			    System.out.println("| 2| new acount.        |      |                                            |");
			    System.out.println("|__|____________________|      |                    WELCOME                 |");
			    System.out.println("| 3| Login.             |      |                                            |");
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 4| Account Details.   |      |        CURRENT ACOUNT: "+bank.currentacount());
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 5| Account Log.       |      |        ACCOUNT TYPE  : "+bank.currenttype());
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 6| set interest.      |      |        USER NAME     : "+bank.currentuser().name);
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 7| Deposit Amount     |      |        USER Address  : "+bank.currentuser().address);                 
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 8| Withdraw Amount.   |      |        USER PHONE NO : "+bank.currentuser().phoneNo);
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 9| Check Balance.     |      |                                            |");
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("|10| Calculate Zakat.   |      |                                            |");
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("|11| Close Acount.      |      |                                            |");
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("|12| Calculate interest |      |                                            |");
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("|13| Transfer Amount    |      |                                            |");
			    System.out.println("|__|____________________|      |____________________________________________|");
			   
			    number=myObj.nextInt(); 
		    break;
		  case 6:
			  bank.setInterestRate();
			  System.out.println(  "_______________________        ____________________________________________");
			    System.out.println("| 2| new acount.        |      |                                            |");
			    System.out.println("|__|____________________|      |                    WELCOME                 |");
			    System.out.println("| 3| Login.             |      |                                            |");
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 4| Account Details.   |      |        CURRENT ACOUNT: "+bank.currentacount());
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 5| Account Log.       |      |        ACCOUNT TYPE  : "+bank.currenttype());
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 6| set interest.      |      |        USER NAME     : "+bank.currentuser().name);
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 7| Deposit Amount     |      |        USER Address  : "+bank.currentuser().address);                 
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 8| Withdraw Amount.   |      |        USER PHONE NO : "+bank.currentuser().phoneNo);
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 9| Check Balance.     |      |                                            |");
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("|10| Calculate Zakat.   |      |                                            |");
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("|11| Close Acount.      |      |                                            |");
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("|12| Calculate interest |      |                                            |");
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("|13| Transfer Amount    |      |                                            |");
			    System.out.println("|__|____________________|      |____________________________________________|");
			   
			    number=myObj.nextInt(); 
		    break;
		  case 7:
			  double amount;
				System.out.println("Please enter Amount:");
			    amount=myObj.nextDouble();
			  bank.makeDeposit(amount);
			  System.out.println(  "_______________________        ____________________________________________");
			    System.out.println("| 2| new acount.        |      |                                            |");
			    System.out.println("|__|____________________|      |                    WELCOME                 |");
			    System.out.println("| 3| Login.             |      |                                            |");
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 4| Account Details.   |      |        CURRENT ACOUNT: "+bank.currentacount());
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 5| Account Log.       |      |        ACCOUNT TYPE  : "+bank.currenttype());
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 6| set interest.      |      |        USER NAME     : "+bank.currentuser().name);
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 7| Deposit Amount     |      |        USER Address  : "+bank.currentuser().address);                 
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 8| Withdraw Amount.   |      |        USER PHONE NO : "+bank.currentuser().phoneNo);
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 9| Check Balance.     |      |                                            |");
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("|10| Calculate Zakat.   |      |                                            |");
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("|11| Close Acount.      |      |                                            |");
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("|12| Calculate interest |      |                                            |");
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("|13| Transfer Amount    |      |                                            |");
			    System.out.println("|__|____________________|      |____________________________________________|");
			   
			    number=myObj.nextInt(); 
		    break;
		  case 8:
			    
				System.out.println("Please enter Amount:");
			    amount=myObj.nextDouble();
			  bank.withdraw(amount);
			  System.out.println(  "_______________________        ____________________________________________");
			    System.out.println("| 2| new acount.        |      |                                            |");
			    System.out.println("|__|____________________|      |                    WELCOME                 |");
			    System.out.println("| 3| Login.             |      |                                            |");
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 4| Account Details.   |      |        CURRENT ACOUNT: "+bank.currentacount());
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 5| Account Log.       |      |        ACCOUNT TYPE  : "+bank.currenttype());
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 6| set interest.      |      |        USER NAME     : "+bank.currentuser().name);
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 7| Deposit Amount     |      |        USER Address  : "+bank.currentuser().address);                 
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 8| Withdraw Amount.   |      |        USER PHONE NO : "+bank.currentuser().phoneNo);
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 9| Check Balance.     |      |                                            |");
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("|10| Calculate Zakat.   |      |                                            |");
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("|11| Close Acount.      |      |                                            |");
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("|12| Calculate interest |      |                                            |");
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("|13| Transfer Amount    |      |                                            |");
			    System.out.println("|__|____________________|      |____________________________________________|");
			   
			    number=myObj.nextInt(); 
			     
			    break;
		  case 9:
			  bank.checkBalance();
			  System.out.println(  "_______________________        ____________________________________________");
			    System.out.println("| 2| new acount.        |      |                                            |");
			    System.out.println("|__|____________________|      |                    WELCOME                 |");
			    System.out.println("| 3| Login.             |      |                                            |");
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 4| Account Details.   |      |        CURRENT ACOUNT: "+bank.currentacount());
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 5| Account Log.       |      |        ACCOUNT TYPE  : "+bank.currenttype());
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 6| set interest.      |      |        USER NAME     : "+bank.currentuser().name);
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 7| Deposit Amount     |      |        USER Address  : "+bank.currentuser().address);                 
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 8| Withdraw Amount.   |      |        USER PHONE NO : "+bank.currentuser().phoneNo);
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 9| Check Balance.     |      |                                            |");
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("|10| Calculate Zakat.   |      |                                            |");
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("|11| Close Acount.      |      |                                            |");
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("|12| Calculate interest |      |                                            |");            
			    System.out.println("|__|____________________|      |Total no of diposit :"+bank.currenttotaldeposit());
			    System.out.println("|13| Transfer Amount    |      |Total no of withdraw:"+bank.currenttotalWithdra());
			    System.out.println("|__|____________________|      |____________________________________________|");
			   
			    number=myObj.nextInt(); 
			    break;
		  case 10:
			  bank.calculateZakat();
			  System.out.println(  "_______________________        ____________________________________________");
			    System.out.println("| 2| new acount.        |      |                                            |");
			    System.out.println("|__|____________________|      |                    WELCOME                 |");
			    System.out.println("| 3| Login.             |      |                                            |");
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 4| Account Details.   |      |        CURRENT ACOUNT: "+bank.currentacount());
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 5| Account Log.       |      |        ACCOUNT TYPE  : "+bank.currenttype());
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 6| set interest.      |      |        USER NAME     : "+bank.currentuser().name);
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 7| Deposit Amount     |      |        USER Address  : "+bank.currentuser().address);                 
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 8| Withdraw Amount.   |      |        USER PHONE NO : "+bank.currentuser().phoneNo);
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 9| Check Balance.     |      |                                            |");
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("|10| Calculate Zakat.   |      |                                            |");
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("|11| Close Acount.      |      |                                            |");
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("|12| Calculate interest |      |                                            |");
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("|13| Transfer Amount    |      |                                            |");
			    System.out.println("|__|____________________|      |____________________________________________|");
			   
			    number=myObj.nextInt(); 
			     
			    break;
		  case 11:
			  bank.closeAccount();
			  System.out.println(  "_______________________        ____________________________________________");
			    System.out.println("| 2| new acount.        |      |                                            |");
			    System.out.println("|__|____________________|      |                    WELCOME                 |");
			    System.out.println("| 3| Login.             |      |                                            |");
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 4| Account Details.   |      |        CURRENT ACOUNT: "+bank.currentacount());
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 5| Account Log.       |      |        ACCOUNT TYPE  : "+bank.currenttype());
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 6| set interest.      |      |        USER NAME     : "+bank.currentuser().name);
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 7| Deposit Amount     |      |        USER Address  : "+bank.currentuser().address);                 
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 8| Withdraw Amount.   |      |        USER PHONE NO : "+bank.currentuser().phoneNo);
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 9| Check Balance.     |      |                                            |");
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("|10| Calculate Zakat.   |      |                                            |");
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("|11| Close Acount.      |      |                                            |");
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("|12| Calculate interest |      |                                            |");
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("|13| Transfer Amount    |      |                                            |");
			    System.out.println("|__|____________________|      |____________________________________________|");
			   
			  
			    number=myObj.nextInt(); 
			    break;
		  case 12:
			  bank.calculatelnterest();
			  System.out.println(  "_______________________        ____________________________________________");
			    System.out.println("| 2| new acount.        |      |                                            |");
			    System.out.println("|__|____________________|      |                    WELCOME                 |");
			    System.out.println("| 3| Login.             |      |                                            |");
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 4| Account Details.   |      |        CURRENT ACOUNT: "+bank.currentacount());
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 5| Account Log.       |      |        ACCOUNT TYPE  : "+bank.currenttype());
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 6| set interest.      |      |        USER NAME     : "+bank.currentuser().name);
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 7| Deposit Amount     |      |        USER Address  : "+bank.currentuser().address);                 
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 8| Withdraw Amount.   |      |        USER PHONE NO : "+bank.currentuser().phoneNo);
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 9| Check Balance.     |      |                                            |");
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("|10| Calculate Zakat.   |      |                                            |");
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("|11| Close Acount.      |      |                                            |");
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("|12| Calculate interest |      |                                            |");
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("|13| Transfer Amount    |      |                                            |");
			    System.out.println("|__|____________________|      |____________________________________________|");
			   
			    number=myObj.nextInt(); 
			     
			    break;
		  case 13:
			  bank.transferAmount();
			  System.out.println(  "_______________________        ____________________________________________");
			    System.out.println("| 2| new acount.        |      |                                            |");
			    System.out.println("|__|____________________|      |                    WELCOME                 |");
			    System.out.println("| 3| Login.             |      |                                            |");
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 4| Account Details.   |      |        CURRENT ACOUNT: "+bank.currentacount());
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 5| Account Log.       |      |        ACCOUNT TYPE  : "+bank.currenttype());
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 6| set interest.      |      |        USER NAME     : "+bank.currentuser().name);
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 7| Deposit Amount     |      |        USER Address  : "+bank.currentuser().address);                 
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 8| Withdraw Amount.   |      |        USER PHONE NO : "+bank.currentuser().phoneNo);
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("| 9| Check Balance.     |      |                                            |");
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("|10| Calculate Zakat.   |      |                                            |");
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("|11| Close Acount.      |      |                                            |");
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("|12| Calculate interest |      |                                            |");
			    System.out.println("|__|____________________|      |                                            |");
			    System.out.println("|13| Transfer Amount    |      |                                            |");
			    System.out.println("|__|____________________|      |____________________________________________|");
			   
			    number=myObj.nextInt(); 
			     
			    break;
		}

	}
	}

}
