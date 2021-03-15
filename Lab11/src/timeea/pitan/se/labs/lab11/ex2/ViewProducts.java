package timeea.pitan.se.labs.lab11.ex2;

import javax.swing.*;
import java.util.ArrayList;

public class ViewProducts extends JFrame {

    static JTextArea text;
    ArrayList<Product>list=new ArrayList();

    public ViewProducts(JFrame frame, ArrayList<Product>list){
        this.list=list;
        setTitle("Available products");
        setSize(400,400);
        setLayout(null);

        text=new JTextArea();
        text.setBounds(10,10,350,350);
        for(Product product:list)
            text.append(product.toString());
        add(text);

        setVisible(true);
    }

}
