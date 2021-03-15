package ex4;

public class ControlUnit {

    public static int threshold;
    private FireSensor[] fireSensors = new FireSensor[2];
    private static ControlUnit instance = null;

    ControlUnit(int threshold) {

        this.threshold = threshold;

        TemperatureSensor ts = new TemperatureSensor(threshold);
        fireSensors[0] = new FireSensor();
        fireSensors[1] = new FireSensor();




        Home h = new Home(){
            protected void setValueInEnvironment(Event event){
                System.out.println("New event in environment "+event);
                ts.tempWatchdog(event);
                fireSensors[0].fireWatchdog(event);
                fireSensors[1].fireWatchdog(event);
            }
            protected void controlStep(){
                System.out.println("Control step executed");
            }
        };
        h.simulate();
    }

    public static ControlUnit getInstance(int threshold){
        if(instance == null) instance = new ControlUnit(threshold);
        return instance;
    }



}
