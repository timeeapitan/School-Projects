package timeea.pitan.se.labs.ex2;

public class Main {
    public static void main(String[] args) {
        RealImage a=new RealImage("Tom");
        a.display();
        RotatedImage b=new RotatedImage("Jerry");
        b.display();
        ProxyImage c=new ProxyImage("Cartoons");
        ProxyImage d=new ProxyImage("Mac&Cheese", "real");
        c.display();
        d.display();
        ProxyImage e=new ProxyImage("Pizza","rotated");
        e.display();
    }
}
