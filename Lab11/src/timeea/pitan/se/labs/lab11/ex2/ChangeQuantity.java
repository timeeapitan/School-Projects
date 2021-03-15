package timeea.pitan.se.labs.lab11.ex2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ChangeQuantity extends JFrame implements ActionListener {

    JLabel l1, l2;
    JTextField text1, text2;
    JButton button;
    ArrayList<Product> list=new ArrayList();

    public ChangeQuantity(JFrame frame, ArrayList<Product> list) {
        this.list=list;
        setSize(300, 250);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Change Quantity");
        init();

        setLocationRelativeTo(frame);
        setVisible(true);
    }

    public void init() {
        setLayout(null);
        l1 = new JLabel("Enter the product's name: ");
        l1.setBounds(10, 10,150 , 20);
        ChangeQuantity.this.add(l1);

        text1 = new JTextField();
        text1.setBounds(40, 40, 100, 20);
        ChangeQuantity.this.add(text1);

        l2 = new JLabel("Enter the product's quantity:");
        l2.setBounds(10, 70, 180, 20);
        ChangeQuantity.this.add(l2);

        text2 = new JTextField();
        text2.setBounds(40, 100, 100, 20);
        ChangeQuantity.this.add(text2);

        button = new JButton("SET");
        button.setBounds(40, 150, 60, 30);
        button.addActionListener(this);
        ChangeQuantity.this.add(button);

    }

    public JButton getButton() {
        return button;
    }

    public JTextField getText1() {
        return text1;
    }

    public JTextField getText2() {
        return text2;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(button==e.getSource()){
            for(Product product: list){
                if(product.getName().equals(text1.getText())) {
                    int newQuantity=Integer.parseInt(text2.getText());
                    product.setQuantity(newQuantity);
                }
            }
        }
    }
}
