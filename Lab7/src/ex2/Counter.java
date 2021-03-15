package ex2;

import java.io.*;
import java.util.Scanner;

public class Counter {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Give a desired character to be found in the file: ");
        char desired = input.next().charAt(0);
        int count = 0;

        BufferedReader in = new BufferedReader(new FileReader("data.txt"));
        String s1, s2 = new String();
        while ((s1 = in.readLine()) != null)
            s2 = s2 + s1 + ' ';
        in.close();

        StringReader string = new StringReader(s2);
        int c;
        while ((c = string.read()) != -1) {
            if (c == desired)
                count++;
        }

        System.out.println("The character \'" + desired + "\' appears " + count + " times in the file");
    }
}
