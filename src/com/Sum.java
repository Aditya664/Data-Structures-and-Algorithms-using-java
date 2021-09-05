package com;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args)
    {
//Sum of two number using int
        Scanner input = new Scanner(System.in);
        //Scan two numbers
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        //Get its sum
        int sum = num1+num2;
        //print sum
        System.out.println("Sum of given no is:" + sum);
    }
}
