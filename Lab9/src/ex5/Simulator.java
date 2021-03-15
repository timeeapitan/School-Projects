package ex5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Simulator {

    public static void main(String[] args) {

        Controller c = new Controller();

        //build station Cluj-Napoca
        Controller c1 = new Controller("Cluj-Napoca");

        Segment s1 = new Segment(1);
        Segment s2 = new Segment(2);
        Segment s3 = new Segment(3);

        c1.addControlledSegment(s1);
        c1.addControlledSegment(s2);
        c1.addControlledSegment(s3);

        //build station Bucuresti
        Controller c2 = new Controller("Bucuresti");

        Segment s4 = new Segment(4);
        Segment s5 = new Segment(5);
        Segment s6 = new Segment(6);

        c2.addControlledSegment(s4);
        c2.addControlledSegment(s5);
        c2.addControlledSegment(s6);


        //build station Sibiu
        Controller c3 = new Controller("Sibiu");

        Segment s7 = new Segment(7);
        Segment s8 = new Segment(8);
        Segment s9 = new Segment(9);

        c3.addControlledSegment(s7);
        c3.addControlledSegment(s8);
        c3.addControlledSegment(s9);

        //connect the 3 controllers

        c1.addNeighbourController(c2);
        c1.addNeighbourController(c3);
        c2.addNeighbourController(c1);
        c2.addNeighbourController(c3);
        c3.addNeighbourController(c1);
        c3.addNeighbourController(c2);

        //testing

        Train t1 = new Train("Bucuresti", "IC-001");
        s1.arriveTrain(t1);

        Train t2 = new Train("Cluj-Napoca", "R-002");
        s5.arriveTrain(t2);

        Train t3 = new Train("Cluj-Napoca", "Blue-Arrow");
        s7.arriveTrain(t3);


        c1.displayStationState();
        c2.displayStationState();

        c3.displayStationState();

        System.out.println("\nStart train control\n");

        //execute 3 times controller steps
        for (int i = 0; i < 3; i++) {
            System.out.println("### Step " + i + " ###");
            c1.controlStep();
            c2.controlStep();
            c3.controlStep();

            System.out.println();

            c1.displayStationState();
            c2.displayStationState();
            c3.displayStationState();
        }
    }

}
