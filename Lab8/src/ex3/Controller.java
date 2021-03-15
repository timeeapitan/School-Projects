package ex3;

import java.util.*;

class Controller {

    String stationName;

    ArrayList<Controller> neighbourControllers = new ArrayList<Controller>();

    void addNeighbourController(Controller c) {
        neighbourControllers.add(c);
    }

    //storing station train track segments
    ArrayList<Segment> list = new ArrayList();

    public Controller(String stationName) {
        this.stationName = stationName;
    }

    void addControlledSegment(Segment s) {
        list.add(s);
    }


    int getFreeSegmentId() {
        for (Segment s : list) {
            if (s.hasTrain() == false)
                return s.id;
        }
        return -1;
    }

    void controlStep() {
        //check which train must be sent

        for (Segment segment : list) {
            if (segment.hasTrain()) {
                Train t = segment.getTrain();

                for (int i = 0; i < neighbourControllers.size(); i++) {
                    if (t.getDestination().equals(neighbourControllers.get(i).stationName)) {
                        //check if there is a free segment
                        int id = neighbourControllers.get(i).getFreeSegmentId();
                        if (id == -1) {
                            System.out.println("The train +" + t.name + "from the station " + stationName + " cannot be sent to " + neighbourControllers.get(i).stationName + ". No segment available!");
                            return;
                        }
                        //send train
                        System.out.println("The train " + t.name + " leaves from the station " + stationName + " to " + neighbourControllers.get(i).stationName);
                        segment.departTrain();
                        neighbourControllers.get(i).arriveTrain(t, id);
                    }

                }
            }
        }//.for

    }//.


    public void arriveTrain(Train t, int idSegment) {
        for (Segment segment : list) {
            //search id segment and add a train on it
            if (segment.id == idSegment)
                if (segment.hasTrain() == true) {
                    System.out.println("CRASH! Train " + t.name + " collided with " + segment.getTrain().name + " on segment " + segment.id + " in station " + stationName);
                    return;
                } else {
                    System.out.println("Train " + t.name + " arrived at segment " + segment.id + " in station " + stationName);
                    segment.arriveTrain(t); //changes the train in the current segment with the train given as parameter
                    return;
                }
        }

        //this should not happen
        System.out.println("Train " + t.name + " cannot be received " + stationName + ". Check controller's logic algorithm!");

    }


    public void displayStationState() {
        System.out.println("=== STATION " + stationName + " ===");
        for (Segment s : list) {
            if (s.hasTrain())
                System.out.println("|----------ID=" + s.id + "__Train=" + s.getTrain().name + " to " + s.getTrain().destination + "__----------|");
            else
                System.out.println("|----------ID=" + s.id + "__Train=______ to ________----------|");
        }
    }
}