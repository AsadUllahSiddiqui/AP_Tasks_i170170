package bankManagementSystem;

import java.util.ArrayList; 
import java.util.Scanner;
public class Bank implements BankInterface  {
	ArrayList<person> users;
	ArrayList<Account> accounts;
	ArrayList<SavingAcount> savingaccounts;
	Account CurrentCheckingAcount;
	SavingAcount CurrentSavingAcount;
	
	public Bank(ArrayList<person> users, ArrayList<Account> accounts, ArrayList<SavingAcount> savingaccounts) {
		super();
		this.users = users;
		this.accounts = accounts;
		this.savingaccounts = savingaccounts;
	}

	public Bank() {
		super();
		this.users = new ArrayList<person>() ;
		this.accounts = new ArrayList<Account>();
		this.savingaccounts = new ArrayList<SavingAcount>();
		person dummy=new person("","","",0);
		CurrentCheckingAcount=new Account(dummy,0);
		CurrentSavingAcount=new SavingAcount(dummy,0);
	}

	public void newAccount(String name,String address,String phoneNo,int type,int acountno) {
		// TODO Auto-generated method stub
//		Scanner myObj = new Scanner(System.in);

		person newuser=new person(name, address, phoneNo, 0);

	    Boolean b=true;
	    Boolean c=true;
	    if(type==1) {
	     
	    	for (int i=0;i< this.savingaccounts.size();i++) {
				if(this.savingaccounts.get(i).user.phoneNo.equals(newuser.phoneNo)) {
					System.out.println("One user can't have multiple saving accounts.");
					b=false;
					break;
				}
			}
	    	
	
	    
	    	if(b==true) {
//	    		System.out.println("Enter new Acount Number:");
//		    	int acountno = myObj.nextInt();
		    	for (int i=0;i< this.savingaccounts.size();i++) {
					if(this.savingaccounts.get(i).acountNo==acountno) {
						System.out.println("<<<<<Account no is not valid>>>>>");
						c=false;
						break;
					}
				}
		    	if(c==true) {
	    	SavingAcount newAccount=new SavingAcount(newuser,acountno);
	    	savingaccounts.add(newAccount);
	    	CurrentSavingAcount=newAccount;
	    	person dummy=new person("","","",0);
			CurrentCheckingAcount=new Account(dummy,0);
			System.out.println("<<<<< saving Account is active>>>>>");
		    	}
	    	}
	    	 
	    }
	    else {
	    	
	    	for (int i=0;i< this.accounts.size();i++) {
				if(this.accounts.get(i).user.phoneNo==newuser.phoneNo) {
					System.out.println("One user can't have multiple checking accounts.");
					b=false;
					break;
				}
			}
	    	
	
	    	
	    	if(b==true) {
	    		System.out.println("CHECKING");
//	    		System.out.println("Enter new Acount Number:");
//		    	int acountno = myObj.nextInt();
		    	for (int i=0;i< this.accounts.size();i++) {
					if(this.accounts.get(i).acountNo==acountno) {
						System.out.println("<<<<<Account no is not valid>>>>>");
						c=false;
						break;
					}
				}
		    	if(c==true) {
	    	Account newAccount=new Account(newuser,acountno);
	    	accounts.add(newAccount);
	    	CurrentCheckingAcount=newAccount;
	    	person dummy=new person("","","",0);
			CurrentSavingAcount=new SavingAcount(dummy,0);
			System.out.println("<<<<<Checking Account is active>>>>>");
		    	}
	    	}
			
	    	   
	    }
	 
	    
	}
	public void closeAccount() {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		int no;
		System.out.println("Enter User Acount type :");
		String type = myObj.nextLine();
		System.out.println("Enter User Acount No :");
		  no = myObj.nextInt();
		if(type.equals("saving")) {
			for(int i=0;i<savingaccounts.size();i++) {
				if(savingaccounts.get(i).acountNo==no) {
					System.out.println("Account closed");
					if(savingaccounts.get(i).acountNo==CurrentSavingAcount.acountNo) {
						person dummy=new person("","","",0);
						CurrentSavingAcount=new SavingAcount(dummy,0);
						savingaccounts.remove(i);
					}
					else {
						savingaccounts.remove(i);
					}
				}
				
			}
			
		}
		else if(type.equals("checking")){
			
			for(int i=0;i<accounts.size();i++) {
				if(accounts.get(i).acountNo==no) {
					System.out.println("Account closed");
					if(accounts.get(i).acountNo==CurrentCheckingAcount.acountNo) {
						person dummy=new person("","","",0);
						CurrentCheckingAcount=new Account(dummy,0);
						accounts.remove(i);
					}
					else {
						accounts.remove(i);
					}
				}
				
			}
		}
		
		
		
	}

	public void login( ) {
		// TODO Auto-generated method stub
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Please enter Account No:");
	    int account_no=myObj.nextInt();
	    System.out.println("Please enter Account type 1 saving 2 checking:");
	    int type=myObj.nextInt();
		
		if(type==2) {
			for (int i=0;i< this.accounts.size();i++) {
				if(this.accounts.get(i).acountNo==account_no) {
					CurrentCheckingAcount=this.accounts.get(i);
					System.out.println("Login Successful..");
					System.out.println("User :"+this.accounts.get(i).user.name);
					System.out.println("Account :"+this.accounts.get(i).acountNo);
					System.out.println("Account type :"+this.accounts.get(i).type);
					break;
				}
				
			}
		}
		else if (type==1) {
			for (int i=0;i< this.savingaccounts.size();i++) {
				if(this.savingaccounts.get(i).acountNo==account_no) {
					CurrentSavingAcount=this.savingaccounts.get(i);
					System.out.println("Login Successful..");
					System.out.println("User :"+this.savingaccounts.get(i).user.name);
					System.out.println("Account :"+this.savingaccounts.get(i).acountNo);
					System.out.println("Account type :"+this.savingaccounts.get(i).type);
					break;
				}
			
			}
		}
		else {
			System.out.println("User do not exist kindly get registered.");
		}
		
		
	}

	public void setInterestRate() {
		// TODO Auto-generated method stub
		System.out.println("set InterestRate:");
		Scanner myObj = new Scanner(System.in);
	    Double in=myObj.nextDouble();
	    for(int i=0;i<savingaccounts.size();i++) {
	    	savingaccounts.get(i).interestRate=in;
	    }
	    CurrentSavingAcount.interestRate=in;
	}

	public void accountDetails( ) {
		// TODO Auto-generated method stub
		if(CurrentSavingAcount.acountNo!=0) {
			System.out.println("User Name: "+CurrentSavingAcount.user.name);
			System.out.println("User Address: "+CurrentSavingAcount.user.address);
			System.out.println("User Phone NO: "+CurrentSavingAcount.user.phoneNo);
			System.out.println("User Balance: "+CurrentSavingAcount.balance);
			System.out.println("User totaldeposit: "+CurrentSavingAcount.totaldeposit);
			System.out.println("User totalwithdraw: "+CurrentSavingAcount.totalwithdraw);
			System.out.println("User acountNo: "+CurrentSavingAcount.acountNo);
			System.out.println("User numOfDeposits: "+CurrentSavingAcount.numOfDeposits);
			System.out.println("User numOfwithdrawals: "+CurrentSavingAcount.numOfwithdrawals);
			
		}
		else if(CurrentCheckingAcount.acountNo!=0){
			System.out.println("User Name: "+CurrentCheckingAcount.user.name);
			System.out.println("User Address: "+CurrentCheckingAcount.user.address);
			System.out.println("User Phone NO: "+CurrentCheckingAcount.user.phoneNo);
			System.out.println("User Balance: "+CurrentCheckingAcount.balance);
			System.out.println("User totaldeposit: "+CurrentCheckingAcount.totaldeposit);
			System.out.println("User totalwithdraw: "+CurrentCheckingAcount.totalwithdraw);
			System.out.println("User acountNo: "+CurrentCheckingAcount.acountNo);
			System.out.println("User numOfDeposits: "+CurrentCheckingAcount.numOfDeposits);
			System.out.println("User numOfwithdrawals: "+CurrentCheckingAcount.numOfwithdrawals);
			
		}
		
	}

	public void accountsDeductionsDetais( ) {
		// TODO Auto-generated method stub
		if(CurrentSavingAcount.acountNo!=0) {
			for(int i=0;i<CurrentSavingAcount.Log.size();i++) {
				System.out.println(CurrentSavingAcount.Log.get(i));
			}
			
		}
		else if(CurrentCheckingAcount.acountNo!=0){
			for(int i=0;i<CurrentCheckingAcount.Log.size();i++) {
				System.out.println(CurrentCheckingAcount.Log.get(i));
			}
		}
		
	}
 
	public void calculateZakat() {
		// TODO Auto-generated method stub
		if(this.CurrentSavingAcount.acountNo!=0) {
			CurrentSavingAcount.calculateZakat();
			
		}
		else if(this.CurrentCheckingAcount.acountNo!=0) {
			System.out.println("Please login to saving account");
			
		}
		
		
		
	}

	public void calculatelnterest() {
		// TODO Auto-generated method stub
		if(this.CurrentSavingAcount.acountNo!=0) {
			CurrentSavingAcount.calculatelnterest();
			
		}
		else if(this.CurrentCheckingAcount.acountNo!=0) {
			System.out.println("Please login to saving account");
			
		}
		
	}

	public void makeDeposit(Double amount) {
		// TODO Auto-generated method stub
		
//		double amount;
//		System.out.println("Please enter Amount:");
//		Scanner myObj = new Scanner(System.in);
//	    amount=myObj.nextDouble();
	    
		if(this.CurrentSavingAcount.acountNo!=0) {
			
			for (int i=0;i<savingaccounts.size();i++) {
				if(savingaccounts.get(i).acountNo==CurrentSavingAcount.acountNo) {
					savingaccounts.get(i).deposit(amount);
					CurrentSavingAcount=savingaccounts.get(i);
				}
			}
			
		}
		else if(this.CurrentCheckingAcount.acountNo!=0) {
			for (int i=0;i<accounts.size();i++) {
				if(accounts.get(i).acountNo==CurrentCheckingAcount.acountNo) {
					accounts.get(i).deposit(amount);
					CurrentCheckingAcount=accounts.get(i);
				}
			
		}
		}
		
	}

	public void checkBalance() {
		// TODO Auto-generated method stub
		if(this.CurrentSavingAcount.acountNo!=0) {
			CurrentSavingAcount.checkBalance();
			
		}
		else if(this.CurrentCheckingAcount.acountNo!=0) {
			CurrentCheckingAcount.checkBalance();
			
		}
		
	}
 
	public void transferAmount( ) {
		// TODO Auto-generated method stub
	
		int reviever;
		System.out.println("Please enter Account No of reciever:");
		Scanner myObj = new Scanner(System.in);
		reviever=myObj.nextInt();
		int amount;
		System.out.println("Please enter amount you want to send:");
		amount=myObj.nextInt();
		boolean recexist=false;
		if(this.CurrentSavingAcount.acountNo!=0) {
			SavingAcount send;
			SavingAcount rec;
			
			int s=0;
			int r=0;
			for (int i=0;i<savingaccounts.size();i++) {
				if(CurrentSavingAcount.acountNo==savingaccounts.get(i).acountNo) {
					send=savingaccounts.get(i);
					s=i;
				}
				if(reviever==savingaccounts.get(i).acountNo) {
					rec=savingaccounts.get(i);
					recexist=true;
					r=i;
				}	
			}
			if(recexist) {
			savingaccounts.get(s).transferAmount(savingaccounts.get(s), savingaccounts.get(r), amount);
			CurrentSavingAcount=savingaccounts.get(s);}
			else {
				System.out.println("reciever do not exist.");
			}
			
		}
		else if(this.CurrentCheckingAcount.acountNo!=0) {
			Account send;
			Account rec;
			int s=0;
			int r=0;
			for (int i=0;i<accounts.size();i++) {
				if(CurrentCheckingAcount.acountNo==accounts.get(i).acountNo) {
					send=accounts.get(i);
					s=i;
				}
				if(reviever==accounts.get(i).acountNo) {
					rec=accounts.get(i);
					recexist=true;
					r=i;
				}	
			}
			if(recexist) {
			accounts.get(s).transferAmount(accounts.get(s), accounts.get(r), amount);
			CurrentCheckingAcount=accounts.get(s);
			}
			else {
				System.out.println("reciever do not exist.");
			}
			
			
		}
		
	}

	public int  currentacount() {
		// TODO Auto-generated method stub
		if(CurrentSavingAcount.acountNo!=0) {
			return CurrentSavingAcount.acountNo;
			
		}
		else if(CurrentCheckingAcount.acountNo!=0) {
			return CurrentCheckingAcount.acountNo;
		}
		return 0;
	}
	public int  currenttotaldeposit() {
		// TODO Auto-generated method stub
		if(CurrentSavingAcount.acountNo!=0) {
			return CurrentSavingAcount.numOfDeposits;
			
		}
		else if(CurrentCheckingAcount.acountNo!=0) {
			return CurrentCheckingAcount.numOfDeposits;
		}
		return 0;
	}
	public int  currenttotalWithdra() {
		// TODO Auto-generated method stub
		if(CurrentSavingAcount.acountNo!=0) {
			return CurrentSavingAcount.numOfwithdrawals;
			
		}
		else if(CurrentCheckingAcount.acountNo!=0) {
			return CurrentCheckingAcount.numOfwithdrawals;
		}
		return 0;
	}
	public String  currenttype() {
		// TODO Auto-generated method stub
		if(CurrentSavingAcount.acountNo!=0) {
			return "Saving";
			
		}
		else if(CurrentCheckingAcount.acountNo!=0) {
			return "Checking";
		}
		return "No Account Selected";
	}
	public person  currentuser() {
		// TODO Auto-generated method stub
		person cu=new person("NULL","NULL","NULL",0);
		if(CurrentSavingAcount.acountNo!=0) {
			  cu=CurrentSavingAcount.user;
			return  cu;
			
		}
		else if(CurrentCheckingAcount.acountNo!=0) {
			  cu=CurrentCheckingAcount.user;
			return cu;
		}
		
		return cu;
	}
 
	public void withdraw(Double amount) {
		// TODO Auto-generated method stub
		if(this.CurrentSavingAcount.acountNo!=0) {
			
			for (int i=0;i<savingaccounts.size();i++) {
				if(savingaccounts.get(i).acountNo==CurrentSavingAcount.acountNo) {
					savingaccounts.get(i).withdraw(amount);
					CurrentSavingAcount=savingaccounts.get(i);
				}
			}
			
		}
		else if(this.CurrentCheckingAcount.acountNo!=0) {
			
			for (int i=0;i<accounts.size();i++) {
				if(accounts.get(i).acountNo==CurrentCheckingAcount.acountNo) {
					accounts.get(i).withdraw(amount);
					CurrentCheckingAcount=accounts.get(i);
				}
			
		}
		}
	}
}
