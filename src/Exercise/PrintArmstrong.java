package Exercise;

import java.util.Scanner;

public class PrintArmstrong {
    public static void main(String[] args) {
        //print all the 3 digits armstrong number
        Scanner in = new Scanner(System.in);
//        System.out.println("Please enter 3 digit number: ");
//        int n = in.nextInt();
      for(int i = 100; i < 1000; i++){
          if(isArm(i)){
              System.out.println(i);
          }
      }



    }
    static boolean isArm(int n){
        int sum = 0;
        int orignal = n;
        while(n > 0){
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem*rem*rem;

        }
        if(sum == orignal){
            return true;
        }
        return false;
    }
}
