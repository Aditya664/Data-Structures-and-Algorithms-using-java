package com.BesicsOfJava.Switch;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
            case "Mango" -> System.out.println("King of fruit");
            case "Apple" -> System.out.println("A Sweet red fruit");
            case "Orange" -> System.out.println("Round fruit");
            case "Grapes" -> System.out.println("Small fruit");
            default -> System.out.println("Please enter valid fruit");
        }
    }
}
