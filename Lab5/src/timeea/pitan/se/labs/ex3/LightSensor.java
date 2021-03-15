package timeea.pitan.se.labs.ex3;

import java.util.Random;

public class LightSensor extends Sensor {

    private int light;
    Random rand=new Random();

    public LightSensor(){
        this.light=rand.nextInt(100);
    }

    public int readValue(){
        return light;
    }
}
