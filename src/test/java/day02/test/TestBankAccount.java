package day02.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import day02.solved.BankAccount;

public class TestBankAccount {

    @Test
    public void testGetterSetters() {
        // create Account
        BankAccount acct1 = new BankAccount();
        acct1.setAccNo("A101");
        acct1.setName("Krishna");
        acct1.setBalance(1000);

        assertEquals("A101", acct1.getAccNo());
        assertEquals("Krishna", acct1.getName());
      
    }
}
