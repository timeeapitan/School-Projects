package timeea.pitan.se.labs.lab6.ex4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // HashMap<Word, Definition> final_dictionary = new HashMap<Word, Definition>();
        int choice;
        Scanner scanner = new Scanner(System.in);
        Dictionary dictionary=new Dictionary();

        do {
            System.out.println("Choose a number:\n1.Add \n2.Find \n3.Exit ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Add a word: ");
                    Word w = new Word(scanner.next());

                    System.out.println("Write a definition: ");
                    Definition d = new Definition(scanner.next());

                    dictionary.addWord(w,d);
                    System.out.println(w.getName() + " has been added!");
                    break;

                case 2:
                    System.out.println("Find a word");
                    Word test = new Word(scanner.next());
                    System.out.println("The definition is ");
                    dictionary.getDefinition(test);
                    break;

            }
        } while (choice == 1 || choice == 2);
    }
}
