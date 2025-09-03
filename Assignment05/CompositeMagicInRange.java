import java.util.*;
public class CompositeMagicInRange {
    static boolean isComposite(int n){
        if (n<4) return false;
        for(int i=2;i*i<=n;i++) if(n%i==0) return true;
        return false;
    }
    static int digitRoot(int n){
        while(n>=10){
            int s=0; while(n>0){ s+=n%10; n/=10; } n=s;
        }
        return n;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        int cnt=0; StringBuilder out = new StringBuilder();
        for(int i=m;i<=n;i++){
            if (isComposite(i) && digitRoot(i)==1){
                if (cnt>0) out.append(", ");
                out.append(i); cnt++;
            }
        }
        if (cnt>0) System.out.println("Composite magic integers are " + out);
        else System.out.println("No composite magic integers in range");
        System.out.println("Frequency of composite magic integers is " + cnt + ".");
        sc.close();
    }
}
