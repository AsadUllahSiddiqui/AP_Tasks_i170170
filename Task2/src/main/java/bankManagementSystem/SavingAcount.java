package bankManagementSystem;


import java.time.LocalDate;

public class SavingAcount extends Account {
	double interestRate;
	double remainingAmount;
	double zakat;
	
	public SavingAcount(person user, int acountNo,double interestRate ) {
		super(user, acountNo);
		this.interestRate=interestRate;
		this.remainingAmount=0;
		this.type="Saving";
	}
	
	public SavingAcount(person user, int acountNo ) {
		super(user, acountNo);
		this.interestRate=10;
		this.remainingAmount=0;
		this.type="Saving";
		this.zakat=0;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getRemainingAmount() {
		return remainingAmount;
	}

	public void setRemainingAmount(double remainingAmount) {
		this.remainingAmount = remainingAmount;
	}

	public double getZakat() {
		return zakat;
	}

	public void setZakat(double zakat) {
		this.zakat = zakat;
	}

	public void calculatelnterest() {
		double mInterestRate=(this.interestRate/12);
        double mInterest=mInterestRate*this.balance;
        balance+=mInterest;
        System.out.println("THis month intrest is :"+ mInterest+" Rs.");
        updateLog("account type:"+this.type+"   MonthlyInterest:"+mInterest+  "Date:"+LocalDate.now());
	}
	public void withdraw(double amount){
		if(amount<0 || amount>(balance+5000) ){
            System.out.println("Please enter valid Amount.");
        }
        else{
        	if(amount>balance) {
        		remainingAmount+=amount-balance;
        	}
            balance -= amount;
            totalwithdraw += amount;
            
            updateLog("account type:"+this.type+"   withdraw Amount:"+amount+ "Remainings:"+remainingAmount+" Rs."+  "Date:"+LocalDate.now());
        }
		
	}
	public void Remainings(){
		if(remainingAmount!=0) {
			 System.out.println("You have no remainings.");
		}
		else {
			System.out.println("You remainings are: "+remainingAmount+" Rs.");
		}
	}
	public void payRemainings(double amount) {
		remainingAmount=remainingAmount-amount;
		if(remainingAmount<1) {
			balance+=(remainingAmount*-1);
			remainingAmount=0;
			
		}
		updateLog("account type:"+this.type+"   Remainins payed:"+amount+ "Remainings:"+remainingAmount+" Rs."+  "Date:"+LocalDate.now());
	}
	public void calculateZakat() {
		if(balance>20000) {
		this.zakat=(balance*2.5)/100;
		System.out.println("Calculated Zakat: "+(balance*2.5)/100+" Rs.");
		updateLog("account type:"+this.type+"   Zakat:"+(balance*2.5)/100+" Rs."+ "Date:"+LocalDate.now());
		}
		else {
		System.out.println("Calculated Zakat: "+0+" Rs.");
		updateLog("account type:"+this.type+"   Zakat:"+0+" Rs."+ "Date:"+LocalDate.now());
		}
	}
	public void deposit (double amount) {
		
		numOfDeposits+=1;
		totaldeposit+=amount;
		balance+=amount;
		updateLog("account type:"+this.type+"   Deposit amount:"+amount+" Rs."+ "Date:"+LocalDate.now());
	}
	
}
