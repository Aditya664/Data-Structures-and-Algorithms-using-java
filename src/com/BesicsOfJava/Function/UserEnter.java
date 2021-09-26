package com.BesicsOfJava.Function;

import java.util.Scanner;

public class UserEnter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String naam = in.next();
        String person = myGreet(naam);
        System.out.println(person);


    }

    static String myGreet(String name) {
        String msg = "Hello " + name;
        return msg;
    }

}
