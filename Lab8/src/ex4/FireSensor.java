package ex4;

public class FireSensor {

    public FireSensor(){

    }

    public void fireWatchdog(Event s){
        if(s.toString().contains("NoEvent")==true||s.toString().contains("Temperature")==true){}
        else
        if(s.toString().contains("smoke")==true) FireSensor.tripFireSensor();
    }

    public static void tripFireSensor(){
        AlarmUnit.raiseAlarm();
    }
}

