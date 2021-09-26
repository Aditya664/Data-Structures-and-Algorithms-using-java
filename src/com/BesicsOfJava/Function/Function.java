package com.BesicsOfJava.Function;

import java.util.Scanner;

public class Function {
   /* What is function?
    a function is a piece of code which performs the
    operation and sometimes returns a value.*/
    public static void main(String[] args){
        //Syntax of function
       /* return_type name(){
            //body of Function
        return value;
        }*/
        int ans = sum();
        System.out.println(ans);

    }
    static int sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1 = in.nextInt();
        System.out.println("Enter second number: ");
        int n2 = in.nextInt();
        int sum = n1+n2;
        return sum;

        //function is over here.
    }
}
