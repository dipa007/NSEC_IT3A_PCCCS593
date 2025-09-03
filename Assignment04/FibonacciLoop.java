import java.util.*;
public class FibonacciLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + (i<n?" ":""));
            long c = a + b;
            a = b; b = c;
        }
        sc.close();
    }
}
