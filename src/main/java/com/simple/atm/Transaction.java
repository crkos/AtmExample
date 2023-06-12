package com.simple.atm;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public interface Transaction {
    LocalDateTime transactionDate = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    String formattedDate = transactionDate.format(formatter);
     boolean withdraw(double amount);
     boolean deposit(double amount);
     double getBalance();
     static boolean recordTransaction(double transactionAmt, String transactionType){
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("transactions.txt", true))){
            bufferedWriter.write((Objects.equals(transactionType, "Credit")) ?  "\t\nAmount Credited: $" + transactionAmt + "\tDate: " + formattedDate :
                    "\t\nAmount Debited: $" + transactionAmt + "\tDate: " + formattedDate);
            bufferedWriter.newLine();
            return true;
        } catch (Exception e) {
            System.out.println("Error writing to file");
            return false;
        }
    }
}
