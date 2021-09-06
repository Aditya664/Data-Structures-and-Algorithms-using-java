package com.input;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter some input:");
        int rollNo = input.nextInt();
        System.out.println("Your Roll no is " + rollNo);
    }
}
