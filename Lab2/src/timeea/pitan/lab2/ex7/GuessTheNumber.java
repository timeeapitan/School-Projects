package timeea.pitan.lab2.ex7;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String args[])
    {
        int x,y, ct=0, ok=0;
        Random rand=new Random();
        Scanner in=new Scanner(System.in);
        System.out.println("The program will generate a number now.");
        x=rand.nextInt(10);
       do {
           System.out.println("Try to guess the number!");
           y = in.nextInt();
           if (y == x) {
               ok=1;
               System.out.println("Congratulations! You won!");
               break;
           }
           else if (y < x)
               System.out.println("Wrong answer, the number is too low.");
           else if (y > x)
               System.out.println("Wrong answer, the number is too high.");
           ct++;
       } while(ct<3);
       if(ok==0)
           System.out.println("You lost.");

    }
}
