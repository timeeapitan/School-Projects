package ex1;

public class TemperatureException extends Exception {
    int t;

    public TemperatureException(int t, String message) {
        super(message);
        this.t = t;
    }

    int getTemp() {
        return t;
    }
}