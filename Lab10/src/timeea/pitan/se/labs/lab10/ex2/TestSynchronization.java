package timeea.pitan.se.labs.lab10.ex2;

public class TestSynchronization {
    public static void main(String[] args) {
        Point p=new Point();
        FireSet fs=new FireSet(p);
        FireGet fg=new FireGet(p);

        fs.start();
        fg.start();
    }
}
