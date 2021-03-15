package timeea.pitan.se.labs.lab6.ex3;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import java.util.*;

public class NewBank {

    TreeSet<NewBankAccount> accounts = new TreeSet<NewBankAccount>();
    TreeSet<NewBankAccount> sorted=new TreeSet<NewBankAccount>(new Comparator_Balance());

    public void addAccount(String owner, double balance) {
        NewBankAccount A = new NewBankAccount(owner, balance);
        accounts.add(A);
    }

    public void printAccounts() {
        sorted.addAll(accounts);
        System.out.println(sorted);
        }


    public void printAccounts(double minBalance, double maxBalance){
        for(NewBankAccount test:accounts){
            if(test.getBalance()>minBalance && test.getBalance()<maxBalance)
                System.out.println(test);
        }
    }

    public Set getAllAccounts(){
            return accounts;
    }
}



