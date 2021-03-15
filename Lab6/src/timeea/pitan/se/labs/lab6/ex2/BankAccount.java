package timeea.pitan.se.labs.lab6.ex2;

public class BankAccount implements Comparable {
    private String owner;
    private double balance;

    BankAccount(){}

    BankAccount(String owner, double balance){
        this.owner=owner;
        this.balance=balance;
    }

    public void withdraw(double amount){
        System.out.println("The amount of withdrawn money is "+amount);
    }

    public void deposit(double amount){
        System.out.println("The amount of deposit money is "+amount);
    }

    @Override
    public boolean equals(Object x){
        if(x instanceof BankAccount) {
            BankAccount a = (BankAccount) x;
            if (balance == a.balance)
                return balance == a.balance;
        }
            return false; }

    public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public int hashCode() {
        return (int)balance+owner.hashCode();
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "owner='" + owner + '\'' +
                ", balance=" + balance +
                '}';
    }

    public int compareTo(Object o){
        BankAccount test=(BankAccount)o;
        if(test.balance>this.balance)
            return 1;
        if(test.balance==this.balance)
            return 0;
        return -1;
    }

    public int compareTo(String string){
       return this.owner.compareTo(string);
    }

}
