package ex4;

public class HeatingUnit {
    public static void turnOn(int temp, int threshold){

        System.out.println("Heating unit is turned on.");
        while(temp<threshold)
        {
            System.out.println("Current temperature:"+temp);
            temp++;
        }
        System.out.println("Temperature threshold reached. Heating unit is turning off.");
    }
}
