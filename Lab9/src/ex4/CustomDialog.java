package ex4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomDialog extends JDialog implements ActionListener {

    JLabel l1, l2;
    JButton yes, no, close;
    private boolean answer;
    private int answer2;

    public CustomDialog(JFrame frame, boolean modal, String text) {
        super(frame,modal);
        setSize(320, 150);
        setLayout(null);

        l1 = new JLabel(text);
        l1.setBounds(10, 10, 200, 20);
        add(l1);

        l2 = new JLabel("Do you want to play again?");
        l2.setBounds(10, 35, 200, 40);
        add(l2);

        yes = new JButton("YES");
        yes.setBounds(10, 80, 70, 20);
        yes.addActionListener(this);
        add(yes);


        no = new JButton("NO");
        no.setBounds(100, 80, 70, 20);
        no.addActionListener(this);
        add(no);


        close=new JButton("CLOSE");
        close.setBounds(190,80,100,20);
        close.addActionListener(this);
        add(close);

        setLocationRelativeTo(frame);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if(yes==e.getSource()){
            answer=true;
            setVisible(false);}
        if(no==e.getSource()){
            answer=false;
            setVisible(false);}
        if(close==e.getSource()){
            answer2=0;
            setVisible(false);}
    }

    public boolean isAnswer() {
        return answer;
    }

    public int getAnswer2() {
        return answer2;
    }
}
