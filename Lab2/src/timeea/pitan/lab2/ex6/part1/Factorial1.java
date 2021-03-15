package timeea.pitan.lab2.ex6.part1;

import java.util.Scanner;

public class Factorial1 {
    public static void main(String args[]) {
        int x, i, factorial = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Give a number: ");
        x = in.nextInt();
        for (i = 2; i <= x; i++)
            factorial = factorial * i;
        System.out.println("The factorial of the given number is: " + factorial);
    }
}
