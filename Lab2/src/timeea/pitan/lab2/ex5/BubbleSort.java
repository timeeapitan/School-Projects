package timeea.pitan.lab2.ex5;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String args[])
    {
        int i, aux, ok;
        int v[]=new int[11];
        Scanner in=new Scanner (System.in);
        System.out.println("The Vector is:\n");
        for(i=0; i<10; i++)
            v[i]=in.nextInt();
        do {
            ok = 1;
            for (i = 0; i < 10; i++)
                if (v[i] > v[i + 1]) {
                    aux = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = aux;
                    ok = 0;
                }
        } while(ok==0);
        System.out.println("The sorted Vector is:\n");
        for(i=0; i<10; i++)
            System.out.println(v[i]);
    }
}
