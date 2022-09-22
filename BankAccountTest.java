package com.example.training;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount acc;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Executes @BeforeClass");
    }
    @Before
    public void setup(){
        acc = new BankAccount("Jairaj", "Saraf", 1000.00, BankAccount.CHECKING);
        System.out.println("@Before Running a test..");
    }
    @Test
    public void deposit() {
       double bal = acc.deposit(200.00, true);
       assertEquals(1200.00, bal, 0);
       assertEquals(1200.00, acc.getBal(), 0);
    }

    @Test
    public void getBal_deposit() {

        acc.deposit(200.00, true);

        assertEquals(1200.00, acc.getBal(), 0);
    }

    @Test
    public void getBal_withdraw() {

        acc.withdraw(200.00, true);

        assertEquals(800.00, acc.getBal(), 0);
    }

    @Test
    public void withdraw() {
        fail("Test yet to be implemented.");
    }

    @Test
    public void isChecking_true(){

        assertTrue("The account is NOT checking.", acc.isChecking());
    }
}



