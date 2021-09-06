    /*what is primitive?
    any datatype can not break ferther*/
    package com.DataTypes;

    public class Primitives {
        public static void main(String[] args)
        {
           /* 4 bytes stored here*/
            int rollNo = 64;
            /*4 bytes stored here*/
            char letter = 'r';
            /*4 bytes stored here
            Why are you adding f over here?
                by default they are stored in double thats why we need to add f over here.*/
            float marks = 98.56f;
          /*8 bytes stored here
                Why we use double?
            float givs some errors sometimes thats why we use double.
            and double stores larger value*/
            double largeDecimalNo = 45454545.6565;
           /* 8 bytes stored here
           long stores larger value than int that why long is used.
                Why we use L over last?
                by default its stored in int thats why we use L over here.*/
            long largeIntValue = 5464545544545L;
            /*4 bytes stored here*/
            boolean check = false;
        }
    }
