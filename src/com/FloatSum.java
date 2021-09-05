package com;

import java.util.Scanner;

public class FloatSum {
    public static void main(String[] args)
    {
//Sum of two number using int
        Scanner input = new Scanner(System.in);
        //Scan two numbers
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();
        //Get its sum
        float sum = num1+num2;
        //print sum
        System.out.println("Sum of given no is:" + sum);
    }
}
