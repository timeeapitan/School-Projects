package timeea.pitan.se.labs.lab6.ex3;

import java.util.Comparator;

public class Comparator_Balance implements Comparator<NewBankAccount> {

    @Override
    public int compare(NewBankAccount o1, NewBankAccount o2) {
        if(o1.getBalance()>o2.getBalance())
            return 1;
        else return -1;
    }
}
