package ex5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static ex5.StationWin.controllers;

public class NewSimulator extends JFrame implements ActionListener {

    JButton station, train, stationInformation, controlStep;
    static JTextArea textArea;
    int j = 0;

    public NewSimulator() {
        setTitle("Railway Traffic");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        station = new JButton("ADD STATION");
        station.setBounds(10, 30, 140, 20);
        add(station);
        station.addActionListener(this);

        train = new JButton("ADD TRAIN");
        train.setBounds(10, 80, 140, 20);
        add(train);
        train.addActionListener(this);

        stationInformation = new JButton("STATIONS STATE");
        stationInformation.setBounds(10, 130, 140, 20);
        add(stationInformation);
        stationInformation.addActionListener(this);

        controlStep = new JButton("CONTROL STEP");
        controlStep.setBounds(10, 180, 140, 20);
        add(controlStep);
        controlStep.addActionListener(this);

        textArea = new JTextArea();
        textArea.setBounds(180, 10, 300, 330);
        add(textArea);

        setVisible(true);

    }

    public static JTextArea getTextArea() {
        return textArea;
    }

    public static void main(String[] args) {
        new NewSimulator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (station == e.getSource()) {
            new StationWin(this);
        }

        if (controlStep == e.getSource()) {
            for (int i = 0; i < controllers.size(); i++) {
                getTextArea().setText(controllers.get(i).controlStep());
            }
        }

        if (train == e.getSource()) {
            new TrainWin(this);
        }

        if (stationInformation == e.getSource()) {
            for (int i = 0; i < StationWin.getControllers().size(); i++) {
                String text=StationWin.getControllers().get(i).displayStationState();
                textArea.setText(text);
            }
        }
    }
}

