package com.BesicsOfJava.Array;

public class Arrays {
   /*  What is Array?
    Array is represent a group of elements of same data type. We can represent elements in single array.
        there are three types of array:
            1.one dimensional array.
            2.two ......
            3.three ......*/
     public static void main(String[] args)
     {
         int[] arr;
         int arr2[];
//         these are two ways to declare array

         arr = new int[10];
         //Initialize an array
         System.out.print(arr.length);
         //check length of an array
         System.out.println(arr[0]);
         //check the elements in array
         double[] arr3 = new double[10];
         System.out.println(arr3[0]);
         boolean[] arr4 = new boolean[10];
         System.out.println(arr4[0]);
         System.out.println(arr4[10]);

         //array litteral
         int[] arr5 = {3, 2, 1};

         int[][] matrix = {
                 {1, 2, 3},
                 {4, 5, 6}
         };

//		System.out.println(matrix[0][2]);

         int[][] matrix2 = new int[10][10];
//		System.out.println(matrix2[0]);

       /*  System.out.println(java.util.Arrays.toString(arr5));
         Arrays.sort(arr5);
         System.out.println(Arrays.toString(arr5));*/
     }
}
