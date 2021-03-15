package timeea.pitan.se.labs.lab6.ex1;

public class Main {
    public static void main(String[] args) {
        BankAccount rich=new BankAccount("Timeea Pitan",2500000.99);
        BankAccount poor=new BankAccount("Kim Kardashian", 99.50);
        BankAccount modest=new BankAccount("Jennifer Aniston", 12000);
        BankAccount even=new BankAccount("Miriam Pitan", 2500000.99);
        BankAccount copy=new BankAccount("Kim Kardashian", 99.50);
        if(rich.equals(even))
            System.out.println("Great family!");
        else
            System.out.println("Crisis");

        if(poor.equals(copy)){
            System.out.println(poor.hashCode());
            System.out.println(copy.hashCode());}

        if(poor.equals(modest))
            System.out.println("That doesn't feel right");
        else
            System.out.println("Yes, error!");
        }

}
