package com.temitopeolanrewaju81;
import java.util.Scanner;

public class Bank__Account {
    // These are different for each account
    public double balance;
    public String accountNumber;
    public String email;
    public  String accountName;


    public static void main(String[] args){
        Scanner myObj  = new Scanner(System.in);

        Bank__Account account = new Bank__Account(50);
        account.deposit(10);
        account.withdraw(65);
        String accountName="Azeez Olanrewaju";
        String accountNumber="123456789";
        String email="lanru2001@yahoo.com";

        System.out.println(accountName);
        System.out.println(accountNumber);
        System.out.println(email);
        System.out.println("Has a balance of " + account.getBalance());
    }


    // This is a constructor: no return type (void, boolean etc) and has the same name as the class.
    public Bank__Account(double intialBalance)
    {
        balance = intialBalance;
    }

    public void deposit(double depositAmount)
    {
        balance += depositAmount;
    }

    public boolean withdraw(double withdrawAmount)
    {
        if (withdrawAmount > balance)
        {
            System.out.println("Insufficient Funds!!!");
            return false;
        } else
        {
            balance -= withdrawAmount;
            return true;
        }
    }

    public double getBalance()
    {
        return balance;
    }

}