package bankManagementSystem;
import java.time.LocalDate;
import java.util.ArrayList; 
public class Account {
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	person user;
	int acountNo;
	double balance=0;
	int numOfDeposits=0;
	int numOfwithdrawals=0;
//	double ainterestRate;
	double totalwithdraw;
	double totaldeposit;
	LocalDate date;
	String type;
	ArrayList<String> Log;
	
	
	public Account(person user, int acountNo, double balance, int numOfDeposits, int numOfwithdrawals,
			double totalwithdraw, double totaldeposit) {
		super();
		this.user = user;
		this.acountNo = acountNo;
		this.balance = balance;
		this.numOfDeposits = numOfDeposits;
		this.numOfwithdrawals = numOfwithdrawals;
		this.totalwithdraw = totalwithdraw;
		this.totaldeposit = totaldeposit;
		this.date=LocalDate.now();
		this.user.acNo=acountNo;
		this.type="Checking";
		this.Log= new ArrayList<String>();
		
	}
	
	public Account(person u , int acountNo) {
		
		this.user=new person(u.name,u.address,u.phoneNo,0);
		this.acountNo = acountNo;
		this.balance = 0;
		this.numOfDeposits = 0;
		this.numOfwithdrawals = 0;
		this.totalwithdraw = 0;
		this.totaldeposit = 0;
		this.date=LocalDate.now();
		this.type="Checking";
		this.Log= new ArrayList<String>();
		Log.add("Acount has been created  on "+date);
	}
	
	public person getUser() {
		return user;
	}
	public void setUser(person user) {
		this.user = user;
	}
	public int getAcountNo() {
		return acountNo;
	}
	public void setAcountNo(int acountNo) {
		this.acountNo = acountNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getNumOfDeposits() {
		return numOfDeposits;
	}
	public void setNumOfDeposits(int numOfDeposits) {
		this.numOfDeposits = numOfDeposits;
	}
	public int getNumOfwithdrawals() {
		return numOfwithdrawals;
	}
	public void setNumOfwithdrawals(int numOfwithdrawals) {
		this.numOfwithdrawals = numOfwithdrawals;
	}
	public double getTotalwithdraw() {
		return totalwithdraw;
	}
	public void setTotalwithdraw(double totalwithdraw) {
		this.totalwithdraw = totalwithdraw;
	}
	public double getTotaldeposit() {
		return totaldeposit;
	}
	public void setTotaldeposit(double totaldeposit) {
		this.totaldeposit = totaldeposit;
	}

	public void deposit (double amount) {
		
		numOfDeposits+=1;
		totaldeposit+=amount;
		balance+=amount;
		if(this.numOfDeposits>2)
		{
			balance-=10;
			Log.add("account type:"+this.type+"   Deposit chagres:10  Date:"+LocalDate.now());
		}
		else {
			Log.add("account type:"+this.type+"   Deposit chagres:0  Date:"+LocalDate.now());
		}
		
	}
	
	public void checkBalance() {
		System.out.println("your current balance is :"+this.getBalance()+" Rs.");
//		return this.getBalance();
	}
	
	public void transferAmount(Account sender,Account receiver,double amount) {
		if(amount<=balance) {
		sender.balance-=amount;
		receiver.balance+=amount;	
		sender.Log.add("account type:"+this.type+
				"   you have sent " +
				   amount+" Rs "
				   +"to acount no "+receiver.acountNo
						+ " on "+LocalDate.now()+".");
		receiver.Log.add("account type:"+this.type+
				"   you have recieved "+amount+" Rs "+
				"from acount no "+receiver.acountNo
						+ " on "+LocalDate.now());
		}
		else {
			System.out.println("please enter valid amount.");
		}
		
	}
	public void withdraw(double amount){
		if(amount<0 || amount>balance ){
            System.out.println("Please enter valid Amount.");
        }
        else{
            balance -= amount;
            totalwithdraw += amount;
            numOfwithdrawals+=1;
            updateLog("account type:"+this.type+"   Withdraw chagres:0 "+"   amount:"+amount+"Rs. "+"  Date:"+LocalDate.now());
        }
		if(this.numOfwithdrawals>2) {
			updateLog("account type:"+this.type+"   Withdraw chagres:10 "+"   amount:"+amount+"Rs. "+"  Date:"+LocalDate.now());
			balance-=10;
		}
	}
  
	public void updateLog(String log) {
	   if(!this.Log.add(log)) {
		   	   System.out.println("Couldn't log transaction :( ");
	   		}
		}
	public void showlog() {
		for (int i = 0; i < Log.size(); i++) {
			  System.out.println(i);
			}
		if(Log.size()==0) {
			 System.out.println("No data to show.");
		}
	}
}
