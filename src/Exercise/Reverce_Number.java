package Exercise;

import java.util.Scanner;

public class Reverce_Number {
    public static void main(String[] args)
    {
        Scanner op = new Scanner(System.in);
        int num = op.nextInt();
        int ans = 0;
        while(num > 0)
        {
            int rem = num % 10;
            num /= 10;
            ans = ans * 10 +rem;

        }
        System.out.println(ans);
    }
}
