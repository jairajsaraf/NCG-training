package com.example.training;

import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountTest {

    @Test
    public void deposit() {
       BankAccount acc = new BankAccount("Jairaj", "Saraf", 1000.00, BankAccount.CHECKING);
       double bal = acc.deposit(200.00, true);
       assertEquals(1200.00, bal, 0);
       assertEquals(1200.00, acc.getBal(), 0);
    }

    @Test
    public void getBal_deposit() {
        BankAccount acc = new BankAccount("Jairaj", "Saraf", 1000.00, BankAccount.CHECKING);
        acc.deposit(200.00, true);

        assertEquals(1200.00, acc.getBal(), 0);
    }

    @Test
    public void getBal_withdraw() {
        BankAccount acc = new BankAccount("Jairaj", "Saraf", 1000.00, BankAccount.CHECKING);
        acc.withdraw(200.00, true);

        assertEquals(800.00, acc.getBal(), 0);
    }

    @Test
    public void withdraw() {
        fail("Test yet to be implemented.");
    }

    @Test
    public void isChecking_true(){
        BankAccount acc = new BankAccount("Jairaj", "Saraf", 1000.00, BankAccount.CHECKING);
        assertTrue("The account is NOT checking.", acc.isChecking());
    }
}



