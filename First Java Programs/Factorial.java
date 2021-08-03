package com.pk;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = input.nextInt();
        int fact = 1;
        if(n==0){
            System.out.println("1");
            return;
        }
        while(n>=1){
            fact *= n;
            n--;
        }
        System.out.println(fact);
    }
}
