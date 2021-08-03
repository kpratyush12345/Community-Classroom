package com.pk;

import java.util.Scanner;

public class RupeeToDollar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number (Rs)");
        float rupee = input.nextFloat();
        System.out.println("The currency in Dollar is : " + (rupee/74.22) + "$");
    }
}
