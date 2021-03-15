package timeea.pitan.se.labs.ex5;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder c1=new Cylinder();
        Cylinder c2=new Cylinder(2.5);
        Cylinder c3=new Cylinder(4, 6);
        System.out.println("The height of the first cylinder is "+c1.getHeight());
        System.out.println("The height of the second cylinder is "+c2.getHeight());
        System.out.println("The area of the third cylinder is "+c3.getArea()+
                " and its volume is "+c3.getVolume());
    }
}
