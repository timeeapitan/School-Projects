package timeea.pitan.se.labs.lab6.ex3;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        NewBank BRD = new NewBank();
        BRD.addAccount("Love", 1);
        BRD.addAccount("Timeea", 5);
        BRD.addAccount("Miriam", 4);
        BRD.addAccount("Kim K", 2);
        BRD.addAccount("Me", 3);
        BRD.addAccount("Someone", 6);
        BRD.printAccounts();
        System.out.println("Owners with a balance between 1 and 3 are: ");
        BRD.printAccounts(1, 3);
        System.out.println("The bank accounts sorted alphabetically by owner field: ");
            sorting(BRD.getAllAccounts());
    }

    public static void sorting(Set<NewBankAccount> accounts){
           TreeSet<NewBankAccount> sortat=new TreeSet<NewBankAccount>(new Comparator_Owner());
           sortat.addAll(accounts);
        System.out.println(sortat);
    }
}
