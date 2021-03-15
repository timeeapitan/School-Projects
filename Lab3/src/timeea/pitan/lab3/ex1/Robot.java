package timeea.pitan.lab3.ex1;

public class Robot {
    int x;
    Robot()
    {
        x=1; //position of the robot initialized to 1
    }
    void change(int k)
    {
        if(k>=1)
            x=x+k;
    }

    public String toString()
    {
        return "The position of the robot is "+ x; //de ce nu se afiseaza cand e scris doar x
    }
}
