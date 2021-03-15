package timeea.pitan.se.labs.ex1;

public class Circle {
    private double radius;
    private String color;

    public Circle(){
        this.radius=1.0;
        this.color="red";
    }

    public Circle(double radius){
        this.radius=radius;
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }
}

