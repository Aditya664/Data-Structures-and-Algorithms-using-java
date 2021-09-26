package com.BesicsOfJava.Function;

public class Shadowing {
    static int x = 90;//this will be shadowed at line 15
    /*
    anything we want to use in inside of block of x
    */

  /*  What is shadowing in java?

  */
    public static void main(String[] args) {
        System.out.println(x);//print 90
        int x;//class variable at line 4 is shadowed by this
        //System.out.println(x);//Scope will  begin when value is initialised
        x = 40;
        System.out.println(x);
        System.out.println(x);//print 40
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
