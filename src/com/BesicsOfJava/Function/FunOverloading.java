package com.BesicsOfJava.Function;

public class FunOverloading {

    /*What is function overloading?
    when two or more function have same name,
    but parameters are different,how program to determine which function
    runs its called as function overloading.
    ##compile time decides which funtion run first*/

    public static void main(String[] args) {
        fun(88);
        fun("Aditya");
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
}
