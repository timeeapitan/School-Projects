package timeea.pitan.lab2.ex3;

import java.util.*;

public class PrimeNumbers {
    public static void main(String args[]) {
        int x, y, i, j, ct = 0, nr = 0, k = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Give the interval endings: ");
        x = in.nextInt();
        y = in.nextInt();
        System.out.print("The interval [A,B] is: [" + x + "," + y + "].\n");
        Vector v = new Vector();
        if (x < y) {
            i = x;
            while (i <= y) {
                for (j = 1; j <= i; j++)
                    if (i % j == 0)
                        ct++;
                if (ct == 2) {
                    v.add(k, i);
                    k++;
                    nr++;
                }
                ct = 0;
                i++;
            }
        } else
            System.out.print("A needs to be smaller than B!\n");
        if (v.size() == 0)
            System.out.println("No numbers stored in the Vector.");
        else
            System.out.println(v);
        if (nr == 1)
            System.out.print("There is one prime number in the interval [" + x + "," + y + "].\n");
        else if (nr > 0)
            System.out.print("There are " + nr + " prime numbers in the interval [" + x + "," + y + "].\n");
        else
            System.out.print("There are no prime numbers in the interval [" + x + "," + y + "].\n");
    }
}



