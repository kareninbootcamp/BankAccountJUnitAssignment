package com.ssa.tiy.junitlesson;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ssa.tiy.junitlesson.Account;

public class TestAccount {
	//To test your deposit, withdraw, and transferFrom methods:
	//check the balances before and after this methods run and make sure the balance changes as it should. 
	//For the transferFrom method, you'll need to check the balances from both accounts.
	
	Account anAccount = new Account();
	Account checking = new Account();
	Account savings = new Account();
	
	@Test
	public void transactions() {
		//assume they are equal as long as they are not different by this little bit 0.005 
		//(this is the fudge factor they allow you to put in)
		//assertEquals(100.00, account.getBalance(), 0.005);
				
		anAccount.setBalance(1000);
		checking.setBalance(2000);
		savings.setBalance(3000);
		
		
		assertEquals(1000,anAccount.getBalance(), 0.005);	
		assertEquals(2000,checking.getBalance(), 0.005);	
		anAccount.transferFrom(checking, 1000);
		assertEquals(2000,anAccount.getBalance(), 0.005);	
		assertEquals(1000,checking.getBalance(), 0.005);
		assertEquals(2100, anAccount.deposit(100),0);
		assertEquals(2100,anAccount.getBalance(), 0.005);
		assertEquals(1000,checking.getBalance(), 0.005);
		assertEquals(900,checking.withdraw(100), 0.005);
		
		
		}
						
	@Test
	public void testID() {
	
		
		anAccount.setId(0);
		assertEquals(0,anAccount.getId());
		anAccount.setId(-1);
		assertEquals (-1,anAccount.getId());
		anAccount.setId(100);
		assertEquals(100,anAccount.getId());
		anAccount.setId(5);
		assertEquals(5,anAccount.getId());
		}
	
	@Test
	public void testDescription() {
	
			
		anAccount.setDescription("my account");
		assertEquals("my account",anAccount.getDescription());
		anAccount.setDescription("Checking");
		assertEquals("Checking",anAccount.getDescription());
		anAccount.setDescription("SAVINGS");
		assertEquals("SAVINGS",anAccount.getDescription());
		
		}
	
//	@Test
//	public void testIdNotEqualValues() {
//	
//			
//		anAccount.setId(-1);
//		assertNotEquals (-1,anAccount.getId());
//		
//		}
//	
//	@Test
//	public void anyfieldErrors() {
//		
//			
//		anAccount.setId(-1);
//		assertNotEquals (-1,anAccount.getId());
//	}
}
