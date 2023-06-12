package com.simple.atm;

public class SavingsAccount extends Account{
    private double interestRate;
    public SavingsAccount(int pin, double balance, float interestRate) {
        super(pin, balance);
        this.interestRate = interestRate;
    }

    public double calculateInterest () {
        return this.getBalance() * this.interestRate;
    }

}
