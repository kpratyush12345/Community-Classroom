package com.pk;

import java.util.Scanner;

public class FactorsOfNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Numbers");
        int n = input.nextInt();
        int f = 2;
        System.out.println("Factors of " + n + "are :");
        while(f <= n){
            if(n%f==0){
                System.out.print(f + " ");
            }
            f++;
        }
    }
}
