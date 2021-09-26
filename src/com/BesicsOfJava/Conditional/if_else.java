package com.BesicsOfJava.Conditional;

public class if_else {
    public static void main(String[] args)
    {
     /*   Syntax of if statement
            if(boolean expressiom t or f)
        {
            //body
        }
            else
        {
            //do this
        }*/

        int sallary = 25000;
        //Single if condition
        if(sallary > 10000)
        {
            sallary = sallary + 2000;
            sallary += sallary;
        }
        else {
            sallary = sallary + 1000;
        }
        System.out.println(sallary);

        //multiple if else
        int age = 20;
        if(age == 20)
        {
            System.out.println("You are young!");
        }
        else if(age < 20)
        {
            System.out.println("You are child!");
        }
        else{
            System.out.println("You are old!");
        }
    }
}
