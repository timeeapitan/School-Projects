package ex4;

import java.io.*;
import java.util.*;

public class Garage implements Serializable {
    ArrayList<Car> cars = new ArrayList<Car>();

    void addCar(Car car){
        cars.add(car);
    }
    void store(String fileName) {
        try {
            ObjectOutputStream obj1 = new ObjectOutputStream(new FileOutputStream(fileName));
            obj1.writeObject(this);
            System.out.println("Cars stored in the garage.");
        } catch (IOException e) {
            System.err.println("Cars can't be stored in the garage.");
            e.printStackTrace();
        }
    }

     void load(String fileName, int i) throws IOException, ClassNotFoundException {
        ObjectInputStream obj2=new ObjectInputStream(new FileInputStream(fileName));
        Garage garage=(Garage)obj2.readObject();
        System.out.println("The wanted car is "+garage.getCars().get(i).toString());
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "cars=" + cars +
                '}';
    }

    String getCertainCar_model(int i){
        return cars.get(i).getModel();
    }

    int getCertainCar_price(int i){
        return cars.get(i).getPrice();
    }
}
