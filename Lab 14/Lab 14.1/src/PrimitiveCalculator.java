import java.util.*;

public class PrimitiveCalculator {
    private static List<Integer> optimal_sequence(int n) {
        List<Integer> sequence = new ArrayList<>();
        if (n < 4 && n > 1){
            sequence.add(1);
            sequence.add(n);
            return sequence;
        }
        if (n == 1){
            sequence.add(n);
            return sequence;
        }
        int [] a = new int[n+1];
        a[0] = 1;
        a[1] = 1;
        a[2] = 1;
        a[3] = 1;
        for (int i = 4; i <= n; i++){
            if (i % 3 == 0) {
                a[i] = a[i / 3] + 1;
            } else if (i % 2 == 0 && a[i-1]>= a[i/2]) {
                a[i] = a[i / 2] + 1;
            } else {
                a[i] = a[i - 1] + 1;
            }
        }
        int i = n;
        while (i >= 1) {
            sequence.add(i);
            if (i % 3 == 0 ) {
                i /= 3;
            } else if (i%2 == 0 && a[i-1] >= a[i/2]) {
                i /= 2;
            } else {
                i --;
            }
        }
        Collections.reverse(sequence);
        return sequence;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> sequence = optimal_sequence(n);
        System.out.println(sequence.size() - 1);
        for (Integer x : sequence) {
            System.out.print(x + " ");
        }
    }
}
