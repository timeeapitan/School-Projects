package ex4;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Garage cars = new Garage();
        Car c1 = new Car("VolksWagen Passat", 10000);
        Car c2 = new Car("Mazda", 8000);
        Car c3 = new Car("Porsche", 40000);
        Car c4 = new Car("Dacia 1300", 500);
        Car c5 = new Car("Masserati", 100000);
        cars.addCar(c1);
        cars.addCar(c2);
        cars.addCar(c3);
        cars.addCar(c4);
        cars.addCar(c5);
        System.out.println(cars);

        String filename;
        Scanner scanner = new Scanner(System.in);
        filename = scanner.nextLine();

        cars.store(filename);

        System.out.println("Select the car you want to show details about.");
        int i = scanner.nextInt();
        String model = cars.getCertainCar_model(i);
        int price = cars.getCertainCar_price(i);
        System.out.println(model + price);

        try {
            cars.load(filename, i);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
