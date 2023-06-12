package com.simple.atm;

public class CheckingAccount extends Account {
    private double fee;
    public CheckingAccount(int pin, double balance, double fee) {
        super(pin, balance);
        this.fee = fee;
    }

    public double getFee() {
        return this.fee;
    }
}
