package timeea.pitan.se.labs.ex3;

import java.util.Arrays;

    public class Controller {
        public Controller() {
        }

        TemperatureSensor temperatureSensor = new TemperatureSensor();
        LightSensor lightSensor = new LightSensor();

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
