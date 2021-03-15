
import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.*;

public class GUIColocviu extends JFrame {

    public JButton button;
    public JTextField textField;

    GUIColocviu() {
        setTitle("Colocviu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        init();
        setSize(200, 250);
        setVisible(true);
    }

    public void init() {

        this.setLayout(null);
        int width = 80;
        int height = 20;

        button = new JButton("Buton");
        button.setBounds(60, 150, width, height);

        textField = new JTextField();
        textField.setBounds(60, 50, width, height);

        button.addActionListener(new TreatButton());

        add(button);
        add(textField);

    }

    class TreatButton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            FileDialog d = new FileDialog(GUIColocviu.this, "Incarca", FileDialog.SAVE);
            d.setVisible(true);
            save(d.getDirectory() + d.getFile());
            open(d.getDirectory() + d.getFile());

        }
    }

    void save(String f) {
        try {
            PrintWriter pw = new PrintWriter(
                    new FileWriter(new File(f)));
            pw.println(textField.getText());
            pw.close();
        } catch (Exception e) {

        }


    }

    void open(String f) {
        try {
            textField.setText("");
            BufferedReader bf =
                    new BufferedReader(
                            new FileReader(new File(f)));
            String l = "";
            l = bf.readLine();
            while (l != null) {
                System.out.println(l + "\n");
                l = bf.readLine();
            }
        } catch (Exception e) {
        }

    }

    public static void main(String[] args) {
        JFrame gui = new GUIColocviu();
        gui.setVisible(true);
    }
}