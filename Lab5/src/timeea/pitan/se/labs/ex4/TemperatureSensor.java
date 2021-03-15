package timeea.pitan.se.labs.ex4;

import java.util.Random;

public class TemperatureSensor extends Sensor {

    private int temperature;
    Random rand=new Random();

    public TemperatureSensor(){

        this.temperature=rand.nextInt(100);
   }
    public int readValue(){
        return temperature;
    }
}
