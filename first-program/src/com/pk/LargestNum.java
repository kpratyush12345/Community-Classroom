package com.pk;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        int a = input.nextInt();
        int b = input.nextInt();
//        if(a > b){
//            System.out.println("Greater Number is : " + a);
//        } else {
//            System.out.println("Greater Number is : " + b);
//        }
        System.out.println("Greater Number is " + ((a > b) ? a : b)); //Ternary Operator
    }
}
