package timeea.pitan.se.labs.lab6.ex2;

import java.util.*;

public class Bank {
    ArrayList<BankAccount> accounts=new ArrayList();
    TreeSet<BankAccount> sorted=new TreeSet(new BalanceComparator());
    int ok;

    public void addAccount(String owner, double balance){
        BankAccount B=new BankAccount(owner, balance);
        accounts.add(B);
    }

    public void printAccounts(){
        sorted.addAll(accounts);
        System.out.println(sorted);
    }
//    public void printAccounts(){
//
//        do {
//            ok = 1;
//
//            for (int i = 0; i < accounts.size() - 1; i++) {
//                BankAccount test1 = (BankAccount) accounts.get(i);
//                BankAccount test2 = (BankAccount) accounts.get(i + 1);
//                if (test1.getBalance() > test2.getBalance()) {
//                    double alfa = test1.getBalance();
//                    test1.setBalance(test2.getBalance());
//                    test2.setBalance(alfa);
//
//                    String name = test1.getOwner();
//                    test1.setOwner(test2.getOwner());
//                    test2.setOwner(name);
//
//                    ok = 0;
//                }
//            }
//        }while(ok==0);
//
//        for(int j=0; j<accounts.size(); j++)
//        System.out.println(accounts.get(j).toString());
//
//        }

        public void printAccounts(double minBalance, double maxBalance){
            for(int k=0; k<accounts.size(); k++) {
                BankAccount x = (BankAccount) accounts.get(k);
                if (x.getBalance() > minBalance && x.getBalance() < maxBalance)
                    System.out.println(x.toString());
            }

        }


        public List getAllAccounts(){
            return accounts;
        }

}
