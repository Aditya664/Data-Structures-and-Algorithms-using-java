package com.BesicsOfJava.Function;

import static com.BesicsOfJava.Function.Greatting.greeting;

public class ReturnString {
    public static void main(String[] args) {
        String ans = gree();
        System.out.println(ans);
    }
    static String gree(){

        String greeting = "Hey Its Aditya!";
        return greeting;
       /* return 112;
        this will not work because the we declare the string function
                and we return intiger value.*/
    }
}
