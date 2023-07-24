package day03.test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;


import day03.solved.Account;

public class TestAccount {

	// create Account

	@Test
	void test1() {
		Account acct1 = new Account("A101", "Naresh", 1000);
		System.out.println(acct1.accNo + "-" + acct1.name + "-" + acct1.balance);

		assertEquals("A101", acct1.accNo);

	}

	@Test
	void test2() {
		Account acct2 = new Account("A102", "Arun", 1000);
		System.out.println(acct2.accNo + "-" + acct2.name + "-" + acct2.balance);

		assertNotEquals("A101", acct2.accNo);

	}

}
