package timeea.pitan.se.labs.ex1;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1=new Circle();
        Circle c2=new Circle(4.2);
        System.out.println("The radius of the first circle is "+ c1.getRadius()+
                " and the radius of the second circle is "+c2.getRadius());
        System.out.println("The area of the first circle is "+c1.getArea()+
                " and the radius of the second circle is "+c2.getArea());
    }
}
