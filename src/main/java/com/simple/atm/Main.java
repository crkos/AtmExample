package com.simple.atm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int pinNum;
        int userOption = 0;
        Scanner scanner = new Scanner(System.in);


        //Account acct1 = new Account(1234, 1000);
        CheckingAccount acct1 = new CheckingAccount(1234, 1000, 25.0);

        acct1.printTransactions();

        /*Atm atm = new Atm();

        pinNum = scanner.nextInt();

        if(acct1.validatePin(pinNum)) {
            do {
                atm.menu();
                userOption = scanner.nextInt();
                switch (userOption) {
                    case 1:
                        atm.CheckBalanceMenu(acct1.getBalance());
                        //System.out.printf("Interest Rate: $%.2f", acct1.calculateInterest()); //Savings account
                        break;
                    case 2:
                        atm.withdrawMenu();
                        double withdrawAmount = scanner.nextDouble();
                        if (acct1.withdraw(withdrawAmount + acct1.getFee())) {
                            System.out.println("Please take your cash");
                        } else {
                            System.out.println("Insufficient funds");
                        }
                        break;
                    case 3:
                        atm.DepositMenu();
                        double depositAmount = scanner.nextDouble();
                        acct1.deposit(depositAmount);
                        break;
                    case 4:
                        atm.exitMenu();
                        break;
                    default:
                        atm.invalidMessageMenu();
                }

            } while (userOption != 4);
        }*/
    }
}