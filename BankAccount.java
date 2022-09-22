package com.example.training;



public class BankAccount {
    private String fn;
    private String ln;
    private double bal;

    public static final int CHECKING = 1;
    public static final int SAVINGS = 2;

    private int accountType;

    public BankAccount(String fn, String ln, double bal, int accType){
        this.fn = fn;
        this.ln = ln;
        this.bal = bal;
        this.accountType = accType;
    }

    // Branch == true if txn performed at a bank
    // == false if txn performed at ATM
    public double deposit(double amt, boolean branch){
        bal += amt;
        return bal;
    }

    public double getBal(){
        return bal;
    }

    // Branch == true if txn performed at a bank
    // == false if txn performed at ATM
    public double withdraw(double amt, boolean branch){
        if(amt > 500 && !branch){
            throw new IllegalArgumentException();
        }
        bal -= amt;
        return bal;
    }

    public boolean isChecking(){
        return accountType == CHECKING;
    }

    public boolean isSavings(){
        return accountType == SAVINGS;
    }
}
