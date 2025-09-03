import java.util.*;
public class SortMenu {
    static void bubble(int[] a){
        for(int i=0;i<a.length-1;i++)
            for(int j=0;j<a.length-1-i;j++)
                if(a[j]>a[j+1]){int t=a[j];a[j]=a[j+1];a[j+1]=t;}
    }
    static void selection(int[] a){
        for(int i=0;i<a.length-1;i++){
            int mi=i;
            for(int j=i+1;j<a.length;j++) if(a[j]<a[mi]) mi=j;
            int t=a[i];a[i]=a[mi];a[mi]=t;
        }
    }
    static void insertion(int[] a){
        for(int i=1;i<a.length;i++){
            int key=a[i], j=i-1;
            while(j>=0 && a[j]>key){ a[j+1]=a[j]; j--; }
            a[j+1]=key;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(); int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int choice=sc.nextInt();
        if(choice==1) bubble(a);
        else if(choice==2) selection(a);
        else insertion(a);
        System.out.println(Arrays.toString(a));
        sc.close();
    }
}
