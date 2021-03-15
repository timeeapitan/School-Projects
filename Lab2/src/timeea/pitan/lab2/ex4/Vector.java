package timeea.pitan.lab2.ex4;

import java.util.Scanner;

public class Vector {
    public static void main(String args[]) {
        int max = 0, n, i;
        int v[]=new int[100];
        Scanner in = new Scanner(System.in);
        System.out.println("Give a number of elements.\n");
        n = in.nextInt();
        System.out.println("The Vector v is: \n");
        for (i = 0; i < n; i++) {
            v[i] = in.nextInt();
        }
        for (i = 0; i < n; i++) {
            if (v[i] > max)
                max = v[i];
        }
        System.out.println("The Maximum element of the Vector is:\n" + max);
    }


}
