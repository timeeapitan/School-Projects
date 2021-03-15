package ex5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static ex5.Controller.getList;

public class TrainWin extends JFrame implements ActionListener {

    JLabel label1, label2;
    JTextField destination, name;
    JButton set;

    TrainWin(JFrame frame) {
        setTitle("Add a train.");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(250, 150);
        setLayout(null);

        label1 = new JLabel("Name: ");
        label1.setBounds(10, 10, 80, 20);
        add(label1);

        destination = new JTextField();
        destination.setBounds(100, 10, 100, 20);
        add(destination);

        label2 = new JLabel("Destination :");
        label2.setBounds(10, 50, 100, 20);
        add(label2);

        name = new JTextField();
        name.setBounds(100, 50, 100, 20);
        add(name);

        set = new JButton("Set");
        set.setBounds(100, 80, 55, 20);
        add(set);
        set.addActionListener(this);

        setLocationRelativeTo(frame);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (set == e.getSource()) {
            for (int i = 0; i < StationWin.getControllers().size(); i++) {
                for (Segment segment : getList()) {
                    if (segment.hasTrain() == false) {
                        segment.arriveTrain(new Train(destination.getText(), name.getText()));
                        dispose();
                        return;
                    }
                }
            }
            JOptionPane.showMessageDialog(this, "There is no segment available.");
        }
    }
}
