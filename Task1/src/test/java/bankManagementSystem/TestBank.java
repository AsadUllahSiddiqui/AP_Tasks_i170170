package bankManagementSystem;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestBank {
	Bank bank;
	@Before
	public void BeforeTest() {
		 bank=new Bank();
	}
	
	

	@Test
	public void OpeningSavingBankAcount() {
		
		bank.newAccount("1","1","1",1,12);
		assertNotEquals(0,bank.CurrentSavingAcount.acountNo);
	}
	
	@Test
	public void OpeningCheckingBankAcount() {
		
		bank.newAccount("1","1","1",2,12);
		assertNotEquals(0,bank.CurrentCheckingAcount.acountNo);
	}
	
	@Test
	public void CheckBalanceTest() {
		bank.checkBalance();
		assertTrue(0==bank.CurrentCheckingAcount.balance);
	}
	
	@Test
	public void DepositAmountTest() {
		bank.newAccount("1","1","1",2,12);
		Double no=1000.0;
		bank.makeDeposit(no);
		assertTrue(no==bank.CurrentCheckingAcount.getBalance());
	}
	
	@Test
	public void WithdrawAmountTest() {
		bank.newAccount("1","1","1",2,12);
		double nod=1000;
		bank.makeDeposit(nod);
		Double now=100.0;
		bank.withdraw(now);
		Double res=1000-now;
		assertTrue(res==bank.CurrentCheckingAcount.balance);
		
	}
	
	@Test
	public void ZakattTest() {
		bank.newAccount("1","1","1",1,1);
		double nod=90000;
		double zak=(nod*2.5)/100;
		bank.makeDeposit(nod);
		bank.savingaccounts.get(0).calculateZakat();
		assertTrue(zak==bank.savingaccounts.get(0).zakat);
		
	}
}
