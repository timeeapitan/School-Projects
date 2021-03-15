package timeea.pitan.lab2.ex2.Switch;

import java.util.Scanner;

public class PrintNumberInWord_Switch {
    public static void main(String args[]) {
        int x;
        System.out.print("Give a number.\n");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();

        switch (x) {
            case 1: {
                System.out.print("ONE\n");
                break;
            }
            case 2: {
                System.out.print("TWO\n");
                break;
            }
            case 3: {
                System.out.print("THREE\n");
                break;
            }
            case 4: {
                System.out.print("FOUR\n");
                break;
            }
            case 5: {
                System.out.print("FIVE\n");
                break;
            }
            case 6: {
                System.out.print("SIX\n");
                break;
            }
            case 7: {
                System.out.print("SEVEN\n");
                break;
            }
            case 8: {
                System.out.print("EIGHT\n");
                break;
            }
            case 9: {
                System.out.print("NINE\n");
                break;
            }
            case 10: {
                System.out.print("TEN\n");
                break;
            }
            default:
                System.out.print("OTHER\n");
        }
    }
}
