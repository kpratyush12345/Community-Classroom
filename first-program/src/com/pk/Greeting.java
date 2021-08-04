package com.pk;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = input.nextLine();
        System.out.println("Welcome to Community Classroom " + name);
    }
}
