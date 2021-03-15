package timeea.pitan.se.labs.ex4;

import java.util.Arrays;

public class UpdateController {
    private UpdateController() {
    }

    private static UpdateController test;
    TemperatureSensor temperatureSensor = new TemperatureSensor();
    LightSensor lightSensor = new LightSensor();

    public static UpdateController getControl(){
        if(test==null)
            test=new UpdateController();
        return test;
    }

    public void control() {
        Arrays.asList(temperatureSensor.readValue(), lightSensor.readValue()).forEach(e ->
        {
            System.out.println(e);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException ignored) {
            }
        });
    }
}