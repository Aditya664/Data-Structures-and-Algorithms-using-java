package com.BesicsOfJava.ErrorsInJava;

import java.util.Scanner;

public class FloatingPointError {
    public static void main(String[] args)
    {
// Values are not accurate in float
        Scanner input = new Scanner(System.in);
        float marks = input.nextFloat();
        System.out.println(marks);
        /*it gives this output
         545454.5454545
         545454.56*/
    }
}
