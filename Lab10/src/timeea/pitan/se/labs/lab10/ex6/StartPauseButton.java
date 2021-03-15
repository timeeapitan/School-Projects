package timeea.pitan.se.labs.lab10.ex6;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartPauseButton implements ActionListener {
    Chronometer ch;
    int ok = 0;
    Thread t;
    boolean clicked = true;
    boolean count = false;
    int i = 0;

    StartPauseButton(Chronometer ch) {
        this.ch = ch;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        synchronized (this) {
            if (clicked) {
                count = true;
                while (count) {
                    ch.setText(Integer.toString(i));
                    i++;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
                clicked = false;
                notify();
            }
        }
        synchronized (this) {
            if (!clicked) {
                count = false;
                if(count) {
                    try {
                        wait();
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
                clicked = true;
            }
        }
    }


//    StartPauseButton(Chronometer ch) {
//        this.ch = ch;
//    }
//
//    synchronized void start() throws InterruptedException {
//        while (clicked) {
//            count = true;
//            while (count) {
//                ch.setText(Integer.toString(i));
//                i++;
//                Thread.sleep(1000);
//            }
//        }
//    }
//
//    synchronized void stop() throws InterruptedException {
//        if (clicked == false) {
//            wait();
//        }
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if (clicked) {
//            try {
//                start();
//            } catch (InterruptedException ex) {
//                ex.printStackTrace();
//            }
//            clicked = false;
//        } else {
//            try {
//                stop();
//            } catch (InterruptedException ex) {
//                ex.printStackTrace();
//            }
//            clicked=true;
//        }
//    }
}

