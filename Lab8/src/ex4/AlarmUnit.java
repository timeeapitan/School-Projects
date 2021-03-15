package ex4;

public class AlarmUnit {
    public static void raiseAlarm(){
        System.out.println("Alarm is raised.");
        GsmUnit.callOwner();
    }
}
