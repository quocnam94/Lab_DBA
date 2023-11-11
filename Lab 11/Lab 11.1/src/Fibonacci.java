import java.util.Scanner;

public class Fibonacci {
    //    private static long calc_fib(int n) {
//        if (n <= 1)
//            return n;
//
//        return calc_fib(n - 1) + calc_fib(n - 2);
//    }
    private static long fib (int n){
        int [] a = new int[45];
        a[0] = 0;
        a[1] = 1;
        for (int i = 2; i < a.length; i++){
            a[i] = a[i-1] + a[i-2];
        }
        return a[n];
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

//        System.out.println(calc_fib(n));
        System.out.println(fib(n));
    }
}