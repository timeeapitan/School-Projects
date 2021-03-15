package timeea.pitan.se.labs.lab10.ex4;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Space extends Thread {
        ArrayList<Robot> robots = new ArrayList();
        int x[] = new int[10];
        int y[] = new int[10];

        public void run () {

            for (int i = 0; i < 10; i++) {
                robots.add(new Robot("Robot " + i));
            }

            for (Robot r : robots) {
                r.move();
                System.out.println("Robot " + r.getName() + " moves at [" + r.getX() + ", " + r.getY() + "]");
            }

            while (robots.size() > 1) {
                int i = 0;
                for (Robot r : robots) {
                    r.move();
                    System.out.println(r.getName() + " moves at [" + r.getX() + ", " + r.getY() + "]");
                    x[i] = r.getX();
                    y[i] = r.getY();
                    i++;
                }
                for (int a = 0; a < i; a++) {
                    boolean verify = false;
                    for (int b = a + 1; b < i; b++) {
                        if (x[a] == x[b] && y[a] == y[b] && x[a] != -1) {
                            x[b] = -1;
                            y[b] = -1;
                            verify = true;
                        }
                    }
                    if (verify == true) {
                        x[a] = -1;
                        y[a] = -1;
                    }
                }

                for (int k = 0; k < robots.size(); k++) {
                    if (x[k] == -1 && y[k] == -1)
                        robots.remove(k);
                }
                try{
                    Thread.sleep(100);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
            System.out.println("There is only one robot left in the 2D Space: "+robots.get(0).getName());
        }
    }
