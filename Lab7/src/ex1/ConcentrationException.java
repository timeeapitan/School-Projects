package ex1;


public class ConcentrationException extends Exception {
    int c;

    public ConcentrationException(int c, String message) {
        super(message);
        this.c = c;
    }

    int getConcentration() {
        return c;
    }
}
