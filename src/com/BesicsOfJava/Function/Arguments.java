package com.BesicsOfJava.Function;

import java.util.Scanner;

import static java.lang.Integer.sum;

public class Arguments {
    public static void main(String[] args) {

        int ans = sum(6, 8);
        System.out.println(ans);
    }
    //pass the value of number when you are calling the method in main function
    static int sum(int a, int b){
            //This is sum function
            //any channges makes in this function its reflected to all calls.
           int sum2 = a + b;
           return sum2;
        }


}
