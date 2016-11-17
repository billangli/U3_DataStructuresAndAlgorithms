package E12;/*
 BankAccount.java
 Created by Bill Li on 2016-10-10.
 */

public class BankAccount {

    private String name;
    private double balance;

    BankAccount(String name) {
        this.name = name;
        this.balance = 0;
    }

    BankAccount(String name, double initialAmount) {
        this.name = name;
        this.balance = initialAmount;
    }

    void deposit(double depositAmount) {
        this.balance += depositAmount;
    }

    void withdraw(double withdrawAmount) {
        this.balance -= withdrawAmount;
    }

    double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
