package timeea.pitan.se.labs.ex1;

public class Main {
    public static void main(String[] args) {
        Shape[] shape= new Shape[6];
        shape[0]=new Circle(7);
        shape[1]=new Circle(3.5, "red",true);
        shape[2]=new Rectangle(8,10);
        shape[3]=new Rectangle(2,3,"green",false);
        shape[4]=new Square(5);
        shape[5]=new Square(9, "yellow",true);
        for(int i=0; i<6; i++)
        {
            System.out.println("The area of shape "+i+" is "+shape[i].getArea());
            System.out.println("The perimeter of shape "+i+" is "+shape[i].getPerimeter());
        }
    }
}
