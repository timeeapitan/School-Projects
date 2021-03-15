package ex4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import static java.lang.System.exit;

public class X_and_0 extends JFrame implements ActionListener {

    JButton buttons[] = new JButton[9];
    int fill = 0;

    public X_and_0() {
        setTitle("X and 0 GAME");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton("");
            add(buttons[i]);
            buttons[i].addActionListener(this);
        }

        setSize(500, 500);
        setLayout(new GridLayout(3, 3));
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();
        if (fill % 2 == 0)
            clickedButton.setText("X");
        else
            clickedButton.setText("0");

        if (whoIsTheWinner() == true) {
            CustomDialog myDialog = new CustomDialog(this,true,"Congratulation, you won!");
                if (myDialog.isAnswer())
                    newGame();
                else
                    exit(1);}

        if(lostGame()==false){
            CustomDialog myDialog=new CustomDialog(this,true,"Sorry you lost!");
            if(myDialog.isAnswer()==true)
                newGame();
            else if(myDialog.getAnswer2()==0)
                X_and_0.this.setVisible(false);
        }

        fill++;
    }

    public boolean whoIsTheWinner() {
        if (neighbourButtons(0, 1) && neighbourButtons(1, 2))
            return true;
        else if (neighbourButtons(3, 4) && neighbourButtons(4, 5))
            return true;
        else if (neighbourButtons(6, 7) && neighbourButtons(7, 8))
            return true;
        else if (neighbourButtons(0, 3) && neighbourButtons(3, 6))
            return true;
        else if (neighbourButtons(1, 4) && neighbourButtons(4, 7))
            return true;
        else if (neighbourButtons(2, 5) && neighbourButtons(5, 8))
            return true;
        else if (neighbourButtons(0, 4) && neighbourButtons(4, 8))
            return true;
        else if (neighbourButtons(2, 4) && neighbourButtons(4, 6))
            return true;
        else
            return false;
    }

    public void newGame() {
        for (int i = 0; i < 9; i++) {
            buttons[i].setText("");
        }
    }

    public boolean neighbourButtons(int a, int b) {
        if (buttons[a].getText().equals(buttons[b].getText()) && !buttons[a].getText().equals(""))
            return true;
        else
            return false;
    }

    public boolean lostGame() {
        boolean ok=false;
        for (int i = 0; i < 9; i++)
            if (buttons[i].getText() == "")
                ok=true;
            return ok;
    }

    public static void main(String[] args) {
        new X_and_0();
    }
}
