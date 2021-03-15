package timeea.pitan.se.labs.ex4;

abstract class Sensor {

    private String location;

   abstract int readValue();

   public String getLocation(){
       return location;
   }
}
