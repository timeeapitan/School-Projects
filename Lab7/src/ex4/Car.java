package ex4;

import com.sun.jdi.ClassNotLoadedException;

import java.io.ObjectOutput;
import java.io.*;
import java.util.*;

public class Car implements Serializable {
    String model;
    int price;

    public Car() {
    }

    public Car(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Model='" + model + '\'' +
                "\nPrice=" + price +
                '.';
    }
}
