package Dayone.assignment2.BankAccountSimulation;

import Dayone.assignment2.LibraryManagementSystem.Book;

public class BankAccount {
    // Lets write a class that performs basic banking operations such as deposit and withdrawal.
    String accountNumber;
    double balance;


    //Default constructor.
    BankAccount(){}

    // Parameterized constructor to initialize accountNumber and balance
    BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    void deposit(double amount){
        if(amount > 0){
            this.balance += amount;
            System.out.println("Deposited Ksh" + amount);
        }else {
            System.out.println("Deposit failed");
        }

    }

    void withdraw(double amount){
        if(amount > 0 && this.balance >= amount){
            this.balance -= amount;
            System.out.println("Withdraw Ksh" + amount);
        }else {
            System.out.println("Insufficient Funds. Balance is " + this.balance + " " + "Kindly Top up");
        }
    }


    void printAccountSummary(){
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Balance: " + this.balance);
    }


    public static void main(String[] args) {
        // Initialize
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(10);
        bankAccount.withdraw(100);
        bankAccount.printAccountSummary();


    }
}
