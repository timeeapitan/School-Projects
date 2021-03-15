package ex4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class HomeAutomation {

    public static void main(String[] args) throws FileNotFoundException {
        int threshold;
        Scanner s = new Scanner(System.in);
        System.out.println("Set temperature:");

        PrintStream out = new PrintStream(new File("system_logs.txt"));
        PrintStream console = System.out;


        System.setOut(out);
        threshold = s.nextInt();
        ControlUnit controlUnit = ControlUnit.getInstance(threshold);

        System.setOut(console);
        System.out.println("Home automation ended. Check system_logs.txt for further information.");
    }
}









