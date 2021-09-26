package com.BesicsOfJava.Function;

public class Scop {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Aditya";
        {
            a = 78;//already initialised outside the block in the same method, hence you cannot initialize again
            int c = 99;
            name = "DDs";
            System.out.println(name);
            a = 100;//this reassign the origin ref variable to some other value.
            System.out.println(a);
            //values initialised in this block will remain in block

        }
        System.out.println(name);
        System.out.println(a);

        //Scoping in for loop
        for(int i = 0; i < 4; i++){
            System.out.println(i);
            int num = 90;
//            int a = 10;
        }
//        System.out.println(i);



//        System.out.println(c); .//cannot use outside the block
//        System.out.println(marks);
    }
    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
