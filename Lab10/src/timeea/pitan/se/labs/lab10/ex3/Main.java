package timeea.pitan.se.labs.lab10.ex3;

public class Main {
    public static void main(String[] args) {
        FirstCounter fc=new FirstCounter("Counter 1");
        SecondCounter sc=new SecondCounter("Counter 2");

        fc.start();
        try{
            fc.join();
        }catch(InterruptedException e){
            System.out.println("The counter has been interrupted.");
            e.printStackTrace();
        }
        sc.start();
    }
}
