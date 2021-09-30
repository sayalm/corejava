package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount account;
    private  static int count;

    @org.junit.BeforeClass
    public static void beforeClass() {
        System.out.println("This executes before any test cases. Count =" + count++);
    }

    @org.junit.Before
    public void setup() {
        account = new BankAccount("Tim", "Buchalka", 1000.00, BankAccount.CHECKING);
        System.out.println("Running a test..");
    }

    @org.junit.Test
    public void deposit() throws Exception {
        double balance = account.deposit(200.00, true);
        assertEquals(1200.00, balance, 0);
    }

    @org.junit.Test
    public void withdraw_branch() throws Exception {
       double balance = account.withdraw(600.00, true);
       assertEquals(400.0, balance, 0);
    }

    @org.junit.Test //(expected = IllegalArgumentException.class)
    public void withdraw_notBranch() throws Exception{
        account.deposit(200.00, true);
        assertEquals(1200.00, account.getBalance(), 0);

    }


    @org.junit.Test
    public void getBalance_deposit() throws Exception {
        account.deposit(200.00, true);
        assertEquals(1200.00, account.getBalance(), 0);
    }

    @org.junit.Test
    public void getBalance_withdraw() throws Exception {
        account.withdraw(200.00, true);
        assertEquals(800.00, account.getBalance(), 0);
    }

    @org.junit.Test
    public void isChecking_true() {
        assertTrue("The account is NOT a checking account", account.isChecking());
        assertFalse("The account is NOT a saving account", account.isSaving());
    }

    @org.junit.AfterClass
    public static void afterClass() {
        System.out.println("This executes after test cases. Count = " + count ++);
    }

//    @Test
//    public void hasAccount(){
//        assertNotNull("Account does not Exist.", account);
//        //assertNull("Account does Exist.", account);
//    }
    @org.junit.After
    public void teardown() {
        System.out.println("Count = " + count++);
    }

}