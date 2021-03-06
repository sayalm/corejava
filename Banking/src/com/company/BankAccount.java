package com.company;

public class BankAccount {
    private String firstName;
    private String lastName;
    private double balance;
    public static final int CHECKING = 1;
    public static final int SAVINGS = 2;

    private int accountType;

    public BankAccount(String firstName, String lastName, double balance, int accountType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.accountType = accountType;
    }

    // The branch argument is true if the customer is performing the transaction
    // at a branch,with a teller.
    //It's false if the customer is performing the transaction at an ATM
    public double deposit(double amount, boolean branch) {
        balance += amount;
        System.out.println(amount+" has been deposited.");
        return balance;
    }

    // The branch argument is true if the customer is performing the transaction
    // at a branch,with a teller.
    //It's false if the customer is performing the transaction at an ATM
    public double withdraw(double amount, boolean branch) {
        if ((amount > 500.00) & !branch){
            throw  new IllegalArgumentException();
        }

        balance -= amount;
//        System.out.println(amount+" has been withdrawn.");
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isChecking() {
        return accountType == CHECKING;
    }

    public boolean isSaving() {
        return accountType == SAVINGS;
    }

    //More methods that use firstName, lastName, and perform other functions
}
