package com.pk;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Principle, Time and Rate");
        float principle = input.nextFloat();
        float time = input.nextFloat();
        float rate = input.nextFloat();
        float simpleInterest = principle * rate * time / 100;
        System.out.println("The Simple Interest is " + simpleInterest);
    }
}
