package com.example.training;

import org.junit.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount acc;
    private static int count;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Executes @BeforeClass, count = " + count++);
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
    public void getBal_deposit() throws Exception{

        acc.deposit(200.00, true);

        assertEquals(1200.00, acc.getBal(), 0);
    }
    @Test
    public void getBal_withdraw() throws Exception{

        acc.withdraw(200.00, true);

        assertEquals(800.00, acc.getBal(), 0);
    }
    @Test
    public void withdraw_branch() throws Exception{
        double bal = acc.withdraw(600.00, true);
        assertEquals(400, bal, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void withdraw_not_branch() throws Exception{
        acc.withdraw(600.00, false);

    }
    @Test
    public void isChecking_true(){

        assertTrue("The account is NOT checking.", acc.isChecking());
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("Executes after tests. count : "+ count++);
    }

    @After
    public void after(){
        System.out.println("Count = " + count++);
    }
}



