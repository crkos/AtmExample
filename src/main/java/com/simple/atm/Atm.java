package com.simple.atm;

public class Atm {
    public Atm() {
        System.out.println("Welcome to the ATM");
        System.out.println("Enter your pin: ");


    }

    public void menu() {
        System.out.println("\n1. Check Balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Exit");
    }

    public void withdrawMenu() {
        System.out.println("Enter amount to withdraw: ");
    }

    public void DepositMenu() {
        System.out.println("Enter amount to deposit: ");
    }

    public void CheckBalanceMenu(double balance) {
        System.out.printf("The balance is: $%.2f\n", balance);
    }

    public void invalidMessageMenu() {
        System.out.println("Invalid Option");
    }

    public void exitMenu(){
        System.out.println("Thank you for using the ATM");
    }

}
