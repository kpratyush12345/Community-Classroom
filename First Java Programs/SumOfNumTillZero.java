package com.pk;

import java.util.Scanner;

public class SumOfNumTillZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input Numbers and if you want to exit enter 0");
        int sum = 0;
        int n = 1;
        while(n!=0){
            n = input.nextInt();
            sum += n;
        }
        System.out.println("Sum of Numbers are : " + sum);
    }
}
