package com.homework1.scanner;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner username = new Scanner(System.in);
        System.out.println("Please enter your name");

        String name = username.nextLine();
        System.out.println("Hello " + name);
    }
}
