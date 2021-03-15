package timeea.pitan.lab3.ex5;

public class Flower {

    private static int counter;

    Flower() {
        System.out.println("Flower has been created!");
    }

    static void Counter() {
        counter++;
    }

    public static void main(String[] args) {
        Flower[] garden = new Flower[5];
        for (int i = 0; i < 5; i++) {
            Flower f = new Flower();
            garden[i] = f;
            Flower.Counter();
        }
        System.out.println("The number of the constructed objects is " + counter);
    }
}
