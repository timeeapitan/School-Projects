package timeea.pitan.se.labs.lab10.ex5;

public class Test {
    public static void main(String[] args) {
        BufferEx b=new BufferEx();
        Producer pro=new Producer(b);
        Consumer c1=new Consumer(b);
        Consumer c2=new Consumer(b);
        pro.start();
        c1.start();
        c2.start();

    }
}

