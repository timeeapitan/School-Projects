package ex1;

public class CoffeeException extends Exception {
    int number;

    public CoffeeException(int number, String message) {
        super(message);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
