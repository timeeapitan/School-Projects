package timeea.pitan.se.labs.ex5;

import timeea.pitan.se.labs.ex1.*;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(){
        this.height=1.0;
    }

    public Cylinder(double radius){
        super(radius);
    }

    public Cylinder(double radius, double height){
        super(radius);
        this.height=height;
    }

    public double getHeight(){
        return height;
    }

    @Override
    public double getArea(){
        return 2*Math.PI*getRadius()*height+Math.PI*getRadius()*getRadius();
    }

    public double getVolume(){
        return getArea()*height;
    }

}
