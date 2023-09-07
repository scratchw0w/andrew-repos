package com.bosiy;

public class BankAccount {

    private String accountOwner;
    private boolean isCredit;
    private int accountNumber;
    private int balance;


    public BankAccount(String accountOwner, boolean isCredit, int accountNumber, int balance) {

        if(!isCredit) {
            if(balance < 0) {
                System.out.println("Your balance can't be negative!");
                return;
            }
        }

        this.isCredit = isCredit;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountOwner = accountOwner;
    }

    public void allInfo() {
        System.out.println("Account owner: " + accountOwner + "\nCard is credit: " + (isCredit ?
                "Credit" : "Debit") + "\nAccount number: " + accountNumber + "\nBalance: "
                + balance + "\n");
    }

    public void deposit(int funds) {
        if(funds <= 0) {
            System.out.println("Error!");
            return;
        }
        this.balance += funds;
        System.out.println("Your account has been updated with: " + funds);
    }
    public void withdraw(int funds) {
        if(!isCredit) {
           if(this.balance < funds) {
               System.out.println("Your balance can't be negative!");
               return;
           }
        }
        this.balance -= funds;
        System.out.println("Your account has been updated with: " + funds);
    }

}
