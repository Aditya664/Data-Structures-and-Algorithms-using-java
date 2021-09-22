package com.BesicsOfJava.Loops;

import java.util.Scanner;

public class loops {
    public static void main(String[] args)
    {

        /*When you use which loop?
            when you know how many times loops going to run then for loop is used.
            and when you have no idea how many times loop going to run then while loop is used.*/
//        ----------

        //for loop
        /*syntax of for loop:
        for(initialisaion;condition;increament/decrement)

            {
                //body
            }*/
        System.out.println("-----For loop-----");
        for(int num = 1;num <= 5; num += 1)
        {
            System.out.println(num);
        }

        System.out.println("-----while loop-----");
        //While loop
     /*   syntax for while loop:
        while(confition)
        {
            //body
        }*/
        int num = 1;
        while(num <= 5)
        {
            System.out.println(num);
            num++;
        }

        System.out.println("-----do-while loop-----");
        //do-while loop
       /*
        syntax of do while loop:
        do {

        }while(condition);*/

        int n = 1;
        do{
            System.out.println(n);
            n++;
        }while(n <= 5);


    }
 }

