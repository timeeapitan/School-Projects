package timeea.pitan.se.labs.lab6.ex2;

import java.util.Comparator;

public class BalanceComparator implements Comparator<BankAccount> {
    @Override
    public int compare(BankAccount o1, BankAccount o2) {
        if (o1.getBalance() > o2.getBalance())
            return 1;
        else
            return -1;
    }
}
