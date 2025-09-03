import java.util.Scanner;
public class PowerXN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long n = sc.nextLong();
        long res = 1;
        long base = x;
        long exp = n;
        while (exp > 0) {
            if ((exp & 1) == 1) res *= base;
            base *= base;
            exp >>= 1;
        }
        System.out.println(res);
        sc.close();
    }
}
