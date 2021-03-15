package timeea.pitan.lab2.ex1;

import java.util.Scanner;

public class Maximum {
    public static void main(String args[]) {
        int x, y, max;
        Scanner in = new Scanner(System.in);

        System.out.println("Introduce 2 numbers from the keyboard.\n");
        System.out.println("The first number is: ");
        x = in.nextInt();
        System.out.println("The second number is: ");
        y = in.nextInt();

        if (x > y)
            max = x;
        else
            max = y;

        System.out.print("The Maximum between the 2 numbers is " + max + "\n");

    }

}
