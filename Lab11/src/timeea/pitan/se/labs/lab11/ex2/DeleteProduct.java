package timeea.pitan.se.labs.lab11.ex2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class DeleteProduct extends JFrame implements ActionListener {

    JLabel label;
    JButton button;
    JTextField text;
    int ok=0;
    ArrayList<Product> list=new ArrayList();

    public DeleteProduct(JFrame frame, ArrayList<Product> list) {
        this.list=list;
        setSize(280, 150);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(null);

        label = new JLabel("Enter a product's name.");
        label.setBounds(10, 10, 250, 20);
        add(label);

        text = new JTextField();
        text.setBounds(10, 40, 100, 20);
        add(text);

        button = new JButton("OK");
        button.setBounds(110, 70, 55, 30);
        add(button);
        button.addActionListener(this);

        setLocationRelativeTo(frame);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (button == e.getSource()) {
            for(int i=0; i<list.size();i++){
                if(list.get(i).getName().equals(text.getText()))
                    list.remove(i);
                JOptionPane.showMessageDialog(this,"The product has been deleted successfully");
            }
            if(ok==0)
                JOptionPane.showMessageDialog(this,"There are no products in the stock");
        }
    }
}
