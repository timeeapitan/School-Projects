package timeea.pitan.se.labs.lab10.ex5;

import java.nio.Buffer;

public class Producer implements Runnable {
    private BufferEx bf;
    private Thread thread;

    Producer(BufferEx bf) {
        this.bf = bf;
    }

    public void start() {
        if (thread == null) {
            thread = new Thread(this);
            thread.start();
        }
    }

    @Override
    public void run() {
        while (true) {
            bf.push(Math.random());
            System.out.println("I wrote.");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }

}
