package Exercise;

public class SwapWithFunc {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a,b);
        System.out.println(a + " " + b);
    }
    static void swap(int c, int d) {
        int temp = c;
        c = d;
        d = temp;
    }
}
