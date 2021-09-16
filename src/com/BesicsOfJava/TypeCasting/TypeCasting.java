package com.BesicsOfJava.TypeCasting;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args)
    {
       /* When One type of data is assigned to another to type of
        variable an automatic type conversion will take place
        if the following condition are make.*/

        Scanner ip = new Scanner(System.in);
    /*  in type casting happend when two
        types are be compatible to each other.
         the destination type should be source type.*/

        float num = ip.nextInt();
        System.out.println(num);

/*        in above case float is grater than int.
        int num1 = ip.nextFloat();
        in above case float is grater than int thats why its give error.
        if we want to convert int to float when we use type casting*/


//        type casting

        int num1 = (int) (65.55);
        System.out.println(num1);

//        it give 65 output.

//        automatic type promotion in expressions

        int a = 257;
        byte b = (byte) (a);
        System.out.println(b); //257 % 256 = 1
        //260 % 256 = 4
      /*  maximium range of the byte is 257
        after running this program we get 1 in the output
            because its give  the reminder because max value is 257 hence byte
        show extra velue form the input for eq.if i give 260 it give me output 4.*/

        byte c = 40;
        byte d = 50;
        byte e = 100;
        int f = (c * d)/ e;
        System.out.println(f);


        int num4 = 'a';
        System.out.println(num4);

//        it gives askye value



/*        Type promotion rules.
            1.All the byte short and char values are promoted to int.
            2.Any one of the operand is long whole operation promoted to long.*/

        byte p = 42;
        char q = 'a';
        short w = 1024;
        int r = 50000;
        float s = 5.6f;
        double t = 0.22223;
        double result = (s * p) + (r / q) - (t * w);
        //float + int - double = double.
        System.out.println((s * p) + " " + (r / q) + " " +(t * w));
        System.out.println(result);



    }
}
