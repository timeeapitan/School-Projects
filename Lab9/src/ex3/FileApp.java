package ex3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileApp extends JFrame implements ActionListener {
    JButton button;
    JTextField textField;
    JTextArea textArea;


    public FileApp() {

        setTitle("File Application Test");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        init();
        setSize(500, 400);
        setVisible(true);
    }

    void init() {
        setLayout(null);

        textField = new JTextField();
        textField.setBounds(10, 20, 100, 20);

        button = new JButton("Click here");
        button.setBounds(10, 60, 100, 20);
        button.addActionListener(this);

        textArea = new JTextArea();
        textArea.setBounds(10, 100, 200, 250);

        add(button);
        add(textArea);
        add(textField);
    }

    public void actionPerformed(ActionEvent e) {
        String t = FileApp.this.textField.getText();
        if (button == e.getSource()) {
            try {
                String s=new String();
                BufferedReader file=new BufferedReader(new FileReader(t));
                while((s=file.readLine())!=null){
                    textArea.append(s+"\n"); }
            } catch (IOException exception) {
                exception.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        new FileApp();
    }
}
