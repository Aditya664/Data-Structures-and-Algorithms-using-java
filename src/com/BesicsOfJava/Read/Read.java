package com.BesicsOfJava.Read;

import java.util.Scanner;

public class Read {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter any word: ");
        String word = sc.next();
        System.out.println("You entered this word: " + word);
        System.out.print("Please, enter any integer number: ");
        int i = sc.nextInt();
        System.out.println("You entered this integer number: " + i);

    }
}
