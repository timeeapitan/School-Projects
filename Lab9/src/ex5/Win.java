package ex5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Win extends JFrame implements ActionListener {

    JTextField text, t1, t2,t3;
    JButton button;

    Win() {
        setTitle("Railway Traffic");
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        text = new JTextField();
        text.setBounds(200, 10, 120, 30);
        text.addActionListener(this);

        t1 = new JTextField();
        t1.setBounds(20, 70, 100, 20);

        t2 = new JTextField();
        t2.setBounds(20, 110, 100, 20);

        t3 = new JTextField();
        t3.setBounds(20, 150, 100, 20);

        button = new JButton("Add a train");
        button.setBounds(200, 200, 120, 50);
        button.addActionListener(this);


        add(text);
        add(t1);
        add(t2);
        add(t3);
        add(button);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Win();


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
