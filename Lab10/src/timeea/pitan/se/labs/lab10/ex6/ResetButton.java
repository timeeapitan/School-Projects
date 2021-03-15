package timeea.pitan.se.labs.lab10.ex6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResetButton implements ActionListener {
    Chronometer ch;

    ResetButton(Chronometer ch) {
        this.ch = ch;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ch.setText("0");
    }
}
