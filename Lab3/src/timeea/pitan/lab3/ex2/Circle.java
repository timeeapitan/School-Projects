package timeea.pitan.lab3.ex2;

public class Circle {
    private double radius;
    private String color;

    Circle() {
        radius = 1.0;
        color = "red";
    }

    Circle(double radius) {
        this.radius = radius;
    }

    Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
        System.out.println("The color of the circle is " + color);
    }

    public void getRadius() {
        System.out.println("The radius is: " + radius);
    }

    public void getArea() {
        double area = Math.PI * radius * radius;
        System.out.println("The area is: " + area);
    }

    public String getColor() {
        return color;
    }
}
