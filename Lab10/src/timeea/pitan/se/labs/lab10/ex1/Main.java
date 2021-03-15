package timeea.pitan.se.labs.lab10.ex1;

public class Main {
    public static void main(String[] args) {
        Counter c1=new Counter("counter 1");
        Counter c2=new Counter("counter 2");
        Counter c3=new Counter("counter 3");

        c1.start();
        c2.start();
        c3.start();
    }
}
