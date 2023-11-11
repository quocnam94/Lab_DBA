import java.util.*;

public class FibonacciLastDigit {
    private static int lastFib (int n){
        LinkedList<Integer> a = new LinkedList<>();
        a.add(0);
        a.add(1);
        for (int i = 2; i <= n; i++){
            a.add(a.get(i-1)%10 + a.get(i-2)%10);
        }
        return a.get(n);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(lastFib(n));
    }
}
