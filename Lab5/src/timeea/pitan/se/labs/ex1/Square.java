package timeea.pitan.se.labs.ex1;

import timeea.pitan.se.labs.ex1.*;

public class Square extends Rectangle {

    public Square(){}
    public Square(double side){
        super(side, side);
    }

    public Square(double side, String color, boolean filled){
        super(side,side,color,filled);
    }

    public double getSide(){
        return super.getWidth();
    }

    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setWidth(double width){
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public void setLength(double length){
        super.setLength(length);
        super.setWidth(width);
    }

    @Override
    public String toString() {
        return "A Square with side=" + getSide() +
                ", which is a subclass of " + super.toString();
    }
}
