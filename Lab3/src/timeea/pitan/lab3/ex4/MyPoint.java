package timeea.pitan.lab3.ex4;

public class MyPoint {
    int x;
    int y;

    MyPoint() {
        x = 0;
        y = 0;
    }

    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void getX() {
        System.out.println(x);
    }

    void getY() {
        System.out.println(y);
    }

    void setX(int x) {
        this.x = x;
    }

    void setY(int y) {
        this.y = y;
    }

    void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "The coordinates are (" + x + "," + y + ").\n";
    }

    void distance(int x, int y) {
        double distance = Math.sqrt((this.x - x) ^ 2 + (this.y - y) ^ 2);
        System.out.println("The distance between x and y is " + distance);
    }

    void distance(MyPoint another) {
        double distance = Math.sqrt((x - another.x) ^ 2 + (y - another.y) ^ 2);
        System.out.println("The distance between the points is " + distance);
    }
}
