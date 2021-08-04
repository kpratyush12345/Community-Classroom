package com.pk;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        float a = input.nextFloat();
        float b = input.nextFloat();
        System.out.println("Enter an Operator");
        char op = input.next().charAt(0);
        if(op == '+') System.out.println(a+b);
        else if(op == '-') System.out.println(a-b);
        else if(op == '*') System.out.println(a*b);
        else if(op == '/') System.out.println(a/b);
        else System.out.println("Enter a valid Operator");
    }
}
