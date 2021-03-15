package timeea.pitan.se.labs.lab11.ex1;

import javax.swing.*;

public class Window extends JFrame {

    JTextField text;
    JLabel label;
    JLabel update;

    Window(){
        setTitle("Temperature sensor");
        setSize(380,150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        init();
        setVisible(true);
    }

    void init(){
        setLayout(null);
        text=new JTextField();
        text.setBounds(20,60,50,30);
        add(text);

        label=new JLabel("Temperature");
        label.setBounds(130,10,100,20);
        add(label);

        update=new JLabel("");
        update.setBounds(100,60,220,20);
        add(update);

    }

    public void setText(String text) {
        Window.this.text.setText(text);
    }

    public JLabel getUpdate() {
        return update;
    }
}
