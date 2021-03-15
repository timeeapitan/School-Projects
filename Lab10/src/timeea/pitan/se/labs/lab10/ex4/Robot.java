package timeea.pitan.se.labs.lab10.ex4;

import java.util.Random;

public class Robot {

    String name;
    int x, y;
    Random random = new Random();

    public Robot(String name) {
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getName() {
        return name;
    }

    public void move(){
        x=random.nextInt(10);
        y=random.nextInt(10);
    }
}

