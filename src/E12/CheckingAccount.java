package E12;/*
 CheckingAccount
 
 
 Created by Bill Li on 2016-10-10.
 */


public class CheckingAccount extends BankAccount {

    private final double WITHDRAWL_FEE = 1;

    CheckingAccount (String name) {
        super(name);
    }

    CheckingAccount (String name, double money) {
        super(name);
        this.setBalance(money);
    }

    void withdraw(double withdrawAmount) {
        if (this.getBalance() < 100) {
            serviceCharge();
        }
        this.setBalance(this.getBalance() - withdrawAmount);
    }

    void serviceCharge(){
        if(this.getBalance() < 100) {
            this.setBalance(this.getBalance() - WITHDRAWL_FEE);
        }
    }
}
