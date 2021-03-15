package ex3;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.io.*;

public class Encrypt_Decrypt {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the file to be converted:");
        String filename = scanner.nextLine();
        String extension = scanner.nextLine();
        String filename_final = filename + extension;
        System.out.println("1. Encrypt the file. \n2. Decrypt the file.");
        int op = scanner.nextInt();
        switch (op) {
            case 1:
                BufferedReader input = new BufferedReader(new FileReader(filename_final));
                String s1, s2 = new String();
                while ((s1 = input.readLine()) != null)
                    s2 = s2 + s1 + "\n";
                try {
                    CharArrayWriter aux1 = new CharArrayWriter();
                    BufferedReader input1 = new BufferedReader(new StringReader(s2));
                    String filename2 = filename + ".enc";
                    PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter(filename2)));
                    int c;
                    while ((c = input1.read()) != -1) {
                        if (c != ' ') {
                            c = c << 1;
                            aux1.write(c);
                        } else {
                            aux1.write(c);
                        }
                    }
                    output.println(aux1);
                    output.close();
                    aux1.close();
                } catch (Exception e) {
                    System.err.println("End of stream");
                }
                break;
            case 2:
                System.out.println(filename_final);
                BufferedReader input2 = new BufferedReader(new FileReader(filename_final));
                String s3, s4 = new String();
                while ((s3 = input2.readLine()) != null)
                    s4 = s4 + s3 + "\n";
                try {
                    CharArrayWriter charArrayWriter = new CharArrayWriter();
                    BufferedReader input3 = new BufferedReader(new StringReader(s4));
                    String filename3 = filename + ".dec";
                    PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter(filename3)));
                    int c;
                    while ((c = input3.read()) != -1) {
                        if (c != ' ') {
                            c = c >> 1;
                            charArrayWriter.write(c);
                        }
                        else {
                            charArrayWriter.write(c);
                        }
                    }
                        output.println(charArrayWriter);
                        output.close();
                    } catch(Exception e){
                        System.err.println("End of stream");
                    }
                    break;
                }
        }
    }
