package com.BesicsOfJava.Function;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        //This is normal program of sum of two number
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1 = in.nextInt();
        System.out.println("Enter second number: ");
        int n2 = in.nextInt();
        int sum = n1+n2;
        System.out.println("Sum is:"+sum);
    }
}
