package com.pk;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = input.nextInt();
        if(n%2==0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
