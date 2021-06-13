package ex25;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Nyles Symonette
 */

public class App {
    public static void passwordStrength(String password) {
        if (password.matches("[0-9]+") && password.length() < 8) {
            System.out.println("The password '" + password + "' is a very weak password.");
        } else if (password.matches("[a-zA-Z]+") && password.length() < 8) {
            System.out.println("The password '" + password + "' is a weak password.");
        } else if (password.matches("[0-9a-zA-Z]+") && password.length() >= 8) {
            System.out.println("The password '" + password + "' is a strong password.");
        } else {
            System.out.println("The password '" + password + "' is a very strong password.");
        }
    }

    public static void main(String[] args) {
        passwordStrength("12345");
        passwordStrength("abcdef");
        passwordStrength("abc123xyz");
        passwordStrength("1337h@xor");
    }
}
