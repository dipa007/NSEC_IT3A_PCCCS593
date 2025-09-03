public class Automorphic11to40 {
    static boolean isAutomorphic(int n){
        long sq = 1L*n*n;
        int t = n;
        while (t>0){ if (t%10 != sq%10) return false; t/=10; sq/=10; }
        return true;
    }
    public static void main(String[] args){
        for(int i=11;i<=40;i++) if (isAutomorphic(i)) System.out.print(i+" ");
    }
}
