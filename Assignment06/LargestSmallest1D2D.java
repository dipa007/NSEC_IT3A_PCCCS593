import java.util.*;
public class LargestSmallest1D2D {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int min=a[0], max=a[0];
        for(int v:a){ if(v<min)min=v; if(v>max)max=v; }
        System.out.println("1D min="+min+" max="+max);
        int r=sc.nextInt(), c=sc.nextInt();
        int[][] m = new int[r][c];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++) m[i][j]=sc.nextInt();
        min=m[0][0]; max=m[0][0];
        for(int[] row:m) for(int v:row){ if(v<min)min=v; if(v>max)max=v; }
        System.out.println("2D min="+min+" max="+max);
        sc.close();
    }
}
