import java.util.*;
public class SearchMenu {
    static int linear(int[] a, int key){
        for(int i=0;i<a.length;i++) if(a[i]==key) return i;
        return -1;
    }
    static int binary(int[] a, int key){
        int l=0,r=a.length-1;
        while(l<=r){
            int m=(l+r)/2;
            if(a[m]==key) return m;
            if(a[m]<key) l=m+1; else r=m-1;
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int choice=sc.nextInt(); int key=sc.nextInt();
        if(choice==2) Arrays.sort(a);
        int idx = (choice==1) ? linear(a,key) : binary(a,key);
        System.out.println(idx);
        sc.close();
    }
}
