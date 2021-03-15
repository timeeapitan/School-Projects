package timeea.pitan.se.labs.lab10.ex3;

public class SecondCounter extends Thread {
    String name;

    SecondCounter(String name){
        this.name=name;
    }

    public void run(){
        for(int i=100; i<=200; i++) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("The second counter has finalised its job.");
    }
}
