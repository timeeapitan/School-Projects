package ex1;

import java.util.Scanner;

public class CoffeeTest {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        CoffeeMaker maker = new CoffeeMaker();
        CoffeeDrinker d = new CoffeeDrinker();
        System.out.println("Give the number of maximum coffees.");
        int no=scan.nextInt();

        for (int i = 1; i < 15; i++) {
            Coffee coffee = maker.makeCoffee();

            try {
                d.drinkCoffee(coffee);
            } catch (TemperatureException e) {
                System.out.println("Exception:" + e.getMessage() +
                        " temperature=" + e.getTemp());
            } catch (ConcentrationException e) {
                System.out.println("Exception:" + e.getMessage() +
                        " concentration=" + e.getConcentration());
            } finally {
                System.out.println("Throw the coffee cup.\n");
            }

            try {
                maker.numberOfCoffees(no);
            } catch (CoffeeException e) {
                System.out.println("Exception:" + e.getMessage() +
                        "Number of coffees=" + e.getNumber()+"\n");
            }
        }
    }
}

