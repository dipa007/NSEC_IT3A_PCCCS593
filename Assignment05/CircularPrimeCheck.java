import java.util.*;
public class CircularPrimeCheck {
    static boolean isPrime(int x){
        if (x < 2) return false;
        if (x % 2 == 0) return x == 2;
        for (int i = 3; i * i <= x; i += 2) if (x % i == 0) return false;
        return true;
    }
    static List<Integer> rotations(int n){
        String s = String.valueOf(n);
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            String t = s.substring(i) + s.substring(0,i);
            res.add(Integer.parseInt(t));
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> rots = rotations(N);
        for (int i=0;i<rots.size();i++){
            System.out.print(rots.get(i));
            if (i<rots.size()-1) System.out.print(" - ");
        }
        boolean ok = true;
        for(int v: rots) if (!isPrime(v)) { ok=false; break; }
        System.out.println(ok ? " [Circular Prime]" : " [Not Circular Prime]");
        sc.close();
    }
}
