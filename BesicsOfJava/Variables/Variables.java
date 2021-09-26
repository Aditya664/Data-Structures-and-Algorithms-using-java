package com.BesicsOfJava.Variables;

public class Variables {
    public static void main(String[] args)
    {
            /*What is variable?
                1.A java variable is a piece of memory that can contain a data value.
                2.java is strongly types language . each variable has a type.
                3.A variable is defined by the combination of identifier and type.
                4. you can declare variable with 'var' keyword -- in this case type of the variable will be defined by the compiler.
                5.All variables have a scpoe which defines their visibility.
                */
            byte b = 1;
            short s;
            s = 2;
            int i = 3;
            char c = 'a';
            boolean bool = true;
            long l = 23000_200_000L;
            double db = 6.3;
            float f = 10.2f;
            var v = 1;
//            v = true;
//            v= 1.1
        int i3 = s;
        char c2 = 100;
        System.out.println(c2);
        double d2 = i3;
        d2 = l;


    }
}
