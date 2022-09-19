package com.example.training;



public class BankAccount {
    private String fn;
    private String ln;
    private double bal;

    public BankAccount(String fn, String ln, double bal){
        this.fn = fn;
        this.ln = ln;
        this.bal = bal;
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
        bal -= amt;
        return bal;
    }

}
