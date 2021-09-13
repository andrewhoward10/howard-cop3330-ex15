/*
 *  UCF COP3330 Fall 2021 Assignment 15 Solution
 *  Copyright 2021 Andrew Howard
 */
package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("What is the username? ");
        String userName = keyboardInput.nextLine();

        System.out.print("What is the password? ");
        String userPassword = keyboardInput.next();

        if (userPassword.equals("abc$123")) {
            System.out.print("Welcome!");
        } else {
            System.out.print("I don't know you. ");
        }
    }
}
