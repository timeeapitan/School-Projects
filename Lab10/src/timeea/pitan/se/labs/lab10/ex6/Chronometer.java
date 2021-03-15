package timeea.pitan.se.labs.lab10.ex6;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Chronometer extends JFrame {

    JButton b1, b2;
    JLabel label;
    JTextField text;
    StartPauseButton button1;

    public JButton getB1() {
        return b1;
    }

    public JButton getB2() {
        return b2;
    }

    public void setText(String text) {
        this.text.setText(text);
    }

    public String getText() {
        return text.getText();
    }

    public Chronometer() {
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        init();
        setVisible(true);
    }

    void init() {
        setLayout(null);

        label = new JLabel("Chronometer");
        label.setBounds(100, 10, 80, 20);
        add(label);

        text = new JTextField();
        text.setBounds(100, 40, 80, 20);
        add(text);

        b1 = new JButton("Start/Pause");
        b1.setBounds(30, 70, 100, 20);
        add(b1);
        b1.addActionListener(button1 = new StartPauseButton(this));

        b2 = new JButton("Reset");
        b2.setBounds(150, 70, 80, 20);
        add(b2);
        b2.addActionListener(new ResetButton(this));
    }

    public static void main(String[] args) {
        new Chronometer();
    }

}
