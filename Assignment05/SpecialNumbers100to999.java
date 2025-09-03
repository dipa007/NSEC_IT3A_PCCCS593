public class SpecialNumbers100to999 {
    static int fact(int x){ int f=1; for(int i=2;i<=x;i++) f*=i; return f; }
    static boolean isSpecial(int n){
        int sum=0, t=n;
        while(t>0){ sum += fact(t%10); t/=10; }
        return sum==n;
    }
    public static void main(String[] args){
        for(int i=100;i<=999;i++) if (isSpecial(i)) System.out.print(i+" ");
    }
}
