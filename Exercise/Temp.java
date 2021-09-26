package Exercise;

import java.util.Scanner;

public class Temp {
    public static void main(String[] args)
    {
        Scanner ip = new Scanner(System.in);
        System.out.println("Please enter temp. in C: ");
        float tempc = ip.nextFloat();
        //formula for fa.
        float tempf = (tempc * 9/5)  + 32;
        System.out.println("temp in f : " + tempf);
    }
}
