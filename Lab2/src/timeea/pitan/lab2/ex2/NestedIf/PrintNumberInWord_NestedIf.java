package timeea.pitan.lab2.ex2.NestedIf;

import java.util.Scanner;

public class PrintNumberInWord_NestedIf {
    public static void main(String args[]) {
        int x;
        System.out.print("Enter a number between 1 and 10:\n");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        if (x >= 1 && x <= 10) {
            if (x == 10)
                System.out.print("TEN\n");
            else if (x == 9)
                System.out.print("NINE\n");
            else if (x == 8)
                System.out.print("EIGHT\n");
            else if (x == 7)
                System.out.print("SEVEN\n");
            else if (x == 6)
                System.out.print("SIX\n");
            else if (x == 5)
                System.out.print("FIVE\n");
            else if (x == 4)
                System.out.print("FOUR\n");
            else if (x == 3)
                System.out.print("THREE\n");
            else if (x == 2)
                System.out.print("TWO\n");
            else
                System.out.print("ONE\n");
        }
        else
            System.out.println("OTHER\n");
    }

}



