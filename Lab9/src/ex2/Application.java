package ex2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Application extends JFrame implements ActionListener {

    JButton button;
    JTextField text;
    int counter = 0;

    public Application() {
        int width = 80;
        int height = 20;
        setTitle("Application");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 200);
        setVisible(true);

        setLayout(null);

        button = new JButton("Click!");
        button.setBounds(10, 20, width, height);
        button.addActionListener(this);
        setLocationRelativeTo(null);
        text = new JTextField();
        text.setBounds(10, 50, width, height);
        text.setEditable(false);

        getContentPane().add(button);
        getContentPane().add(text);
    }

    public void actionPerformed(ActionEvent e) {
        if (button == e.getSource()) {
            counter++;
            text.setText(Integer.toString(counter));
            //
            // text.setText(String.valueOf(counter));
        }
    }

    public static void main(String[] args) {
        new Application();
    }
}
