import java.util.*;
public class MergePQtoR {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] P = new int[6];
        int[] Q = new int[4];
        for(int i=0;i<6;i++) P[i]=sc.nextInt();
        for(int i=0;i<4;i++) Q[i]=sc.nextInt();
        int[] R = new int[P.length + Q.length];
        System.arraycopy(P,0,R,0,P.length);
        System.arraycopy(Q,0,R,P.length,Q.length);
        System.out.println(Arrays.toString(R));
        sc.close();
    }
}
