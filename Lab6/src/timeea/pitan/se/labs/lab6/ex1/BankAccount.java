package timeea.pitan.se.labs.lab6.ex1;

public class BankAccount {
    private String owner;
    private double balance;

    BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void withdraw(double amount) {
        System.out.println("The amount of withdrawn money is " + amount);
    }

    public void deposit(double amount) {
        System.out.println("The amount of deposit money is " + amount);
    }

    @Override
    public boolean equals(Object x) {
        if (x instanceof BankAccount) {
            BankAccount a = (BankAccount) x;
            if (this.balance == a.balance)
                return balance == a.balance; //returns true
        }
        return false;
    }

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
        return (int) balance + owner.hashCode();
    }
}
