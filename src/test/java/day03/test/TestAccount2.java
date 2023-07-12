package day03.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import day03.solved.Account2;

public class TestAccount2 {

	@Test
	void Test1() {
		Account2 acct1 = new Account2();
		acct1.setAccNo("A101");
		acct1.setName("Naresh");
		acct1.setBalance(1000);
		System.out.println(acct1.getAccNo() + "-" + acct1.getName() + "-" + acct1.getBalance());
		
		assertEquals("A101", acct1.getAccNo());
		
	}


}
