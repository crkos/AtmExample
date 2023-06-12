package com.simple.atm;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public abstract class Account implements Transaction{
    private final int accountNumber;
    private int pin;
    private double balance;
    private static int nextAccountNumber = 1001;

    public Account(int pin, double balance) {
        accountNumber = getNextAccountNumber();
        this.pin = pin;
        this.balance = balance;
    }

    public static int getNextAccountNumber() {
        int accountNumber = nextAccountNumber;
        nextAccountNumber++;
        return accountNumber;
    }

    @Override
    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from account " + accountNumber);
            Transaction.recordTransaction(amount, "Debit");
            return true;
        }
        return false;
    }

    @Override
    public boolean deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Cannot deposit negative amount");
            return false;
        }
        balance += amount;
        Transaction.recordTransaction(amount, "Credit");
        System.out.println("Deposited " + amount + " to account " + accountNumber);
        return true;
    }
    public boolean validatePin(int pin) {
        return this.pin == pin;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public boolean printTransactions() {
        StringBuilder sb = new StringBuilder();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("transactions.txt"))) {
            String currentLine;
            while((currentLine = bufferedReader.readLine()) != null) {
                sb.append(currentLine).append("\n");
            }
        }catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
            return false;
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(sb);
        return true;
    }
}
