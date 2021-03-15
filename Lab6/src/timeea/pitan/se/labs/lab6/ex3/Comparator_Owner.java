package timeea.pitan.se.labs.lab6.ex3;

import java.util.Comparator;

public class Comparator_Owner implements Comparator<NewBankAccount> {
    @Override
    public int compare(NewBankAccount o1, NewBankAccount o2) {
        return o1.getOwner().compareTo(o2.getOwner());
    }
}
