package timeea.pitan.lab3.ex3;

import java.util.Scanner;

public class Author {
    private String name;
    private String email;
    private char gender;

    Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public void getName() {
        System.out.println("The name of the author is " + name);
    }

    public void getEmail() {
        System.out.println("The email of the author is " + email);
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void getGender() {
        System.out.println("The gender of the author is " + gender);
    }

    public String toString() {
        return name + "(" + gender + ") at email" + email;
    }
}
