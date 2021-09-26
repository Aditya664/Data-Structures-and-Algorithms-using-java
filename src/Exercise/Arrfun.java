package Exercise;

import java.util.Arrays;

public class Arrfun {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,};
        arr(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void arr(int[] change) {
        change[0] = 55;
        //if we make changes via this variable same object will be change
    }
}
