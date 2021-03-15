package timeea.pitan.se.labs.ex6;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class FinalTest {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        Shape shape2 = new Shape("green", true);
        System.out.println(shape1);
        System.out.println(shape2);
        shape1.setColor("yellow");
        shape2.setFilled(false);
        System.out.println(shape1);
        System.out.println(shape2);

        Circle c1=new Circle();
        Circle c2=new Circle(2.5);
        Circle c3=new Circle(7.3, "purple", false);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        c1.setRadius(10);
        System.out.println(c1);
        System.out.println("The area of the second circle is "+c2.getArea()+
                " and the perimeter of it is "+c2.getPerimeter());

        Rectangle r1=new Rectangle();
        Rectangle r2=new Rectangle(2,3);
        Rectangle r3=new Rectangle(5,7,"blue",true);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r1);
        r3.setLength(8);
        r1.setWidth(6);
        System.out.println(r3);
        System.out.println(r1);
        System.out.println("The area of the second rectangle is "+r2.getArea()+
                " and the perimeter of it is "+r2.getPerimeter());

        Square a=new Square();
        Square b=new Square(5);
        Square c=new Square(11,"orange",false);
        System.out.println(c);
        b.setSide(19);
        System.out.println(b);
        a.setWidth(29);
        System.out.println(a);
        b.setLength(24);
        System.out.println(b);

    }
}
