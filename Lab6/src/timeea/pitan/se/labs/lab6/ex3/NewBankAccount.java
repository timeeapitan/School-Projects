package timeea.pitan.se.labs.lab6.ex3;

public class NewBankAccount implements Comparable<NewBankAccount>{

    private String owner;
    private double balance;

    NewBankAccount(double balance){
        this.balance=balance;
    }

    NewBankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void withdraw(double amount) {
        System.out.println("The amount of money withdrawn is " + amount);
    }

    public void deposit(double amount) {
        System.out.println("The amount of money in the deposit is " + amount);
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    @Override
    public String toString() {
        return "NewBankAccount{" +
                "owner='" + owner + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public int compareTo(NewBankAccount o) {
        return o.getOwner().compareTo(this.getOwner());
    }
}
