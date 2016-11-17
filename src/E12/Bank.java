/*
 Bank.java

 Created by Bill Li on 2016-11-08.
 */

package E12;

import java.util.ArrayList;

class Bank<A> {
    private ArrayList<A> account = new ArrayList<>();

    void add(A account) {
        this.account.add(account);
    }

    public void remove(A account) {
        this.account.remove(account);
    }

    ArrayList<A> getAccounts() {
        return account;
    }
}
