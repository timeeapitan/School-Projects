package timeea.pitan.lab2.ex6.part2;

import java.util.Scanner;

public class Factorial2 {
    static int factorial(int n)
    {
        if(n==1)
            return 1;
        else
            return (n*factorial(n-1));
    }
    public static void main(String args[])
    {
        int x;
        System.out.println("Give a number.\n");
        Scanner in=new Scanner(System.in);
        x=in.nextInt();
        System.out.println("The result is: "+factorial(x));
    }
}

