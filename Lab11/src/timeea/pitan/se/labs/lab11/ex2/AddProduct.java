package timeea.pitan.se.labs.lab11.ex2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class AddProduct extends JFrame implements ActionListener {

    JLabel l1, l2, l3;
    JTextField name, quantity, price;
    JButton ok;
    int verify = 0;
    ArrayList<Product> list;

    public AddProduct(JFrame frame, ArrayList<Product> list) {
        this.list = list;
        setTitle("Products");
        setSize(250, 200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(null);

        l1 = new JLabel("Name");
        l1.setBounds(10, 10, 50, 20);
        add(l1);

        name = new JTextField();
        name.setBounds(100, 10, 100, 20);
        add(name);

        l2 = new JLabel("Quantity");
        l2.setBounds(10, 40, 50, 20);
        add(l2);

        quantity = new JTextField();
        quantity.setBounds(100, 40, 100, 20);
        add(quantity);

        l3 = new JLabel("Price");
        l3.setBounds(10, 70, 50, 20);
        add(l3);

        price = new JTextField();
        price.setBounds(100, 70, 100, 20);
        add(price);

        ok = new JButton("OK");
        ok.setBounds(100, 100, 60, 30);
        add(ok);
        ok.addActionListener(this);

        setLocationRelativeTo(frame);
        setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String pName=name.getText();
        int pQuantity=Integer.parseInt(quantity.getText());
        double pPrice=Double.parseDouble(price.getText());
        if (ok == e.getSource()) {
            for (int i = 0; i < list.size(); i++)
                if (name.getText().equals(list.get(i)))
                    verify = 1;
            if (verify == 1)
                JOptionPane.showInputDialog("The object already exists.");
            else {
                list.add(new Product(pName, pQuantity, pPrice));
                JOptionPane.showMessageDialog(this, "Products added.");
            }
        }
    }
}
