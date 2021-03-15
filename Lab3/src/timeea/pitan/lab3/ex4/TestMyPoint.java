package timeea.pitan.lab3.ex4;

public class
TestMyPoint {
    public static void main(String[] args) {
        MyPoint point=new MyPoint();
        MyPoint another=new MyPoint(7,8);
        point.getX();
        point.getY();
        point.setX(7);
        point.setY(29);
        System.out.println(point);
        point.setXY(6,19);
        System.out.println(point);
        point.distance(9,28);
        point.setXY(13,17);
        point.distance(another);
    }
}

