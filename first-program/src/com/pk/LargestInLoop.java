package com.pk;

import java.util.Scanner;

public class LargestInLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input Numbers and if you want to exit enter 0");
        int mx = Integer.MIN_VALUE;
        int n = 1;
        while(n!=0){
            n = input.nextInt();
            if(n==0) break;
            if(n > mx){
                mx = n;
            }
        }
        System.out.println("Largest of all Numbers are : " + mx);
    }
}
