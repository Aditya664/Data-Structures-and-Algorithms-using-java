package com.BesicsOfJava.Function;

import java.util.Scanner;

public class SumFun {
    public static void main(String[] args) {
        //calling function
        sum();
    }
    static void sum(){
        //This is sum function
        //any channges makes in this function its reflected to all calls.
            Scanner in = new Scanner(System.in);
            System.out.println("Enter first number: ");
            int n1 = in.nextInt();
            System.out.println("Enter second number: ");
            int n2 = in.nextInt();
            int sum = n1+n2;
            System.out.println("Sum is:"+sum);
    }
}
