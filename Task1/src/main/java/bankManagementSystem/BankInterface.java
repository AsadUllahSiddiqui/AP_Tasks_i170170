package bankManagementSystem;

import java.util.Scanner;

public interface BankInterface {
	public void newAccount(String name,String address,String phoneNo,int type,int acountno);
	public void closeAccount();
	public void login( );
	public void setInterestRate();
	public void accountDetails( );
	public void accountsDeductionsDetais();
	public void calculateZakat();
	public void calculatelnterest();
	public void makeDeposit(Double amount);
	public void checkBalance();
	public void transferAmount();	
	public int currentacount();
	public void withdraw(Double amount);
}
	


