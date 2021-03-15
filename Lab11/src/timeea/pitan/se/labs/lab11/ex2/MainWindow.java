package timeea.pitan.se.labs.lab11.ex2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;



public class MainWindow extends JFrame implements ActionListener {

    JButton addProduct, viewProducts, deleteProduct, changeQuantity;
    JLabel label;
    int WIDTH=250, HEIGHT=35;
    public ArrayList<Product> products=new ArrayList();

    public MainWindow(){
      setTitle("Stock Management Application");
      setSize(300,300);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setLayout(null);

      label=new JLabel("Welcome to our store!");
      label.setBounds(70,10,WIDTH,HEIGHT);
      add(label);

      addProduct=new JButton("Add a new product");
      addProduct.setBounds(10,60,WIDTH,HEIGHT);
      add(addProduct);
      addProduct.addActionListener(this);

      viewProducts=new JButton("View available products");
      viewProducts.setBounds(10,110,WIDTH,HEIGHT);
      add(viewProducts);
      viewProducts.addActionListener(this);

      deleteProduct=new JButton("Delete a product");
      deleteProduct.setBounds(10,160,WIDTH,HEIGHT);
      add(deleteProduct);
      deleteProduct.addActionListener(this);

      changeQuantity=new JButton("Change a product available quantity");
      changeQuantity.setBounds(10,210,WIDTH,HEIGHT);
      add(changeQuantity);
      changeQuantity.addActionListener(this);

      setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (addProduct == e.getSource()) {
            new AddProduct(this,products);
        }
        if (viewProducts == e.getSource()) {
           new ViewProducts(this,products);
        }

        if (deleteProduct == e.getSource()) {
            new DeleteProduct(this,products);
        }


        if (changeQuantity == e.getSource()) {
            new ChangeQuantity(this,products);
            }
        }

            public static void main (String[]args){
                new MainWindow();

            }

    }
