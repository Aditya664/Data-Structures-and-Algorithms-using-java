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
        if(sallary > 10000)
        {
            sallary = sallary + 2000;
        }
        else {
            sallary = sallary + 1000;
        }
        System.out.println(sallary);
    }
}
