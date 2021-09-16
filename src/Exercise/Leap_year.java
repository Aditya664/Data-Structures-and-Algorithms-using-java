package Exercise;

import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args)
    {
        // year to be checked
        int year;
        boolean leap = false;
        Scanner y = new Scanner(System.in);
        System.out.println("please Enter year: ");
        year = y.nextInt();

        // if the year is divided by 4
        if (year % 4 == 0) {

            // if the year is century
            if (year % 100 == 0) {

                // if year is divided by 400
                // then it is a leap year
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }

            // if the year is not century
            else
                leap = true;
        }

        else
            leap = false;

        if (leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }

}
