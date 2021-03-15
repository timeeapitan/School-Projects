package ex1;

public class CoffeeDrinker {
    void drinkCoffee(Coffee coffee) throws TemperatureException, ConcentrationException {
        if (coffee.getTemperature() > 60)
            throw new TemperatureException(coffee.getTemperature(), "Coffee is too hot!");
        if (coffee.getConcentration() > 50)
            throw new ConcentrationException(coffee.getConcentration(), "Coffee concentration is too high!");
        System.out.println("Drink coffee:" + coffee);
    }
}
