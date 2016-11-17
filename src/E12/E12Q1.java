/*
 

 Created by Bill Li on 2016-11-08.
 */

package E12;

import java.util.Scanner;

public class E12Q1 {
    public static void main(String[] args) {
        Bank<BankAccount> bank = new Bank<BankAccount>();

        Scanner input = new Scanner(System.in);
        String response = "";

        while (!response.equalsIgnoreCase("quit")) {

            System.out.println("Enter c to add checking account");
            System.out.println("Enter s to add savings account");
            System.out.println("Enter r to remove account");
            System.out.println("Enter m to modify account");
            System.out.println("Enter v to view all accounts");
            System.out.println("Enter q to quit");
            response = input.next();

            if (response.equalsIgnoreCase("c")) {
                System.out.println("Enter name");
                response = input.next();

                CheckingAccount c = new CheckingAccount(response);
                bank.add(c);
            } else if (response.equalsIgnoreCase("s")) {
                System.out.println("Enter name");
                response = input.next();

                SavingsAccount s = new SavingsAccount(response);
                bank.add(s);
            } else if (response.equalsIgnoreCase("r")) {
                System.out.println("Enter name");
                response = input.next();

                int index = -1;
                for (int i = 0; i < bank.getAccounts().size(); i ++) {
                    if (bank.getAccounts().get(i).getName().equalsIgnoreCase(response)) {
                        index = i;
                    }
                }
                bank.getAccounts().remove(index);
            } else if (response.equalsIgnoreCase("m")) {
                System.out.println("Enter name");
                response = input.next();

                int index = -1;
                for (int i = 0; i < bank.getAccounts().size(); i ++) {
                    if (bank.getAccounts().get(i).getName().equalsIgnoreCase(response)) {
                        index = i;
                    }
                }

                System.out.println("Enter n to change name");
                System.out.println("Enter w to withdraw");
                System.out.println("Enter d to deposit");
                response = input.next();

                if (response.equalsIgnoreCase("n")) {
                    System.out.println("Enter new name");
                    response = input.next();
                    bank.getAccounts().get(index).setName(response);
                } else if (response.equalsIgnoreCase("w")) {
                    System.out.println("Enter amount to withdraw");
                    response = input.next();
                    bank.getAccounts().get(index).withdraw(Integer.parseInt(response));
                } else if (response.equalsIgnoreCase("d")) {
                    System.out.println("Enter amount to deposit");
                    response = input.next();
                    bank.getAccounts().get(index).deposit(Integer.parseInt(response));
                }
            } else if (response.equalsIgnoreCase("v")) {
                for (int i = 0; i < bank.getAccounts().size(); i ++) {
                    System.out.print(bank.getAccounts().get(i).getName());
                    System.out.println("\t$" + bank.getAccounts().get(i).getBalance());
                }
            }
        }

        System.out.println("Quitting");
    }

}
