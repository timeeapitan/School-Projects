package timeea.pitan.se.labs.lab6.ex2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Bank banca = new Bank();
        banca.addAccount("Love", 10000);
        banca.addAccount("Timeea", 125);
        banca.addAccount("Miriam", 78);
        banca.addAccount("Kim K", 9999);
        banca.addAccount("Me", 99999999);
        banca.printAccounts();
        System.out.println("Owners with a balance between 50 and 700 are: ");
        banca.printAccounts(50, 700);
        System.out.println("The bank accounts sorted alphabetically by owner field: ");
        sorting(banca.getAllAccounts());

    }

    public static void sorting(List <BankAccount> accounts){
        for(int i=0; i<accounts.size()-1; i++) {
            for (int j = i + 1; j < accounts.size(); j++) {
                if ((accounts.get(i).getOwner().compareTo(accounts.get(j).getOwner())) > 0) {
                    String owner1 = (String) accounts.get(i).getOwner();
                    double balance1 = (double) accounts.get(i).getBalance();

                    accounts.get(i).setOwner(accounts.get(j).getOwner());
                    accounts.get(i).setBalance(accounts.get(j).getBalance());

                    accounts.get(j).setOwner(owner1);
                    accounts.get(j).setBalance(balance1);
                }
            }
        }

                for(int k=0; k<accounts.size(); k++){
                    System.out.println(accounts.get(k).getOwner());
    }
    }
}
