package Exercise;

import java.util.Scanner;

public class print_one_to_n {
    public static void main(String[] args)
    {
        int i = 0;
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        System.out.println("Please enter the number:");
        for(i = 1 ; i<=n ;i++)
        {
            System.out.println(i + " ");
        }

    }
}
