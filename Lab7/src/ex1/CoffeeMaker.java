package ex1;

import java.util.Random;
import java.util.Scanner;

public class CoffeeMaker {
    int number = 0;

    Coffee makeCoffee() {
        Random rand = new Random();
        System.out.println("Make a coffee, please.");
        int t = rand.nextInt(100);
        int c = rand.nextInt(100);
        Coffee coffee = new Coffee(t, c);
        number++;
        return coffee;
    }

    void numberOfCoffees(int no) throws CoffeeException {
        if (number == no)
            throw new CoffeeException(number, "The number of maximum coffees has been reached.");
    }
}
