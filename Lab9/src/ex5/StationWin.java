package ex5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import static ex5.NewSimulator.getTextArea;

public class StationWin extends JFrame implements ActionListener {

    JLabel message;
    JTextField text;
    JButton ok;
    static ArrayList<Controller> controllers=new ArrayList();
    int i=0;

    StationWin(JFrame frame){
        setTitle("Add station");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,150);
        setLayout(null);

        message=new JLabel("Give a name to the station.");
        message.setBounds(10,10,200,20);
        add(message);

        text=new JTextField();
        text.setBounds(10,40,100,20);
        add(text);

        ok=new JButton("OK");
        ok.setBounds(10,70,60,30);
        add(ok);
        ok.addActionListener(this);
        setLocationRelativeTo(frame);

        setVisible(true);
    }

    public static ArrayList<Controller> getControllers() {
        return controllers;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(ok==e.getSource()){
            controllers.add(new Controller(text.getText()));
            getTextArea().setText("New station created: "+controllers.get(i).getStationName());
            i++;
            new SegmentWin(this);
            dispose();
        }
    }
}
