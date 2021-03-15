package timeea.pitan.se.labs.lab11.ex1;

import javax.swing.*;
import java.util.Random;

public class TempSensor extends Thread {

    Random random = new Random(100);
    Window win = new Window();
    boolean ok = true;
    boolean display=false;

    TempSensor() {
    }

    @Override
    public void run() {
        while (ok) {
            try {
                float degrees = random.nextFloat();
                String temperature = String.format("%.02f", degrees * 100);
                win.setText(temperature);
                win.getUpdate().setText("");
                display=true;
                if(display) {
                    win.getUpdate().setText("The temperature has been updated.");
                }
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

