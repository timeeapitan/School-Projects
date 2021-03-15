package ex1;

public class Coffee {
    private int temperature;
    private int concentration;
    private int number = 0;

    public Coffee(int t, int c) {
        temperature = t;
        concentration = c;
        number++;
    }

    int getTemperature() {
        return temperature;
    }

    int getConcentration() {
        return concentration;
    }

    public int getNumber() {
        return number;
    }

    public String toString() {
        return "[coffee temperature=" + temperature +
                ", concentration:" + concentration + "]";
    }

    Coffee makeCoffee() {
        System.out.println("Make a coffee, please!");
        int t = (int) (Math.random() * 100);
        int c = (int) (Math.random() * 100);
        Coffee coffee = new Coffee(t, c);
        return coffee;
    }
}
