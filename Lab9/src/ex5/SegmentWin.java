package ex5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static ex5.Controller.getList;
import static ex5.NewSimulator.getTextArea;
import static ex5.StationWin.getControllers;

public class SegmentWin extends JFrame implements ActionListener {

    JLabel noSegments;
    JTextField no;
    JButton ok,set;
    int j=0;

    public SegmentWin(JFrame frame) {
        setSize(250, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        noSegments = new JLabel("Give a number of segments.");
        noSegments.setBounds(10, 10, 200, 20);
        add(noSegments);

        no = new JTextField();
        no.setBounds(30, 40, 30, 20);
        add(no);

        ok = new JButton("ok");
        ok.setBounds(90, 40, 50, 20);
        ok.addActionListener(this);
        add(ok);
        setLocationRelativeTo(frame);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (ok == e.getSource()) {
            int nr = Integer.parseInt(no.getText());
            no.setEnabled(false);
            ok.setEnabled(false);

            JLabel segments_id[] = new JLabel[nr];
            JTextField fields[] = new JTextField[nr];

            setSize(250, 150 + nr * 40);

            for (int i = 0; i < nr; i++) {
                segments_id[i] = new JLabel("Segment " + (i + 1) + ": ");
                fields[i] = new JTextField();

                segments_id[i].setBounds(10, 100+i*20, 70, 20);
                fields[i].setBounds(100, 100+i*20, 100, 20);

                SegmentWin.this.add(fields[i]);
                SegmentWin.this.add(segments_id[i]);

                getControllers().get(j).addControlledSegment(new Segment(i+1));

            }
            j++;
            set=new JButton("Set");
            set.setBounds(30,nr*20+120,60,30);
            set.addActionListener(this);
            add(set);
        }

        if(set==e.getSource()){
            getTextArea().setText(getList().toString());
            dispose();
        }
    }
}
