package timeea.pitan.lab3.ex2;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1=new Circle( 1.5);
        Circle c2=new Circle(3.5, "purple");
        Circle c3=new Circle();
        c1.getRadius();
        c1.getArea();
        c2.getRadius();
        c2.getArea();
        c3.getRadius();
        c3.getArea();
        System.out.println("The color of the second circle is "+c2.getColor());
        System.out.println("The color of the third circle is "+c3.getColor());
    }
}
