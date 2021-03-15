package timeea.pitan.se.labs.lab10.ex5;

public class Consumer extends Thread {
    private BufferEx bf;

    Consumer(BufferEx bf){this.bf=bf;}

    public void run(){
        while(true){
            System.out.println("I wrote "+this+">>"+bf.get());
        }
    }
}
