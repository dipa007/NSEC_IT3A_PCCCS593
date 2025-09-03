import java.util.*;
public class PrimesInRange {
    static boolean isPrime(int x){
        if (x < 2) return false;
        if (x % 2 == 0) return x == 2;
        for (int i = 3; i * i <= x; i += 2) if (x % i == 0) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt(), R = sc.nextInt();
        boolean first = true;
        for (int i = Math.max(2,L); i <= R; i++) if (isPrime(i)){
            System.out.print((first?"":" ") + i);
            first = false;
        }
        sc.close();
    }
}
