package com.BesicsOfJava.Function;

import java.util.Arrays;

public class VarLeangthArgsument {
    public static void main(String[] args) {
//        fun();
        multiple(2,3,"kunal","aditya");
    }

    static void multiple(int a, int b,String  ...v){

    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
