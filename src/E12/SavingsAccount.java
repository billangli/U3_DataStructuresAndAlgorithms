package E12;/*
 SavingsAccount


 Created by Bill Li on 2016-10-10.
 */

public class SavingsAccount extends  BankAccount {

    private double interestRate = 0.025;

    SavingsAccount(String name) {
        super(name);
        this.setBalance(this.getBalance() - 100);
    }

    SavingsAccount(String name, double money) {
        super(name, money);
        this.setBalance(this.getBalance() - 100);
    }

    SavingsAccount (String name, double money, double interest) {
        super(name, money);
        interestRate = interest;
        this.setBalance(this.getBalance() - 100);
    }

    void addInterest() {
        this.setBalance(this.getBalance() * (1 + interestRate)); ;
    }
}
