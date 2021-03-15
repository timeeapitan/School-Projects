package ex4;

public class CoolingUnit {
    public static void turnOn(int temp, int threshold){

        System.out.println("Cooling unit is turned on.");
        while(temp>threshold)
        {
            System.out.println("Current temperature:"+temp);
            temp--;
        }
        System.out.println("Temperature threshold reached. Cooling unit is turning off.");
    }
}

