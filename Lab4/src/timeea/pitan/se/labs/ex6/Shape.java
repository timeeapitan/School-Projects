package timeea.pitan.se.labs.ex6;

import javax.swing.*;

public class Shape {
    private String color;
    private boolean filled;

    public Shape(){
        this.color="red";
        this.filled=true;
    }

    public Shape(String color, boolean filled){
        this.color=color;
        this.filled=filled;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color=color;
    }

    public boolean isFilled(){
        return filled;
    }

    public void setFilled(boolean filled){
        this.filled=filled;
    }

    public String toString(){
        if(isFilled()==true)
             return "A Shape with color of "+ getColor()+" and it is filled";
        else
            return "A Shape with color of "+getColor()+" and it is not filled";
    }
}
