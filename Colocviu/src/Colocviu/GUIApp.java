package Colocviu;

//Implement a Java GUI application composed of two text fields and one button. The first text field holds the name of a text file. When clicking the button the text input in the second text field is written in the text file.


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GUIApp extends JFrame implements ActionListener {

    JTextField text1,text2;
    JButton button;
    JLabel label;
    String filename,composition;

    GUIApp(){
            setTitle("Application");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            init();
            setSize(300, 180);
            setVisible(true);
        }

        public void init() {
            setLayout(null);
            text1 = new JTextField();
            text1.setBounds(10, 50, 100, 30);
            add(text1);

            text2=new JTextField();
            text2.setBounds(160,50,120,30);
            add(text2);

            button = new JButton("Ok");
            button.setBounds(125, 100, 50, 20);
            add(button);
            button.addActionListener(this);

            label = new JLabel("Enter a file in the first textfield.");
            label.setBounds(50, 10, 200, 20);
            add(label);
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(button==e.getSource()){
            filename=text1.getText();
            try {
                PrintWriter file=new PrintWriter(new FileWriter(new File(filename)));
                composition=text2.getText();
                file.println(composition);
                file.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        new GUIApp();
    }
}


