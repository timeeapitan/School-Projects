package ex4;

import static java.lang.Integer.parseInt;

public class TemperatureSensor {
    private static int threshold;

    public TemperatureSensor(int threshold){
        this.threshold = threshold;
    }

    public void tempWatchdog(Event s){
        if(s.toString().contains("NoEvent")==true||s.toString().contains("FireEvent")==true){}
        else {
            if (parseInt(s.toString().replaceAll("\\D+", "")) < threshold)
                HeatingUnit.turnOn(parseInt(s.toString().replaceAll("\\D+", "")), threshold);
            else if (parseInt(s.toString().replaceAll("\\D+", "")) > threshold)
                CoolingUnit.turnOn(parseInt(s.toString().replaceAll("\\D+", "")), threshold);
            else if (parseInt(s.toString().replaceAll("\\D+", "")) == threshold)
                System.out.println("Temperature is at set threshold");
        }
    }
}
