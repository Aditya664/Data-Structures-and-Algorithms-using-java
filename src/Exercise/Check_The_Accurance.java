package Exercise;

import java.util.Scanner;

public class Check_The_Accurance {
    public static void main(String[] args)
    {
        //Q.Check the accurance of the number.

        int num = 55656;
        int count = 0;
        while( num > 0)
        {
            int rem = num % 10;
            if(rem == 5)
            {
                count++;
            }
            num = num / 10; // n /= 10

        }
        System.out.println(count);
    }
}
